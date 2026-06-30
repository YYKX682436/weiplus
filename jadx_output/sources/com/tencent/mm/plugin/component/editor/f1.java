package com.tencent.mm.plugin.component.editor;

/* loaded from: classes12.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.EditorUI f96558d;

    public f1(com.tencent.mm.plugin.component.editor.EditorUI editorUI) {
        this.f96558d = editorUI;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:175:0x033b. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v11 */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        byte[] bArr;
        boolean z17;
        r45.bq0 bq0Var;
        java.lang.String str;
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.vfs.x1 m18;
        java.lang.String str2;
        java.lang.String str3;
        int i18;
        java.io.InputStream inputStream;
        java.io.InputStream inputStream2;
        java.io.InputStream inputStream3;
        java.lang.String c17;
        long k17;
        com.tencent.mm.vfs.x1 m19;
        java.lang.String o17 = nx1.d.q().o();
        nx1.d q17 = nx1.d.q();
        q17.getClass();
        int i19 = 6;
        ?? r96 = 0;
        boolean z18 = true;
        if (com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorDataManager", "getFavProtoItem error, htmlstr is null or nil");
            bq0Var = null;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (q17) {
                int i27 = 0;
                while (true) {
                    i17 = 4;
                    if (i27 >= q17.f341282a.size()) {
                        break;
                    }
                    ix1.a aVar = (ix1.a) q17.f341282a.get(i27);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f295311a)) {
                        aVar.f295311a = hx1.b.a(aVar.toString(), 18);
                    }
                    if (aVar.b() == -1) {
                        if (arrayList.size() <= 0 || ((ix1.d) arrayList.get(arrayList.size() - 1)).f295327p != 1) {
                            ix1.l lVar = new ix1.l();
                            lVar.f295338s = "\n";
                            lVar.f295311a = aVar.f295311a;
                            lVar.f295323l = "-1";
                            lVar.f295327p = 1;
                            lVar.f295324m = null;
                            arrayList.add(lVar);
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            ix1.l lVar2 = (ix1.l) arrayList.get(arrayList.size() - 1);
                            sb6.append(lVar2.f295338s);
                            sb6.append("\n");
                            lVar2.f295338s = sb6.toString();
                        }
                    } else if (aVar.b() >= -1) {
                        if ((aVar.b() == 6 || aVar.b() == 4) && com.tencent.mm.sdk.platformtools.t8.K0(((ix1.d) aVar).f295329r)) {
                            r45.gp0 gp0Var = new r45.gp0();
                            gp0Var.e0(aVar.f295311a);
                            gp0Var.i0(aVar.a());
                            java.lang.String c18 = hx1.b.c(gp0Var);
                            if (com.tencent.mm.vfs.w6.j(c18)) {
                                com.tencent.mars.xlog.Log.e("MicroMsg.EditorDataManager", "getFavProtoItem, type = %d, localfile exist, but localpath is null or nil, set path here", java.lang.Integer.valueOf(aVar.b()));
                                ((ix1.d) aVar).f295329r = c18;
                            }
                        }
                        if (aVar.b() != 1) {
                            arrayList.add((ix1.d) aVar);
                        } else {
                            ix1.l lVar3 = (ix1.l) aVar;
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(lVar3.f295338s)) {
                                if (arrayList.size() <= 0 || ((ix1.d) arrayList.get(arrayList.size() - 1)).b() != 1) {
                                    ix1.l lVar4 = new ix1.l();
                                    lVar4.f295338s = lVar3.f295338s;
                                    lVar4.f295311a = lVar3.f295311a;
                                    lVar4.f295323l = lVar3.f295323l;
                                    lVar4.f295327p = lVar3.f295327p;
                                    lVar4.f295324m = null;
                                    arrayList.add(lVar4);
                                } else {
                                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                    ix1.l lVar5 = (ix1.l) arrayList.get(arrayList.size() - 1);
                                    sb7.append(lVar5.f295338s);
                                    sb7.append(lVar3.f295338s);
                                    lVar5.f295338s = sb7.toString();
                                }
                                int i28 = i27 + 1;
                                if (i28 < q17.f341282a.size() && ((ix1.a) q17.f341282a.get(i28)).b() == 1 && !com.tencent.mm.sdk.platformtools.t8.K0(((ix1.l) q17.f341282a.get(i28)).f295338s)) {
                                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                    ix1.l lVar6 = (ix1.l) arrayList.get(arrayList.size() - 1);
                                    sb8.append(lVar6.f295338s);
                                    sb8.append("<br/>");
                                    lVar6.f295338s = sb8.toString();
                                }
                            } else if (arrayList.size() <= 0 || ((ix1.d) arrayList.get(arrayList.size() - 1)).b() != 1) {
                                ix1.l lVar7 = new ix1.l();
                                lVar7.f295338s = "<br/>";
                                lVar7.f295311a = lVar3.f295311a;
                                lVar7.f295323l = lVar3.f295323l;
                                lVar7.f295327p = lVar3.f295327p;
                                lVar7.f295324m = null;
                                arrayList.add(lVar7);
                            } else {
                                java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
                                ix1.l lVar8 = (ix1.l) arrayList.get(arrayList.size() - 1);
                                sb9.append(lVar8.f295338s);
                                sb9.append("<br/>");
                                lVar8.f295338s = sb9.toString();
                            }
                        }
                    }
                    i27++;
                }
            }
            java.lang.String replaceAll = java.util.regex.Pattern.compile("</wx-", 2).matcher(java.util.regex.Pattern.compile("<wx-", 2).matcher(o17).replaceAll("<")).replaceAll("</");
            try {
                bArr = replaceAll.getBytes(com.tencent.mapsdk.internal.rv.f51270c);
                z17 = false;
            } catch (java.io.UnsupportedEncodingException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditorDataManager", e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorDataManager", "writehtmlfile, use utf-8 encoding error, use default encoding");
                bArr = null;
                z17 = true;
            }
            q17.f341284c.h0(8);
            q17.f341284c.t0("WeNoteHtmlFile");
            q17.f341284c.z0(true);
            q17.f341284c.i0(".htm");
            r45.gp0 gp0Var2 = q17.f341284c;
            gp0Var2.e0(hx1.b.a(gp0Var2.toString(), 18));
            java.lang.String c19 = hx1.b.c(q17.f341284c);
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorDataManager", "getFavProtoItem: save note html file, path is %s", c19);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c19);
            if (r6Var.m()) {
                r6Var.l();
            }
            if (!r6Var.m()) {
                try {
                    r6Var.k();
                } catch (java.io.IOException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EditorDataManager", e18, "", new java.lang.Object[0]);
                }
            }
            if (z17 || com.tencent.mm.vfs.w6.S(c19, bArr, 0, bArr.length) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorDataManager", "writefile error, return");
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.ccq), 1).show();
                bq0Var = null;
            } else {
                q17.f341284c.A0(c19);
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorDataManager", "do EditorBase.ConvertNote2FavProtoItem");
                r45.gp0 gp0Var3 = q17.f341284c;
                int i29 = hx1.a.f285617a;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                bq0Var = new r45.bq0();
                java.lang.String str4 = "WeNoteHtmlFile";
                if (gp0Var3 != null) {
                    linkedList.add(gp0Var3);
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(replaceAll) && replaceAll.length() > 0) {
                    java.lang.String b17 = o72.p5.b();
                    r45.gp0 gp0Var4 = new r45.gp0();
                    gp0Var4.h0(8);
                    gp0Var4.t0("WeNoteHtmlFile");
                    gp0Var4.z0(true);
                    gp0Var4.q0(com.tencent.mm.vfs.w6.k(b17));
                    gp0Var4.i0(".htm");
                    linkedList.add(gp0Var4);
                    java.lang.String c27 = hx1.b.c(gp0Var4);
                    if (!com.tencent.mm.vfs.w6.j(c27)) {
                        com.tencent.mm.vfs.w6.c(b17, c27);
                    }
                    gp0Var4.A0(c27);
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ix1.d dVar = (ix1.d) it.next();
                    if (dVar != null) {
                        r45.gp0 gp0Var5 = dVar.f295324m;
                        if (gp0Var5 != null) {
                            linkedList.add(gp0Var5);
                        } else {
                            r45.gp0 gp0Var6 = new r45.gp0();
                            r45.hp0 hp0Var = new r45.hp0();
                            r45.ip0 ip0Var = new r45.ip0();
                            ip0Var.l(i19);
                            hp0Var.f376353d = ip0Var;
                            gp0Var6.J1 = hp0Var;
                            switch (dVar.f295327p) {
                                case 1:
                                    str3 = str4;
                                    gp0Var6.h0(1);
                                    gp0Var6.x0(true);
                                    gp0Var6.z0(true);
                                    gp0Var6.e0(dVar.f295311a);
                                    gp0Var6.m0(com.tencent.mm.plugin.component.editor.u1.k(((ix1.l) dVar).f295338s));
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(gp0Var6.f375408f) && gp0Var6.f375408f.length() > 1000) {
                                        gp0Var6.m0(gp0Var6.f375408f.substring(0, 1000));
                                    }
                                    gp0Var6.t0(dVar.f295323l);
                                    linkedList.add(gp0Var6);
                                    str4 = str3;
                                    i19 = 6;
                                    break;
                                case 2:
                                    str3 = str4;
                                    gp0Var6.h0(2);
                                    ix1.c cVar = (ix1.c) dVar;
                                    java.lang.String str5 = cVar.f295322s;
                                    gp0Var6.A0(str5);
                                    if (com.tencent.mm.sdk.platformtools.t8.K0(cVar.f295311a)) {
                                        gp0Var6.e0(hx1.b.a(cVar.toString(), 18));
                                        com.tencent.mm.sdk.platformtools.x.x(str5, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, hx1.b.e(gp0Var6), true);
                                        gp0Var6.B0(hx1.b.e(gp0Var6));
                                    } else {
                                        gp0Var6.e0(dVar.f295311a);
                                        gp0Var6.B0(cVar.f295329r);
                                    }
                                    gp0Var6.h0(2);
                                    gp0Var6.t0(dVar.f295323l);
                                    linkedList.add(gp0Var6);
                                    str4 = str3;
                                    i19 = 6;
                                    break;
                                case 3:
                                    gp0Var6.h0(i19);
                                    ix1.e eVar = (ix1.e) dVar;
                                    gp0Var6.e0(dVar.f295311a);
                                    r45.pp0 pp0Var = new r45.pp0();
                                    pp0Var.t(eVar.f295334w);
                                    str3 = str4;
                                    pp0Var.u(eVar.f295331t);
                                    pp0Var.w(eVar.f295332u);
                                    pp0Var.E((int) eVar.f295333v);
                                    pp0Var.C(eVar.f295330s);
                                    pp0Var.B(eVar.f295335x);
                                    pp0Var.s(eVar.f295336y);
                                    pp0Var.y(eVar.f295337z);
                                    pp0Var.x(eVar.A);
                                    pp0Var.z(eVar.B);
                                    pp0Var.A(eVar.C);
                                    pp0Var.q(eVar.D);
                                    pp0Var.r(eVar.E);
                                    gp0Var6.x0(true);
                                    gp0Var6.z0(true);
                                    gp0Var6.J1.f376354e = pp0Var;
                                    gp0Var6.t0(dVar.f295323l);
                                    linkedList.add(gp0Var6);
                                    str4 = str3;
                                    i19 = 6;
                                    break;
                                case 4:
                                    gp0Var6.h0(3);
                                    ix1.h hVar = (ix1.h) dVar;
                                    gp0Var6.e0(dVar.f295311a);
                                    java.lang.String str6 = hVar.f295329r;
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str6) && str6.length() != 0) {
                                        gp0Var6.A0(str6);
                                        gp0Var6.n0(hVar.f295345v);
                                        gp0Var6.z0(true);
                                        gp0Var6.i0(hVar.f295342s);
                                        str3 = str4;
                                        gp0Var6.t0(dVar.f295323l);
                                        linkedList.add(gp0Var6);
                                        str4 = str3;
                                        i19 = 6;
                                        break;
                                    }
                                    break;
                                case 5:
                                    gp0Var6.h0(8);
                                    ix1.g gVar = (ix1.g) dVar;
                                    gp0Var6.e0(dVar.f295311a);
                                    gp0Var6.A0(gVar.f295329r);
                                    gp0Var6.z0(true);
                                    gp0Var6.O0(gVar.f295339s);
                                    gp0Var6.m0(gVar.f295340t);
                                    gp0Var6.i0(gVar.f295341u);
                                    str3 = str4;
                                    gp0Var6.t0(dVar.f295323l);
                                    linkedList.add(gp0Var6);
                                    str4 = str3;
                                    i19 = 6;
                                    break;
                                case 6:
                                    gp0Var6.h0(i17);
                                    ix1.m mVar = (ix1.m) dVar;
                                    gp0Var6.e0(dVar.f295311a);
                                    gp0Var6.A0(mVar.f295329r);
                                    gp0Var6.B0(mVar.f295346s);
                                    com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
                                    java.lang.String str7 = mVar.f295329r;
                                    ((be0.e) oVar).getClass();
                                    com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str7, true);
                                    if (d17 != null) {
                                        gp0Var6.n0(d17.a());
                                    } else {
                                        gp0Var6.n0(1);
                                    }
                                    gp0Var6.i0(mVar.f295348u);
                                    str3 = str4;
                                    gp0Var6.t0(dVar.f295323l);
                                    linkedList.add(gp0Var6);
                                    str4 = str3;
                                    i19 = 6;
                                    break;
                                default:
                                    str3 = str4;
                                    gp0Var6.t0(dVar.f295323l);
                                    linkedList.add(gp0Var6);
                                    str4 = str3;
                                    i19 = 6;
                                    break;
                            }
                            i17 = 4;
                        }
                    }
                }
                java.lang.String str8 = str4;
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorBase", "do EditorBase.setExtraInfo");
                if (linkedList.size() > 0) {
                    int size = linkedList.size();
                    int i37 = 0;
                    while (i37 < size) {
                        r45.gp0 gp0Var7 = (r45.gp0) linkedList.get(i37);
                        if (i37 > 0 && com.tencent.mm.sdk.platformtools.t8.K0(gp0Var7.f375434s)) {
                            gp0Var7.e0(hx1.b.a(gp0Var7.toString(), 18));
                            int i38 = i37 - 1;
                            ix1.d dVar2 = (i38 < 0 || i38 >= arrayList.size() || arrayList.size() <= 0) ? null : (ix1.d) arrayList.get(i38);
                            if (dVar2 != null && (str2 = dVar2.f295323l) != null && str2.equals(gp0Var7.P1)) {
                                dVar2.f295311a = gp0Var7.T;
                            }
                        }
                        if (i37 <= 0 || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var7.f375434s) || com.tencent.mm.sdk.platformtools.t8.K0(gp0Var7.f375438u)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EditorBase", "datalist.get[%d].type = %d", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(gp0Var7.I));
                            java.lang.String str9 = gp0Var7.V;
                            if (com.tencent.mm.vfs.w6.j(str9)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.EditorBase", "datapath exist,pathname:%s", str9);
                                java.lang.String p17 = com.tencent.mm.vfs.w6.p(str9);
                                java.lang.String g17 = kk.k.g(com.tencent.mm.vfs.w6.N(str9, r96, 256));
                                gp0Var7.p0(p17);
                                gp0Var7.r0(g17);
                                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str9);
                                java.lang.String str10 = a17.f213279f;
                                if (str10 != null) {
                                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str10, r96, r96);
                                    if (!str10.equals(l17)) {
                                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                                    }
                                }
                                com.tencent.mm.vfs.z2 m27 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                                gp0Var7.q0((m27.a() && (m18 = m27.f213266a.m(m27.f213267b)) != null) ? m18.f213233c : 0L);
                                java.lang.String c28 = hx1.b.c(gp0Var7);
                                boolean j17 = com.tencent.mm.vfs.w6.j(c28);
                                if (str9.equals(c28) || j17) {
                                    str = str8;
                                } else {
                                    str = str8;
                                    if (!str.equals(gp0Var7.P1)) {
                                        com.tencent.mm.vfs.w6.w(str9, c28);
                                        gp0Var7.A0(c28);
                                    }
                                }
                            } else {
                                str = str8;
                                com.tencent.mars.xlog.Log.e("MicroMsg.EditorBase", "datapath not exist, %s not exist!", str9);
                            }
                            java.lang.String str11 = gp0Var7.X;
                            if (com.tencent.mm.vfs.w6.j(str11)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.EditorBase", "thumbPath exist,pathname:%s", str11);
                                java.lang.String p18 = com.tencent.mm.vfs.w6.p(str11);
                                java.lang.String f17 = kk.k.f(str11, r96, 256);
                                gp0Var7.N0(p18);
                                gp0Var7.M0(f17);
                                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str11);
                                java.lang.String str12 = a18.f213279f;
                                if (str12 != null) {
                                    java.lang.String l18 = com.tencent.mm.vfs.e8.l(str12, r96, r96);
                                    if (!str12.equals(l18)) {
                                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                                    }
                                }
                                com.tencent.mm.vfs.z2 m28 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                                gp0Var7.L0((m28.a() && (m17 = m28.f213266a.m(m28.f213267b)) != null) ? m17.f213233c : 0L);
                                java.lang.String e19 = hx1.b.e(gp0Var7);
                                if (!str11.equals(e19) && !com.tencent.mm.vfs.w6.j(e19)) {
                                    com.tencent.mm.vfs.w6.w(str11, e19);
                                    gp0Var7.B0(e19);
                                }
                            } else {
                                com.tencent.mars.xlog.Log.e("MicroMsg.EditorBase", "thumbPath not exist, pathname:%s", str11);
                            }
                        } else {
                            gp0Var7.x0(z18);
                            gp0Var7.z0(z18);
                            str = str8;
                        }
                        i37++;
                        str8 = str;
                        r96 = 0;
                        z18 = true;
                    }
                }
                bq0Var.d(linkedList);
            }
        }
        if (bq0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "protoItem is null, return!");
            return;
        }
        this.f96558d.G.clear();
        this.f96558d.G.addAll(bq0Var.f370964f);
        com.tencent.mm.plugin.component.editor.EditorUI editorUI = this.f96558d;
        java.util.LinkedList linkedList2 = editorUI.G;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (editorUI.F == null) {
            editorUI.F = new o72.r2();
        }
        o72.r2 r2Var = editorUI.F;
        r2Var.field_type = 18;
        r2Var.field_sourceType = 6;
        r45.jq0 Y6 = editorUI.Y6(r2Var);
        editorUI.F.field_favProto.o(Y6);
        o72.r2 r2Var2 = editorUI.F;
        r2Var2.field_fromUser = Y6.f378036f;
        r2Var2.field_toUser = Y6.f378038h;
        r2Var2.field_favProto.s(1);
        editorUI.F.field_favProto.f(wo.w0.k());
        editorUI.F.field_favProto.c(127);
        editorUI.F.field_edittime = com.tencent.mm.sdk.platformtools.t8.i1();
        editorUI.F.field_updateTime = java.lang.System.currentTimeMillis();
        o72.r2 r2Var3 = editorUI.F;
        r2Var3.field_favProto.g(r2Var3.field_edittime);
        editorUI.F.field_favProto.f370962d.c(java.lang.System.currentTimeMillis());
        o72.r2 r2Var4 = editorUI.F;
        r2Var4.field_itemStatus = 9;
        r2Var4.field_localId = currentTimeMillis;
        java.util.LinkedList linkedList3 = r2Var4.field_favProto.f370964f;
        if (linkedList3 != linkedList2) {
            linkedList3.clear();
            editorUI.F.field_favProto.d(linkedList2);
        }
        editorUI.F = editorUI.F;
        com.tencent.mm.plugin.component.editor.EditorUI editorUI2 = this.f96558d;
        while (true) {
            java.util.LinkedList linkedList4 = editorUI2.G;
            if (i18 >= linkedList4.size()) {
                return;
            }
            r45.gp0 gp0Var8 = (r45.gp0) linkedList4.get(i18);
            if (com.tencent.mm.sdk.platformtools.t8.K0(gp0Var8.T)) {
                gp0Var8.e0(hx1.b.a(gp0Var8.toString(), editorUI2.F.field_type));
            }
            java.lang.String str13 = gp0Var8.V;
            if (com.tencent.mm.vfs.w6.j(str13)) {
                java.lang.String e27 = kk.k.e(str13);
                java.lang.String f18 = kk.k.f(str13, 0, 256);
                gp0Var8.p0(e27);
                gp0Var8.r0(f18);
                com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(str13);
                java.lang.String str14 = a19.f213279f;
                if (str14 != null) {
                    java.lang.String l19 = com.tencent.mm.vfs.e8.l(str14, false, false);
                    if (!str14.equals(l19)) {
                        a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l19, a19.f213280g, a19.f213281h);
                    }
                }
                inputStream = null;
                com.tencent.mm.vfs.z2 m29 = com.tencent.mm.vfs.a3.f212781a.m(a19, null);
                gp0Var8.q0((m29.a() && (m19 = m29.f213266a.m(m29.f213267b)) != null) ? m19.f213233c : 0L);
                java.lang.String c29 = hx1.b.c(gp0Var8);
                if (!str13.equals(c29)) {
                    com.tencent.mm.vfs.w6.c(str13, c29);
                }
                editorUI2.l7(gp0Var8, com.tencent.mm.plugin.component.editor.a.TYPE_FILE);
            } else {
                inputStream = null;
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "copy file fail, type: %d,%s not exist!", java.lang.Integer.valueOf(gp0Var8.I), str13);
            }
            java.lang.String str15 = gp0Var8.X;
            if (com.tencent.mm.vfs.w6.j(str15)) {
                try {
                    inputStream3 = com.tencent.mm.vfs.w6.E(str15);
                    try {
                        try {
                            c17 = kk.k.c(inputStream3, 4096);
                            if (c17 == null) {
                                c17 = "";
                            }
                            k17 = com.tencent.mm.vfs.w6.k(str15);
                        } catch (java.io.FileNotFoundException unused) {
                        }
                        try {
                            java.lang.String d18 = kk.k.d(inputStream3, 102400, 0, 256);
                            gp0Var8.N0(c17);
                            gp0Var8.M0(d18);
                            gp0Var8.L0(k17);
                            java.lang.String e28 = hx1.b.e(gp0Var8);
                            if (!str15.equals(e28)) {
                                com.tencent.mm.vfs.w6.c(str15, e28);
                            }
                            editorUI2.l7(gp0Var8, com.tencent.mm.plugin.component.editor.a.TYPE_THUMB);
                            if (inputStream3 == null) {
                            }
                        } catch (java.io.FileNotFoundException unused2) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "VFSFileOp thumbPath error!");
                            i18 = inputStream3 == null ? i18 + 1 : 0;
                            inputStream3.close();
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        inputStream2 = inputStream3;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (java.lang.Exception unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (java.io.FileNotFoundException unused4) {
                    inputStream3 = inputStream;
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    inputStream2 = inputStream;
                }
                try {
                    inputStream3.close();
                } catch (java.lang.Exception unused5) {
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.EditorActivityUI", "copy thumb fail, %s not exist!", str15);
            }
        }
    }
}

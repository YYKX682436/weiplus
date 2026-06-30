package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@yn.c(m177365x976763e5 = sb5.l1.class)
/* loaded from: classes9.dex */
public final class xi extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements sb5.l1 {
    /* JADX WARN: Multi-variable type inference failed */
    public void m0(java.util.List list) {
        java.lang.Object[] objArr;
        android.view.View a17;
        java.lang.String str;
        java.lang.String str2;
        gp.d dVar;
        int i17 = 0;
        if ((list == null || list.isEmpty()) == true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PasteComponent", "itemList is null");
            return;
        }
        android.app.Activity g17 = this.f280113d.g();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            t35.a aVar = (t35.a) it.next();
            java.lang.String obj = r26.n0.u0(aVar.f496966b).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
            aVar.f496966b = obj;
        }
        long Ai = ((d40.n) ((e40.v) i95.n0.c(e40.v.class))).Ai();
        if (!list.isEmpty()) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                if ((com.p314xaae8f345.mm.vfs.w6.k(java.lang.String.valueOf(((t35.a) it6.next()).f496967c)) > Ai) != false) {
                    objArr = true;
                    break;
                }
            }
        }
        objArr = false;
        if (objArr == true) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PasteComponent", "file size is too large");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(g17);
            u1Var.u(g17.getString(list.size() == 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.f572627nf4 : com.p314xaae8f345.mm.R.C30867xcad56011.nfv, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(Ai)));
            u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            u1Var.q(false);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(g17, 1, 2);
        z2Var.q(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ogq));
        android.view.View view = z2Var.f293591g;
        if (view != null) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cw_);
        }
        com.p314xaae8f345.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
        if (list.size() == 1) {
            int i18 = ((t35.a) kz5.n0.X(list)).f496965a;
            r7 = null;
            gp.d dVar2 = null;
            if (i18 == 2) {
                jd5.a aVar2 = new jd5.a();
                android.net.Uri uri = ((t35.a) kz5.n0.X(list)).f496967c;
                java.lang.String uri2 = uri != null ? uri.toString() : null;
                aVar2.p(uri2 != null ? uri2 : "");
                io.r rVar = new io.r();
                jd5.a aVar3 = rVar.f374960c;
                rVar.f374960c = aVar2;
                rVar.c(aVar3, aVar2);
                a17 = rVar.a(g17);
            } else if (i18 == 3) {
                android.net.Uri uri3 = ((t35.a) kz5.n0.X(list)).f496967c;
                if (uri3 == null || (str2 = uri3.toString()) == null) {
                    str2 = "";
                }
                java.io.File cacheDir = g17.getCacheDir();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tempthumb_");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                sb6.append(java.lang.System.currentTimeMillis());
                java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(cacheDir, sb6.toString()).o();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                ((q90.i) ((r90.l) i95.n0.c(r90.l.class))).getClass();
                android.graphics.Bitmap p17 = ai3.d.p(str2);
                if (p17 != null) {
                    try {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(p17, 60, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PasteComponent", e17, "", new java.lang.Object[0]);
                    }
                }
                jd5.c cVar = new jd5.c();
                cVar.r(str2);
                try {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        try {
                            try {
                                dVar = new gp.d();
                            } catch (java.lang.Exception e18) {
                                e = e18;
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            dVar = dVar2;
                        }
                        try {
                            dVar.setDataSource(str2);
                            i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(dVar.extractMetadata(9), 0) / 1000;
                            dVar.release();
                        } catch (java.lang.Exception e19) {
                            e = e19;
                            dVar2 = dVar;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PasteComponent", e, "", new java.lang.Object[0]);
                            if (dVar2 != null) {
                                dVar2.release();
                            }
                            cVar.q(i17);
                            cVar.o(o17);
                            io.z zVar = new io.z();
                            jd5.c cVar2 = zVar.f374977b;
                            zVar.f374977b = cVar;
                            zVar.c(cVar2, cVar);
                            a17 = zVar.a(g17);
                            z2Var.j(a17);
                            z2Var.m(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya));
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ti tiVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ti(z2Var);
                            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ui uiVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ui(this, list, z2Var);
                            z2Var.D = tiVar;
                            z2Var.E = uiVar;
                            z2Var.C();
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            if (dVar != null) {
                                try {
                                    dVar.release();
                                } catch (java.lang.Exception unused) {
                                }
                            }
                            throw th;
                        }
                    }
                } catch (java.lang.Exception unused2) {
                }
                cVar.q(i17);
                cVar.o(o17);
                io.z zVar2 = new io.z();
                jd5.c cVar22 = zVar2.f374977b;
                zVar2.f374977b = cVar;
                zVar2.c(cVar22, cVar);
                a17 = zVar2.a(g17);
            } else if (i18 == 4) {
                android.net.Uri uri4 = ((t35.a) kz5.n0.X(list)).f496967c;
                ec5.a aVar4 = new ec5.a();
                java.lang.String uri5 = uri4 != null ? uri4.toString() : null;
                aVar4.l(uri5 != null ? uri5 : "");
                aVar4.k(n13.v.f415673a.b(o35.a.h(uri4), o35.a.c(uri4), com.p314xaae8f345.mm.vfs.w6.k(uri4 != null ? uri4.toString() : null)));
                mi5.h hVar = new mi5.h();
                ec5.a aVar5 = hVar.f408381c;
                hVar.f408381c = aVar4;
                hVar.c(aVar5, aVar4);
                a17 = hVar.a(g17);
            }
            z2Var.j(a17);
            z2Var.m(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ti tiVar2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ti(z2Var);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ui uiVar2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ui(this, list, z2Var);
            z2Var.D = tiVar2;
            z2Var.E = uiVar2;
            z2Var.C();
        }
        ld5.b bVar = new ld5.b();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            t35.a aVar6 = (t35.a) it7.next();
            android.net.Uri uri6 = aVar6.f496967c;
            if (uri6 == null || (str = uri6.toString()) == null) {
                str = aVar6.f496966b;
            }
            arrayList.add(str);
        }
        bVar.p(new java.util.LinkedList(arrayList));
        bVar.n(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572024wk) + g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574370i25, java.lang.Integer.valueOf(list.size())));
        mi5.k0 k0Var = new mi5.k0();
        ld5.b bVar2 = k0Var.f408402b;
        k0Var.f408402b = bVar;
        k0Var.c(bVar2, bVar);
        a17 = k0Var.a(g17);
        z2Var.j(a17);
        z2Var.m(g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), g17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ti tiVar22 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ti(z2Var);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ui uiVar22 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ui(this, list, z2Var);
        z2Var.D = tiVar22;
        z2Var.E = uiVar22;
        z2Var.C();
    }

    public final void n0(t35.a aVar, java.lang.String str, java.lang.String str2) {
        ut.s0 s0Var = new ut.s0(str, java.lang.String.valueOf(aVar.f496967c));
        s0Var.f512254e = "forward_file_path";
        java.lang.String h17 = o35.a.h(aVar.f496967c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "getFileName(...)");
        s0Var.f512252c = h17;
        s0Var.f512258i = str2;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j tj6 = ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).tj(((ot.i) ((pt.h0) i95.n0.c(pt.h0.class))).Zi(s0Var));
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a != null) {
            v65.i.b(c20976x6ba6452a, null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.wi(tj6, null), 1, null);
        }
    }
}

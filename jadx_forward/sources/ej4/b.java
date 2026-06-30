package ej4;

/* loaded from: classes11.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.m1 implements com.p314xaae8f345.mm.p971x6de15a2e.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final pj4.g2 f334857d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f334858e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.o f334859f;

    /* renamed from: g, reason: collision with root package name */
    public pj4.p f334860g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f334861h = "";

    public b(pj4.g2 g2Var) {
        java.lang.Long l17;
        java.lang.Long l18;
        java.lang.String str;
        pj4.b0 b0Var;
        pj4.b0 b0Var2;
        pj4.o0 o0Var;
        java.util.LinkedList linkedList;
        pj4.b0 b0Var3;
        pj4.b0 b0Var4;
        pj4.o0 o0Var2;
        pj4.c0 c0Var;
        java.util.LinkedList linkedList2;
        pj4.b0 b0Var5;
        pj4.b0 b0Var6;
        pj4.b0 b0Var7;
        pj4.b0 b0Var8;
        pj4.b0 b0Var9;
        pj4.o0 o0Var3;
        java.util.LinkedList linkedList3;
        pj4.j0 j0Var;
        pj4.b0 b0Var10;
        pj4.b0 b0Var11;
        pj4.o0 o0Var4;
        java.util.LinkedList linkedList4;
        pj4.j0 j0Var2;
        java.lang.String str2;
        pj4.b0 b0Var12;
        pj4.o0 o0Var5;
        pj4.c0 c0Var2;
        java.util.LinkedList linkedList5;
        pj4.j0 j0Var3;
        java.lang.String str3;
        this.f334857d = g2Var;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 5293;
        lVar.f152199c = "/cgi-bin/micromsg-bin/modtextstatus";
        lVar.f152197a = new pj4.o();
        lVar.f152198b = new pj4.p();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f334859f = a17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.ModTextStatusReq");
        pj4.o oVar = (pj4.o) fVar;
        int c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20700x168d6117());
        boolean z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20701x1df1f5c3()) == 1;
        boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20699x5387e31()) == 1;
        if (g2Var == null || (b0Var12 = g2Var.f436595d) == null || (o0Var5 = b0Var12.f436508g) == null || (c0Var2 = o0Var5.f436754o) == null || (linkedList5 = c0Var2.f436542m) == null || (j0Var3 = (pj4.j0) kz5.n0.a0(linkedList5, 0)) == null || (str3 = j0Var3.f436674f) == null) {
            l17 = null;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3.getBytes(r26.c.f450398a), "getBytes(...)");
            l17 = java.lang.Long.valueOf(r11.length);
        }
        if (g2Var == null || (b0Var11 = g2Var.f436595d) == null || (o0Var4 = b0Var11.f436508g) == null || (linkedList4 = o0Var4.f436749g) == null || (j0Var2 = (pj4.j0) kz5.n0.a0(linkedList4, 0)) == null || (str2 = j0Var2.f436674f) == null) {
            l18 = null;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2.getBytes(r26.c.f450398a), "getBytes(...)");
            l18 = java.lang.Long.valueOf(r12.length);
        }
        byte[] encode = android.util.Base64.encode((g2Var == null || (b0Var10 = g2Var.f436595d) == null) ? null : b0Var10.mo14344x5f01b1f6(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode, "encode(...)");
        java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_8, "UTF_8");
        java.lang.String str4 = new java.lang.String(encode, UTF_8);
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = str4.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        long length = bytes.length;
        if (length >= c17 || z18 || z17) {
            if (g2Var != null && (b0Var4 = g2Var.f436595d) != null && (o0Var2 = b0Var4.f436508g) != null && (c0Var = o0Var2.f436754o) != null && (linkedList2 = c0Var.f436542m) != null) {
                I(linkedList2);
            }
            byte[] encode2 = android.util.Base64.encode((g2Var == null || (b0Var3 = g2Var.f436595d) == null) ? null : b0Var3.mo14344x5f01b1f6(), 2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode2, "encode(...)");
            java.nio.charset.Charset UTF_82 = java.nio.charset.StandardCharsets.UTF_8;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_82, "UTF_8");
            str = "";
            java.lang.String str5 = new java.lang.String(encode2, UTF_82);
            byte[] bytes2 = str5.getBytes(charset);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
            if (bytes2.length >= c17 || z18 || z17) {
                if (g2Var != null && (b0Var2 = g2Var.f436595d) != null && (o0Var = b0Var2.f436508g) != null && (linkedList = o0Var.f436749g) != null) {
                    I(linkedList);
                }
                byte[] encode3 = android.util.Base64.encode((g2Var == null || (b0Var = g2Var.f436595d) == null) ? null : b0Var.mo14344x5f01b1f6(), 2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(encode3, "encode(...)");
                java.nio.charset.Charset UTF_83 = java.nio.charset.StandardCharsets.UTF_8;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(UTF_83, "UTF_8");
                str4 = new java.lang.String(encode3, UTF_83);
            } else {
                str4 = str5;
            }
        } else {
            str = "";
        }
        byte[] bytes3 = str4.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes3, "getBytes(...)");
        long length2 = bytes3.length;
        java.lang.String str6 = (g2Var == null || (b0Var9 = g2Var.f436595d) == null || (o0Var3 = b0Var9.f436508g) == null || (linkedList3 = o0Var3.f436749g) == null || (j0Var = (pj4.j0) kz5.n0.a0(linkedList3, 0)) == null) ? null : j0Var.f436672d;
        java.lang.Long valueOf = java.lang.Long.valueOf(length);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(length2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6960xc16dd91a c6960xc16dd91a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6960xc16dd91a();
        c6960xc16dd91a.f142675d = valueOf != null ? valueOf.longValue() : 0L;
        c6960xc16dd91a.f142676e = valueOf2 != null ? valueOf2.longValue() : 0L;
        c6960xc16dd91a.f142678g = l17 != null ? l17.longValue() : 0L;
        c6960xc16dd91a.f142679h = l18 != null ? l18.longValue() : 0L;
        c6960xc16dd91a.f142677f = c6960xc16dd91a.b("StatusJumpInfoType", str6 == null ? str : str6, true);
        java.lang.String n17 = c6960xc16dd91a.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "report%s %s", 29359, r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
        oVar.f436741d = str4;
        java.lang.Integer valueOf3 = (g2Var == null || (b0Var8 = g2Var.f436595d) == null) ? null : java.lang.Integer.valueOf(b0Var8.f436513o);
        if ((valueOf3 == null || valueOf3.intValue() != 2) && (valueOf3 == null || valueOf3.intValue() != 1)) {
            if (valueOf3 != null && valueOf3.intValue() == 3) {
                oVar.f436745h = g2Var.f436609u;
            } else if (valueOf3 != null && valueOf3.intValue() == 4) {
                oVar.f436742e = g2Var.f436596e;
            }
        }
        oVar.f436743f = g2Var != null ? g2Var.f436606r : null;
        oVar.f436744g = g2Var != null ? g2Var.f436608t : 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("rowId:");
        sb6.append(g2Var != null ? java.lang.Long.valueOf(g2Var.f436602n) : null);
        sb6.append(" text:");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1((g2Var == null || (b0Var7 = g2Var.f436595d) == null) ? null : b0Var7.f436504J));
        sb6.append(" statusId:");
        sb6.append(oVar.f436743f);
        sb6.append(" option:");
        sb6.append((g2Var == null || (b0Var6 = g2Var.f436595d) == null) ? null : java.lang.Long.valueOf(b0Var6.f436519u));
        sb6.append(" request.mod_status_option = :");
        sb6.append(oVar.f436744g);
        sb6.append(" extInfo:");
        sb6.append((g2Var == null || (b0Var5 = g2Var.f436595d) == null) ? null : bk4.l.b(b0Var5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", sb6.toString());
    }

    public final void H(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                pj4.j0 j0Var = (pj4.j0) it.next();
                if (bi4.e.d(j0Var.f436672d) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j0Var.f436674f)) {
                    j0Var.f436674f = this.f334861h;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", "addBusiBuf: " + this.f334861h.length());
                }
            }
        }
    }

    public final void I(java.util.List list) {
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                pj4.j0 j0Var = (pj4.j0) it.next();
                if (bi4.e.d(j0Var.f436672d) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j0Var.f436674f)) {
                    java.lang.String busiBuf = j0Var.f436674f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(busiBuf, "busiBuf");
                    this.f334861h = busiBuf;
                    j0Var.f436674f = "";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", "clearBusiBuf: " + this.f334861h.length());
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: doScene */
    public int mo807x6c193ac1(com.p314xaae8f345.mm.p971x6de15a2e.s dispatcher, com.p314xaae8f345.mm.p944x882e457a.u0 callback) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f334858e = callback;
        java.text.SimpleDateFormat simpleDateFormat = bi4.v1.f102626a;
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
            z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2569xa4f4bf5f.C20707xe1a759ed()) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusSwitch", "isPostForceError: result:%s", java.lang.Boolean.valueOf(z17));
        } else {
            z17 = false;
        }
        if (!z17) {
            return mo9409x10f9447a(dispatcher, this.f334859f, this);
        }
        mo804x5f9cdc6f(5293, -1, -1, "", this.f334859f, null);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 5293;
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 rr6, byte[] bArr) {
        pj4.r rVar;
        java.lang.String str2;
        pj4.c0 c0Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rr6, "rr");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.NetSceneModTextStatus", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = this.f334859f.f152244b.f152233a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.ModTextStatusResp");
            pj4.p pVar = (pj4.p) fVar;
            this.f334860g = pVar;
            java.lang.String str3 = pVar.f436766d;
            java.lang.String str4 = pVar.f436767e;
            boolean z17 = true;
            if (!(str3 == null || str3.length() == 0)) {
                if (str4 != null && str4.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    pj4.b0 b0Var = new pj4.b0();
                    b0Var.mo11468x92b714fd(android.util.Base64.decode(pVar.f436767e, 0));
                    pj4.o0 o0Var = b0Var.f436508g;
                    if (o0Var != null && (linkedList2 = o0Var.f436749g) != null) {
                        H(linkedList2);
                    }
                    pj4.o0 o0Var2 = b0Var.f436508g;
                    if (o0Var2 != null && (c0Var = o0Var2.f436754o) != null && (linkedList = c0Var.f436542m) != null) {
                        H(linkedList);
                    }
                    pj4.p pVar2 = this.f334860g;
                    jz5.f0 f0Var = null;
                    if (pVar2 == null || (str2 = pVar2.f436768f) == null) {
                        rVar = null;
                    } else {
                        com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new pj4.r().mo11468x92b714fd(android.util.Base64.decode(str2, 0));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.PrivateInfo");
                        rVar = (pj4.r) mo11468x92b714fd;
                    }
                    ai4.m0 m0Var = ai4.m0.f86706a;
                    java.lang.String a17 = bk4.k1.a();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    ai4.b.g(m0Var, a17, str3, b0Var, 4, null, 0L, 0.0f, null, rVar, false, 752, null);
                    pj4.g2 g2Var = this.f334857d;
                    if (g2Var != null) {
                        java.lang.String str5 = g2Var.f436605q;
                        pj4.o0 o0Var3 = b0Var.f436508g;
                        java.lang.String str6 = o0Var3 != null ? o0Var3.f436746d : null;
                        if (str6 == null) {
                            str6 = "";
                        }
                        java.lang.String str7 = pVar.f436766d;
                        if (str5 != null) {
                            ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(8, "StatusTextPost_".concat(str5), pj4.h2.class, new qj4.o(str5, 1L, str6, str7));
                            f0Var = jz5.f0.f384359a;
                        }
                        if (f0Var == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.tsReport", "postReport: cliPostID is null");
                        }
                        oj4.j.f427348a.e(g2Var.f436595d.f436515q);
                    }
                    if (g2Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.NetSceneModTextStatus", "onSceneEnd mod statusId:" + pVar.f436766d + ", this is deleted");
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var = this.f334858e;
        if (u0Var != null) {
            u0Var.mo815x76e0bfae(i18, i19, str, this);
        }
    }
}

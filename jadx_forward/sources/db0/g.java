package db0;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final db0.g f309361a = new db0.g();

    public final void a(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c12476xea20f622, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str) {
        java.lang.String str2;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
        boolean z17 = f9Var.A0() == 1;
        java.lang.String r17 = z17 ? c01.z1.r() : R4 ? c01.w9.s(f9Var.j()) : f9Var.Q0();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12476xea20f622.f167802d)) {
            arrayList.add(new bi1.h("unsupported", null, null, 0, null, null, 0L, 0L, null, ac1.g.f19x366c91de, null));
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c12476xea20f622.f167802d, "text/message")) {
            java.lang.String str3 = c12476xea20f622.f167802d;
            java.lang.String str4 = r17 == null ? "" : r17;
            long mo78012x3fdd41df = f9Var.mo78012x3fdd41df();
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String d17 = d(f9Var);
            java.lang.String str5 = d17 == null ? "" : d17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            java.lang.String str6 = c12476xea20f622.f167804f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str6);
            arrayList.add(new bi1.h(str3, str5, str6, 0, null, str4, mo78012x3fdd41df, m124847x74d37ac6, null, 280, null));
            return;
        }
        java.lang.String str7 = c12476xea20f622.f167802d;
        java.lang.String j17 = f9Var.j();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17)) {
            str2 = "";
        } else {
            if (!z17) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
                int length = r17.length() + 2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j17);
                if (length <= j17.length()) {
                    j17 = j17.substring(length);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(j17, "substring(...)");
                }
            } else if (j17 == null) {
                j17 = "";
            }
            str2 = j17;
        }
        java.lang.String str8 = r17 == null ? "" : r17;
        long mo78012x3fdd41df2 = f9Var.mo78012x3fdd41df();
        long m124847x74d37ac62 = f9Var.m124847x74d37ac6();
        java.lang.String d18 = d(f9Var);
        java.lang.String str9 = d18 == null ? "" : d18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str7);
        arrayList.add(new bi1.h(str7, str9, null, 0, str2, str8, mo78012x3fdd41df2, m124847x74d37ac62, null, 268, null));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        jz5.l c17 = c(f9Var, false);
        if (c17 != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622) c17.f384366d;
        }
        return null;
    }

    public final jz5.l c(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17) {
        boolean booleanValue;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 c17;
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgHelper", "covertMsgToMaterialModel fail, msgInfo is null");
            return null;
        }
        ud5.e eVar = (ud5.e) ((fb0.i) i95.n0.c(fb0.i.class));
        eVar.getClass();
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.J(f9Var)) {
            m11.b0 v17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.v(f9Var);
            java.lang.String x17 = v17 == null ? null : com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.x(f9Var, v17, false);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgHelper", "covertMsgToMaterialModel fail, imagePath is null, return");
                return null;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(x17)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
                c17 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("image/jpeg", "jpg", x17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x17);
                c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.c(x17);
            }
            return new jz5.l(c17, bi1.g.IMAGE);
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k1.N(f9Var)) {
            i95.m c18 = i95.n0.c(tg3.u0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            java.lang.String e86 = tg3.u0.e8((tg3.u0) c18, f9Var, bm5.f0.f104104s, f9Var.z0(), false, 8, null);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e86)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgHelper", "covertMsgToMaterialModel fail, videoPath is null, return");
                return null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(e86);
            return new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.a(e86), z17 ? bi1.g.VIDEO : null);
        }
        boolean n27 = f9Var.n2();
        bi1.g gVar = bi1.g.ATTACH;
        if (n27) {
            nm5.b wi6 = eVar.wi(f9Var);
            if (wi6 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgHelper", "covertMsgToMaterialModel fail, filePathAndExt is null, return");
                return null;
            }
            java.lang.String str = (java.lang.String) wi6.a(0);
            java.lang.String str2 = (java.lang.String) wi6.a(1);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return new jz5.l(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622.b(str, str2), z17 ? gVar : null);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgHelper", "covertMsgToMaterialModel fail, fileExt is null");
            return null;
        }
        if (f9Var.b3()) {
            return new jz5.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("text/message", "text/message", ""), z17 ? gVar : null);
        }
        if (f9Var.k2()) {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            java.lang.Boolean bool = db0.f.f309360b;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                db0.f.f309360b = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_wxa_material_open_msg_webview, 0) == 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenMsgABTest", "enableWebViewOpenABTest:" + db0.f.f309360b);
                java.lang.Boolean bool2 = db0.f.f309360b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool2);
                booleanValue = bool2.booleanValue();
            }
            if (booleanValue) {
                java.lang.String j17 = f9Var.j();
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(f9Var.Q0()) && f9Var.A0() == 0) {
                    j17 = c01.w9.u(f9Var.j());
                }
                ot0.q v18 = ot0.q.v(j17);
                nm5.b c19 = (v18 == null || v18.f430199i != 5) ? null : nm5.j.c(java.lang.Boolean.TRUE, v18.f430207k);
                if (c19 != null) {
                    java.lang.Object a17 = c19.a(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "$1(...)");
                    if (((java.lang.Boolean) a17).booleanValue()) {
                        return new jz5.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622("text/html", "html", (java.lang.String) c19.a(1)), z17 ? bi1.g.WEB_VIEW : null);
                    }
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenMsgHelper", "covertMsgToMaterialModel fail, msg:" + f9Var.mo78013xfb85f7b0() + " not support");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(com.p314xaae8f345.mm.p2621x8fb0427b.f9 r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.U1()
            if (r6 != 0) goto L8
            java.lang.String r6 = ""
        L8:
            v05.b r0 = new v05.b
            r0.<init>()
            r0.m126728xdc93280d(r6)
            int r6 = r0.f449898d
            int r1 = r6 + 6
            int r1 = r0.m75939xb282bd08(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            if (r1 == 0) goto L43
            r1.intValue()
            int r3 = r1.intValue()
            r4 = 6
            if (r3 == r4) goto L41
            r3 = 130(0x82, float:1.82E-43)
            int r4 = r1.intValue()
            if (r4 == r3) goto L41
            r3 = 74
            int r4 = r1.intValue()
            if (r4 == r3) goto L41
            r3 = 131(0x83, float:1.84E-43)
            int r1 = r1.intValue()
            if (r1 != r3) goto L43
        L41:
            r1 = r2
            goto L44
        L43:
            r1 = 0
        L44:
            if (r1 == 0) goto L6a
            int r1 = r0.f513848e
            int r1 = r1 + 8
            com.tencent.mm.protobuf.f r1 = r0.m75936x14adae67(r1)
            v05.a r1 = (v05.a) r1
            if (r1 == 0) goto L63
            java.lang.String r1 = r1.s()
            if (r1 == 0) goto L63
            boolean r3 = r26.n0.N(r1)
            r2 = r2 ^ r3
            if (r2 == 0) goto L60
            goto L61
        L60:
            r1 = 0
        L61:
            if (r1 != 0) goto L70
        L63:
            int r6 = r6 + 2
            java.lang.String r1 = r0.m75945x2fec8307(r6)
            goto L70
        L6a:
            int r6 = r6 + 2
            java.lang.String r1 = r0.m75945x2fec8307(r6)
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: db0.g.d(com.tencent.mm.storage.f9):java.lang.String");
    }
}

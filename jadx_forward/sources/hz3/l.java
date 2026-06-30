package hz3;

/* loaded from: classes12.dex */
public final class l extends hz3.p {
    @Override // hz3.p, hz3.a0
    public void a(ry3.p request, hz3.z zVar) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        long j17 = request.f483060a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(request.f483063d, request.f483062c);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        hz3.j jVar = new hz3.j(h0Var, c0Var, c0Var2);
        if (!n17.J2() && !n17.o2()) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            jVar.mo147xb9724478(null, bool, bool);
            i17 = 1;
        } else if (n17.A0() == 1) {
            long m124847x74d37ac6 = n17.m124847x74d37ac6();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 T1 = m11.b1.Di().T1(n17.Q0(), m124847x74d37ac6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(T1, "getByMsgLocalId(...)");
            if (T1.f404166a == 0) {
                long I0 = n17.I0();
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                T1 = m11.b1.Di().b2(n17.Q0(), I0);
            }
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            i17 = 1;
            java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(n17, bm5.f0.f104095g, m11.b1.Di().G2(n17.Q0(), T1), "", "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(aj6)) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                aj6 = m11.b1.Di().P0(aj6);
            }
            if (com.p314xaae8f345.mm.vfs.w6.j(aj6)) {
                java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                jVar.mo147xb9724478(aj6, bool2, bool2);
            } else {
                java.lang.String str = T1.f404170e;
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String y27 = m11.b1.Di().y2(n17, bm5.c0.f104083a.d(T1.l()), str, "", "");
                if (com.p314xaae8f345.mm.vfs.w6.j(y27)) {
                    java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                    jVar.mo147xb9724478(y27, bool3, bool3);
                }
            }
        } else {
            i17 = 1;
            long I02 = n17.I0();
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            m11.b0 b27 = m11.b1.Di().b2(n17.Q0(), I02);
            if (b27.j()) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                java.lang.String G2 = m11.b1.Di().G2(n17.Q0(), b27);
                i95.m c17 = i95.n0.c(tg3.u0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                java.lang.String ob6 = tg3.u0.ob((tg3.u0) c17, n17, bm5.f0.f104095g, G2, "", "", false, false, 64, null);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.g(ob6)) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    ob6 = m11.b1.Di().P0(ob6);
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(ob6)) {
                    java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
                    jVar.mo147xb9724478(ob6, bool4, bool4);
                }
            }
            java.lang.String str2 = b27.f404170e;
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            java.lang.String y28 = m11.b1.Di().y2(n17, bm5.c0.f104083a.d(b27.l()), str2, "", "");
            if (com.p314xaae8f345.mm.vfs.w6.j(y28)) {
                jVar.mo147xb9724478(y28, java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(b27.j()));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat msgId: %s, talker: %s, session: %s, isHdImageValid: %s, hasHd: %s", java.lang.Long.valueOf(request.f483062c), request.f483063d, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(c0Var.f391645d), java.lang.Boolean.valueOf(c0Var2.f391645d));
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        hz3.s sVar = new hz3.s(j17, 2);
        c(request.f483062c, request.f483063d, sVar, c0Var.f391645d);
        hz3.s sVar2 = new hz3.s(j17, i17);
        java.lang.String str3 = (java.lang.String) h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
        sVar2.f367888b = str3;
        c(request.f483062c, request.f483063d, sVar2, c0Var.f391645d);
        hz3.t a17 = hz3.v.a(sVar, hz3.i.a(request.f483061b));
        hz3.t a18 = hz3.v.a(sVar2, hz3.i.a(request.f483061b));
        java.lang.String str4 = request.f483064e;
        if (str4 == null || str4.length() == 0) {
            if (com.p314xaae8f345.mm.vfs.w6.j(sVar2.f367888b)) {
                request.f483064e = sVar2.f367888b;
            } else if (com.p314xaae8f345.mm.vfs.w6.j(sVar.f367888b)) {
                request.f483064e = sVar.f367888b;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AiScanChatImageStrategy", "getCDNImageInfoList-chat result midImage fileId: %s, aesKey: %s, hdImage fileId: %s aesKey: %s", sVar.f367890d, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(sVar.f367891e), sVar2.f367890d, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(sVar2.f367891e));
        hz3.k kVar = new hz3.k(h0Var2, h0Var3, arrayList, c0Var, c0Var2, j17, request, sVar, sVar2, zVar);
        h0Var2.f391656d = sVar.a();
        h0Var3.f391656d = sVar2.a();
        int i18 = a17.f367894a;
        if (i18 == 1) {
            b(request, sVar, kVar);
            return;
        }
        int i19 = a18.f367894a;
        if (i19 == 1) {
            b(request, sVar2, kVar);
            return;
        }
        if (i19 == 2) {
            b(request, sVar2, kVar);
            return;
        }
        if (i18 == 2) {
            b(request, sVar, kVar);
            return;
        }
        hz3.t tVar = new hz3.t();
        tVar.f367896c = 3;
        tVar.f367897d = 401;
        kVar.b(tVar);
    }

    public final void c(long j17, java.lang.String str, hz3.s sVar, boolean z17) {
        int i17 = sVar.f367887a;
        if (i17 == 2) {
            sVar.f367892f = 0;
            java.lang.String b17 = hz3.m.f367881a.b(pt0.f0.f439742b1.n(str, j17));
            if (b17 == null) {
                b17 = "";
            }
            sVar.f367888b = b17;
        } else if (i17 == 1) {
            sVar.f367892f = z17 ? 1 : 0;
        }
        java.lang.String str2 = sVar.f367888b;
        android.graphics.Point point = null;
        if (!(str2 == null || str2.length() == 0) && com.p314xaae8f345.mm.vfs.w6.j(str2)) {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            com.p314xaae8f345.mm.p786x600aa8b.e.d(str2, options);
            point = new android.graphics.Point(options.outWidth, options.outHeight);
        }
        sVar.f367889c = point;
        hz3.m.a(sVar, j17, str, sVar.f367892f);
    }

    @Override // hz3.p, hz3.a0
    /* renamed from: name */
    public java.lang.String mo134285x337a8b() {
        return "MicroMsg.AiScanChatImageStrategy";
    }
}

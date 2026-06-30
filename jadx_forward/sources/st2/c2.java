package st2;

/* loaded from: classes3.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static final st2.c2 f493782a = new st2.c2();

    public final java.lang.String a(java.lang.String url, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (r26.n0.B(url, "?", false)) {
            return url + "&objectId=" + pm0.v.u(j17);
        }
        if (!(url.length() > 0)) {
            return url;
        }
        return url + "?objectId=" + pm0.v.u(j17);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig b(gk2.e liveData, r45.y23 productInfo, r45.ce0 ce0Var) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String m75945x2fec8307;
        int i17;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(productInfo, "productInfo");
        java.lang.String finderUsername = ((mm2.c1) liveData.a(mm2.c1.class)).f410385o;
        long j17 = ((mm2.e1) liveData.a(mm2.e1.class)).f410516m;
        java.lang.String nonceId = ((mm2.e1) liveData.a(mm2.e1.class)).f410525v;
        zl2.b0 b0Var = zl2.b0.f555196a;
        java.lang.String u17 = pm0.v.u(((mm2.e1) liveData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        r45.br2 br2Var = new r45.br2();
        br2Var.set(0, u17);
        br2Var.set(1, finderUsername);
        br2Var.set(2, pm0.v.u(j17));
        br2Var.set(3, nonceId);
        br2Var.set(4, "");
        r45.ce0 ce0Var2 = (r45.ce0) productInfo.m75936x14adae67(9);
        if (ce0Var2 == null || (str = ce0Var2.m75945x2fec8307(0)) == null) {
            str = "";
        }
        br2Var.set(5, str);
        r45.ce0 ce0Var3 = (r45.ce0) productInfo.m75936x14adae67(9);
        if (ce0Var3 == null || (str2 = ce0Var3.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        br2Var.set(6, str2);
        br2Var.set(7, pm0.v.u(productInfo.m75942xfb822ef2(0)));
        java.util.LinkedList m75941xfb821914 = productInfo.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getImg_urls(...)");
        java.lang.String str5 = (java.lang.String) kz5.n0.a0(m75941xfb821914, 0);
        if (str5 == null) {
            str5 = "";
        }
        br2Var.set(8, str5);
        java.lang.String m75945x2fec83074 = productInfo.m75945x2fec8307(1);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        br2Var.set(9, m75945x2fec83074);
        br2Var.set(11, java.lang.Integer.valueOf(productInfo.m75939xb282bd08(5)));
        br2Var.set(27, java.lang.Boolean.valueOf(productInfo.m75939xb282bd08(36) != 0));
        k91.v5 Ai = ((k91.g4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f6.class))).Ai(br2Var.m75945x2fec8307(5));
        if (Ai == null || (str3 = Ai.f68907x6b8edeb4) == null) {
            str3 = "";
        }
        br2Var.set(12, str3);
        if (Ai == null || (str4 = Ai.f68913x21f9b213) == null) {
            str4 = "";
        }
        br2Var.set(13, str4);
        r45.e07 e07Var = (r45.e07) productInfo.m75936x14adae67(32);
        br2Var.set(18, e07Var != null ? e07Var.m75945x2fec8307(2) : null);
        java.util.LinkedList m75941xfb8219142 = productInfo.m75941xfb821914(34);
        br2Var.set(20, m75941xfb8219142 != null ? (java.lang.String) kz5.n0.Z(m75941xfb8219142) : null);
        java.util.LinkedList m75941xfb8219143 = productInfo.m75941xfb821914(34);
        br2Var.set(22, m75941xfb8219143 != null ? (java.lang.String) kz5.n0.a0(m75941xfb8219143, 1) : null);
        br2Var.set(34, productInfo.m75933x41a8a7f2(63) ? "1" : "");
        br2Var.set(35, productInfo.m75945x2fec8307(65));
        r45.id5 id5Var = (r45.id5) productInfo.m75936x14adae67(74);
        br2Var.set(36, id5Var != null ? id5Var.m75945x2fec8307(0) : null);
        br2Var.set(37, id5Var != null ? id5Var.m75945x2fec8307(1) : null);
        br2Var.set(38, id5Var != null ? id5Var.m75945x2fec8307(2) : null);
        br2Var.set(39, id5Var != null ? id5Var.m75945x2fec8307(3) : null);
        java.lang.String m75945x2fec83075 = ce0Var != null ? ce0Var.m75945x2fec8307(2) : null;
        if (!(m75945x2fec83075 == null || m75945x2fec83075.length() == 0)) {
            java.lang.String m75945x2fec83076 = ce0Var != null ? ce0Var.m75945x2fec8307(3) : null;
            if (!(m75945x2fec83076 == null || m75945x2fec83076.length() == 0)) {
                if (ce0Var == null || (m75945x2fec8307 = ce0Var.m75945x2fec8307(2)) == null) {
                    m75945x2fec8307 = br2Var.m75945x2fec8307(12);
                }
                br2Var.set(12, m75945x2fec8307);
                if (ce0Var == null || (m75945x2fec83073 = ce0Var.m75945x2fec8307(3)) == null) {
                    i17 = 13;
                    m75945x2fec83072 = br2Var.m75945x2fec8307(13);
                } else {
                    m75945x2fec83072 = m75945x2fec83073;
                    i17 = 13;
                }
                br2Var.set(i17, m75945x2fec83072);
            }
        }
        if (productInfo.m75939xb282bd08(31) != 0) {
            br2Var.set(10, java.lang.Integer.valueOf(productInfo.m75939xb282bd08(4)));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("platformHeadImg:");
        sb6.append(br2Var.m75945x2fec8307(12));
        sb6.append(" platformName: ");
        sb6.append(br2Var.m75945x2fec8307(13));
        sb6.append(", page:");
        sb6.append(ce0Var != null ? ce0Var.m75945x2fec8307(2) : null);
        sb6.append(", ");
        sb6.append(ce0Var != null ? ce0Var.m75945x2fec8307(3) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductShareUtil", sb6.toString());
        br2Var.set(14, "");
        r45.y64 d17 = cm2.a.f124861a.d(productInfo);
        if (d17 != null) {
            long c17 = c01.id.c();
            if (d17.m75942xfb822ef2(1) > c17 && d17.m75939xb282bd08(0) > 0) {
                br2Var.set(15, java.lang.Integer.valueOf(d17.m75939xb282bd08(0)));
                br2Var.set(16, java.lang.Long.valueOf(d17.m75942xfb822ef2(1)));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderProductShareUtil", productInfo.m75945x2fec8307(1) + ",discount_price:" + d17.m75939xb282bd08(0) + ", serverTime:" + c17 + ",end_time_ms:" + d17.m75942xfb822ef2(1));
        }
        br2Var.set(29, productInfo.m75945x2fec8307(30));
        br2Var.set(17, ((mm2.c1) liveData.a(mm2.c1.class)).f410319c3);
        zl2.b0.f555198c = br2Var;
        java.lang.String u18 = pm0.v.u(c01.id.a());
        zl2.b0.f555197b.put(u18, br2Var);
        b0Var.f(br2Var, "Finder.FinderProductShareUtilput");
        b0Var.g(br2Var, "commodity_item", zl2.b0.d(b0Var, br2Var, null, null, null, null, 30, null));
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig(true, u18);
    }

    public final l81.b1 c(r45.y23 data, int i17, byte[] bArr, java.lang.String setSceneNote, gk2.e eVar, boolean z17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setSceneNote, "setSceneNote");
        r45.ce0 ce0Var = z17 ? (r45.ce0) data.m75936x14adae67(9) : (r45.ce0) data.m75936x14adae67(8);
        boolean z18 = false;
        if (ce0Var != null && (m75945x2fec8307 = ce0Var.m75945x2fec8307(0)) != null) {
            if (eVar != null && (hashMap2 = ((mm2.f6) eVar.a(mm2.f6.class)).Q) != null) {
                java.lang.String m75945x2fec83072 = ce0Var.m75945x2fec8307(2);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                hashMap2.put(m75945x2fec8307, m75945x2fec83072);
            }
            if (eVar != null && (hashMap = ((mm2.f6) eVar.a(mm2.f6.class)).R) != null) {
                java.lang.String m75945x2fec83073 = ce0Var.m75945x2fec8307(3);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                hashMap.put(m75945x2fec8307, m75945x2fec83073);
            }
        }
        boolean z19 = ce0Var != null && ce0Var.m75939xb282bd08(5) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.MiniProgramPayloadHelper", "showNavigationBar:" + z19);
        l81.b1 b1Var = new l81.b1();
        dk2.ah ahVar = new dk2.ah();
        java.lang.String m75945x2fec83074 = data.m75945x2fec8307(13);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        ahVar.f314744d = m75945x2fec83074;
        ahVar.f314745e = data.m75942xfb822ef2(0);
        ahVar.f314748h = "";
        ahVar.f314747g = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63;
        ahVar.f314753p = -1;
        ahVar.f314754q = bArr;
        ahVar.f314756s = z17;
        ahVar.f314757t = !z17;
        ahVar.f314760w = ce0Var != null && ce0Var.m75933x41a8a7f2(8);
        b1Var.f398561i = ahVar;
        if (ce0Var == null || (str = ce0Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        b1Var.f398547b = str;
        if (ce0Var == null || (str2 = ce0Var.m75945x2fec8307(1)) == null) {
            str2 = "";
        }
        b1Var.f398555f = str2;
        b1Var.f398565k = i17;
        b1Var.f398567l = setSceneNote;
        int e17 = f493782a.e();
        k91.s2 s2Var = k91.s2.f387293d;
        k91.t2 t2Var = z19 ? k91.t2.f387300e : k91.t2.f387301f;
        boolean z27 = !z19;
        k91.y2 y2Var = k91.y2.f387360d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo h17 = zl2.q4.f555466a.h(ce0Var);
        int dimension = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        if (ce0Var != null && ce0Var.m75933x41a8a7f2(8)) {
            z18 = true;
        }
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, e17, s2Var, false, null, false, null, t2Var, z17, z19, null, y2Var, z27, false, null, false, 0, null, 0, 0, 0, !z18, false, false, null, false, h17, dimension, false, null, z17, 0, false, false, false, false, null, null, null, false, null, null, false, -1277172616, 2047, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98 c11812xa040dc98 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11812xa040dc98();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String m75945x2fec83075 = data.m75945x2fec8307(26);
        if (m75945x2fec83075 == null) {
            m75945x2fec83075 = "";
        }
        jSONObject.put("cookies", m75945x2fec83075);
        c11812xa040dc98.f158855d = 1;
        c11812xa040dc98.f158858g = jSONObject.toString();
        b1Var.f398574s = c11812xa040dc98;
        return b1Var;
    }

    public final l81.b1 d(android.content.Context context, r45.ce0 page, int i17, byte[] locClickId, java.lang.String setSceneNote, gk2.e eVar) {
        java.util.HashMap hashMap;
        java.util.HashMap hashMap2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(page, "page");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locClickId, "locClickId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(setSceneNote, "setSceneNote");
        java.lang.String m75945x2fec8307 = page.m75945x2fec8307(0);
        if (m75945x2fec8307 != null) {
            if (eVar != null && (hashMap2 = ((mm2.f6) eVar.a(mm2.f6.class)).Q) != null) {
                java.lang.String m75945x2fec83072 = page.m75945x2fec8307(2);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                hashMap2.put(m75945x2fec8307, m75945x2fec83072);
            }
            if (eVar != null && (hashMap = ((mm2.f6) eVar.a(mm2.f6.class)).R) != null) {
                java.lang.String m75945x2fec83073 = page.m75945x2fec8307(3);
                if (m75945x2fec83073 == null) {
                    m75945x2fec83073 = "";
                }
                hashMap.put(m75945x2fec8307, m75945x2fec83073);
            }
        }
        boolean z17 = page.m75939xb282bd08(5) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.MiniProgramPayloadHelper", "getBundleFromPage showNavigationBar:" + z17);
        l81.b1 b1Var = new l81.b1();
        dk2.ah ahVar = new dk2.ah();
        ahVar.f314748h = "";
        ahVar.f314747g = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19904x66446a63;
        ahVar.f314753p = -1;
        ahVar.f314754q = locClickId;
        ahVar.f314756s = false;
        ahVar.f314757t = true;
        ahVar.f314760w = page.m75933x41a8a7f2(8);
        b1Var.f398561i = ahVar;
        boolean z18 = ahVar.f314756s;
        boolean z19 = ahVar.f314757t;
        java.lang.String m75945x2fec83074 = page.m75945x2fec8307(0);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        b1Var.f398547b = m75945x2fec83074;
        java.lang.String m75945x2fec83075 = page.m75945x2fec8307(1);
        b1Var.f398555f = m75945x2fec83075 != null ? m75945x2fec83075 : "";
        b1Var.f398565k = i17;
        b1Var.f398567l = setSceneNote;
        int e17 = f493782a.e();
        k91.s2 s2Var = k91.s2.f387293d;
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, e17, s2Var, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.BackgroundShapeConfig(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.z_), true, true, false, false, 24, null), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CloseWhenClickEmptyAreaConfig(context.getClass().getName(), s2Var), z17 ? k91.t2.f387300e : k91.t2.f387301f, z18, z17, null, k91.y2.f387360d, !z17, z19, null, false, 0, null, 0, 0, 0, !(page.m75933x41a8a7f2(8)), false, false, null, false, zl2.q4.f555466a.h(page), (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), z18 && !z19, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -471874560, 2047, null);
        return b1Var;
    }

    public final int e() {
        float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        }
        return (int) ((ae2.in.f85221a.h0() / 100.0f) * f17);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x032d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(android.content.Context r64, gk2.e r65, cm2.m0 r66, byte[] r67, boolean r68, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r69) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.f(android.content.Context, gk2.e, cm2.m0, byte[], boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (r10 == null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x04a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r69, gk2.e r70, cm2.m0 r71, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r72) {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.g(android.content.Context, gk2.e, cm2.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r78, gk2.e r79, cm2.m0 r80, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r81) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.h(android.content.Context, gk2.e, cm2.m0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.content.Context r16, gk2.e r17, cm2.m0 r18, boolean r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.i(android.content.Context, gk2.e, cm2.m0, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.content.Context r62, gk2.e r63, cm2.m0 r64, byte[] r65, boolean r66, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r67) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c2.j(android.content.Context, gk2.e, cm2.m0, byte[], boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k(l81.b1 bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLive.MiniProgramPayloadHelper", "[appId:" + bundle.f398547b + ",path:" + bundle.f398555f + ",halfScreen:" + bundle.G.c() + ",scene:" + bundle.f398565k + ",sceneNote:" + bundle.f398567l + ",extraData:" + bundle.f398561i + ']');
    }
}

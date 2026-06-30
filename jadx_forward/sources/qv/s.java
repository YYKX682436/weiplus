package qv;

@j95.b(m140513x1e06fd29 = {r01.q3.class})
/* loaded from: classes7.dex */
public final class s extends i95.w implements qk.r6 {
    public boolean Ai() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_mp_screenshot_show_source, false);
    }

    public com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 Bi(java.lang.String imgPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        com.p314xaae8f345.mm.p2621x8fb0427b.r1 mj6 = r01.q3.mj();
        mj6.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p1 y07 = mj6.y0(imgPath);
        if (y07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizScreenshotInfoStorage", "queryNonExpired, screenshotPath: " + imgPath + ", screenshotInfo is null");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizScreenshotInfoStorage", "queryNonExpired, screenshotInfo: " + y07);
        pm0.v.K(null, new com.p314xaae8f345.mm.p2621x8fb0427b.q1(mj6));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1() - y07.f67193x90a4a338 >= 2592000) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizScreenshotInfoStorage", "queryNonExpired, screenshotInfo is expired");
            return null;
        }
        java.lang.String field_screenshotMd5 = y07.f67191xe3a21bb3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_screenshotMd5, "field_screenshotMd5");
        java.lang.String field_url = y07.f67194x4b6e88aa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_url, "field_url");
        return new com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6(field_screenshotMd5, field_url, y07.f67189x1d6ee32f, y07.f67187x4b6e404e, y07.f67190x4b6e6983, y07.f67188x4b6e59f8);
    }

    public void Di(com.p314xaae8f345.mm.p954x7e3e6bb0.C11124xda6b8ad6 info, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (Ai()) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6346x626fd5c3 c6346x626fd5c3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6346x626fd5c3();
            c6346x626fd5c3.f136956d = c6346x626fd5c3.b("url", info.f152785e, true);
            c6346x626fd5c3.f136957e = info.f152787g;
            c6346x626fd5c3.f136958f = info.f152788h;
            c6346x626fd5c3.f136959g = info.f152789i;
            c6346x626fd5c3.f136960h = i17;
            c6346x626fd5c3.f136961i = i18;
            c6346x626fd5c3.k();
        }
    }

    public boolean wi(java.lang.String str) {
        boolean z17;
        r01.q3.mj().getClass();
        if (str == null) {
            return false;
        }
        java.util.List list = com.p314xaae8f345.mm.p2621x8fb0427b.r1.f276794e;
        if (!(list instanceof java.util.Collection) || !((java.util.ArrayList) list).isEmpty()) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                if (r26.n0.B(str, str2, false)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17;
    }
}

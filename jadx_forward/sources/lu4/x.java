package lu4;

/* loaded from: classes7.dex */
public final class x extends lu4.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(lu4.y context) {
        super("wxVideoPrefetcher", context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @android.webkit.JavascriptInterface
    /* renamed from: cacheVideo */
    public final void m146373x137d619(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.q0) ((lu4.y) this.f402963b)).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.u.f175984a;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1379L, 51L, 1L, false);
            cl0.e eVar = new cl0.e(data);
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                cl0.g jSONObject = eVar.getJSONObject(i17);
                java.lang.String mo15082x48bce8a4 = jSONObject.mo15082x48bce8a4("url");
                long optLong = jSONObject.optLong("position");
                int optInt = jSONObject.optInt("preloadType");
                long optLong2 = jSONObject.optLong("length");
                if (optLong2 > 10485760) {
                    optLong2 = 10485760;
                }
                int mo15080xc3ca103c = jSONObject.mo15080xc3ca103c("videoType", 0);
                if (optLong2 < 512000) {
                    optLong2 = 512000;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo15082x48bce8a4)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizVideoPreloadLogic", "cacheVideo url is null");
                    return;
                }
                java.lang.String str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
                if (optInt != 0) {
                    str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274591f;
                }
                java.lang.String str2 = str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo15082x48bce8a4);
                uVar.b(str2, mo15082x48bce8a4, optLong, optLong2, mo15080xc3ca103c);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizVideoPreloadLogic", "cacheVideo ex " + e17.getMessage());
        }
    }
}

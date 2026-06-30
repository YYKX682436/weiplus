package g73;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f350839a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f350840b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f350841c;

    /* renamed from: d, reason: collision with root package name */
    public final g73.m f350842d;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
    }

    public n(android.os.Looper looper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(looper, "looper");
        this.f350839a = new java.util.LinkedHashMap();
        this.f350840b = new java.util.LinkedHashMap();
        this.f350841c = new java.util.LinkedHashMap();
        this.f350842d = new g73.m(looper, this);
    }

    public final int a(com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 abstractC16085x8c838260) {
        int mo65028xe67d4b7a = abstractC16085x8c838260.mo65028xe67d4b7a();
        int i17 = 1;
        if (mo65028xe67d4b7a == 1) {
            i17 = 4;
        } else if (mo65028xe67d4b7a != 2) {
            if (mo65028xe67d4b7a != 3) {
                i17 = mo65028xe67d4b7a != 6 ? mo65028xe67d4b7a != 7 ? 0 : 22 : 21;
            }
        } else if (abstractC16085x8c838260 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) {
            java.lang.String url = ((com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16092xbbe22aef) abstractC16085x8c838260).getUrl();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "<this>");
            if (!r26.i0.y(url, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s?", false)) {
                if (!r26.i0.y(url, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s?", false)) {
                    if (!r26.i0.y(url, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s/", false)) {
                        if (!r26.i0.y(url, "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/s/", false)) {
                            i17 = 0;
                        }
                    }
                }
            }
            i17 = i17 != 0 ? 26 : 2;
        } else {
            i17 = -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HandOff.RequestProcessor", "convert handoffType from " + abstractC16085x8c838260.mo65028xe67d4b7a() + " to " + i17);
        return i17;
    }
}

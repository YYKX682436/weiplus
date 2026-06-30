package la2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final la2.d f399043a = new la2.d();

    public static void a(la2.d dVar, android.content.Context context, r45.ze2 location, boolean z17, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        if ((i18 & 8) != 0) {
            i17 = 5;
        }
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(location.m75945x2fec8307(5))) {
            java.lang.String MM_NEAR_LIFE_URI = o45.yf.f424570a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MM_NEAR_LIFE_URI, "MM_NEAR_LIFE_URI");
            java.lang.String format = java.lang.String.format(MM_NEAR_LIFE_URI, java.util.Arrays.copyOf(new java.lang.Object[]{location.m75945x2fec8307(5)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("map_view_type", 7);
        intent2.putExtra("kwebmap_slat", java.lang.Double.valueOf(location.m75938x746dc8a6(1)));
        intent2.putExtra("kwebmap_lng", java.lang.Double.valueOf(location.m75938x746dc8a6(0)));
        intent2.putExtra("kwebmap_scale", i17);
        java.lang.String m75945x2fec8307 = location.m75945x2fec8307(3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            m75945x2fec8307 = location.m75945x2fec8307(2);
        }
        intent2.putExtra("kPoiName", m75945x2fec8307);
        intent2.putExtra("Kwebmap_locaion", location.m75945x2fec8307(4));
        intent2.putExtra("kShowshare", z17);
        j45.l.j(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent2, null);
    }

    public final void b(android.content.Context context, android.content.Intent intent, int i17, r45.f96 location, boolean z17, int i18, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("map_view_type", i17);
        intent.putExtra("kwebmap_slat", location.m75938x746dc8a6(1));
        intent.putExtra("kwebmap_lng", location.m75938x746dc8a6(0));
        intent.putExtra("kPoiid", location.m75945x2fec8307(5));
        intent.putExtra("KIsFromPoiList", location.m75933x41a8a7f2(16));
        if (z19) {
            intent.putExtra("key_enable_flutter_poi", z19);
        }
        java.lang.String m75945x2fec8307 = location.m75945x2fec8307(3);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
            m75945x2fec8307 = location.m75945x2fec8307(2);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(location.m75945x2fec8307(4))) {
                i18 = 9;
            }
        }
        intent.putExtra("kPoiName", m75945x2fec8307);
        intent.putExtra("Kwebmap_locaion", location.m75945x2fec8307(4));
        intent.putExtra("kwebmap_scale", i18);
        intent.putExtra("kShowshare", z17);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        intent.putExtra("key_drawer_expend", z18);
        if (intent.getSerializableExtra("key_from_type") == null) {
            intent.putExtra("key_from_type", zy2.o9.f559050e);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        java.lang.String m75945x2fec83072 = nyVar != null ? nyVar.V6().m75945x2fec8307(1) : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec83072)) {
            intent.putExtra("key_context_id", m75945x2fec83072);
        }
        j45.l.j(context, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }
}

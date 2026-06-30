package zl2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final zl2.g f555303a = new zl2.g();

    public final void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6668x8d965adc c6668x8d965adc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6668x8d965adc();
        c6668x8d965adc.f140103l = c6668x8d965adc.b("Event", str, true);
        c6668x8d965adc.f140104m = c6668x8d965adc.b("Params", r26.i0.t(str2, ",", ";", false), true);
        c6668x8d965adc.k();
    }

    public final void b(java.lang.String coupon_id, java.lang.String noticeid, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coupon_id, "coupon_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeid, "noticeid");
        cl0.g gVar = new cl0.g();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gVar.h("finderuin", xy2.c.e(context));
        gVar.h("coupon_id", coupon_id);
        gVar.h("noticeid", noticeid);
        gVar.o(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, i17);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        a("click_get_coupon_btn_after_reserve", gVar2);
    }

    public final void c(java.lang.String coupon_id, java.lang.String noticeid, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coupon_id, "coupon_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeid, "noticeid");
        cl0.g gVar = new cl0.g();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gVar.h("finderuin", xy2.c.e(context));
        gVar.h("coupon_id", coupon_id);
        gVar.h("noticeid", noticeid);
        gVar.o("ui_position", z17 ? 2 : 1);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        a("click_get_coupon_btn_after_reserve_of_profile", gVar2);
    }

    public final void d(java.lang.String coupon_id, java.lang.String noticeid, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coupon_id, "coupon_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeid, "noticeid");
        cl0.g gVar = new cl0.g();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        gVar.h("finderuin", xy2.c.e(context));
        gVar.h("coupon_id", coupon_id);
        gVar.h("noticeid", noticeid);
        gVar.o("ui_position", z17 ? 2 : 1);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        a("expose_get_coupon_btn_after_reserve_of_profile", gVar2);
    }
}

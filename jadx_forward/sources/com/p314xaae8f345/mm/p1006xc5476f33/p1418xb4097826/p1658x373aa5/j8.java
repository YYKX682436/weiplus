package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class j8 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f213954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ al5.u4 f213955b;

    public j8(android.app.Activity activity, al5.u4 u4Var) {
        this.f213954a = activity;
        this.f213955b = u4Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g
    public final void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_START_HALF_ACTIVITY_PREFERENCE", "settings_finder_switch");
        java.lang.Long FINDER_SHARE_ENTER_TIMELINE = com.p314xaae8f345.mm.ui.t2.f291402c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(FINDER_SHARE_ENTER_TIMELINE, "FINDER_SHARE_ENTER_TIMELINE");
        intent.putExtra("KEY_ENTER_SCENE", FINDER_SHARE_ENTER_TIMELINE.longValue());
        i95.m c17 = i95.n0.c(wd0.z1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((vd0.o3) ((wd0.z1) c17)).Zi(this.f213954a, intent);
        this.f213955b.dismiss();
    }
}

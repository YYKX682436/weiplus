package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class rc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18651x182090c3 f255782d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18651x182090c3 activityC18651x182090c3) {
        super(0);
        this.f255782d = activityC18651x182090c3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById = this.f255782d.findViewById(com.p314xaae8f345.mm.R.id.j8i);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = (p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.kod);
        if (c1190x18d3c3fe != null) {
            return new ui4.f(frameLayout, frameLayout, c1190x18d3c3fe);
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(com.p314xaae8f345.mm.R.id.kod)));
    }
}

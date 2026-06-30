package com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220;

/* renamed from: com.tencent.mm.plugin.location.ui.impl.TrackPointAnimAvatar */
/* loaded from: classes15.dex */
public class C16299x7c6037cf extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f226255d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f226256e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f226257f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f226258g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.animation.Animation f226259h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f226260i;

    public C16299x7c6037cf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f226255d = context;
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(this.f226255d, com.p314xaae8f345.mm.R.C30864xbddafb2a.d2_, this);
        this.f226256e = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564575v1);
        this.f226257f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564574v0);
        android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -0.5f);
        this.f226259h = translateAnimation;
        translateAnimation.setDuration(500L);
        this.f226259h.setFillAfter(true);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -0.5f, 1, 0.0f);
        this.f226260i = translateAnimation2;
        translateAnimation2.setDuration(500L);
        this.f226260i.setFillAfter(true);
        this.f226259h.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.o2(this));
        this.f226260i.setAnimationListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p2(this));
    }

    /* renamed from: setUser */
    public void m65970x76511b4d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        this.f226258g = str;
        if (this.f226257f != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ni(this.f226257f, this.f226258g);
        }
    }

    public C16299x7c6037cf(android.content.Context context) {
        super(context);
        this.f226255d = context;
        a();
    }
}

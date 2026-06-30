package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class o5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 f214297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f214298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f214299f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214300g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214301h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15269x718714b0 c15269x718714b0, java.lang.CharSequence charSequence, android.widget.FrameLayout frameLayout, android.view.View view, android.view.View view2) {
        super(0);
        this.f214297d = c15269x718714b0;
        this.f214298e = charSequence;
        this.f214299f = frameLayout;
        this.f214300g = view;
        this.f214301h = view2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f214297d.setHint(this.f214298e);
        android.widget.FrameLayout frameLayout = this.f214299f;
        frameLayout.removeView(this.f214300g);
        frameLayout.removeView(this.f214301h);
        return jz5.f0.f384359a;
    }
}

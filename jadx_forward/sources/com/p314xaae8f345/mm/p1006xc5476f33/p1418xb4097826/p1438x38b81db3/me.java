package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes.dex */
public final class me extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f185525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185526e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f185527f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(yz5.a aVar, in5.s0 s0Var, android.widget.FrameLayout frameLayout) {
        super(0);
        this.f185525d = aVar;
        this.f185526e = s0Var;
        this.f185527f = frameLayout;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f185525d.mo152xb9724478();
        android.view.View p17 = this.f185526e.p(com.p314xaae8f345.mm.R.id.jdk);
        android.view.ViewGroup viewGroup = p17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) p17 : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(this.f185527f);
        return jz5.f0.f384359a;
    }
}

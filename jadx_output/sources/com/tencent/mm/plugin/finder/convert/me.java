package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes.dex */
public final class me extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f103992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f103994f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(yz5.a aVar, in5.s0 s0Var, android.widget.FrameLayout frameLayout) {
        super(0);
        this.f103992d = aVar;
        this.f103993e = s0Var;
        this.f103994f = frameLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f103992d.invoke();
        android.view.View p17 = this.f103993e.p(com.tencent.mm.R.id.jdk);
        android.view.ViewGroup viewGroup = p17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) p17 : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(this.f103994f);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class le extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f103916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f103918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.qe f103919g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(yz5.a aVar, in5.s0 s0Var, android.widget.FrameLayout frameLayout, com.tencent.mm.plugin.finder.convert.qe qeVar) {
        super(0);
        this.f103916d = aVar;
        this.f103917e = s0Var;
        this.f103918f = frameLayout;
        this.f103919g = qeVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f103916d.invoke();
        android.view.View p17 = this.f103917e.p(com.tencent.mm.R.id.jdk);
        android.view.ViewGroup viewGroup = p17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) p17 : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.f103918f);
        }
        this.f103919g.f104367r = null;
        return jz5.f0.f302826a;
    }
}

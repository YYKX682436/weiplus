package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.d0 f91155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hk1.e f91156e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f91157f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 f91158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.appbrand.widget.d0 d0Var, hk1.e eVar, android.widget.LinearLayout linearLayout, com.tencent.mm.plugin.appbrand.widget.halfscreen.l0 l0Var) {
        super(1);
        this.f91155d = d0Var;
        this.f91156e = eVar;
        this.f91157f = linearLayout;
        this.f91158g = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.RelativeLayout.LayoutParams c17 = this.f91155d.c();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        android.widget.LinearLayout linearLayout = this.f91157f;
        hk1.e eVar = this.f91156e;
        eVar.b(linearLayout, layoutParams);
        eVar.a((android.view.View) obj, c17);
        eVar.setExternalHeaderAnchor(this.f91158g.f91195a.f74810s);
        return jz5.f0.f302826a;
    }
}

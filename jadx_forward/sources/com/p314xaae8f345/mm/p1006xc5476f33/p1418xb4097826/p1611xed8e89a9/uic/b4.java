package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic;

/* loaded from: classes2.dex */
public final class b4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f205084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f205085e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var, java.lang.Long l17) {
        super(0);
        this.f205084d = f4Var;
        this.f205085e = l17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.f4 f4Var = this.f205084d;
        f4Var.Q6();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = f4Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c X6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.o0.class)).X6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(X6, "<get-appBarLayout>(...)");
        android.view.ViewGroup.LayoutParams layoutParams = X6.getLayoutParams();
        p012xc85e97e9.p073xee01125a.p074xd1075a44.c cVar = layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c ? (p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams : null;
        java.lang.Object obj = cVar != null ? cVar.f92539a : null;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior behavior = obj instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior ? (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior) obj : null;
        if (behavior != null) {
            behavior.B(X6.getHeight() * (-1));
        }
        f4Var.d7();
        f4Var.Z6().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.a4(f4Var), 200L);
        if (this.f205085e == null) {
            f4Var.b7("channel_profile_recentviewed", 1, 1);
        } else {
            f4Var.c7("view_clk");
        }
        return jz5.f0.f384359a;
    }
}

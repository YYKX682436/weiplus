package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        super(0);
        this.f101979d = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float q17 = i65.a.q(this.f101979d.getContext());
        return java.lang.Integer.valueOf((int) (r0.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480451ya) - (q17 > 1.0f ? (q17 - 1) * r0.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7) : 0.0f)));
    }
}

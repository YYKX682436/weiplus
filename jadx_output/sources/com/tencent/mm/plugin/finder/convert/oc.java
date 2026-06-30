package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class oc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f104167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f104168e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f104167d = baseFinderFeed;
        this.f104168e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f104167d.r1(true);
        ((android.view.View) this.f104168e.f310123d).animate().translationX(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setStartDelay(100L).setDuration(300L).start();
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.c1 f101833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.finder.activity.uic.c1 c1Var) {
        super(1);
        this.f101833d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("FinderActivityPostUIC", "setAnnounceView");
        hc2.i.h(this.f101833d.getContext());
        return jz5.f0.f302826a;
    }
}

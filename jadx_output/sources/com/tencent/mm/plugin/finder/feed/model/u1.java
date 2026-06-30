package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f108386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.x1 f108387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(java.lang.Object obj, com.tencent.mm.plugin.finder.feed.model.x1 x1Var) {
        super(0);
        this.f108386d = obj;
        this.f108387e = x1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f108386d;
        ((db2.t0) obj).f36766m = this.f108387e.getLifeCycleKeeper();
        return (az2.j) obj;
    }
}

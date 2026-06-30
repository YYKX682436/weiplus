package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class g8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.k8 f105540d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(com.tencent.mm.plugin.finder.extension.reddot.k8 k8Var) {
        super(0);
        this.f105540d = k8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return ((java.util.concurrent.locks.ReentrantReadWriteLock) ((jz5.n) this.f105540d.f105632c).getValue()).readLock();
    }
}

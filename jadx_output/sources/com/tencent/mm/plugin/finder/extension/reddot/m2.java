package com.tencent.mm.plugin.finder.extension.reddot;

@j95.b
/* loaded from: classes8.dex */
public final class m2 extends i95.w implements zy2.aa {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f105700d = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f105700d;
        if (atomicBoolean.get()) {
            pm0.v.K(null, new com.tencent.mm.plugin.finder.extension.reddot.l2(this));
            atomicBoolean.compareAndSet(true, false);
        }
    }
}

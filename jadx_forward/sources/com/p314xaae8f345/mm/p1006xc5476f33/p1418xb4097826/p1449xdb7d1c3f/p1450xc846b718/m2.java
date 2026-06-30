package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718;

@j95.b
/* loaded from: classes8.dex */
public final class m2 extends i95.w implements zy2.aa {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f187233d = new java.util.concurrent.atomic.AtomicBoolean(false);

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f187233d;
        if (atomicBoolean.get()) {
            pm0.v.K(null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.l2(this));
            atomicBoolean.compareAndSet(true, false);
        }
    }
}

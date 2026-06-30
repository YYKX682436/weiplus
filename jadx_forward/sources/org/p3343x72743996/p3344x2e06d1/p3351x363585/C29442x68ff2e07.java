package org.p3343x72743996.p3344x2e06d1.p3351x363585;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37137xa0346395)
/* renamed from: org.chromium.base.task.SingleThreadTaskRunnerImpl */
/* loaded from: classes13.dex */
public class C29442x68ff2e07 extends org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5 implements org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73623x7118e671 = false;

    /* renamed from: mHandler */
    private final android.os.Handler f73624xc7640a1d;

    public C29442x68ff2e07(android.os.Handler handler, int i17) {
        super(i17, "SingleThreadTaskRunnerImpl", 2);
        this.f73624xc7640a1d = handler;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347
    /* renamed from: belongsToCurrentThread */
    public boolean mo153023xbdc9b874() {
        java.lang.Boolean m153035x696e2f51 = m153035x696e2f51();
        return m153035x696e2f51 != null ? m153035x696e2f51.booleanValue() : this.f73624xc7640a1d.getLooper().getThread() == java.lang.Thread.currentThread();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5
    /* renamed from: schedulePreNativeDelayedTask */
    public boolean mo153024xc2472a44(java.lang.Runnable runnable, long j17) {
        android.os.Handler handler = this.f73624xc7640a1d;
        if (handler == null) {
            return false;
        }
        handler.postDelayed(runnable, j17);
        return true;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5
    /* renamed from: schedulePreNativeTask */
    public void mo153021xda48bfe8() {
        android.os.Handler handler = this.f73624xc7640a1d;
        if (handler == null) {
            return;
        }
        handler.post(this.f73638xe3e47ffa);
    }
}

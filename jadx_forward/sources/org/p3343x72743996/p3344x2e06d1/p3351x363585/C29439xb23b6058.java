package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* renamed from: org.chromium.base.task.SequencedTaskRunnerImpl */
/* loaded from: classes13.dex */
public class C29439xb23b6058 extends org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5 implements org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29438x8d615618 {

    /* renamed from: mPendingTasks */
    private java.util.concurrent.atomic.AtomicInteger f73617xa0ab8144;

    /* renamed from: mReadyToCreateNativeTaskRunner */
    private volatile boolean f73618x41971559;

    public C29439xb23b6058(int i17) {
        super(i17, "SequencedTaskRunnerImpl", 1);
        this.f73617xa0ab8144 = new java.util.concurrent.atomic.AtomicInteger();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5
    /* renamed from: initNativeTaskRunner */
    public void mo153019x794ecdbc() {
        this.f73618x41971559 = true;
        if (this.f73617xa0ab8144.getAndIncrement() == 0) {
            super.mo153019x794ecdbc();
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5
    /* renamed from: runPreNativeTask */
    public void mo153020x75a92474() {
        super.mo153020x75a92474();
        if (this.f73617xa0ab8144.decrementAndGet() > 0) {
            if (this.f73618x41971559) {
                super.mo153019x794ecdbc();
            } else {
                super.mo153021xda48bfe8();
            }
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5
    /* renamed from: schedulePreNativeTask */
    public void mo153021xda48bfe8() {
        if (this.f73617xa0ab8144.getAndIncrement() == 0) {
            super.mo153021xda48bfe8();
        }
    }
}

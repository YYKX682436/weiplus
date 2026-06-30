package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.chromium.base.task.ThreadPoolTaskExecutor */
/* loaded from: classes13.dex */
public class C29451xb04489fe implements org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198 {

    /* renamed from: TRAITS_COUNT */
    private static final int f73662x682e9055 = 6;

    /* renamed from: mTraitsToRunnerMap */
    private final org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535[] f73663x1034b17f = new org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535[6];

    public C29451xb04489fe() {
        for (int i17 = 0; i17 < 6; i17++) {
            this.f73663x1034b17f[i17] = mo153028xa4f87b31(i17 + 0);
        }
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: canRunTaskImmediately */
    public boolean mo153025x28fcf81e(int i17) {
        return false;
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: createSequencedTaskRunner */
    public org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29438x8d615618 mo153026x3b26bb9c(int i17) {
        return new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29439xb23b6058(i17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: createSingleThreadTaskRunner */
    public org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347 mo153027xb415cf43(int i17) {
        return new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29442x68ff2e07(null, i17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: createTaskRunner */
    public org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535 mo153028xa4f87b31(int i17) {
        return new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29446x400e18f5(i17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: postDelayedTask */
    public void mo153029x6a420547(int i17, java.lang.Runnable runnable, long j17) {
        this.f73663x1034b17f[i17 + 0].mo153030x6a420547(runnable, j17);
    }
}

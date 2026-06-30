package org.p3343x72743996.p3344x2e06d1.p3351x363585;

/* renamed from: org.chromium.base.task.UiThreadTaskExecutor */
/* loaded from: classes13.dex */
public class C29452x5366e276 implements org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198 {

    /* renamed from: sRegistered */
    private static boolean f73664xea194755;

    /* renamed from: mBestEffortTaskRunner */
    private final org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347 f73665xaa365d32;

    /* renamed from: mUserBlockingTaskRunner */
    private final org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347 f73666x4718ab22;

    /* renamed from: mUserVisibleTaskRunner */
    private final org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347 f73667xca59382f;

    public C29452x5366e276(android.os.Handler handler) {
        this.f73665xaa365d32 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29442x68ff2e07(handler, 6);
        this.f73667xca59382f = new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29442x68ff2e07(handler, 7);
        this.f73666x4718ab22 = new org.p3343x72743996.p3344x2e06d1.p3351x363585.C29442x68ff2e07(handler, 8);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: canRunTaskImmediately */
    public boolean mo153025x28fcf81e(int i17) {
        return mo153027xb415cf43(i17).mo153023xbdc9b874();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: createSequencedTaskRunner */
    public org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29438x8d615618 mo153026x3b26bb9c(int i17) {
        return mo153027xb415cf43(i17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: createSingleThreadTaskRunner */
    public org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29441xc5d55347 mo153027xb415cf43(int i17) {
        if (6 == i17) {
            return this.f73665xaa365d32;
        }
        if (7 == i17) {
            return this.f73667xca59382f;
        }
        if (8 == i17) {
            return this.f73666x4718ab22;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: createTaskRunner */
    public org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29445xaefae535 mo153028xa4f87b31(int i17) {
        return mo153027xb415cf43(i17);
    }

    @Override // org.p3343x72743996.p3344x2e06d1.p3351x363585.InterfaceC29443x242a9198
    /* renamed from: postDelayedTask */
    public void mo153029x6a420547(int i17, java.lang.Runnable runnable, long j17) {
        mo153027xb415cf43(i17).mo153030x6a420547(runnable, j17);
    }
}

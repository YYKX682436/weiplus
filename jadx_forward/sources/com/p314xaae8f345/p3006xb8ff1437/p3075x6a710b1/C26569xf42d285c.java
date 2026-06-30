package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPFutureResult */
/* loaded from: classes13.dex */
public class C26569xf42d285c {

    /* renamed from: INTERRUPTED_TIMES */
    private static final int f55293x159592c9 = 2;
    private static final java.lang.String TAG = "TPFutureResult";

    /* renamed from: mRealResult */
    private java.lang.Object f55296x630bd7a8 = null;

    /* renamed from: mIsReady */
    private boolean f55295x1977396c = false;

    /* renamed from: mException */
    private java.lang.Throwable f55294xd3071a62 = null;

    /* renamed from: waitAndDealInterrupted */
    private void m104296xb8694db4() {
        int i17 = 2;
        boolean z17 = false;
        while (true) {
            i17--;
            if (i17 < 0) {
                break;
            }
            try {
                wait();
                break;
            } catch (java.lang.InterruptedException unused) {
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "getResult wait has InterruptedException, interrupted:" + i17);
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* renamed from: getResult */
    public synchronized java.lang.Object m104298x2d64eb13() {
        if (!this.f55295x1977396c) {
            m104296xb8694db4();
        }
        java.lang.Throwable th6 = this.f55294xd3071a62;
        if (th6 == null) {
        } else {
            throw th6;
        }
        return this.f55296x630bd7a8;
    }

    /* renamed from: setException */
    public synchronized void m104300xb411020d(java.lang.Throwable th6) {
        if (th6 != null) {
            this.f55294xd3071a62 = th6;
            this.f55295x1977396c = true;
            notifyAll();
        }
    }

    /* renamed from: setResult */
    public synchronized void m104301x209a1f1f(java.lang.Object obj) {
        if (this.f55295x1977396c) {
            return;
        }
        this.f55296x630bd7a8 = obj;
        this.f55295x1977396c = true;
        notifyAll();
    }

    /* renamed from: waitAndDealInterrupted */
    private void m104297xb8694db4(long j17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = false;
        while (j17 > 0) {
            try {
                wait(j17);
                break;
            } catch (java.lang.InterruptedException unused) {
                j17 -= java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.i(TAG, "getResult wait has InterruptedException, remainTime:" + j17);
                z17 = true;
            }
        }
        if (z17) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* renamed from: getResult */
    public synchronized java.lang.Object m104299x2d64eb13(long j17) {
        if (!this.f55295x1977396c) {
            m104297xb8694db4(j17);
        }
        java.lang.Throwable th6 = this.f55294xd3071a62;
        if (th6 == null) {
        } else {
            throw th6;
        }
        return this.f55296x630bd7a8;
    }
}

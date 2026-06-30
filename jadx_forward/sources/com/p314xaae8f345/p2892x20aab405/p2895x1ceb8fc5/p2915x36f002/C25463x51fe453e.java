package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002;

/* renamed from: com.tencent.qqmusic.mediaplayer.util.WaitNotify */
/* loaded from: classes16.dex */
public class C25463x51fe453e {
    private static final java.lang.String TAG = "WaitNotify";

    /* renamed from: myMonitorObject */
    private final com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25458x94649119 f46175x98a51aed = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25458x94649119();

    /* renamed from: wasSignalled */
    private volatile boolean f46176x72a55d7a = false;

    /* renamed from: isWaiting */
    private volatile boolean f46174x1ffaddc3 = false;

    /* renamed from: com.tencent.qqmusic.mediaplayer.util.WaitNotify$WaitListener */
    /* loaded from: classes16.dex */
    public interface WaitListener {
        /* renamed from: keepWaiting */
        boolean mo93622x33d5f308();
    }

    /* renamed from: doNotify */
    public void m94412xf35bbb4() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "doNotify " + java.lang.Thread.currentThread().getName());
        synchronized (this.f46175x98a51aed) {
            this.f46176x72a55d7a = true;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "doNotify internal " + java.lang.Thread.currentThread().getName());
            this.f46175x98a51aed.notifyAll();
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "doNotify over " + java.lang.Thread.currentThread().getName());
        }
    }

    /* renamed from: doWait */
    public void m94413xb0e9d4a0() {
        m94414xb0e9d4a0(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0, new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e.WaitListener() { // from class: com.tencent.qqmusic.mediaplayer.util.WaitNotify.1
            @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e.WaitListener
            /* renamed from: keepWaiting */
            public boolean mo93622x33d5f308() {
                return true;
            }
        });
    }

    /* renamed from: isWaiting */
    public boolean m94415x1ffaddc3() {
        return this.f46174x1ffaddc3;
    }

    /* renamed from: doWait */
    public void m94414xb0e9d4a0(long j17, int i17, com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25463x51fe453e.WaitListener waitListener) {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "doWait " + java.lang.Thread.currentThread().getName());
        synchronized (this.f46175x98a51aed) {
            this.f46176x72a55d7a = false;
            int i18 = 0;
            while (!this.f46176x72a55d7a) {
                try {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "doWait internal " + java.lang.Thread.currentThread().getName() + " " + i18);
                    this.f46174x1ffaddc3 = true;
                    if (i18 < i17) {
                        this.f46175x98a51aed.wait(j17, 0);
                        if (!waitListener.mo93622x33d5f308()) {
                            m94412xf35bbb4();
                            break;
                        }
                    } else {
                        this.f46175x98a51aed.wait();
                    }
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.d(TAG, "doWait wake " + java.lang.Thread.currentThread().getName() + " " + i18);
                } catch (java.lang.InterruptedException e17) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, e17.toString());
                }
                i18++;
            }
            this.f46174x1ffaddc3 = false;
        }
    }
}

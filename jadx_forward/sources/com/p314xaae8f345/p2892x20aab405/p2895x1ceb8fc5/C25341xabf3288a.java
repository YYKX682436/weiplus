package com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5;

/* renamed from: com.tencent.qqmusic.mediaplayer.PlayerConfigManager */
/* loaded from: classes13.dex */
public class C25341xabf3288a {
    private static final int ADD = 1;

    /* renamed from: DTS_COST_THRESHOLD */
    private static final int f45637x2b8d4055 = 40;

    /* renamed from: ENABLE_CHANGE_THREAD_PRIORITY */
    private static boolean f45638x89c603e6 = false;

    /* renamed from: ENABLE_REAL_CHECK */
    private static final boolean f45639x9730af43 = true;

    /* renamed from: MAX_RATIO */
    private static final int f45640xcea4e130 = 4;

    /* renamed from: MAX_TIMES */
    private static final int f45641xcec4986b = 10;

    /* renamed from: MIN_RATIO */
    private static final int f45642xfcaff79e = 8;

    /* renamed from: NONE */
    private static final int f45643x24a738 = 0;
    private static final int SUB = -1;
    private static final java.lang.String TAG = "PlayerConfigManager";

    /* renamed from: mInstance */
    private static com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a f45644x46143c22;

    /* renamed from: count */
    private int f45647x5a7510f;

    /* renamed from: mBufRatio */
    private int f45649xc92998e5;

    /* renamed from: mLastDecodeSpeed */
    private long f45652x98846e56;

    /* renamed from: mStartTime */
    private long f45655xfbccd462;

    /* renamed from: contextGetter */
    private com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a.ContextGetter f45646xe60bcb9a = null;

    /* renamed from: mPlaySpeed */
    private long f45653xa23af86 = 1;

    /* renamed from: mAddPriority */
    private int f45648x2a8336b8 = 0;

    /* renamed from: mProcessorNumber */
    private int f45654x53d00e4e = java.lang.Runtime.getRuntime().availableProcessors();

    /* renamed from: mCommonPlayerRef */
    private java.lang.ref.WeakReference<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80> f45650xe1b4cc1a = null;

    /* renamed from: THREAD_PRIORITY */
    private int[] f45645x1b604439 = {19, 10, -2, -4, -8, -16, -19};

    /* renamed from: mCurrPriorityIndex */
    private int f45651xdf43378f = 0;

    /* renamed from: com.tencent.qqmusic.mediaplayer.PlayerConfigManager$ContextGetter */
    /* loaded from: classes13.dex */
    public interface ContextGetter {
        /* renamed from: getContext */
        android.content.Context m93838x76847179();
    }

    private C25341xabf3288a() {
        this.f45649xc92998e5 = 4;
        this.f45647x5a7510f = 0;
        this.f45655xfbccd462 = 0L;
        this.f45649xc92998e5 = 4;
        this.f45647x5a7510f = 0;
        this.f45655xfbccd462 = 0L;
    }

    private boolean add() {
        return this.f45648x2a8336b8 >= 1;
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a m93828x9cf0d20b() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a c25341xabf3288a;
        synchronized (com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a.class) {
            if (f45644x46143c22 == null) {
                f45644x46143c22 = new com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a();
            }
            c25341xabf3288a = f45644x46143c22;
        }
        return c25341xabf3288a;
    }

    private boolean sub() {
        return this.f45648x2a8336b8 < -1;
    }

    /* renamed from: calDTSCostEnd */
    public void m93829xcba464d9() {
        if (this.f45649xc92998e5 != 8 && java.lang.System.currentTimeMillis() - this.f45655xfbccd462 > 40) {
            int i17 = this.f45647x5a7510f + 1;
            this.f45647x5a7510f = i17;
            if (i17 > 10) {
                this.f45649xc92998e5 *= 2;
                this.f45647x5a7510f = 0;
            }
        }
    }

    /* renamed from: calDTSCostStart */
    public void m93830x74e698e0() {
        if (this.f45649xc92998e5 == 8) {
            return;
        }
        this.f45655xfbccd462 = java.lang.System.currentTimeMillis();
    }

    /* renamed from: changeDecodeThreadPriority */
    public void m93831x80d4372c() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80;
        java.lang.ref.WeakReference<com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80> weakReference = this.f45650xe1b4cc1a;
        if (weakReference == null || (runnableC25325xe8a39f80 = weakReference.get()) == null) {
            return;
        }
        runnableC25325xe8a39f80.m93731xbb55c7ac();
    }

    /* renamed from: changeDecodeThreadPriorityIfNeed */
    public void m93832xa275459f() {
        try {
            int i17 = this.f45651xdf43378f;
            int i18 = this.f45645x1b604439[r3.length - 1];
            if (m93835x6c9d6aa() && f45638x89c603e6) {
                if (add()) {
                    i17++;
                } else if (sub()) {
                    i17--;
                }
                if (i17 == this.f45651xdf43378f && i17 >= 0 && i17 < this.f45645x1b604439.length) {
                    com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "changeDecodeThreadPriorityIfNeed don't change Priority mCurrPriorityIndex = " + this.f45645x1b604439[this.f45651xdf43378f]);
                    return;
                }
                if (i17 < 0) {
                    i17 = 0;
                } else {
                    int[] iArr = this.f45645x1b604439;
                    if (i17 >= iArr.length) {
                        i17 = iArr.length - 1;
                    }
                }
                this.f45651xdf43378f = i17;
                int i19 = this.f45645x1b604439[i17];
                this.f45648x2a8336b8 = 0;
            } else {
                int i27 = this.f45645x1b604439[r1.length - 1];
            }
            android.os.Process.setThreadPriority(0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.e(TAG, th6);
        }
    }

    /* renamed from: getBufRatio */
    public int m93833x20062ece() {
        int i17 = this.f45649xc92998e5;
        if (i17 <= 1) {
            this.f45649xc92998e5 = 4;
        } else if (i17 > 8) {
            this.f45649xc92998e5 = 8;
        }
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "getBufRatio = " + this.f45649xc92998e5);
        this.f45647x5a7510f = 0;
        return this.f45649xc92998e5;
    }

    /* renamed from: getContext */
    public android.content.Context m93834x76847179() {
        com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a.ContextGetter contextGetter = this.f45646xe60bcb9a;
        if (contextGetter != null) {
            return contextGetter.m93838x76847179();
        }
        return null;
    }

    /* renamed from: isSingleCpuOrScreenOff */
    public boolean m93835x6c9d6aa() {
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        this.f45654x53d00e4e = availableProcessors;
        return availableProcessors <= 1;
    }

    /* renamed from: setCommonPlayerRef */
    public void m93836x2d3f0785(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.RunnableC25325xe8a39f80 runnableC25325xe8a39f80) {
        if (runnableC25325xe8a39f80 != null) {
            this.f45650xe1b4cc1a = new java.lang.ref.WeakReference<>(runnableC25325xe8a39f80);
            this.f45651xdf43378f = 0;
            this.f45648x2a8336b8 = 0;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25316x94782396 m93735x7ad436d9 = runnableC25325xe8a39f80.m93735x7ad436d9();
            if (m93735x7ad436d9 != null) {
                this.f45653xa23af86 = ((float) ((m93735x7ad436d9.m93542xf6c809a0() * 2) * m93735x7ad436d9.m93539xd13e6146())) / 1000.0f;
                com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i(TAG, "setCommonPlayerRef info = " + m93735x7ad436d9 + ",mPlaySpeed = " + this.f45653xa23af86);
            }
        }
    }

    /* renamed from: setContextGetter */
    public void m93837x3641ee58(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25341xabf3288a.ContextGetter contextGetter) {
        this.f45646xe60bcb9a = contextGetter;
    }
}

package org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01;

/* renamed from: org.chromium.base.memory.MemoryPressureUma */
/* loaded from: classes7.dex */
public class ComponentCallbacks2C29403x57678463 implements android.content.ComponentCallbacks2 {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73497x7118e671 = false;

    /* renamed from: sInstance */
    private static org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.ComponentCallbacks2C29403x57678463 f73498xbfaed628;

    /* renamed from: mHistogramName */
    private final java.lang.String f73499x4b9fa6a2;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: org.chromium.base.memory.MemoryPressureUma$Notification */
    /* loaded from: classes6.dex */
    public @interface Notification {

        /* renamed from: NUM_ENTRIES */
        public static final int f73500x6b242097 = 9;

        /* renamed from: ON_LOW_MEMORY */
        public static final int f73501xf0a57ecc = 8;

        /* renamed from: TRIM_MEMORY_BACKGROUND */
        public static final int f73502xf35c3c4f = 3;

        /* renamed from: TRIM_MEMORY_COMPLETE */
        public static final int f73503x9b9b709a = 1;

        /* renamed from: TRIM_MEMORY_MODERATE */
        public static final int f73504x9a733c64 = 2;

        /* renamed from: TRIM_MEMORY_RUNNING_CRITICAL */
        public static final int f73505xb90db8a0 = 5;

        /* renamed from: TRIM_MEMORY_RUNNING_LOW */
        public static final int f73506xd5547993 = 6;

        /* renamed from: TRIM_MEMORY_RUNNING_MODERATE */
        public static final int f73507x1fcf3e04 = 7;

        /* renamed from: TRIM_MEMORY_UI_HIDDEN */
        public static final int f73508x7fb9d274 = 4;

        /* renamed from: UNKNOWN_TRIM_LEVEL */
        public static final int f73509x7ea5903c = 0;
    }

    private ComponentCallbacks2C29403x57678463(java.lang.String str) {
        this.f73499x4b9fa6a2 = "Android.MemoryPressureNotification." + str;
    }

    /* renamed from: initializeForBrowser */
    public static void m152878x68cd65cf() {
        m152880xe8603445("Browser");
    }

    /* renamed from: initializeForChildService */
    public static void m152879xa0b07b2() {
        m152880xe8603445("ChildService");
    }

    /* renamed from: initializeInstance */
    private static void m152880xe8603445(java.lang.String str) {
        org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152651x286f5ca3();
        f73498xbfaed628 = new org.p3343x72743996.p3344x2e06d1.p3348xbfc2bd01.ComponentCallbacks2C29403x57678463(str);
        org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035().registerComponentCallbacks(f73498xbfaed628);
    }

    /* renamed from: record */
    private void m152881xc8466c51(int i17) {
        org.p3343x72743996.p3344x2e06d1.p3349x38f8c0c3.C29410x1048b7f3.m152933x22a24ab3(this.f73499x4b9fa6a2, i17, 9);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m152881xc8466c51(8);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        if (i17 == 5) {
            m152881xc8466c51(7);
            return;
        }
        if (i17 == 10) {
            m152881xc8466c51(6);
            return;
        }
        if (i17 == 15) {
            m152881xc8466c51(5);
            return;
        }
        if (i17 == 20) {
            m152881xc8466c51(4);
            return;
        }
        if (i17 == 40) {
            m152881xc8466c51(3);
            return;
        }
        if (i17 == 60) {
            m152881xc8466c51(2);
        } else if (i17 != 80) {
            m152881xc8466c51(0);
        } else {
            m152881xc8466c51(1);
        }
    }
}

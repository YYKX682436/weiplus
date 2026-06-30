package io.p3284xd2ae381c.p3320x373aa5;

/* renamed from: io.flutter.view.VsyncWaiter */
/* loaded from: classes14.dex */
public class C28981x87f28833 {

    /* renamed from: instance */
    private static io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833 f72336x21169495;

    /* renamed from: listener */
    private static io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.DisplayListener f72337x503cc4b4;

    /* renamed from: flutterJNI */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f72339x2014a1e9;

    /* renamed from: refreshPeriodNanos */
    private long f72341xca8e3523 = -1;

    /* renamed from: frameCallback */
    private io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.FrameCallback f72340x5bd370d2 = new io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.FrameCallback(0);

    /* renamed from: asyncWaitForVsyncDelegate */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AsyncWaitForVsyncDelegate f72338x8bd56e9e = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AsyncWaitForVsyncDelegate() { // from class: io.flutter.view.VsyncWaiter.1
        /* renamed from: obtainFrameCallback */
        private android.view.Choreographer.FrameCallback m139647xe5b4742d(long j17) {
            if (io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72340x5bd370d2 == null) {
                return new io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.FrameCallback(j17);
            }
            io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72340x5bd370d2.f72345xaf400a64 = j17;
            io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.FrameCallback frameCallback = io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72340x5bd370d2;
            io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72340x5bd370d2 = null;
            return frameCallback;
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09.AsyncWaitForVsyncDelegate
        /* renamed from: asyncWaitForVsync */
        public void mo137771x2f9a35f9(long j17) {
            android.view.Choreographer.getInstance().postFrameCallback(m139647xe5b4742d(j17));
        }
    };

    /* renamed from: io.flutter.view.VsyncWaiter$DisplayListener */
    /* loaded from: classes14.dex */
    public class DisplayListener implements android.hardware.display.DisplayManager.DisplayListener {

        /* renamed from: displayManager */
        private android.hardware.display.DisplayManager f72343x9295908b;

        public DisplayListener(android.hardware.display.DisplayManager displayManager) {
            this.f72343x9295908b = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i17) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i17) {
            if (i17 == 0) {
                float refreshRate = this.f72343x9295908b.getDisplay(0).getRefreshRate();
                io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72341xca8e3523 = (long) (1.0E9d / refreshRate);
                io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72339x2014a1e9.m137749x90ab7590(refreshRate);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i17) {
        }

        /* renamed from: register */
        public void m139648xd6dc2ea3() {
            this.f72343x9295908b.registerDisplayListener(this, null);
        }
    }

    /* renamed from: io.flutter.view.VsyncWaiter$FrameCallback */
    /* loaded from: classes14.dex */
    public class FrameCallback implements android.view.Choreographer.FrameCallback {

        /* renamed from: cookie */
        private long f72345xaf400a64;

        public FrameCallback(long j17) {
            this.f72345xaf400a64 = j17;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j17) {
            long nanoTime = java.lang.System.nanoTime() - j17;
            io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72339x2014a1e9.m137710xb07ac572(nanoTime < 0 ? 0L : nanoTime, io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72341xca8e3523, this.f72345xaf400a64);
            io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.this.f72340x5bd370d2 = this;
        }
    }

    private C28981x87f28833(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this.f72339x2014a1e9 = c28586x96e67e09;
    }

    /* renamed from: getInstance */
    public static io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833 m139643x9cf0d20b(float f17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        if (f72336x21169495 == null) {
            f72336x21169495 = new io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833(c28586x96e67e09);
        }
        c28586x96e67e09.m137749x90ab7590(f17);
        io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833 c28981x87f28833 = f72336x21169495;
        c28981x87f28833.f72341xca8e3523 = (long) (1.0E9d / f17);
        return c28981x87f28833;
    }

    /* renamed from: reset */
    public static void m139645x6761d4f() {
        f72336x21169495 = null;
        f72337x503cc4b4 = null;
    }

    /* renamed from: init */
    public void m139646x316510() {
        this.f72339x2014a1e9.m137736xa727645c(this.f72338x8bd56e9e);
    }

    /* renamed from: getInstance */
    public static io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833 m139644x9cf0d20b(android.hardware.display.DisplayManager displayManager, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        if (f72336x21169495 == null) {
            f72336x21169495 = new io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833(c28586x96e67e09);
        }
        if (f72337x503cc4b4 == null) {
            io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833 c28981x87f28833 = f72336x21169495;
            java.util.Objects.requireNonNull(c28981x87f28833);
            io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.DisplayListener displayListener = new io.p3284xd2ae381c.p3320x373aa5.C28981x87f28833.DisplayListener(displayManager);
            f72337x503cc4b4 = displayListener;
            displayListener.m139648xd6dc2ea3();
        }
        if (f72336x21169495.f72341xca8e3523 == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f72336x21169495.f72341xca8e3523 = (long) (1.0E9d / refreshRate);
            c28586x96e67e09.m137749x90ab7590(refreshRate);
        }
        return f72336x21169495;
    }
}

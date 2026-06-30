package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb;

/* renamed from: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector */
/* loaded from: classes13.dex */
public class C26326x77dfb019 {

    /* renamed from: DISPLAY_CHANGE */
    public static final int f52340x68a745ed = 10001;
    private static java.lang.String TAG = "TPScreenRefreshRateDetector";

    /* renamed from: isInitted */
    private static boolean f52341x5192c879;

    /* renamed from: mContext */
    private static java.lang.ref.WeakReference<android.content.Context> f52343xd6cfe882;

    /* renamed from: mHandler */
    private static android.os.Handler f52347xc7640a1d;

    /* renamed from: mWindowManager */
    private static android.view.WindowManager f52348xf1218630;

    /* renamed from: listeners */
    private static java.util.List<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.ScreenRefreshRateChangedListener> f52342xb75bd23f = new java.util.LinkedList();

    /* renamed from: mCurScreenRefreshRate */
    private static float f52344x7fc15bfc = 60.0f;

    /* renamed from: mDisplayManager */
    private static android.hardware.display.DisplayManager f52346x99489a58 = null;

    /* renamed from: mDisplayListener */
    private static android.hardware.display.DisplayManager.DisplayListener f52345xd8ae8f69 = new android.hardware.display.DisplayManager.DisplayListener() { // from class: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.2
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i17) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i17) {
            if (i17 == 0) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.f52347xc7640a1d.sendEmptyMessage(10001);
            }
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.TAG, "onDisplayChanged displayId:" + i17);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i17) {
        }
    };

    /* renamed from: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector$ScreenRefreshRateChangedListener */
    /* loaded from: classes13.dex */
    public interface ScreenRefreshRateChangedListener {
        /* renamed from: onScreenRefreshRateChanged */
        void mo101918xabedbe64(float f17);
    }

    /* renamed from: addListener */
    public static void m101924x162a7075(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.class) {
            f52342xb75bd23f.add(screenRefreshRateChangedListener);
        }
    }

    /* renamed from: deinit */
    public static void m101925xb0654911() {
        java.lang.ref.WeakReference<android.content.Context> weakReference;
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.class) {
            if (f52341x5192c879 && (weakReference = f52343xd6cfe882) != null) {
                weakReference.clear();
                f52341x5192c879 = false;
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPScreenRefreshRateDetector deinit succeed!");
            }
        }
    }

    /* renamed from: getLooper */
    private static android.os.Looper m101926x23b2dd47() {
        android.os.Looper myLooper = android.os.Looper.myLooper();
        return myLooper != null ? myLooper : android.os.Looper.getMainLooper();
    }

    /* renamed from: getScreenRefreshRate */
    public static float m101927x63e0a199() {
        java.lang.ref.WeakReference<android.content.Context> weakReference = f52343xd6cfe882;
        if (weakReference == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(4, TAG, "Current mContext is null, set default.");
            return f52344x7fc15bfc;
        }
        android.content.Context context = weakReference.get();
        if (context != null) {
            if (f52348xf1218630 == null) {
                f52348xf1218630 = (android.view.WindowManager) context.getSystemService("window");
            }
            if (f52346x99489a58 == null) {
                android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
                f52346x99489a58 = displayManager;
                displayManager.registerDisplayListener(f52345xd8ae8f69, f52347xc7640a1d);
            }
            android.view.WindowManager windowManager = f52348xf1218630;
            if (windowManager != null) {
                android.view.Display defaultDisplay = windowManager.getDefaultDisplay();
                android.view.Display.Mode[] supportedModes = defaultDisplay.getSupportedModes();
                android.view.Display.Mode mode = defaultDisplay.getMode();
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getMode width:" + mode.getPhysicalWidth() + " height:" + mode.getPhysicalHeight() + " refreshRate:" + mode.getRefreshRate() + " ModeId:" + mode.getModeId());
                java.lang.String str = TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSupportedModes length:");
                sb6.append(supportedModes.length);
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, str, sb6.toString());
                for (int i17 = 0; i17 < supportedModes.length; i17++) {
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "getSupportedModes width:" + supportedModes[i17].getPhysicalWidth() + " height:" + supportedModes[i17].getPhysicalHeight() + " refreshRate:" + supportedModes[i17].getRefreshRate() + " ModeId:" + supportedModes[i17].getModeId());
                }
                f52344x7fc15bfc = mode.getRefreshRate();
            }
        }
        return f52344x7fc15bfc;
    }

    /* renamed from: init */
    public static void m101928x316510(android.content.Context context) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.class) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPScreenRefreshRateDetector init enter!");
            if (f52341x5192c879) {
                return;
            }
            f52343xd6cfe882 = new java.lang.ref.WeakReference<>(context.getApplicationContext());
            f52341x5192c879 = true;
            m101929x606b9d09();
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "TPScreenRefreshRateDetector init succeed!");
        }
    }

    /* renamed from: initHandleMsg */
    public static void m101929x606b9d09() {
        f52347xc7640a1d = new android.os.Handler(m101926x23b2dd47()) { // from class: com.tencent.thumbplayer.core.common.TPScreenRefreshRateDetector.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                if (message.what == 10001 && com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.f52346x99489a58 != null) {
                    android.view.Display display = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.f52346x99489a58.getDisplay(0);
                    java.lang.String mode = display.getMode().toString();
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.TAG, "handleMessage DISPLAY_CHANGE, mode:" + mode.toString());
                    com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.m101930x74960156(display.getMode().getRefreshRate());
                }
                super.handleMessage(message);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: notifyScreenRefreshRateChange */
    public static void m101930x74960156(float f17) {
        boolean z17;
        if (java.lang.Math.abs(f17 - f52344x7fc15bfc) >= 1.0f) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26319x6d577091.m101886xba7add57(2, TAG, "notifyScreenRefreshRateChange Change From " + f52344x7fc15bfc + " to " + f17);
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            f52344x7fc15bfc = f17;
            synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.class) {
                java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.ScreenRefreshRateChangedListener> it = f52342xb75bd23f.iterator();
                while (it.hasNext()) {
                    it.next().mo101918xabedbe64(f17);
                }
            }
        }
    }

    /* renamed from: removeListener */
    public static void m101931xf1335d58(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.ScreenRefreshRateChangedListener screenRefreshRateChangedListener) {
        synchronized (com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26326x77dfb019.class) {
            f52342xb75bd23f.remove(screenRefreshRateChangedListener);
        }
    }
}

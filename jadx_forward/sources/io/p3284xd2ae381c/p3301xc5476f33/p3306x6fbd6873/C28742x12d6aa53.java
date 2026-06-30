package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.flutter.plugin.platform.VirtualDisplayController */
/* loaded from: classes15.dex */
public class C28742x12d6aa53 {
    private static java.lang.String TAG = "VirtualDisplayController";

    /* renamed from: callback */
    private static android.hardware.display.VirtualDisplay.Callback f71897xf5bc2045 = new android.hardware.display.VirtualDisplay.Callback() { // from class: io.flutter.plugin.platform.VirtualDisplayController.1
        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onPaused() {
        }

        @Override // android.hardware.display.VirtualDisplay.Callback
        public void onResumed() {
        }
    };

    /* renamed from: accessibilityEventsDelegate */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c f71898xf53d26ac;

    /* renamed from: context */
    private final android.content.Context f71899x38b735af;

    /* renamed from: densityDpi */
    private final int f71900xba56f55;

    /* renamed from: focusChangeListener */
    private final android.view.View.OnFocusChangeListener f71901xd78e537c;

    /* renamed from: presentation */
    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 f71902x298aff1a;

    /* renamed from: renderTarget */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf f71903x2ce096c7;

    /* renamed from: viewId */
    private final int f71904xcf532ea0;

    /* renamed from: virtualDisplay */
    private android.hardware.display.VirtualDisplay f71905x42109f37;

    /* renamed from: io.flutter.plugin.platform.VirtualDisplayController$OneTimeOnDrawListener */
    /* loaded from: classes15.dex */
    public static class OneTimeOnDrawListener implements android.view.ViewTreeObserver.OnDrawListener {

        /* renamed from: mOnDrawRunnable */
        java.lang.Runnable f71910x7c1f75cd;

        /* renamed from: mView */
        final android.view.View f71911x628b0b2;

        public OneTimeOnDrawListener(android.view.View view, java.lang.Runnable runnable) {
            this.f71911x628b0b2 = view;
            this.f71910x7c1f75cd = runnable;
        }

        /* renamed from: schedule */
        public static void m138854xd6669297(android.view.View view, java.lang.Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53.OneTimeOnDrawListener(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            java.lang.Runnable runnable = this.f71910x7c1f75cd;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f71910x7c1f75cd = null;
            this.f71911x628b0b2.post(new java.lang.Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.OneTimeOnDrawListener.1
                @Override // java.lang.Runnable
                public void run() {
                    io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53.OneTimeOnDrawListener.this.f71911x628b0b2.getViewTreeObserver().removeOnDrawListener(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53.OneTimeOnDrawListener.this);
                }
            });
        }
    }

    private C28742x12d6aa53(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c c28705xcb1b0e8c, android.hardware.display.VirtualDisplay virtualDisplay, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf, android.view.View.OnFocusChangeListener onFocusChangeListener, int i17, java.lang.Object obj) {
        this.f71899x38b735af = context;
        this.f71898xf53d26ac = c28705xcb1b0e8c;
        this.f71903x2ce096c7 = interfaceC28721xe81de0bf;
        this.f71901xd78e537c = onFocusChangeListener;
        this.f71904xcf532ea0 = i17;
        this.f71905x42109f37 = virtualDisplay;
        this.f71900xba56f55 = context.getResources().getDisplayMetrics().densityDpi;
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7(context, this.f71905x42109f37.getDisplay(), interfaceC28717x1311f9d8, c28705xcb1b0e8c, i17, onFocusChangeListener);
        this.f71902x298aff1a = presentationC28734xa07da2e7;
        presentationC28734xa07da2e7.show();
    }

    /* renamed from: create */
    public static io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 m138840xaf65a0fc(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c c28705xcb1b0e8c, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf, int i17, int i18, int i19, java.lang.Object obj, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        if (i17 == 0 || i18 == 0) {
            return null;
        }
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        interfaceC28721xe81de0bf.mo53768xc84d9cb4(i17, i18);
        android.hardware.display.VirtualDisplay createVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i19, i17, i18, displayMetrics.densityDpi, interfaceC28721xe81de0bf.mo53764xcf572877(), 0, f71897xf5bc2045, null);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53(context, c28705xcb1b0e8c, createVirtualDisplay, interfaceC28717x1311f9d8, interfaceC28721xe81de0bf, onFocusChangeListener, i19, obj);
    }

    /* renamed from: resize31 */
    private void m138841xeb594612(android.view.View view, int i17, int i18, java.lang.Runnable runnable) {
        this.f71903x2ce096c7.mo53768xc84d9cb4(i17, i18);
        this.f71905x42109f37.resize(i17, i18, this.f71900xba56f55);
        this.f71905x42109f37.setSurface(this.f71903x2ce096c7.mo53764xcf572877());
        view.postDelayed(runnable, 0L);
    }

    /* renamed from: clearSurface */
    public void m138842x901e8da0() {
        this.f71905x42109f37.setSurface(null);
    }

    /* renamed from: dispatchTouchEvent */
    public void m138843xb864a2b5(android.view.MotionEvent motionEvent) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = this.f71902x298aff1a;
        if (presentationC28734xa07da2e7 == null) {
            return;
        }
        presentationC28734xa07da2e7.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: dispose */
    public void m138844x63a5261f() {
        this.f71902x298aff1a.cancel();
        this.f71902x298aff1a.m138804x40ec80be();
        this.f71905x42109f37.release();
        this.f71903x2ce096c7.mo53767x41012807();
    }

    /* renamed from: getRenderTargetHeight */
    public int m138845x9e8a04c4() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = this.f71903x2ce096c7;
        if (interfaceC28721xe81de0bf != null) {
            return interfaceC28721xe81de0bf.mo53762x1c4fb41d();
        }
        return 0;
    }

    /* renamed from: getRenderTargetWidth */
    public int m138846x81d15289() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28721xe81de0bf interfaceC28721xe81de0bf = this.f71903x2ce096c7;
        if (interfaceC28721xe81de0bf != null) {
            return interfaceC28721xe81de0bf.mo53765x755bd410();
        }
        return 0;
    }

    /* renamed from: getView */
    public android.view.View m138847xfb86a31b() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = this.f71902x298aff1a;
        if (presentationC28734xa07da2e7 == null) {
            return null;
        }
        return presentationC28734xa07da2e7.m138805xfb86a31b().mo31848xfb86a31b();
    }

    /* renamed from: onFlutterViewAttached */
    public void m138848x5e3a4146(android.view.View view) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = this.f71902x298aff1a;
        if (presentationC28734xa07da2e7 == null || presentationC28734xa07da2e7.m138805xfb86a31b() == null) {
            return;
        }
        this.f71902x298aff1a.m138805xfb86a31b().mo65795x5e3a4146(view);
    }

    /* renamed from: onFlutterViewDetached */
    public void m138849x7c604f14() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = this.f71902x298aff1a;
        if (presentationC28734xa07da2e7 == null || presentationC28734xa07da2e7.m138805xfb86a31b() == null) {
            return;
        }
        this.f71902x298aff1a.m138805xfb86a31b().mo65796x7c604f14();
    }

    /* renamed from: onInputConnectionLocked */
    public void m138850x6ba43ad3() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = this.f71902x298aff1a;
        if (presentationC28734xa07da2e7 == null || presentationC28734xa07da2e7.m138805xfb86a31b() == null) {
            return;
        }
        this.f71902x298aff1a.m138805xfb86a31b().mo65797x6ba43ad3();
    }

    /* renamed from: onInputConnectionUnlocked */
    public void m138851x9518646c() {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = this.f71902x298aff1a;
        if (presentationC28734xa07da2e7 == null || presentationC28734xa07da2e7.m138805xfb86a31b() == null) {
            return;
        }
        this.f71902x298aff1a.m138805xfb86a31b().mo65798x9518646c();
    }

    /* renamed from: resetSurface */
    public void m138852x6e1ea05e() {
        int m138846x81d15289 = m138846x81d15289();
        int m138845x9e8a04c4 = m138845x9e8a04c4();
        boolean isFocused = m138847xfb86a31b().isFocused();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState m138804x40ec80be = this.f71902x298aff1a.m138804x40ec80be();
        this.f71905x42109f37.setSurface(null);
        this.f71905x42109f37.release();
        this.f71905x42109f37 = ((android.hardware.display.DisplayManager) this.f71899x38b735af.getSystemService("display")).createVirtualDisplay("flutter-vd#" + this.f71904xcf532ea0, m138846x81d15289, m138845x9e8a04c4, this.f71900xba56f55, this.f71903x2ce096c7.mo53764xcf572877(), 0, f71897xf5bc2045, null);
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7(this.f71899x38b735af, this.f71905x42109f37.getDisplay(), this.f71898xf53d26ac, m138804x40ec80be, this.f71901xd78e537c, isFocused);
        presentationC28734xa07da2e7.show();
        this.f71902x298aff1a.cancel();
        this.f71902x298aff1a = presentationC28734xa07da2e7;
    }

    /* renamed from: resize */
    public void m138853xc84d9cb4(int i17, int i18, final java.lang.Runnable runnable) {
        if (i17 == m138846x81d15289() && i18 == m138845x9e8a04c4()) {
            m138847xfb86a31b().postDelayed(runnable, 0L);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            m138841xeb594612(m138847xfb86a31b(), i17, i18, runnable);
            return;
        }
        boolean isFocused = m138847xfb86a31b().isFocused();
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState m138804x40ec80be = this.f71902x298aff1a.m138804x40ec80be();
        this.f71905x42109f37.setSurface(null);
        this.f71905x42109f37.release();
        android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) this.f71899x38b735af.getSystemService("display");
        this.f71903x2ce096c7.mo53768xc84d9cb4(i17, i18);
        this.f71905x42109f37 = displayManager.createVirtualDisplay("flutter-vd#" + this.f71904xcf532ea0, i17, i18, this.f71900xba56f55, this.f71903x2ce096c7.mo53764xcf572877(), 0, f71897xf5bc2045, null);
        final android.view.View m138847xfb86a31b = m138847xfb86a31b();
        m138847xfb86a31b.addOnAttachStateChangeListener(new android.view.View.OnAttachStateChangeListener() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(android.view.View view) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53.OneTimeOnDrawListener.m138854xd6669297(m138847xfb86a31b, new java.lang.Runnable() { // from class: io.flutter.plugin.platform.VirtualDisplayController.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53.AnonymousClass2 anonymousClass2 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53.AnonymousClass2.this;
                        m138847xfb86a31b.postDelayed(runnable, 128L);
                    }
                });
                m138847xfb86a31b.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(android.view.View view) {
            }
        });
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7 presentationC28734xa07da2e7 = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7(this.f71899x38b735af, this.f71905x42109f37.getDisplay(), this.f71898xf53d26ac, m138804x40ec80be, this.f71901xd78e537c, isFocused);
        presentationC28734xa07da2e7.show();
        this.f71902x298aff1a.cancel();
        this.f71902x298aff1a = presentationC28734xa07da2e7;
    }
}

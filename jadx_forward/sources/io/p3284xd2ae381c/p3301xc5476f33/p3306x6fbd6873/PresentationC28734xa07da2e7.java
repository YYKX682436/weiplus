package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.SingleViewPresentation */
/* loaded from: classes7.dex */
class PresentationC28734xa07da2e7 extends android.app.Presentation {
    private static final java.lang.String TAG = "PlatformViewsController";

    /* renamed from: accessibilityEventsDelegate */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c f71855xf53d26ac;

    /* renamed from: container */
    private android.widget.FrameLayout f71856xe7814c81;

    /* renamed from: focusChangeListener */
    private final android.view.View.OnFocusChangeListener f71857xd78e537c;

    /* renamed from: outerContext */
    private final android.content.Context f71858x71093cb4;

    /* renamed from: rootView */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.AccessibilityDelegatingFrameLayout f71859xf60eeea7;

    /* renamed from: startFocused */
    private boolean f71860xcecc0cb5;

    /* renamed from: state */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState f71861x68ac491;

    /* renamed from: viewId */
    private int f71862xcf532ea0;

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$AccessibilityDelegatingFrameLayout */
    /* loaded from: classes7.dex */
    public static class AccessibilityDelegatingFrameLayout extends android.widget.FrameLayout {

        /* renamed from: accessibilityEventsDelegate */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c f71863xf53d26ac;

        /* renamed from: embeddedView */
        private final android.view.View f71864x617b744f;

        public AccessibilityDelegatingFrameLayout(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c c28705xcb1b0e8c, android.view.View view) {
            super(context);
            this.f71863xf53d26ac = c28705xcb1b0e8c;
            this.f71864x617b744f = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return this.f71863xf53d26ac.m138578xacf4d503(this.f71864x617b744f, view, accessibilityEvent);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$ImmContext */
    /* loaded from: classes7.dex */
    public static class ImmContext extends android.content.ContextWrapper {

        /* renamed from: inputMethodManager */
        private final android.view.inputmethod.InputMethodManager f71865x510497e2;

        public ImmContext(android.content.Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public android.content.Context createDisplayContext(android.view.Display display) {
            return new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.ImmContext(super.createDisplayContext(display), this.f71865x510497e2);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String str) {
            return "input_method".equals(str) ? this.f71865x510497e2 : super.getSystemService(str);
        }

        private ImmContext(android.content.Context context, android.view.inputmethod.InputMethodManager inputMethodManager) {
            super(context);
            this.f71865x510497e2 = inputMethodManager == null ? (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$PresentationContext */
    /* loaded from: classes7.dex */
    public static class PresentationContext extends android.content.ContextWrapper {

        /* renamed from: flutterAppWindowContext */
        private final android.content.Context f71866xe5835b3a;

        /* renamed from: windowManager */
        private android.view.WindowManager f71867x96137d9d;

        /* renamed from: windowManagerHandler */
        private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28743x3ed78b0d f71868x331256ed;

        public PresentationContext(android.content.Context context, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28743x3ed78b0d c28743x3ed78b0d, android.content.Context context2) {
            super(context);
            this.f71868x331256ed = c28743x3ed78b0d;
            this.f71866xe5835b3a = context2;
        }

        /* renamed from: getWindowManager */
        private android.view.WindowManager m138806x537339e7() {
            if (this.f71867x96137d9d == null) {
                this.f71867x96137d9d = this.f71868x331256ed;
            }
            return this.f71867x96137d9d;
        }

        /* renamed from: isCalledFromAlertDialog */
        private boolean m138807x770bc773() {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            for (int i17 = 0; i17 < stackTrace.length && i17 < 11; i17++) {
                if (stackTrace[i17].getClassName().equals(android.app.AlertDialog.class.getCanonicalName()) && stackTrace[i17].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String str) {
            return "window".equals(str) ? m138807x770bc773() ? this.f71866xe5835b3a.getSystemService(str) : m138806x537339e7() : super.getSystemService(str);
        }
    }

    /* renamed from: io.flutter.plugin.platform.SingleViewPresentation$PresentationState */
    /* loaded from: classes7.dex */
    public static class PresentationState {

        /* renamed from: fakeWindowViewGroup */
        private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28733xc74af448 f71869x39a08b5;

        /* renamed from: platformView */
        private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 f71870x946a5b8;

        /* renamed from: windowManagerHandler */
        private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28743x3ed78b0d f71871x331256ed;
    }

    public PresentationC28734xa07da2e7(android.content.Context context, android.view.Display display, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c c28705xcb1b0e8c, int i17, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super(new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.ImmContext(context), display);
        this.f71860xcecc0cb5 = false;
        this.f71855xf53d26ac = c28705xcb1b0e8c;
        this.f71862xcf532ea0 = i17;
        this.f71857xd78e537c = onFocusChangeListener;
        this.f71858x71093cb4 = context;
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState presentationState = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState();
        this.f71861x68ac491 = presentationState;
        presentationState.f71870x946a5b8 = interfaceC28717x1311f9d8;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    /* renamed from: detachState */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState m138804x40ec80be() {
        android.widget.FrameLayout frameLayout = this.f71856xe7814c81;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = this.f71859xf60eeea7;
        if (accessibilityDelegatingFrameLayout != null) {
            accessibilityDelegatingFrameLayout.removeAllViews();
        }
        return this.f71861x68ac491;
    }

    /* renamed from: getView */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 m138805xfb86a31b() {
        return this.f71861x68ac491.f71870x946a5b8;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (this.f71861x68ac491.f71869x39a08b5 == null) {
            this.f71861x68ac491.f71869x39a08b5 = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28733xc74af448(getContext());
        }
        if (this.f71861x68ac491.f71871x331256ed == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState presentationState = this.f71861x68ac491;
            presentationState.f71871x331256ed = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28743x3ed78b0d(windowManager, presentationState.f71869x39a08b5);
        }
        this.f71856xe7814c81 = new android.widget.FrameLayout(getContext());
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationContext presentationContext = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationContext(getContext(), this.f71861x68ac491.f71871x331256ed, this.f71858x71093cb4);
        android.view.View mo31848xfb86a31b = this.f71861x68ac491.f71870x946a5b8.mo31848xfb86a31b();
        if (mo31848xfb86a31b.getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) mo31848xfb86a31b.getContext()).setBaseContext(presentationContext);
        } else {
            io.p3284xd2ae381c.Log.w(TAG, "Unexpected platform view context for view ID " + this.f71862xcf532ea0 + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.f71856xe7814c81.addView(mo31848xfb86a31b);
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.AccessibilityDelegatingFrameLayout(getContext(), this.f71855xf53d26ac, mo31848xfb86a31b);
        this.f71859xf60eeea7 = accessibilityDelegatingFrameLayout;
        accessibilityDelegatingFrameLayout.addView(this.f71856xe7814c81);
        this.f71859xf60eeea7.addView(this.f71861x68ac491.f71869x39a08b5);
        mo31848xfb86a31b.setOnFocusChangeListener(this.f71857xd78e537c);
        this.f71859xf60eeea7.setFocusableInTouchMode(true);
        if (this.f71860xcecc0cb5) {
            mo31848xfb86a31b.requestFocus();
        } else {
            this.f71859xf60eeea7.requestFocus();
        }
        setContentView(this.f71859xf60eeea7);
    }

    public PresentationC28734xa07da2e7(android.content.Context context, android.view.Display display, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c c28705xcb1b0e8c, io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.PresentationState presentationState, android.view.View.OnFocusChangeListener onFocusChangeListener, boolean z17) {
        super(new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.PresentationC28734xa07da2e7.ImmContext(context), display);
        this.f71860xcecc0cb5 = false;
        this.f71855xf53d26ac = c28705xcb1b0e8c;
        this.f71861x68ac491 = presentationState;
        this.f71857xd78e537c = onFocusChangeListener;
        this.f71858x71093cb4 = context;
        getWindow().setFlags(8, 8);
        this.f71860xcecc0cb5 = z17;
    }
}

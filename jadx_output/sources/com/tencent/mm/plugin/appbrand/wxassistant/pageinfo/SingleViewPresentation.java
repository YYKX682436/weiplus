package com.tencent.mm.plugin.appbrand.wxassistant.pageinfo;

/* loaded from: classes7.dex */
class SingleViewPresentation extends android.app.Presentation {
    private static final java.lang.String TAG = "PlatformViewsController";
    private final com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a accessibilityEventsDelegate;
    private android.widget.FrameLayout container;
    private final android.view.View.OnFocusChangeListener focusChangeListener;
    private final android.content.Context outerContext;
    private com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.e rootView;
    private boolean startFocused;
    private final com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.h state;
    private int viewId;

    public SingleViewPresentation(android.content.Context context, android.view.Display display, android.view.View view, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a aVar, int i17, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super(new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.f(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i17;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.h hVar = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.h();
        this.state = hVar;
        hVar.f92289a = view;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.h detachState() {
        android.widget.FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.e eVar = this.rootView;
        if (eVar != null) {
            eVar.removeAllViews();
        }
        return this.state;
    }

    public android.view.View getView() {
        return this.state.f92289a;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.h hVar = this.state;
        if (hVar.f92291c == null) {
            hVar.f92291c = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.d(getContext());
        }
        if (this.state.f92290b == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
            com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.h hVar2 = this.state;
            hVar2.f92290b = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.l(windowManager, hVar2.f92291c);
        }
        this.container = new android.widget.FrameLayout(getContext());
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.g gVar = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.g(getContext(), this.state.f92290b, this.outerContext);
        android.view.View view = this.state.f92289a;
        if (view.getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) view.getContext()).setBaseContext(gVar);
        } else {
            io.flutter.Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.e eVar = new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.e(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = eVar;
        eVar.addView(this.container);
        this.rootView.addView(this.state.f92291c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(android.content.Context context, android.view.Display display, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.a aVar, com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.h hVar, android.view.View.OnFocusChangeListener onFocusChangeListener, boolean z17) {
        super(new com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.f(context, null), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = hVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z17;
    }
}

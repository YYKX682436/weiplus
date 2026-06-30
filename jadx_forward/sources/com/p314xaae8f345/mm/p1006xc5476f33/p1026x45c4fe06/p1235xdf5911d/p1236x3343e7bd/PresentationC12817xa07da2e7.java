package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd;

/* renamed from: com.tencent.mm.plugin.appbrand.wxassistant.pageinfo.SingleViewPresentation */
/* loaded from: classes7.dex */
class PresentationC12817xa07da2e7 extends android.app.Presentation {
    private static final java.lang.String TAG = "PlatformViewsController";

    /* renamed from: accessibilityEventsDelegate */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.a f35338xf53d26ac;

    /* renamed from: container */
    private android.widget.FrameLayout f35339xe7814c81;

    /* renamed from: focusChangeListener */
    private final android.view.View.OnFocusChangeListener f35340xd78e537c;

    /* renamed from: outerContext */
    private final android.content.Context f35341x71093cb4;

    /* renamed from: rootView */
    private com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.e f35342xf60eeea7;

    /* renamed from: startFocused */
    private boolean f35343xcecc0cb5;

    /* renamed from: state */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.h f35344x68ac491;

    /* renamed from: viewId */
    private int f35345xcf532ea0;

    public PresentationC12817xa07da2e7(android.content.Context context, android.view.Display display, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.a aVar, int i17, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.f(context, null), display);
        this.f35343xcecc0cb5 = false;
        this.f35338xf53d26ac = aVar;
        this.f35345xcf532ea0 = i17;
        this.f35340xd78e537c = onFocusChangeListener;
        this.f35341x71093cb4 = context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.h();
        this.f35344x68ac491 = hVar;
        hVar.f173822a = view;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    /* renamed from: detachState */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.h m53760x40ec80be() {
        android.widget.FrameLayout frameLayout = this.f35339xe7814c81;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.e eVar = this.f35342xf60eeea7;
        if (eVar != null) {
            eVar.removeAllViews();
        }
        return this.f35344x68ac491;
    }

    /* renamed from: getView */
    public android.view.View m53761xfb86a31b() {
        return this.f35344x68ac491.f173822a;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.h hVar = this.f35344x68ac491;
        if (hVar.f173824c == null) {
            hVar.f173824c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.d(getContext());
        }
        if (this.f35344x68ac491.f173823b == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.h hVar2 = this.f35344x68ac491;
            hVar2.f173823b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.l(windowManager, hVar2.f173824c);
        }
        this.f35339xe7814c81 = new android.widget.FrameLayout(getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.g(getContext(), this.f35344x68ac491.f173823b, this.f35341x71093cb4);
        android.view.View view = this.f35344x68ac491.f173822a;
        if (view.getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) view.getContext()).setBaseContext(gVar);
        } else {
            io.p3284xd2ae381c.Log.w(TAG, "Unexpected platform view context for view ID " + this.f35345xcf532ea0 + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.f35339xe7814c81.addView(view);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.e(getContext(), this.f35338xf53d26ac, view);
        this.f35342xf60eeea7 = eVar;
        eVar.addView(this.f35339xe7814c81);
        this.f35342xf60eeea7.addView(this.f35344x68ac491.f173824c);
        view.setOnFocusChangeListener(this.f35340xd78e537c);
        this.f35342xf60eeea7.setFocusableInTouchMode(true);
        if (this.f35343xcecc0cb5) {
            view.requestFocus();
        } else {
            this.f35342xf60eeea7.requestFocus();
        }
        setContentView(this.f35342xf60eeea7);
    }

    public PresentationC12817xa07da2e7(android.content.Context context, android.view.Display display, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.h hVar, android.view.View.OnFocusChangeListener onFocusChangeListener, boolean z17) {
        super(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.p1236x3343e7bd.f(context, null), display);
        this.f35343xcecc0cb5 = false;
        this.f35338xf53d26ac = aVar;
        this.f35344x68ac491 = hVar;
        this.f35340xd78e537c = onFocusChangeListener;
        this.f35341x71093cb4 = context;
        getWindow().setFlags(8, 8);
        this.f35343xcecc0cb5 = z17;
    }
}

package aa3;

/* loaded from: classes15.dex */
public final class p0 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.widget.input.u4 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f2569p = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f2570d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2571e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2572f;

    /* renamed from: g, reason: collision with root package name */
    public int f2573g;

    /* renamed from: h, reason: collision with root package name */
    public int f2574h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2575i;

    /* renamed from: m, reason: collision with root package name */
    public nl1.b f2576m;

    /* renamed from: n, reason: collision with root package name */
    public int f2577n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView f2578o;

    public p0(android.content.Context context) {
        super(context);
        this.f2571e = false;
        this.f2572f = null;
        this.f2573g = 0;
        this.f2574h = 0;
        this.f2575i = true;
        this.f2576m = null;
        this.f2577n = 2;
        u();
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    public int getPanelHeight() {
        return i65.a.b(getContext(), 240);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2571e) {
            return;
        }
        removeAllViews();
        u();
        java.lang.String str = this.f2572f;
        if (str != null) {
            this.f2578o.setActionText(str);
        }
        int i17 = this.f2573g;
        if (i17 != 0) {
            this.f2578o.setConfirmColor(i17);
        }
        int i18 = this.f2574h;
        if (i18 != 0) {
            this.f2578o.setConfirmBgColor(i18);
        }
        com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView liteAppPayKeyboardView = this.f2578o;
        liteAppPayKeyboardView.f143862r.setEnabled(this.f2575i);
        nl1.b bVar = this.f2576m;
        if (bVar != null) {
            this.f2578o.c(bVar);
        }
        this.f2578o.setXMode(this.f2577n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return n3.x0.c(this);
    }

    public void setConfirmBgColor(int i17) {
        this.f2574h = i17;
        this.f2578o.setConfirmBgColor(i17);
    }

    public void setConfirmColor(int i17) {
        this.f2573g = i17;
        this.f2578o.setConfirmColor(i17);
    }

    public void setConfirmText(java.lang.String str) {
        this.f2572f = str;
        this.f2578o.setActionText(str);
    }

    public void setForceLight(boolean z17) {
        this.f2571e = z17;
        this.f2578o.setForceLight(z17);
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    public <_InputEventReceiver extends nl1.b> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        this.f2576m = _inputeventreceiver;
        this.f2578o.c(_inputeventreceiver);
    }

    public void setIsOnlySupportInteger(boolean z17) {
        this.f2578o.setIsOnlySupportInteger(z17);
    }

    public void setOnDoneListener(aa3.o0 o0Var) {
    }

    public void setXMode(int i17) {
        this.f2577n = i17;
        this.f2578o.setXMode(i17);
    }

    public final void u() {
        super.setId(com.tencent.mm.R.id.f485560i43);
        setVisibility(4);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478490b));
        android.app.Activity activity = (android.app.Activity) getContext();
        android.view.WindowInsets b17 = com.tencent.mm.ui.qk.b(activity);
        int c17 = (android.os.Build.VERSION.SDK_INT < 30 || b17 == null) ? com.tencent.mm.ui.bl.c(activity) : b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i65.a.b(getContext(), 240));
        layoutParams.setMargins(0, 0, 0, c17 - 20);
        com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView liteAppPayKeyboardView = new com.tencent.mm.plugin.lite.keyboard.LiteAppPayKeyboardView(getContext());
        this.f2578o = liteAppPayKeyboardView;
        addView(liteAppPayKeyboardView, layoutParams);
        this.f2578o.setActionText(activity.getString(com.tencent.mm.R.string.gbi));
    }
}

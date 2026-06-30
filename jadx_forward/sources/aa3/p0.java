package aa3;

/* loaded from: classes15.dex */
public final class p0 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f84102p = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f84103d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f84105f;

    /* renamed from: g, reason: collision with root package name */
    public int f84106g;

    /* renamed from: h, reason: collision with root package name */
    public int f84107h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f84108i;

    /* renamed from: m, reason: collision with root package name */
    public nl1.b f84109m;

    /* renamed from: n, reason: collision with root package name */
    public int f84110n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16218x92f34101 f84111o;

    public p0(android.content.Context context) {
        super(context);
        this.f84104e = false;
        this.f84105f = null;
        this.f84106g = 0;
        this.f84107h = 0;
        this.f84108i = true;
        this.f84109m = null;
        this.f84110n = 2;
        u();
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    /* renamed from: getPanelHeight */
    public int m906x10b53b15() {
        return i65.a.b(getContext(), 240);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f84104e) {
            return;
        }
        removeAllViews();
        u();
        java.lang.String str = this.f84105f;
        if (str != null) {
            this.f84111o.m65733x8ac63285(str);
        }
        int i17 = this.f84106g;
        if (i17 != 0) {
            this.f84111o.m65735x12b11e05(i17);
        }
        int i18 = this.f84107h;
        if (i18 != 0) {
            this.f84111o.m65734xe612e440(i18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16218x92f34101 c16218x92f34101 = this.f84111o;
        c16218x92f34101.f225395r.setEnabled(this.f84108i);
        nl1.b bVar = this.f84109m;
        if (bVar != null) {
            this.f84111o.c(bVar);
        }
        this.f84111o.m65739x53eb72f9(this.f84110n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeAllViews();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4
    public boolean q() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        return n3.x0.c(this);
    }

    /* renamed from: setConfirmBgColor */
    public void m907xe612e440(int i17) {
        this.f84107h = i17;
        this.f84111o.m65734xe612e440(i17);
    }

    /* renamed from: setConfirmColor */
    public void m908x12b11e05(int i17) {
        this.f84106g = i17;
        this.f84111o.m65735x12b11e05(i17);
    }

    /* renamed from: setConfirmText */
    public void m909x84c2fa4b(java.lang.String str) {
        this.f84105f = str;
        this.f84111o.m65733x8ac63285(str);
    }

    /* renamed from: setForceLight */
    public void m910x235cdaed(boolean z17) {
        this.f84104e = z17;
        this.f84111o.m65736x235cdaed(z17);
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    /* renamed from: setInputEventReceiver */
    public <_InputEventReceiver extends nl1.b> void m911x9a97bb01(_InputEventReceiver _inputeventreceiver) {
        this.f84109m = _inputeventreceiver;
        this.f84111o.c(_inputeventreceiver);
    }

    /* renamed from: setIsOnlySupportInteger */
    public void m912x1c238f87(boolean z17) {
        this.f84111o.m65738x1c238f87(z17);
    }

    /* renamed from: setOnDoneListener */
    public void m913x87046ad7(aa3.o0 o0Var) {
    }

    /* renamed from: setXMode */
    public void m914x53eb72f9(int i17) {
        this.f84110n = i17;
        this.f84111o.m65739x53eb72f9(i17);
    }

    public final void u() {
        super.setId(com.p314xaae8f345.mm.R.id.f567093i43);
        setVisibility(4);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b));
        android.app.Activity activity = (android.app.Activity) getContext();
        android.view.WindowInsets b17 = com.p314xaae8f345.mm.ui.qk.b(activity);
        int c17 = (android.os.Build.VERSION.SDK_INT < 30 || b17 == null) ? com.p314xaae8f345.mm.ui.bl.c(activity) : b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, i65.a.b(getContext(), 240));
        layoutParams.setMargins(0, 0, 0, c17 - 20);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16218x92f34101 c16218x92f34101 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16218x92f34101(getContext());
        this.f84111o = c16218x92f34101;
        addView(c16218x92f34101, layoutParams);
        this.f84111o.m65733x8ac63285(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbi));
    }
}

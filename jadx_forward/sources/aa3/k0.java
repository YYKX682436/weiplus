package aa3;

/* loaded from: classes7.dex */
public final class k0 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f84076o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f84077d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84078e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84079f;

    /* renamed from: g, reason: collision with root package name */
    public aa3.j0 f84080g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16217x6cae88e8 f84081h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f84082i;

    /* renamed from: m, reason: collision with root package name */
    public nl1.b f84083m;

    /* renamed from: n, reason: collision with root package name */
    public int f84084n;

    public k0(android.content.Context context) {
        super(context);
        this.f84078e = false;
        this.f84079f = false;
        this.f84084n = 0;
        u();
    }

    /* renamed from: getAttachedEditText */
    public android.widget.EditText m897xb5567791() {
        return this.f84082i;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    /* renamed from: getPanelHeight */
    public int m898x10b53b15() {
        return i65.a.b(getContext(), 270);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f84078e) {
            return;
        }
        removeAllViews();
        u();
        nl1.b bVar = this.f84083m;
        if (bVar != null) {
            this.f84081h.e(bVar);
        }
        android.view.KeyEvent.Callback callback = this.f84082i;
        if (callback != null) {
            this.f84081h.e((nl1.b) callback);
        }
        int i17 = this.f84084n;
        if (i17 != 0) {
            this.f84081h.mo53428x53eb72f9(i17);
        }
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

    /* renamed from: setForceLight */
    public void m899x235cdaed(boolean z17) {
        this.f84078e = z17;
        if (z17 && com.p314xaae8f345.mm.ui.bk.C()) {
            this.f84077d.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77706x9d4f2621);
            this.f84077d.findViewById(com.p314xaae8f345.mm.R.id.d0v).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            this.f84077d.findViewById(com.p314xaae8f345.mm.R.id.b3f).setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77907xe61cad8e);
            this.f84081h.a();
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    /* renamed from: setInputEditText */
    public <_Input extends android.widget.EditText & nl1.b> void m900xce4186ff(_Input _input) {
        this.f84082i = _input;
        this.f84081h.e(_input);
    }

    /* renamed from: setInputEventReceiver */
    public <_InputEventReceiver extends nl1.b> void m901x9a97bb01(_InputEventReceiver _inputeventreceiver) {
        this.f84083m = _inputeventreceiver;
        this.f84081h.e(_inputeventreceiver);
    }

    /* renamed from: setOnDoneListener */
    public void m902x87046ad7(aa3.j0 j0Var) {
        this.f84080g = j0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        if (getVisibility() == i17 && (getVisibility() == 0 || getVisibility() == 8)) {
            return;
        }
        if (i17 == 0) {
            super.setVisibility(i17);
        } else {
            super.setVisibility(8);
            v();
        }
    }

    /* renamed from: setXMode */
    public void m903x53eb72f9(int i17) {
        this.f84084n = i17;
        this.f84081h.mo53428x53eb72f9(i17);
    }

    public final void u() {
        super.setId(com.p314xaae8f345.mm.R.id.f564692y6);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, i65.a.b(getContext(), 30));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569673i9, (android.view.ViewGroup) null);
        this.f84077d = inflate;
        inflate.setOnClickListener(new aa3.i0(this));
        addView(this.f84077d, layoutParams);
        android.app.Activity activity = (android.app.Activity) getContext();
        android.view.WindowInsets b17 = com.p314xaae8f345.mm.ui.qk.b(activity);
        int c17 = (android.os.Build.VERSION.SDK_INT < 30 || b17 == null) ? com.p314xaae8f345.mm.ui.bl.c(activity) : b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, i65.a.b(getContext(), 240));
        layoutParams2.setMargins(0, 0, 0, c17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16217x6cae88e8 c16217x6cae88e8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1806x1e0673e7.C16217x6cae88e8(getContext());
        this.f84081h = c16217x6cae88e8;
        addView(c16217x6cae88e8, layoutParams2);
    }

    public final void v() {
        aa3.j0 j0Var;
        if (this.f84079f || (j0Var = this.f84080g) == null) {
            return;
        }
        this.f84079f = true;
        aa3.t tVar = ((aa3.r) j0Var).f84123a;
        tVar.mo891x3f895349();
        tVar.getClass();
        this.f84079f = false;
    }
}

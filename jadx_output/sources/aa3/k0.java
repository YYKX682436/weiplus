package aa3;

/* loaded from: classes7.dex */
public final class k0 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.widget.input.u4 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f2543o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f2544d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2545e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2546f;

    /* renamed from: g, reason: collision with root package name */
    public aa3.j0 f2547g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView f2548h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f2549i;

    /* renamed from: m, reason: collision with root package name */
    public nl1.b f2550m;

    /* renamed from: n, reason: collision with root package name */
    public int f2551n;

    public k0(android.content.Context context) {
        super(context);
        this.f2545e = false;
        this.f2546f = false;
        this.f2551n = 0;
        u();
    }

    public android.widget.EditText getAttachedEditText() {
        return this.f2549i;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    public int getPanelHeight() {
        return i65.a.b(getContext(), 270);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f2545e) {
            return;
        }
        removeAllViews();
        u();
        nl1.b bVar = this.f2550m;
        if (bVar != null) {
            this.f2548h.e(bVar);
        }
        android.view.KeyEvent.Callback callback = this.f2549i;
        if (callback != null) {
            this.f2548h.e((nl1.b) callback);
        }
        int i17 = this.f2551n;
        if (i17 != 0) {
            this.f2548h.setXMode(i17);
        }
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

    public void setForceLight(boolean z17) {
        this.f2545e = z17;
        if (z17 && com.tencent.mm.ui.bk.C()) {
            this.f2544d.setBackgroundResource(com.tencent.mm.R.color.BW_BG_100);
            this.f2544d.findViewById(com.tencent.mm.R.id.d0v).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            this.f2544d.findViewById(com.tencent.mm.R.id.b3f).setBackgroundResource(com.tencent.mm.R.color.UN_BW_0_Alpha_0_1);
            this.f2548h.a();
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    public <_Input extends android.widget.EditText & nl1.b> void setInputEditText(_Input _input) {
        this.f2549i = _input;
        this.f2548h.e(_input);
    }

    public <_InputEventReceiver extends nl1.b> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        this.f2550m = _inputeventreceiver;
        this.f2548h.e(_inputeventreceiver);
    }

    public void setOnDoneListener(aa3.j0 j0Var) {
        this.f2547g = j0Var;
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

    public void setXMode(int i17) {
        this.f2551n = i17;
        this.f2548h.setXMode(i17);
    }

    public final void u() {
        super.setId(com.tencent.mm.R.id.f483159y6);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, i65.a.b(getContext(), 30));
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488140i9, (android.view.ViewGroup) null);
        this.f2544d = inflate;
        inflate.setOnClickListener(new aa3.i0(this));
        addView(this.f2544d, layoutParams);
        android.app.Activity activity = (android.app.Activity) getContext();
        android.view.WindowInsets b17 = com.tencent.mm.ui.qk.b(activity);
        int c17 = (android.os.Build.VERSION.SDK_INT < 30 || b17 == null) ? com.tencent.mm.ui.bl.c(activity) : b17.getInsets(android.view.WindowInsets.Type.navigationBars()).bottom;
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, i65.a.b(getContext(), 240));
        layoutParams2.setMargins(0, 0, 0, c17);
        com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView liteAppNumberKeyboardView = new com.tencent.mm.plugin.lite.keyboard.LiteAppNumberKeyboardView(getContext());
        this.f2548h = liteAppNumberKeyboardView;
        addView(liteAppNumberKeyboardView, layoutParams2);
    }

    public final void v() {
        aa3.j0 j0Var;
        if (this.f2546f || (j0Var = this.f2547g) == null) {
            return;
        }
        this.f2546f = true;
        aa3.t tVar = ((aa3.r) j0Var).f2590a;
        tVar.hideKeyboard();
        tVar.getClass();
        this.f2546f = false;
    }
}

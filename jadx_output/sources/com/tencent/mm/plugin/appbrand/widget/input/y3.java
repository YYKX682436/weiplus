package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class y3 extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.widget.input.u4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f91723d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.x3 f91724e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f91725f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f91726g;

    /* renamed from: h, reason: collision with root package name */
    public jg1.b f91727h;

    /* renamed from: i, reason: collision with root package name */
    public int f91728i;

    public y3(android.content.Context context) {
        super(context);
        this.f91723d = false;
        this.f91727h = null;
        this.f91728i = -1;
        com.tencent.mm.plugin.appbrand.widget.input.w3 w3Var = new com.tencent.mm.plugin.appbrand.widget.input.w3(this);
        setId(com.tencent.mm.R.id.f483160y7);
        setOrientation(1);
        setBackgroundColor(-1);
        nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
        android.content.Context context2 = getContext();
        ((com.tencent.mm.plugin.appbrand.utils.i5) dVar).getClass();
        this.f91725f = ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).wi(context2, this, new com.tencent.mm.plugin.appbrand.utils.h5(w3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setInputReceiver(nl1.b bVar) {
        com.tencent.mm.plugin.appbrand.widget.input.x4 a17;
        if (bVar == 0) {
            return;
        }
        boolean z17 = bVar instanceof android.view.View;
        if (z17 && (a17 = com.tencent.mm.plugin.appbrand.widget.input.w4.a(((android.view.View) bVar).getContext())) != null) {
            a17.hideVKB();
        }
        if (bVar instanceof android.widget.EditText) {
            android.widget.EditText editText = (android.widget.EditText) bVar;
            editText.setShowSoftInputOnFocus(false);
            com.tencent.mm.plugin.appbrand.widget.input.m5.b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
        }
        if (z17) {
            ((android.view.View) bVar).requestFocus();
        }
        ((com.tencent.mm.plugin.appbrand.utils.i5) ((nl1.d) nd.f.a(nl1.d.class))).a(this.f91725f, bVar);
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.y3 v(android.view.View view, jg1.b bVar) {
        com.tencent.mm.plugin.appbrand.widget.input.y3 y3Var = (com.tencent.mm.plugin.appbrand.widget.input.y3) view.getRootView().findViewById(com.tencent.mm.R.id.f483160y7);
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = com.tencent.mm.plugin.appbrand.widget.input.h1.d(view);
        if (d17 == null) {
            return null;
        }
        if (y3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "set new AppBrandWcPayNumberKeyboardPanel");
            y3Var = new com.tencent.mm.plugin.appbrand.widget.input.y3(view.getContext());
        }
        d17.a(y3Var, false);
        if (bVar != null && bVar != y3Var.f91727h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "set mComponentView %s", bVar.toString());
            y3Var.f91727h = bVar;
        }
        return y3Var;
    }

    public android.widget.EditText getAttachedEditText() {
        return this.f91726g;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    public int getPanelHeight() {
        return i65.a.b(getContext(), 240);
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

    public <_Input extends android.widget.EditText & nl1.b> void setInputEditText(_Input _input) {
        this.f91726g = _input;
        setInputReceiver(_input);
    }

    public <_InputEventReceiver extends nl1.b> void setInputEventReceiver(_InputEventReceiver _inputeventreceiver) {
        ((com.tencent.mm.plugin.appbrand.utils.i5) ((nl1.d) nd.f.a(nl1.d.class))).a(this.f91725f, _inputeventreceiver);
        setInputReceiver(_inputeventreceiver);
    }

    public void setOnDoneListener(com.tencent.mm.plugin.appbrand.widget.input.x3 x3Var) {
        this.f91724e = x3Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.tencent.mm.plugin.appbrand.widget.input.x3 x3Var;
        if (getVisibility() == i17 && (getVisibility() == 0 || getVisibility() == 8)) {
            return;
        }
        if (i17 == 0) {
            super.setVisibility(i17);
            return;
        }
        super.setVisibility(8);
        if (this.f91723d || (x3Var = this.f91724e) == null) {
            return;
        }
        this.f91723d = true;
        x3Var.onDone();
        this.f91723d = false;
    }

    public void u() {
        this.f91725f.setVisibility(8);
        setVisibility(8);
        android.widget.EditText editText = this.f91726g;
        if (editText != null) {
            editText.clearFocus();
            this.f91726g = null;
            this.f91724e = null;
            this.f91723d = false;
        }
        nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
        android.view.ViewGroup viewGroup = this.f91725f;
        ((com.tencent.mm.plugin.appbrand.utils.i5) dVar).getClass();
        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).getClass();
        if (viewGroup instanceof com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) {
            ((com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) viewGroup).i();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletService", "hideNumKeyboard error, kbView is not WcPayKeyboard");
        }
    }

    public void w(nl1.b bVar) {
        if (bVar == null) {
            return;
        }
        setInputEventReceiver(bVar);
        this.f91725f.setVisibility(0);
        setVisibility(0);
        nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
        android.view.ViewGroup viewGroup = this.f91725f;
        ((com.tencent.mm.plugin.appbrand.utils.i5) dVar).getClass();
        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(viewGroup);
    }
}

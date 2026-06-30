package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class y3 extends android.widget.LinearLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.u4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f173256d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x3 f173257e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f173258f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.EditText f173259g;

    /* renamed from: h, reason: collision with root package name */
    public jg1.b f173260h;

    /* renamed from: i, reason: collision with root package name */
    public int f173261i;

    public y3(android.content.Context context) {
        super(context);
        this.f173256d = false;
        this.f173260h = null;
        this.f173261i = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w3 w3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w3(this);
        setId(com.p314xaae8f345.mm.R.id.f564693y7);
        setOrientation(1);
        setBackgroundColor(-1);
        nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
        android.content.Context context2 = getContext();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i5) dVar).getClass();
        this.f173258f = ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).wi(context2, this, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.h5(w3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: setInputReceiver */
    private void m53538x3e905e97(nl1.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x4 a17;
        if (bVar == 0) {
            return;
        }
        boolean z17 = bVar instanceof android.view.View;
        if (z17 && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w4.a(((android.view.View) bVar).getContext())) != null) {
            a17.mo48674x36654fab();
        }
        if (bVar instanceof android.widget.EditText) {
            android.widget.EditText editText = (android.widget.EditText) bVar;
            editText.setShowSoftInputOnFocus(false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m5.b(editText).hideSoftInputFromInputMethod(editText.getWindowToken(), 0);
        }
        if (z17) {
            ((android.view.View) bVar).requestFocus();
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i5) ((nl1.d) nd.f.a(nl1.d.class))).a(this.f173258f, bVar);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 v(android.view.View view, jg1.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3 y3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3) view.getRootView().findViewById(com.p314xaae8f345.mm.R.id.f564693y7);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.d(view);
        if (d17 == null) {
            return null;
        }
        if (y3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "set new AppBrandWcPayNumberKeyboardPanel");
            y3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.y3(view.getContext());
        }
        d17.a(y3Var, false);
        if (bVar != null && bVar != y3Var.f173260h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWcPayNumberKeyboardPanel", "set mComponentView %s", bVar.toString());
            y3Var.f173260h = bVar;
        }
        return y3Var;
    }

    /* renamed from: getAttachedEditText */
    public android.widget.EditText m53539xb5567791() {
        return this.f173259g;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return 0;
    }

    /* renamed from: getPanelHeight */
    public int m53540x10b53b15() {
        return i65.a.b(getContext(), 240);
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

    /* renamed from: setInputEditText */
    public <_Input extends android.widget.EditText & nl1.b> void m53541xce4186ff(_Input _input) {
        this.f173259g = _input;
        m53538x3e905e97(_input);
    }

    /* renamed from: setInputEventReceiver */
    public <_InputEventReceiver extends nl1.b> void m53542x9a97bb01(_InputEventReceiver _inputeventreceiver) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i5) ((nl1.d) nd.f.a(nl1.d.class))).a(this.f173258f, _inputeventreceiver);
        m53538x3e905e97(_inputeventreceiver);
    }

    /* renamed from: setOnDoneListener */
    public void m53543x87046ad7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x3 x3Var) {
        this.f173257e = x3Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.x3 x3Var;
        if (getVisibility() == i17 && (getVisibility() == 0 || getVisibility() == 8)) {
            return;
        }
        if (i17 == 0) {
            super.setVisibility(i17);
            return;
        }
        super.setVisibility(8);
        if (this.f173256d || (x3Var = this.f173257e) == null) {
            return;
        }
        this.f173256d = true;
        x3Var.mo53485xc3989e01();
        this.f173256d = false;
    }

    public void u() {
        this.f173258f.setVisibility(8);
        setVisibility(8);
        android.widget.EditText editText = this.f173259g;
        if (editText != null) {
            editText.clearFocus();
            this.f173259g = null;
            this.f173257e = null;
            this.f173256d = false;
        }
        nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
        android.view.ViewGroup viewGroup = this.f173258f;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i5) dVar).getClass();
        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).getClass();
        if (viewGroup instanceof com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) {
            ((com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) viewGroup).i();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletService", "hideNumKeyboard error, kbView is not WcPayKeyboard");
        }
    }

    public void w(nl1.b bVar) {
        if (bVar == null) {
            return;
        }
        m53542x9a97bb01(bVar);
        this.f173258f.setVisibility(0);
        setVisibility(0);
        nl1.d dVar = (nl1.d) nd.f.a(nl1.d.class);
        android.view.ViewGroup viewGroup = this.f173258f;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i5) dVar).getClass();
        ((ps4.g) ((o05.l) i95.n0.c(o05.l.class))).Ai(viewGroup);
    }
}

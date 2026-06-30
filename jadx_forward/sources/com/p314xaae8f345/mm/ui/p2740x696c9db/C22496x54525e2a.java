package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView */
/* loaded from: classes12.dex */
public class C22496x54525e2a extends android.widget.LinearLayout implements com.p314xaae8f345.mm.ui.p2740x696c9db.o3 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f291493u = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f291494d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText f291495e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f291496f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.r f291497g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f291498h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.vd f291499i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f291500m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.q f291501n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.p f291502o;

    /* renamed from: p, reason: collision with root package name */
    public final android.text.TextWatcher f291503p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnFocusChangeListener f291504q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f291505r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f291506s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f291507t;

    /* renamed from: com.tencent.mm.ui.tools.ActionBarSearchView$ActionBarEditText */
    /* loaded from: classes12.dex */
    public static class ActionBarEditText extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22597x35809f4a {
        public ActionBarEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
            super(context, attributeSet, i17);
        }

        @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22597x35809f4a, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017, fl5.i
        /* renamed from: getRealEditText */
        public fl5.i mo61840xc52e48b() {
            return this;
        }

        /* renamed from: setSearchView */
        public void m81065xf20d066f(com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a) {
        }

        public ActionBarEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public C22496x54525e2a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291497g = com.p314xaae8f345.mm.ui.p2740x696c9db.r.CLEAR;
        this.f291498h = false;
        this.f291503p = new com.p314xaae8f345.mm.ui.p2740x696c9db.f(this);
        this.f291504q = new com.p314xaae8f345.mm.ui.p2740x696c9db.g(this);
        this.f291506s = new com.p314xaae8f345.mm.ui.p2740x696c9db.h(this);
        this.f291507t = new com.p314xaae8f345.mm.ui.p2740x696c9db.i(this);
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public boolean a() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            return actionBarEditText.hasFocus();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void b() {
        this.f291495e.clearFocus();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void c(java.lang.Boolean bool) {
        if (this.f291495e == null) {
            return;
        }
        if (!bool.booleanValue()) {
            this.f291495e.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.o(this));
        } else if (d()) {
            l();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public boolean d() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            return actionBarEditText.requestFocus();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public boolean e() {
        return this instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void f(boolean z17) {
        if (z17 && z17 != this.f291498h) {
            k(com.p314xaae8f345.mm.ui.p2740x696c9db.r.VOICE_SEARCH);
        }
        this.f291498h = z17;
        m();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void g(boolean z17) {
        if (z17) {
            this.f291495e.setText("");
            return;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        android.text.TextWatcher textWatcher = this.f291503p;
        actionBarEditText.removeTextChangedListener(textWatcher);
        this.f291495e.setText("");
        this.f291495e.addTextChangedListener(textWatcher);
    }

    /* renamed from: getEditText */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText m81043xdb574fcd() {
        return this.f291495e;
    }

    /* renamed from: getLayoutId */
    public int mo63625x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569448bh;
    }

    /* renamed from: getLineCount */
    public int m81044x92d2fac5() {
        return this.f291495e.getLineCount();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: getSearchContent */
    public java.lang.String mo81045x448ef5fb() {
        return this.f291495e.getEditableText() != null ? this.f291495e.getEditableText().toString() : "";
    }

    /* renamed from: getSelectionEnd */
    public int m81046xffd93625() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            return actionBarEditText.getSelectionEnd();
        }
        return -1;
    }

    /* renamed from: getSelectionStart */
    public int m81047x6f2c472c() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            return actionBarEditText.getSelectionStart();
        }
        return -1;
    }

    /* renamed from: getStatusBtn */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f m81048x84084a54() {
        return this.f291496f;
    }

    public final void h() {
        ((android.view.LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(mo63625x2ee31f5b(), (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f291494d = findViewById;
        findViewById.setOnClickListener(this.f291507t);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText) findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f291495e = actionBarEditText;
        this.f291499i = new com.p314xaae8f345.mm.ui.p2740x696c9db.vd(actionBarEditText);
        this.f291495e.m81065xf20d066f(this);
        this.f291500m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.meb);
        this.f291495e.post(new com.p314xaae8f345.mm.ui.p2740x696c9db.j(this));
        this.f291496f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) findViewById(com.p314xaae8f345.mm.R.id.nhn);
        this.f291495e.addTextChangedListener(this.f291503p);
        this.f291495e.setOnKeyListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.k(this));
        this.f291495e.m81250xa7d6ba0f(new com.p314xaae8f345.mm.ui.p2740x696c9db.l(this));
        this.f291495e.setOnFocusChangeListener(this.f291504q);
        if (!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v)) {
            ck5.f b17 = ck5.f.b(this.f291495e);
            b17.f124094f = 0;
            b17.f124093e = 100;
            b17.d(null);
        }
        m();
        this.f291496f.setOnClickListener(this.f291506s);
        android.view.View view = this.f291500m;
        if (view != null) {
            view.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.m(this));
        }
        if ((getContext() instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) && ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) getContext()).m81210x448cda5d()) {
            this.f291495e.setImeOptions(6);
        }
    }

    public void i(boolean z17) {
    }

    public void j(com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar) {
    }

    public void k(com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar) {
    }

    public void l() {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        if (this.f291495e == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(this.f291495e, 1);
    }

    public final void m() {
        this.f291496f.setImportantForAccessibility(1);
        android.text.Editable editableText = this.f291495e.getEditableText();
        com.p314xaae8f345.mm.ui.p2740x696c9db.r rVar = com.p314xaae8f345.mm.ui.p2740x696c9db.r.CLEAR;
        if (editableText != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f291495e.getEditableText().toString())) {
            this.f291496f.setImageResource(com.p314xaae8f345.mm.R.raw.f81441x86452437);
            this.f291496f.m82034x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
            this.f291496f.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572452b91));
            this.f291497g = rVar;
            return;
        }
        if (!this.f291498h) {
            this.f291496f.setImageResource(0);
            this.f291496f.setImportantForAccessibility(2);
            this.f291497g = rVar;
        } else {
            this.f291496f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b9v);
            this.f291496f.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574483ie3));
            this.f291496f.m82034x7541828(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            this.f291497g = com.p314xaae8f345.mm.ui.p2740x696c9db.r.VOICE_SEARCH;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setAutoMatchKeywords */
    public void mo81049x73ff22de(boolean z17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.vd vdVar = this.f291499i;
        if (vdVar != null) {
            vdVar.f292391e = z17;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setBackClickCallback */
    public void mo81050xd7457004(com.p314xaae8f345.mm.ui.p2740x696c9db.p pVar) {
        this.f291502o = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setCallBack */
    public void mo81051x6c4032e7(com.p314xaae8f345.mm.ui.p2740x696c9db.q qVar) {
        this.f291501n = qVar;
    }

    /* renamed from: setEditTextClickListener */
    public void m81052x2c104e03(android.view.View.OnClickListener onClickListener) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            actionBarEditText.setFocusable(false);
            this.f291495e.setOnClickListener(onClickListener);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setEditTextEnabled */
    public void mo81053xeb117c28(boolean z17) {
        this.f291495e.setEnabled(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setFocusChangeListener */
    public void mo81054x7e02efba(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f291505r = onFocusChangeListener;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setHint */
    public void mo81055x764b0e09(java.lang.CharSequence charSequence) {
        this.f291495e.setHint(charSequence);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setImeScene */
    public void mo81056x490edfcd(int i17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            actionBarEditText.getInputExtras(true).putInt("wechat_scene", i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setKeywords */
    public void mo81057x95c13e2c(java.util.ArrayList<java.lang.String> arrayList) {
        android.widget.EditText editText;
        com.p314xaae8f345.mm.ui.p2740x696c9db.vd vdVar = this.f291499i;
        if (vdVar != null) {
            vdVar.f292389c = arrayList;
            if (!vdVar.f292391e || (editText = (android.widget.EditText) vdVar.f292388b.get()) == null) {
                return;
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.vd.b(editText, vdVar.f292389c);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setNotRealCallBack */
    public void mo81058x56599d4(com.p314xaae8f345.mm.ui.p2740x696c9db.i9 i9Var) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setOnEditorActionListener */
    public void mo81059x37562b58(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f291495e.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setSearchContent */
    public void mo81060xd7655c6f(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f291495e.setText(str);
        this.f291495e.mo81549xf579a34a(str.length());
    }

    /* renamed from: setSearchTipIcon */
    public void m81061x507ad3aa(int i17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            actionBarEditText.setCompoundDrawables(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDrawable(i17), null, null, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setSelectedTag */
    public void mo81062x7d60453d(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        if (actionBarEditText != null) {
            actionBarEditText.setCompoundDrawables(new com.p314xaae8f345.mm.ui.p2740x696c9db.s(this, this.f291495e, str), null, null, null);
            this.f291495e.setHint("");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setStatusBtnEnabled */
    public void mo81063x3717e759(boolean z17) {
        this.f291496f.setEnabled(z17);
    }

    /* renamed from: setText */
    public void m81064x765074af(java.lang.String str) {
        this.f291495e.setText(str);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.ActionBarEditText actionBarEditText = this.f291495e;
        actionBarEditText.mo81549xf579a34a(actionBarEditText.getEditableText().length());
    }

    public C22496x54525e2a(android.content.Context context) {
        super(context);
        this.f291497g = com.p314xaae8f345.mm.ui.p2740x696c9db.r.CLEAR;
        this.f291498h = false;
        this.f291503p = new com.p314xaae8f345.mm.ui.p2740x696c9db.f(this);
        this.f291504q = new com.p314xaae8f345.mm.ui.p2740x696c9db.g(this);
        this.f291506s = new com.p314xaae8f345.mm.ui.p2740x696c9db.h(this);
        this.f291507t = new com.p314xaae8f345.mm.ui.p2740x696c9db.i(this);
        h();
    }
}

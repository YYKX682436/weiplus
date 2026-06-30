package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter */
/* loaded from: classes8.dex */
public class C19492xd515f0ad extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f268616d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f268617e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f268618f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f268619g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f268620h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f268621i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p7 f268622m;

    public C19492xd515f0ad(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public void a() {
        android.content.Context context = this.f268617e.getContext();
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo53060x36654fab(this.f268617e);
        }
        this.f268617e.clearFocus();
        setVisibility(8);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p7 p7Var = this.f268622m;
        if (p7Var != null) {
            p7Var.d(this);
        }
    }

    public final void b() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d_0, this);
        this.f268617e = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f268618f = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2);
        this.f268619g = inflate.findViewById(com.p314xaae8f345.mm.R.id.l28);
        this.f268620h = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567672kb5);
        this.f268621i = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hc6);
        this.f268616d = inflate.findViewById(com.p314xaae8f345.mm.R.id.hdl);
        this.f268618f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.i7(this));
        this.f268619g.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j7(this));
        this.f268620h.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.k7(this));
        this.f268617e.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l7(this));
        this.f268617e.setOnFocusChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m7(this));
        this.f268617e.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n7(this));
        this.f268617e.setSelectAllOnFocus(true);
        c();
    }

    public void c() {
        this.f268621i.setText("");
        this.f268619g.setEnabled(false);
        this.f268620h.setEnabled(false);
    }

    public void d(int i17, int i18, boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.f268621i;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(i18 == 0 ? 0 : i17 + 1);
            objArr[1] = java.lang.Integer.valueOf(i18);
            textView.setText(java.lang.String.format("%d/%d", objArr));
            this.f268620h.setEnabled(i18 > 0);
            this.f268619g.setEnabled(i18 > 0);
        }
    }

    /* renamed from: getSearchContent */
    public java.lang.String m74816x448ef5fb() {
        return this.f268617e.getText().toString();
    }

    @Override // android.view.View
    public boolean isShown() {
        return getVisibility() == 0;
    }

    /* renamed from: setActionDelegate */
    public void m74817xec7f5edd(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p7 p7Var) {
        this.f268622m = p7Var;
    }

    public C19492xd515f0ad(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }
}

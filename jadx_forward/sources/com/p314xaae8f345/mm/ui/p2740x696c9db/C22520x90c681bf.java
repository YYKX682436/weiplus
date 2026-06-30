package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper */
/* loaded from: classes12.dex */
public class C22520x90c681bf extends android.widget.LinearLayout implements com.p314xaae8f345.mm.ui.p2740x696c9db.o3 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f291676d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.EditText f291677e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f291678f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f291679g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.i9 f291680h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.p f291681i;

    public C22520x90c681bf(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public boolean a() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void b() {
        this.f291677e.clearFocus();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void c(java.lang.Boolean bool) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public boolean d() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public boolean e() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void f(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    public void g(boolean z17) {
        if (z17) {
            this.f291677e.setText("");
        } else {
            this.f291677e.setText("");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: getSearchContent */
    public java.lang.String mo81045x448ef5fb() {
        android.text.Editable editableText = this.f291677e.getEditableText();
        return editableText == null ? "" : editableText.toString();
    }

    /* renamed from: getSelectionEnd */
    public int m81095xffd93625() {
        return -1;
    }

    /* renamed from: getSelectionStart */
    public int m81096x6f2c472c() {
        return -1;
    }

    public final void h() {
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569449bi, (android.view.ViewGroup) this, true);
        this.f291677e = (android.widget.EditText) findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.f291678f = (android.widget.ImageButton) findViewById(com.p314xaae8f345.mm.R.id.nhn);
        this.f291676d = findViewById(com.p314xaae8f345.mm.R.id.f563857bd);
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.b2z);
        this.f291679g = button;
        button.setEnabled(false);
        this.f291677e.addTextChangedListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.d9(this));
        this.f291677e.setOnEditorActionListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.e9(this));
        ck5.f b17 = ck5.f.b(this.f291677e);
        b17.f124094f = 0;
        b17.f124093e = 100;
        b17.d(null);
        this.f291678f.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.f9(this));
        this.f291676d.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.g9(this));
        this.f291679g.setOnClickListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.h9(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setAutoMatchKeywords */
    public void mo81049x73ff22de(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setBackClickCallback */
    public void mo81050xd7457004(com.p314xaae8f345.mm.ui.p2740x696c9db.p pVar) {
        this.f291681i = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setCallBack */
    public void mo81051x6c4032e7(com.p314xaae8f345.mm.ui.p2740x696c9db.q qVar) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setEditTextEnabled */
    public void mo81053xeb117c28(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setFocusChangeListener */
    public void mo81054x7e02efba(android.view.View.OnFocusChangeListener onFocusChangeListener) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setHint */
    public void mo81055x764b0e09(java.lang.CharSequence charSequence) {
        m81101xf206aa51(charSequence);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setImeScene */
    public void mo81056x490edfcd(int i17) {
        android.widget.EditText editText = this.f291677e;
        if (editText != null) {
            editText.getInputExtras(true).putInt("wechat_scene", i17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setKeywords */
    public void mo81057x95c13e2c(java.util.ArrayList<java.lang.String> arrayList) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setNotRealCallBack */
    public void mo81058x56599d4(com.p314xaae8f345.mm.ui.p2740x696c9db.i9 i9Var) {
        this.f291680h = i9Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setOnEditorActionListener */
    public void mo81059x37562b58(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
    }

    /* renamed from: setSearchBtnText */
    public void m81098xaaf8d19f(java.lang.CharSequence charSequence) {
        this.f291679g.setText(charSequence);
    }

    /* renamed from: setSearchColor */
    public void m81099x4e8adcd9(int i17) {
        this.f291677e.setTextColor(i17);
    }

    /* renamed from: setSearchContent */
    public void m81100xd7655c6f(java.lang.CharSequence charSequence) {
        this.f291677e.setText("");
        this.f291677e.append(charSequence);
    }

    /* renamed from: setSearchHint */
    public void m81101xf206aa51(java.lang.CharSequence charSequence) {
        this.f291677e.setHint(charSequence);
    }

    /* renamed from: setSearchHintColor */
    public void m81102x7b05f92(int i17) {
        this.f291677e.setHintTextColor(i17);
    }

    /* renamed from: setSearchIcon */
    public void m81103xf2070843(int i17) {
        this.f291677e.setCompoundDrawablesWithIntrinsicBounds(i17, 0, 0, 0);
    }

    /* renamed from: setSearchTipIcon */
    public void m81104x507ad3aa(int i17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setSelectedTag */
    public void mo81062x7d60453d(java.lang.String str) {
    }

    /* renamed from: setShowBackIcon */
    public void m81105xe2d9699f(boolean z17) {
        android.view.View view = this.f291676d;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/tools/SearchViewNotRealTimeHelper", "setShowBackIcon", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setStatusBtnEnabled */
    public void mo81063x3717e759(boolean z17) {
    }

    /* renamed from: setCallBack */
    public void m81097x6c4032e7(com.p314xaae8f345.mm.ui.p2740x696c9db.i9 i9Var) {
        this.f291680h = i9Var;
    }

    public C22520x90c681bf(android.content.Context context) {
        super(context);
        h();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.o3
    /* renamed from: setSearchContent */
    public void mo81060xd7655c6f(java.lang.String str) {
        m81100xd7655c6f((java.lang.CharSequence) str);
    }
}

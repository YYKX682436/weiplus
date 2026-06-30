package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* renamed from: com.tencent.mm.pluginsdk.ui.MultiSelectContactView */
/* loaded from: classes5.dex */
public class C19642xb279030 extends android.widget.LinearLayout {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f271316x = 0;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f271317d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f271318e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f271319f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f271320g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.a2 f271321h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.b2 f271322i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.c2 f271323m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.LayoutInflater f271324n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean f271325o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f271326p;

    /* renamed from: q, reason: collision with root package name */
    public int f271327q;

    /* renamed from: r, reason: collision with root package name */
    public final int f271328r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f271329s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f271330t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f271331u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f271332v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ImageView f271333w;

    public C19642xb279030(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        this.f271318e = new java.util.ArrayList();
        this.f271325o = java.lang.Boolean.FALSE;
        this.f271326p = new java.util.ArrayList();
        this.f271327q = 0;
        this.f271328r = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561144am);
        this.f271329s = false;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        this.f271324n = from;
        from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c5j, (android.view.ViewGroup) this, true);
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528740y);
            i17 = obtainStyledAttributes.getInt(1, 0);
            this.f271325o = java.lang.Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
            obtainStyledAttributes.recycle();
        } else {
            i17 = 0;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.f567597k12);
        this.f271317d = c1163xf1deaba4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext());
        c1162x665295de.Q(0);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.mo7960x6cab2c8d(new com.p314xaae8f345.mm.p2470x93e71c27.ui.t1(this));
        this.f271319f = new java.util.HashSet();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m7g);
        this.f271320g = findViewById;
        setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        if (i17 == 1) {
            findViewById.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            findViewById.setPadding(0, 0, 0, 0);
            c1163xf1deaba4.setBackground(null);
        } else if (i17 == 2) {
            findViewById.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
            findViewById.setPadding(0, 0, 0, 0);
            c1163xf1deaba4.setBackground(null);
        }
        setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.s1(this));
    }

    public final void a(java.lang.String str, boolean z17) {
        this.f271319f.add(str);
        this.f271318e.add(str);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f271317d;
        int mo1894x7e414b06 = c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06();
        int i17 = mo1894x7e414b06 - 2;
        c1163xf1deaba4.mo7946xf939df19().m8149x8b456734(i17);
        if (!this.f271325o.booleanValue()) {
            i17 = mo1894x7e414b06 - 1;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f271317d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba42, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "addContact", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba42.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba42, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "addContact", "(Ljava/lang/String;Z)V", "Undefined", "scrollToPosition", "(I)V");
        j();
        h();
        i();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.a2 a2Var = this.f271321h;
        if (a2Var != null) {
            a2Var.M3(0, str);
        }
    }

    public final void b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f271317d;
        if (c1163xf1deaba4.getChildCount() == 1) {
            return;
        }
        android.view.View childAt = c1163xf1deaba4.getChildAt(c1163xf1deaba4.getChildCount() - 2);
        if (!this.f271329s || childAt == null) {
            return;
        }
        this.f271329s = false;
        android.view.View findViewById = childAt.findViewById(com.p314xaae8f345.mm.R.id.jbx);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "clearDelStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "clearDelStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void c() {
        m75362x652b8d61().setText("");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        try {
            m75362x652b8d61().clearFocus();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiSeclectContactView", "clearFocus exception:%s", e17);
        }
        b();
    }

    public void d(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        b();
        if (this.f271319f.contains(str)) {
            g(str, false, false);
        } else {
            a(str, true);
        }
    }

    public void e(java.util.List list) {
        java.util.ArrayList arrayList = this.f271318e;
        arrayList.clear();
        java.util.HashSet hashSet = this.f271319f;
        hashSet.clear();
        arrayList.addAll(list);
        hashSet.addAll(list);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f271317d;
        c1163xf1deaba4.mo7946xf939df19().m8146xced61ae5();
        int mo1894x7e414b06 = c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06();
        int i17 = this.f271325o.booleanValue() ? mo1894x7e414b06 - 2 : mo1894x7e414b06 - 1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f271317d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(c1163xf1deaba42, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "multiSelectChanged", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba42.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(c1163xf1deaba42, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "multiSelectChanged", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
        j();
        h();
        i();
    }

    public void f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f271318e);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g((java.lang.String) it.next(), false, false);
        }
    }

    public final void g(java.lang.String str, boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.a2 a2Var;
        if (this.f271326p.contains(str)) {
            return;
        }
        java.util.ArrayList arrayList = this.f271318e;
        int indexOf = arrayList.indexOf(str);
        if (indexOf >= 0 && indexOf < arrayList.size()) {
            this.f271319f.remove(arrayList.remove(indexOf));
            this.f271317d.mo7946xf939df19().m8155x27702c4(indexOf);
        }
        j();
        h();
        i();
        if (!z17 || (a2Var = this.f271321h) == null) {
            return;
        }
        a2Var.M3(1, str);
    }

    /* renamed from: getInputText */
    public android.widget.EditText m75362x652b8d61() {
        return this.f271330t;
    }

    /* renamed from: getSearchContent */
    public java.lang.String m75363x448ef5fb() {
        return m75362x652b8d61() != null ? m75362x652b8d61().getText().toString() : "";
    }

    /* renamed from: getSearchIcon */
    public android.view.View m75364xc3e2ba37() {
        return this.f271333w;
    }

    public final void h() {
        int e17 = com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561391h7);
        if (this.f271317d.mo7946xf939df19().mo1894x7e414b06() > 1) {
            e17 = com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) + this.f271328r;
        }
        if (m75362x652b8d61() == null || m75362x652b8d61().getLayoutParams().height == e17) {
            return;
        }
        m75362x652b8d61().getLayoutParams().height = e17;
        m75362x652b8d61().setHeight(e17);
        m75362x652b8d61().invalidate();
        android.widget.LinearLayout linearLayout = this.f271331u;
        if (linearLayout != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams layoutParams = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) linearLayout.getLayoutParams();
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).height = e17;
            this.f271331u.setLayoutParams(layoutParams);
            this.f271331u.invalidate();
        }
    }

    public final void i() {
        boolean booleanValue = this.f271325o.booleanValue();
        java.util.ArrayList arrayList = this.f271318e;
        this.f271327q = booleanValue ? arrayList.size() : arrayList.size() + 1;
        int size = arrayList.size();
        int i17 = this.f271328r;
        int B = size == 0 ? i65.a.B(getContext()) - (i17 * 2) : java.lang.Math.max(i17 * 2, this.f271317d.getWidth() - (this.f271327q * i17));
        if (m75362x652b8d61() == null || m75362x652b8d61().getLayoutParams().width == B) {
            return;
        }
        m75362x652b8d61().getLayoutParams().width = B;
        m75362x652b8d61().setWidth(B);
        m75362x652b8d61().invalidate();
    }

    public final void j() {
        if (m75364xc3e2ba37() != null) {
            android.view.View m75364xc3e2ba37 = m75364xc3e2ba37();
            int i17 = this.f271317d.mo7946xf939df19().mo1894x7e414b06() <= 1 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m75364xc3e2ba37, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "updateSearchIconVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m75364xc3e2ba37.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m75364xc3e2ba37, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "updateSearchIconVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* renamed from: setDefaultHint */
    public void m75365x562adaa6(java.lang.String str) {
        this.f271332v = str;
    }

    /* renamed from: setForBidDelContactList */
    public void m75366x5028ebe9(java.util.ArrayList<java.lang.String> arrayList) {
        this.f271326p = arrayList;
    }

    /* renamed from: setOnContactDeselectListener */
    public void m75367x3935f5b0(com.p314xaae8f345.mm.p2470x93e71c27.ui.a2 a2Var) {
        this.f271321h = a2Var;
    }

    /* renamed from: setOnSearchTextChangeListener */
    public void m75368x62bf99da(com.p314xaae8f345.mm.p2470x93e71c27.ui.b2 b2Var) {
        this.f271322i = b2Var;
    }

    /* renamed from: setOnSearchTextFouceChangeListener */
    public void m75369x50775ebc(com.p314xaae8f345.mm.p2470x93e71c27.ui.c2 c2Var) {
        this.f271323m = c2Var;
    }
}

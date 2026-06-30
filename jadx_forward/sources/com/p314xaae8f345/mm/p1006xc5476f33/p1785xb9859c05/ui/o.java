package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.n f224482a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f224483b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.EditText f224484c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f224485d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f224486e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f224487f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f224488g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f224489h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f224490i;

    /* renamed from: j, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.c5 f224491j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f224492k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f224493l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f224495n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f224496o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f224497p;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f224503v;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f224494m = "";

    /* renamed from: q, reason: collision with root package name */
    public long f224498q = 0;

    /* renamed from: r, reason: collision with root package name */
    public boolean f224499r = false;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f224500s = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.e(this);

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f224501t = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("IPCallDialQueryPhoneNumber");

    /* renamed from: u, reason: collision with root package name */
    public boolean f224502u = false;

    public o(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.widget.EditText editText, android.widget.TextView textView, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ViewOnClickListenerC16124xc5ddcee3 viewOnClickListenerC16124xc5ddcee3, android.widget.ImageButton imageButton, android.widget.TextView textView2, android.view.View view2, android.widget.TextView textView3, android.widget.TextView textView4) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.f(this);
        this.f224503v = "";
        this.f224490i = abstractActivityC21394xb3d2c0cf;
        this.f224484c = editText;
        this.f224483b = textView;
        this.f224485d = view;
        this.f224486e = textView2;
        this.f224487f = view2;
        this.f224488g = textView3;
        this.f224489h = textView4;
        this.f224491j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.c5();
        this.f224493l = t83.f.f();
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryName", "");
        this.f224492k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string) ? t83.c.f(t83.c.h()) : string;
        textView.addTextChangedListener(fVar);
        textView.setText("+" + this.f224493l);
        viewOnClickListenerC16124xc5ddcee3.m65171xb1e1a3f8(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.g(this));
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.h(this));
        view.setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.i(this));
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.j(this));
        imageButton.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.k(this));
        editText.setHorizontallyScrolling(true);
        editText.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l(this));
        editText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.m(this));
        if (fp.h.c(16)) {
            textView.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            editText.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
            textView2.setTypeface(android.graphics.Typeface.create("sans-serif-light", 0));
        }
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.String f17 = this.f224491j.f(str, t83.f.i(str2));
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17) ? str2 : f17;
    }

    public void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f224501t;
        java.lang.Runnable runnable = this.f224500s;
        n3Var.mo50300x3fa464aa(runnable);
        n3Var.mo50297x7c4d7ca2(runnable, 500L);
    }

    public void c(java.lang.String str) {
        this.f224493l = str;
        android.widget.TextView textView = this.f224483b;
        if (textView != null) {
            textView.setText("+" + str);
        }
    }

    public void d(java.util.LinkedList linkedList) {
        boolean z17;
        java.util.LinkedList linkedList2;
        this.f224497p = linkedList;
        java.lang.String replace = this.f224483b.getText().toString().replace("+", "");
        if (t83.c.l(replace) && (linkedList2 = this.f224497p) != null && linkedList2.size() > 0) {
            java.lang.String g17 = t83.c.g(replace);
            java.util.Iterator it = this.f224497p.iterator();
            while (it.hasNext()) {
                r45.o57 o57Var = (r45.o57) it.next();
                if (o57Var != null && o57Var.f463500e.equals(g17)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        android.widget.TextView textView = this.f224489h;
        if (z17) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public void e(java.lang.String str, int i17) {
        android.widget.EditText editText = this.f224484c;
        editText.setText(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (i17 == -1) {
                editText.setSelection(editText.getText().length());
            } else if (this.f224502u) {
                if (i17 <= 0 || i17 > editText.getText().length()) {
                    editText.setSelection(editText.getText().length());
                } else {
                    editText.setSelection(i17);
                }
            }
        }
        this.f224494m = str;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f201232a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f201233b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f201234c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f201235d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f201236e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f201237f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f201238g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f201239h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f201240i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.LinearLayout f201241j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.CheckBox f201242k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f201243l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f201244m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f201245n;

    /* renamed from: o, reason: collision with root package name */
    public yf2.h0 f201246o;

    public s2(android.content.Context context, yz5.a onConfirm, yz5.a aVar, yz5.a aVar2, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onConfirm, "onConfirm");
        this.f201232a = context;
        this.f201233b = onConfirm;
        this.f201234c = aVar;
        this.f201235d = aVar2;
        this.f201236e = z17;
        this.f201237f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.m2(this));
    }

    public final void a(yf2.h0 h0Var) {
        android.widget.TextView textView = this.f201239h;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("licenseText");
            throw null;
        }
        textView.setText(h0Var.f543238a);
        android.widget.TextView textView2 = this.f201240i;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("licenseContentText");
            throw null;
        }
        textView2.setText(h0Var.f543239b);
        android.widget.TextView textView3 = this.f201243l;
        if (textView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxText");
            throw null;
        }
        textView3.setText(h0Var.f543240c);
        android.widget.TextView textView4 = this.f201243l;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxText");
            throw null;
        }
        textView4.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        android.widget.TextView textView5 = this.f201243l;
        if (textView5 != null) {
            textView5.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k2(this, h0Var));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkboxText");
            throw null;
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 b() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3) ((jz5.n) this.f201237f).mo141623x754a37bb();
    }

    public final void c() {
        android.widget.TextView textView = this.f201244m;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
            throw null;
        }
        android.widget.CheckBox checkBox = this.f201242k;
        if (checkBox == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("checkBox");
            throw null;
        }
        textView.setEnabled(checkBox.isChecked());
        android.widget.TextView textView2 = this.f201244m;
        if (textView2 != null) {
            textView2.invalidate();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
            throw null;
        }
    }
}

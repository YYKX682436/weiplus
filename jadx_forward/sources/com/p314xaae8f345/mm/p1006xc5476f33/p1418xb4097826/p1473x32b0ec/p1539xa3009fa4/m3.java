package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public abstract class m3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f198773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f198774e;

    /* renamed from: f, reason: collision with root package name */
    public int f198775f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f198776g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f198777h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f198778i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f198779m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f198780n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f198781o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198773d = "";
        this.f198774e = "";
        this.f198776g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e3(this, activity));
        this.f198777h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d3(this));
        this.f198780n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l3(this, activity));
        this.f198781o = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c3(this, activity));
    }

    public abstract java.lang.Object T6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public abstract java.lang.Object U6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public final void V6(java.lang.String errorWording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorWording, "errorWording");
        jz5.g gVar = this.f198776g;
        java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((android.widget.TextView) mo141623x754a37bb).setText(errorWording);
        java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat((android.widget.TextView) mo141623x754a37bb2, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        java.lang.Object mo141623x754a37bb3 = ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb3, "getValue(...)");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((android.widget.TextView) mo141623x754a37bb3, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setStartDelay(3000L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void W6() {
        boolean z17 = false;
        if (this.f198773d.length() == 11) {
            if (this.f198774e.length() > 0) {
                z17 = true;
            }
        }
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f198781o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb;
        textView.setEnabled(z17);
        textView.setTextColor(m158354x19263085().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.abs : com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(m158354x19263085().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m : com.p314xaae8f345.mm.R.C30859x5a72f63.abt));
        gradientDrawable.setCornerRadius(pm0.v.S(8));
        textView.setBackground(gradientDrawable);
    }

    public final void X6() {
        boolean z17 = this.f198773d.length() == 11 && this.f198775f == 0;
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f198780n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) mo141623x754a37bb;
        textView.setText(this.f198775f == 0 ? m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.otg) : m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oth, java.lang.Integer.valueOf(this.f198775f)));
        textView.setEnabled(z17);
        textView.setTextColor(m158354x19263085().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.abw : com.p314xaae8f345.mm.R.C30859x5a72f63.f560053a84));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(m158354x19263085().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abt));
        gradientDrawable.setCornerRadius(pm0.v.S(6));
        textView.setBackground(gradientDrawable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570491eb3;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            abstractActivityC21394xb3d2c0cf.mo56583xbf7c1df6((java.lang.CharSequence) "");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = m158354x192630852 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630852 : null;
        if (abstractActivityC21394xb3d2c0cf2 != null) {
            abstractActivityC21394xb3d2c0cf2.m78561xe5bc8f21(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630853 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf3 = m158354x192630853 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630853 : null;
        if (abstractActivityC21394xb3d2c0cf3 != null) {
            abstractActivityC21394xb3d2c0cf3.mo64405x4dab7448(m158354x19263085().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630854 = m158354x19263085();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf4 = m158354x192630854 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x192630854 : null;
        if (abstractActivityC21394xb3d2c0cf4 != null) {
            abstractActivityC21394xb3d2c0cf4.mo78530x8b45058f();
        }
        android.view.View findViewById = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.ku_);
        android.widget.EditText editText = (android.widget.EditText) findViewById;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(editText);
        editText.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g3(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "also(...)");
        this.f198778i = (android.widget.EditText) findViewById;
        android.view.View findViewById2 = m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.v6x);
        android.widget.EditText editText2 = (android.widget.EditText) findViewById2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(editText2);
        editText2.addTextChangedListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.h3(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "also(...)");
        this.f198779m = (android.widget.EditText) findViewById2;
        m80380x71e92c1d().findViewById(com.p314xaae8f345.mm.R.id.cg7).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.f3(this));
        X6();
        W6();
    }
}

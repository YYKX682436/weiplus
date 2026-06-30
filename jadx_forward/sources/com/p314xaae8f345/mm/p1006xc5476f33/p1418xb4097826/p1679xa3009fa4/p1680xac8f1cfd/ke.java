package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ke implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe f216492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f216493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f216494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f216495g;

    public ke(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe oeVar, android.widget.TextView textView, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        this.f216492d = oeVar;
        this.f216493e = textView;
        this.f216494f = h0Var;
        this.f216495g = str;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        r45.u25 u25Var = (r45.u25) obj;
        java.lang.String str2 = this.f216495g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oe oeVar = this.f216492d;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f216494f;
        if (u25Var != null) {
            oeVar.f217003o = u25Var;
            if (!android.text.TextUtils.isEmpty(u25Var.m75945x2fec8307(0))) {
                r45.u25 u25Var2 = oeVar.f217003o;
                if (u25Var2 == null || (str = u25Var2.m75945x2fec8307(0)) == null) {
                    str = "";
                }
            } else if (android.text.TextUtils.isEmpty(u25Var.m75945x2fec8307(1)) || android.text.TextUtils.isEmpty(u25Var.m75945x2fec8307(2))) {
                str = str2;
            } else {
                str = u25Var.m75945x2fec8307(1) + " - " + u25Var.m75945x2fec8307(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            }
            h0Var.f391656d = str;
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            h0Var.f391656d = str2;
        }
        float dimension = oeVar.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz);
        android.widget.TextView textView = this.f216493e;
        textView.setTextSize(0, dimension);
        textView.setText((java.lang.CharSequence) h0Var.f391656d);
        textView.requestLayout();
    }
}

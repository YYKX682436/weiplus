package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u2 f268415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u2 u2Var) {
        super(1);
        this.f268415d = u2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.a_f);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.a9v);
        android.widget.ImageView imageView = (android.widget.ImageView) it.findViewById(com.p314xaae8f345.mm.R.id.a_i);
        java.lang.String text = textView.getVisibility() == 0 ? textView.getText() : "";
        java.lang.String text2 = textView2.getVisibility() == 0 ? textView2.getText() : "";
        java.lang.String string = imageView.getVisibility() == 0 ? this.f268415d.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.igy) : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return ((java.lang.Object) text) + (char) 65292 + ((java.lang.Object) text2) + (char) 65292 + string;
    }
}

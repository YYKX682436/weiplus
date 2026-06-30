package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes5.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f273269a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273270b;

    /* renamed from: c, reason: collision with root package name */
    public final int f273271c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f273272d;

    public j7(android.content.Context context, oa.i tab, int i17, int i18, java.lang.String titleName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleName, "titleName");
        this.f273269a = tab;
        this.f273270b = i17;
        this.f273271c = i18;
        tab.f425311a = this;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aq9, (android.view.ViewGroup) null);
        tab.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.nuw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f273272d = textView;
        textView.setText(titleName);
        inflate.setContentDescription(titleName);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
    }

    public final void a(boolean z17) {
        int i17 = z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832 : com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833;
        android.widget.TextView textView = this.f273272d;
        textView.setTextColor(i65.a.d(textView.getContext(), i17));
    }

    /* renamed from: toString */
    public java.lang.String m75857x9616526c() {
        return "TabItem(tabType=" + this.f273271c + ", tabIndex=" + this.f273270b + ')';
    }
}

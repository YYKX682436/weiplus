package dn2;

/* loaded from: classes.dex */
public final class w implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f323522a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f323523b;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.b1u);
    }

    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveMsg, "liveMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.f566107er2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f323522a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b1u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f323523b = (android.widget.TextView) findViewById2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("show MMFinder_LiveAppMsg_Type_ReserveOrDownloadGame ");
        java.lang.Object D = liveMsg.D();
        if (D == null) {
            D = "";
        }
        sb6.append(pm0.b0.g(D));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveGameReserveOrDownloadBulletItem", sb6.toString());
        java.lang.Object D2 = liveMsg.D();
        r45.yj1 yj1Var = D2 instanceof r45.yj1 ? (r45.yj1) D2 : null;
        if (yj1Var != null) {
            android.widget.TextView textView = this.f323523b;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
                throw null;
            }
            textView.setText(yj1Var.m75945x2fec8307(0) + yj1Var.m75945x2fec8307(1));
        }
        android.widget.TextView textView2 = this.f323523b;
        if (textView2 != null) {
            textView2.setTextColor(rootView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            return rootView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bulletContentTv");
        throw null;
    }

    @Override // dn2.e
    /* renamed from: getLayoutId */
    public int mo125815x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dqx;
    }
}

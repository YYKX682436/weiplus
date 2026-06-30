package rv3;

/* loaded from: classes5.dex */
public final class t extends rv3.s {

    /* renamed from: o, reason: collision with root package name */
    public final yz5.a f481947o;

    /* renamed from: p, reason: collision with root package name */
    public final int f481948p;

    public t(yz5.p pVar, yz5.a aVar) {
        super(pVar);
        this.f481947o = aVar;
        this.f481948p = i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.ace);
    }

    @Override // rv3.e
    public void p(android.widget.TextView textView, java.util.ArrayList singers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singers, "singers");
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(singers, ",");
        yz5.a aVar = this.f481947o;
        java.lang.String str = aVar != null ? (java.lang.String) aVar.mo152xb9724478() : null;
        wu3.w1 w1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d.f237589o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        textView.setText(w1Var.a(c17, str, this.f481948p));
    }

    @Override // rv3.e
    public void u(android.widget.TextView textView, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        if (str == null) {
            str = "";
        }
        yz5.a aVar = this.f481947o;
        textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17048x9295f61d.f237589o.a(str, aVar != null ? (java.lang.String) aVar.mo152xb9724478() : null, this.f481948p));
    }
}

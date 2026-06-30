package ju1;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ju1.o f383307d = new ju1.o();

    public o() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bvx);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bvr);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.bvv);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(textView.getText());
        sb6.append(textView2.getText());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4848xc6d43eff.m42328x90544e91(viewGroup, new ju1.n(sb6));
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}

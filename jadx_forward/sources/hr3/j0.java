package hr3;

/* loaded from: classes.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hr3.j0 f365198d = new hr3.j0();

    public j0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.dyw);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) it.findViewById(com.p314xaae8f345.mm.R.id.dyv);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        fq1.e eVar = fq1.e.f347040a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22624x85d69039);
        sb6.append(c22624x85d69039.getVisibility() == 0 ? c22624x85d69039.a().toString() : "");
        sb6.append(", ");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        sb6.append(eVar.f(textView));
        return sb6.toString();
    }
}

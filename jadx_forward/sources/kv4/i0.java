package kv4;

/* loaded from: classes5.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.l0 f394236d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(kv4.l0 l0Var) {
        super(3);
        this.f394236d = l0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        jz5.f0 f0Var;
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.TextView view = (android.widget.TextView) obj2;
        android.view.View header = (android.view.View) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        mv4.j jVar = (mv4.j) kz5.n0.a0(this.f394236d.f394244b, intValue);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (jVar != null) {
            view.setText(((rv4.c0) jVar).f481982c);
            header.setOnClickListener(new kv4.h0(jVar));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            view.setText("");
            view.setOnClickListener(null);
        }
        return f0Var2;
    }
}

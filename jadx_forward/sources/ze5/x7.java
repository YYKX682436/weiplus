package ze5;

/* loaded from: classes5.dex */
public final class x7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final ze5.x7 f553831d = new ze5.x7();

    public x7() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.LinearLayout viewArea = (android.widget.LinearLayout) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((yb5.d) obj, "<anonymous parameter 0>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewArea, "viewArea");
        android.content.Context context = viewArea.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        af5.d1 d1Var = new af5.d1(context);
        d1Var.setPadding(i65.a.b(viewArea.getContext(), 8), i65.a.b(viewArea.getContext(), 16), i65.a.b(viewArea.getContext(), 6), i65.a.b(viewArea.getContext(), 8));
        return d1Var;
    }
}

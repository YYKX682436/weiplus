package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes7.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e1 f92084d = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e1();

    public e1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.Choreographer choreographer;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            choreographer = android.view.Choreographer.getInstance();
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            choreographer = (android.view.Choreographer) p3325xe03a0797.p3326xc267989b.l.e(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.d1(null));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        android.os.Handler a17 = j3.k.a(android.os.Looper.getMainLooper());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "createAsync(Looper.getMainLooper())");
        p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1 i1Var = new p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.i1(choreographer, a17, null);
        return i1Var.mo7096x348d9a(i1Var.f92131q);
    }
}

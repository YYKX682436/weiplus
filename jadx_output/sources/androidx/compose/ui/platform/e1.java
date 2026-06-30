package androidx.compose.ui.platform;

/* loaded from: classes7.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final androidx.compose.ui.platform.e1 f10551d = new androidx.compose.ui.platform.e1();

    public e1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.Choreographer choreographer;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            choreographer = android.view.Choreographer.getInstance();
        } else {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            choreographer = (android.view.Choreographer) kotlinx.coroutines.l.e(kotlinx.coroutines.internal.b0.f310484a, new androidx.compose.ui.platform.d1(null));
        }
        kotlin.jvm.internal.o.f(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
        android.os.Handler a17 = j3.k.a(android.os.Looper.getMainLooper());
        kotlin.jvm.internal.o.f(a17, "createAsync(Looper.getMainLooper())");
        androidx.compose.ui.platform.i1 i1Var = new androidx.compose.ui.platform.i1(choreographer, a17, null);
        return i1Var.plus(i1Var.f10598q);
    }
}

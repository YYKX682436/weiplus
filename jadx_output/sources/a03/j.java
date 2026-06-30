package a03;

/* loaded from: classes11.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a03.j f439d = new a03.j();

    public j() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pi0.k0 a17;
        java.util.Iterator it = ((java.util.HashSet) a03.l.f440a).iterator();
        while (it.hasNext()) {
            com.tencent.mm.flutter.ui.FlutterViewEngine flutterViewEngine = ((bj0.g) ((pi0.l0) it.next())).f21108a;
            io.flutter.Log.i(flutterViewEngine.C, "onExitBackground " + flutterViewEngine.f68139q);
            if (flutterViewEngine.f68139q && (a17 = pi0.k0.f354629c.a(flutterViewEngine.f68131f)) != null) {
                a17.a("HybridNavPageState.EnterForeground");
            }
        }
        return jz5.f0.f302826a;
    }
}

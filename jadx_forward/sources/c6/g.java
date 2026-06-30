package c6;

/* loaded from: classes14.dex */
public final class g extends p012xc85e97e9.p093xedfae76a.o {

    /* renamed from: b, reason: collision with root package name */
    public static final c6.g f120333b = new c6.g();

    /* renamed from: c, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.y f120334c = new c6.C1387x2f5e1a();

    @Override // p012xc85e97e9.p093xedfae76a.o
    public void a(p012xc85e97e9.p093xedfae76a.x observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        if (!(observer instanceof p012xc85e97e9.p093xedfae76a.f)) {
            throw new java.lang.IllegalArgumentException((observer + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        p012xc85e97e9.p093xedfae76a.f fVar = (p012xc85e97e9.p093xedfae76a.f) observer;
        p012xc85e97e9.p093xedfae76a.y yVar = f120334c;
        fVar.mo7794x3e5a77bb(yVar);
        fVar.mo7797xb05099c3(yVar);
        fVar.mo7055x57429eec(yVar);
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public p012xc85e97e9.p093xedfae76a.n b() {
        return p012xc85e97e9.p093xedfae76a.n.RESUMED;
    }

    @Override // p012xc85e97e9.p093xedfae76a.o
    public void c(p012xc85e97e9.p093xedfae76a.x observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
    }

    /* renamed from: toString */
    public java.lang.String m14206x9616526c() {
        return "coil.request.GlobalLifecycle";
    }
}

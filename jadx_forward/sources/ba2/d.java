package ba2;

/* loaded from: classes2.dex */
public final class d implements ir2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f100227d;

    /* renamed from: e, reason: collision with root package name */
    public final ey2.p2 f100228e;

    public d(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f100227d = key;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.p2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f100228e = (ey2.p2) a17;
    }

    @Override // ir2.a0
    public java.lang.Object d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ba2.c(this.f100228e.N6(this.f100227d, false).f338971b);
    }
}

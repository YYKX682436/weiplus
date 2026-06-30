package m55;

/* loaded from: classes10.dex */
public abstract class b implements m55.c {

    /* renamed from: a, reason: collision with root package name */
    public m55.c f405857a;

    public void a() {
        m55.c cVar;
        if (b() || (cVar = this.f405857a) == null) {
            return;
        }
        ((m55.b) cVar).a();
    }

    public boolean b() {
        return false;
    }

    public java.lang.Object c(og3.d dVar, og3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.q1.f392103c, new m55.a(this, dVar, eVar, null), interfaceC29045xdcb5ca57);
    }

    public abstract java.lang.Object d(og3.d dVar, og3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public m55.c e(m55.c chain) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chain, "chain");
        m55.c cVar = this.f405857a;
        if (cVar == null) {
            this.f405857a = chain;
            return this;
        }
        if (cVar != null) {
            ((m55.b) cVar).e(chain);
        }
        return this;
    }
}

package qz5;

/* loaded from: classes14.dex */
public abstract class d extends qz5.a {

    /* renamed from: _context */
    private final oz5.l f76488xc546dc70;

    /* renamed from: intercepted */
    private transient p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> f76489x716f04e1;

    public d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, oz5.l lVar) {
        super(interfaceC29045xdcb5ca57);
        this.f76488xc546dc70 = lVar;
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        oz5.l lVar = this.f76488xc546dc70;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar);
        return lVar;
    }

    /* renamed from: intercepted */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> m161166x716f04e1() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> interfaceC29045xdcb5ca57 = this.f76489x716f04e1;
        if (interfaceC29045xdcb5ca57 == null) {
            oz5.l mo48699x76847179 = mo48699x76847179();
            int i17 = oz5.f.Y0;
            oz5.f fVar = (oz5.f) mo48699x76847179.get(oz5.e.f431860d);
            interfaceC29045xdcb5ca57 = fVar != null ? new p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390((p3325xe03a0797.p3326xc267989b.p0) fVar, this) : this;
            this.f76489x716f04e1 = interfaceC29045xdcb5ca57;
        }
        return interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: releaseIntercepted */
    public void mo161162x90ea0a5a() {
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57<java.lang.Object> interfaceC29045xdcb5ca57 = this.f76489x716f04e1;
        if (interfaceC29045xdcb5ca57 != null && interfaceC29045xdcb5ca57 != this) {
            oz5.l mo48699x76847179 = mo48699x76847179();
            int i17 = oz5.f.Y0;
            oz5.i iVar = mo48699x76847179.get(oz5.e.f431860d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
            ((p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.C29049xd7b07390) interfaceC29045xdcb5ca57).m144033x41012807();
        }
        this.f76489x716f04e1 = qz5.c.f449471d;
    }

    public d(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this(interfaceC29045xdcb5ca57, interfaceC29045xdcb5ca57 != null ? interfaceC29045xdcb5ca57.mo48699x76847179() : null);
    }
}

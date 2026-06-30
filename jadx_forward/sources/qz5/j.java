package qz5;

/* loaded from: classes14.dex */
public abstract class j extends qz5.a {
    public j(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(interfaceC29045xdcb5ca57);
        if (interfaceC29045xdcb5ca57 != null) {
            if (!(interfaceC29045xdcb5ca57.mo48699x76847179() == oz5.m.f431862d)) {
                throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57
    /* renamed from: getContext */
    public oz5.l mo48699x76847179() {
        return oz5.m.f431862d;
    }
}

package bz2;

/* loaded from: classes2.dex */
public abstract class c extends com.p314xaae8f345.mm.p944x882e457a.i implements ay1.m {

    /* renamed from: m, reason: collision with root package name */
    public im5.b f118299m;

    public c(im5.b bVar) {
        this.f118299m = bVar;
    }

    @Override // ay1.m
    public java.lang.Object a(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        oz5.n nVar = new oz5.n(pz5.f.b(interfaceC29045xdcb5ca57));
        pq5.g l17 = l();
        im5.b bVar = this.f118299m;
        if (bVar != null) {
            l17.f(bVar);
        }
        this.f118299m = null;
        l17.K(new bz2.b(nVar));
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    @Override // ay1.m
    public void b() {
        j();
        this.f118299m = null;
    }

    @Override // ay1.m
    public void c(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f value = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
    }
}

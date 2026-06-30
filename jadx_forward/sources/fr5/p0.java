package fr5;

/* loaded from: classes15.dex */
public final class p0 implements hr5.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f347540a;

    /* renamed from: b, reason: collision with root package name */
    public fr5.j f347541b;

    /* renamed from: c, reason: collision with root package name */
    public fr5.h f347542c;

    public p0(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f347540a = view;
    }

    public java.lang.Object a(gr5.d dVar, yz5.l lVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        er5.d dVar2 = dVar instanceof er5.d ? (er5.d) dVar : null;
        if (dVar2 == null) {
            dVar2 = er5.d.f337766c;
        }
        fr5.j jVar = new fr5.j(this.f347540a, 0.0f, 1.0f, dVar2.f337768a, dVar2.f337769b, lVar, new fr5.l0(rVar));
        this.f347541b = jVar;
        if (!jVar.f347509j) {
            jVar.f347509j = true;
            long j17 = 0;
            jVar.f347508i = java.lang.System.currentTimeMillis() + j17;
            jVar.f347500a.postDelayed(jVar.f347507h, j17);
        }
        rVar.m(new fr5.k0(jVar));
        java.lang.Object j18 = rVar.j();
        return j18 == pz5.a.f440719d ? j18 : jz5.f0.f384359a;
    }

    public java.lang.Object b(long j17, zq5.n nVar, long j18, java.util.Map map, yz5.l lVar, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        fr5.h hVar = new fr5.h(this.f347540a, zq5.d.a(a06.d.b(zq5.l.b(j17)), a06.d.b(zq5.l.c(j17))), nVar != null ? zq5.o.d(nVar) : null, zq5.d.a(a06.d.b(zq5.l.b(j18)), a06.d.b(zq5.l.c(j18))), new fr5.n0(lVar), new fr5.o0(rVar), null);
        this.f347542c = hVar;
        if (!hVar.f347491i) {
            hVar.f347491i = true;
            android.widget.OverScroller overScroller = hVar.f347489g;
            long j19 = hVar.f347484b;
            int i17 = (int) (j19 >> 32);
            int a17 = zq5.c.a(j19);
            long j27 = hVar.f347486d;
            int i18 = (int) (j27 >> 32);
            int a18 = zq5.c.a(j27);
            zq5.e eVar = hVar.f347485c;
            overScroller.fling(i17, a17, i18, a18, eVar != null ? eVar.f556594a : 0, eVar != null ? eVar.f556596c : 0, eVar != null ? eVar.f556595b : 0, eVar != null ? eVar.f556597d : 0, 0, 0);
            hVar.f347483a.postOnAnimation(hVar.f347490h);
        }
        rVar.m(new fr5.m0(hVar));
        java.lang.Object j28 = rVar.j();
        return j28 == pz5.a.f440719d ? j28 : jz5.f0.f384359a;
    }
}

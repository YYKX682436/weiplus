package u5;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f506245d;

    /* renamed from: e, reason: collision with root package name */
    public int f506246e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u5.s f506247f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u5.f f506248g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(u5.s sVar, u5.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f506247f = sVar;
        this.f506248g = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new u5.l(this.f506247f, this.f506248g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((u5.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        u5.s sVar;
        java.lang.Object hVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f506246e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            u5.s sVar2 = this.f506247f;
            r5.j jVar = (r5.j) ((n0.q4) sVar2.f506270w).mo128745x754a37bb();
            u5.f fVar = this.f506248g;
            c6.j jVar2 = fVar.f506237b;
            android.content.Context context = jVar2.f120362a;
            jVar2.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            c6.h hVar2 = new c6.h(jVar2, context);
            hVar2.f120339d = new u5.r(sVar2);
            hVar2.H = null;
            hVar2.I = null;
            hVar2.f120335J = null;
            c6.d dVar = jVar2.G;
            if (dVar.f120319b == null) {
                long j17 = d1.k.f307175c;
                long j18 = fVar.f506238c;
                if (j18 != j17) {
                    hVar2.f120350o = new d6.e(new p135x2eae8f.p138x35e001.C1420x6f1c9387(a06.d.b(d1.k.d(j18)), a06.d.b(d1.k.b(j18))));
                    hVar2.H = null;
                    hVar2.I = null;
                    hVar2.f120335J = null;
                } else {
                    hVar2.f120350o = new d6.e(p135x2eae8f.p138x35e001.C1419x8939e192.f125444d);
                    hVar2.H = null;
                    hVar2.I = null;
                    hVar2.f120335J = null;
                }
            }
            if (dVar.f120320c == null) {
                hVar2.f120351p = d6.g.FILL;
            }
            if (dVar.f120323f != d6.d.EXACT) {
                hVar2.f120354s = d6.d.INEXACT;
            }
            c6.j a17 = hVar2.a();
            this.f506245d = sVar2;
            this.f506246e = 1;
            r5.p pVar = (r5.p) jVar;
            pVar.getClass();
            e6.b bVar = a17.f120364c;
            if (bVar instanceof e6.c) {
                a6.c0 b17 = h6.d.b(((p135x2eae8f.p139xcb7e7191.C1422x9d6d031) ((e6.c) bVar)).f125447d);
                oz5.i iVar = mo48699x76847179().get(p3325xe03a0797.p3326xc267989b.q2.f392104d);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar);
                b17.a((p3325xe03a0797.p3326xc267989b.r2) iVar);
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, new r5.l(pVar, a17, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            sVar = sVar2;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = (u5.s) this.f506245d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        c6.l lVar = (c6.l) obj;
        if (lVar instanceof c6.q) {
            c6.q qVar = (c6.q) lVar;
            hVar = new u5.j(u5.x.b(qVar.f120396a), qVar);
        } else {
            if (!(lVar instanceof c6.f)) {
                throw new jz5.j();
            }
            android.graphics.drawable.Drawable a18 = lVar.a();
            hVar = new u5.h(a18 != null ? u5.x.b(a18) : null, (c6.f) lVar);
        }
        ((n0.q4) sVar.f506268u).mo148714x53d8522f(hVar);
        return jz5.f0.f384359a;
    }
}

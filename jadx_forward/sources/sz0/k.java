package sz0;

/* loaded from: classes14.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f495459d;

    /* renamed from: e, reason: collision with root package name */
    public int f495460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vo0.b f495461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sz0.l f495462g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vo0.b bVar, sz0.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495461f = bVar;
        this.f495462g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sz0.k(this.f495461f, this.f495462g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sz0.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f495460e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vo0.b bVar = this.f495461f;
            this.f495459d = bVar;
            this.f495460e = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            sz0.j jVar = new sz0.j(nVar);
            wo0.c cVar = (wo0.c) bVar;
            cVar.getClass();
            cVar.f529406d = jVar;
            bVar.a();
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (bitmap != null) {
            h1.a aVar2 = new h1.a(e1.e.b(bitmap), 0L, 0L, 6, null);
            sz0.l lVar = this.f495462g;
            ((n0.q4) lVar.f495464m).mo148714x53d8522f(aVar2);
            ((n0.q4) lVar.f495465n).mo148714x53d8522f(java.lang.Boolean.TRUE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageLoaderPainter", "get img from network " + lVar.f495463i);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageLoaderPainter", "get from network error");
        }
        return f0Var2;
    }
}

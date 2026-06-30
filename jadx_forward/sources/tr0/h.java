package tr0;

/* loaded from: classes14.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f502837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f502838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tr0.t f502839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo.d1 f502840g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(byte[] bArr, tr0.t tVar, wo.d1 d1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502838e = bArr;
        this.f502839f = tVar;
        this.f502840g = d1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tr0.h(this.f502838e, this.f502839f, this.f502840g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tr0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f502837d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        byte[] data = this.f502838e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (data != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "$data");
                if (!(data.length == 0)) {
                    nr0.x xVar = this.f502839f.f492967h;
                    if (xVar != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(data, "$data");
                        this.f502837d = 1;
                        oz5.n nVar = new oz5.n(pz5.f.b(this));
                        or0.c.f428962a.b();
                        xVar.l(new nr0.g(xVar, data, nVar, null));
                        java.lang.Object a17 = nVar.a();
                        if (a17 != aVar) {
                            a17 = f0Var;
                        }
                        if (a17 == aVar) {
                            return aVar;
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Camera.Camera1Impl", "onPreviewFrame, frame data is null!!");
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f502840g.a(data);
        return f0Var;
    }
}

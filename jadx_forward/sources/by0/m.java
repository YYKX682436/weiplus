package by0;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f117872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ by0.n f117873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f117874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117875g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(by0.n nVar, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f117873e = nVar;
        this.f117874f = c4128x879fba0a;
        this.f117875g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new by0.m(this.f117873e, this.f117874f, this.f117875g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((by0.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f117872d;
        by0.n nVar = this.f117873e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            by0.k kVar = nVar.f117876a;
            this.f117872d = 1;
            gx0.bf bfVar = (gx0.bf) kVar;
            bfVar.getClass();
            obj = p3325xe03a0797.p3326xc267989b.l.g(bfVar.f357786t, new gx0.we(bfVar, this.f117874f, null), this);
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
        if (bitmap == null) {
            return null;
        }
        float min = java.lang.Math.min(640.0f / bitmap.getWidth(), 640.0f / bitmap.getHeight());
        android.graphics.Bitmap F0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(bitmap, min, min, true);
        by0.j jVar = new by0.j();
        jVar.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(F0);
        java.lang.String c17 = jVar.c(F0);
        jVar.a();
        nVar.f117877b.put(this.f117875g, new zu0.l(((gx0.bf) nVar.f117876a).i7(), F0, c17));
        return jz5.f0.f384359a;
    }
}

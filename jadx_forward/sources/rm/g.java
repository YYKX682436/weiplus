package rm;

/* loaded from: classes8.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f478905d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f478906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g f478907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1 f478908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g gVar, com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1 v1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478907f = gVar;
        this.f478908g = v1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        rm.g gVar = new rm.g(this.f478907f, this.f478908g, interfaceC29045xdcb5ca57);
        gVar.f478906e = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rm.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.f1 b17;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f478905d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f478906e;
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.g gVar = this.f478907f;
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.v1 v1Var = this.f478908g;
            p3325xe03a0797.p3326xc267989b.f1 b18 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new rm.d(gVar, v1Var, null), 3, null);
            b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new rm.f(gVar, v1Var, null), 3, null);
            this.f478906e = b17;
            this.f478905d = 1;
            obj = ((p3325xe03a0797.p3326xc267989b.g1) b18).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f478906e;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return new jz5.l(obj2, obj);
            }
            b17 = (p3325xe03a0797.p3326xc267989b.f1) this.f478906e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f478906e = obj;
        this.f478905d = 2;
        java.lang.Object k17 = b17.k(this);
        if (k17 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = k17;
        return new jz5.l(obj2, obj);
    }
}

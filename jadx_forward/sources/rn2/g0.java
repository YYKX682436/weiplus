package rn2;

/* loaded from: classes.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f479275d;

    /* renamed from: e, reason: collision with root package name */
    public int f479276e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f479277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479278g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f479279h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v65.n f479280i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, r45.dz1 dz1Var, v65.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479278g = context;
        this.f479279h = dz1Var;
        this.f479280i = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        rn2.g0 g0Var = new rn2.g0(this.f479278g, this.f479279h, this.f479280i, interfaceC29045xdcb5ca57);
        g0Var.f479277f = obj;
        return g0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        az2.f fVar;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479276e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f479277f;
            az2.c cVar = az2.f.f97658d;
            android.content.Context context = this.f479278g;
            az2.f a17 = az2.c.a(cVar, context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), 500L, null, 8, null);
            a17.a();
            rn2.l0 l0Var = rn2.l0.f479325a;
            this.f479277f = y0Var2;
            this.f479275d = a17;
            this.f479276e = 1;
            java.lang.Object a18 = rn2.l0.a(l0Var, this.f479278g, this.f479279h, this);
            if (a18 == aVar) {
                return aVar;
            }
            fVar = a17;
            y0Var = y0Var2;
            obj = a18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            az2.f fVar2 = (az2.f) this.f479275d;
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f479277f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fVar = fVar2;
            y0Var = y0Var3;
        }
        jz5.l lVar = (jz5.l) obj;
        java.lang.String str = (java.lang.String) lVar.f384366d;
        r45.oz1 oz1Var = (r45.oz1) lVar.f384367e;
        if (oz1Var != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new rn2.f0(this.f479278g, oz1Var, str, this.f479280i, fVar, null), 2, null);
        } else {
            this.f479280i.a(new jz5.l("makeOrder fail", null));
            fVar.b();
        }
        return jz5.f0.f384359a;
    }
}

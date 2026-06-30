package ee5;

/* loaded from: classes9.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333615d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f333617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ee5.y0 f333618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.util.ArrayList arrayList, ee5.y0 y0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333617f = arrayList;
        this.f333618g = y0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.x0 x0Var = new ee5.x0(this.f333617f, this.f333618g, interfaceC29045xdcb5ca57);
        x0Var.f333616e = obj;
        return x0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ee5.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        ot0.q v17;
        zy2.i iVar;
        r45.kv2 kv2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333615d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333616e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : this.f333617f) {
                if (!p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSMultiItemFinderFeedUIC", "is no active");
                    return f0Var;
                }
                java.lang.String j17 = f9Var.j();
                if (j17 != null && (v17 = ot0.q.v(j17)) != null && (iVar = (zy2.i) v17.y(zy2.i.class)) != null && (kv2Var = iVar.f558944b) != null) {
                    r45.bu2 bu2Var = new r45.bu2();
                    bu2Var.set(0, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                    bu2Var.set(3, f9Var.Q0());
                    bu2Var.set(1, java.lang.Long.valueOf(f9Var.mo78012x3fdd41df()));
                    bu2Var.set(2, kv2Var);
                    arrayList.add(bu2Var);
                }
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            ee5.w0 w0Var = new ee5.w0(this.f333618g, arrayList, null);
            this.f333615d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, w0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}

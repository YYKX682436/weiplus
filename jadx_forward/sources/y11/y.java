package y11;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f540375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w11.r1 f540376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f540377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f540378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w11.r1 r1Var, long j17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f540376e = r1Var;
        this.f540377f = j17;
        this.f540378g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new y11.y(this.f540376e, this.f540377f, this.f540378g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((y11.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f540375d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g75.k kVar = g75.r.f350924p;
            java.util.List i18 = kz5.c0.i(y11.r.class, y11.o.class, y11.q.class, y11.k.class, y11.n.class);
            w11.r1 r1Var = this.f540376e;
            r1Var.getClass();
            g75.z zVar = new g75.z();
            zVar.l("PPCKey_Params", r1Var);
            zVar.l("PPCKey_InitCreateTime", new java.lang.Long(this.f540377f));
            this.f540375d = 1;
            obj = g75.k.b(kVar, i18, zVar, "SendMsgMgr", 0L, this, 8, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Long l17 = (java.lang.Long) ((g75.x) obj).f350938b.d("PPCKey_LocalMsgId");
        if (l17 != null) {
            this.f540378g.mo146xb9724478(new java.lang.Long(l17.longValue()));
        }
        return jz5.f0.f384359a;
    }
}

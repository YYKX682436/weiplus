package gx0;

/* loaded from: classes5.dex */
public final class ie extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f358079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 f358080f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f358081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(gx0.bf bfVar, com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358079e = bfVar;
        this.f358080f = c4167x88133861;
        this.f358081g = c4128x879fba0a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.ie(this.f358079e, this.f358080f, this.f358081g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ie) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358078d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.bf bfVar = this.f358079e;
            this.f358078d = 1;
            if (bfVar.O6(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f358079e.E = this.f358080f;
                gx0.bf bfVar2 = this.f358079e;
                gx0.fd fdVar = gx0.fd.f357964g;
                bfVar2.f357789w = fdVar;
                bfVar2.f357787u.mo7808x76db6cb1(fdVar);
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (this.f358079e.B == null) {
            p3325xe03a0797.p3326xc267989b.l.f(null, new gx0.he(this.f358079e, null), 1, null);
        } else {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4152x8b3cf7db c4152x8b3cf7db = this.f358079e.B;
            if (c4152x8b3cf7db != null) {
                c4152x8b3cf7db.m34162x41012807();
            }
        }
        gx0.bf bfVar3 = this.f358079e;
        gx0.fd fdVar2 = gx0.fd.f357963f;
        bfVar3.f357789w = fdVar2;
        bfVar3.f357787u.mo7808x76db6cb1(fdVar2);
        this.f358079e.f357790x.mo7808x76db6cb1(this.f358080f.l());
        gx0.bf bfVar4 = this.f358079e;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 c4167x88133861 = this.f358080f;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f358081g;
        this.f358078d = 2;
        bfVar4.getClass();
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.ne(c4167x88133861, c4128x879fba0a, bfVar4, null), this);
        if (g17 != aVar) {
            g17 = f0Var;
        }
        if (g17 == aVar) {
            return aVar;
        }
        this.f358079e.E = this.f358080f;
        gx0.bf bfVar22 = this.f358079e;
        gx0.fd fdVar3 = gx0.fd.f357964g;
        bfVar22.f357789w = fdVar3;
        bfVar22.f357787u.mo7808x76db6cb1(fdVar3);
        return f0Var;
    }
}

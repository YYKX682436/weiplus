package az0;

/* loaded from: classes5.dex */
public final class oc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97320d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97321e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f97322f;

    /* renamed from: g, reason: collision with root package name */
    public int f97323g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97324h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.p f97325i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97326m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97327n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(yz5.p pVar, java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97325i = pVar;
        this.f97326m = str;
        this.f97327n = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        az0.oc ocVar = new az0.oc(this.f97325i, this.f97326m, this.f97327n, interfaceC29045xdcb5ca57);
        ocVar.f97324h = obj;
        return ocVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.oc) mo148xaf65a0fc((u26.r0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        u26.r0 r0Var;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 c4067xeeae5bd2;
        long j17;
        p3325xe03a0797.p3326xc267989b.r rVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97323g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r0Var = (u26.r0) this.f97324h;
            java.lang.String str = this.f97326m;
            yz5.l lVar = this.f97327n;
            this.f97324h = r0Var;
            yz5.p pVar = this.f97325i;
            this.f97320d = pVar;
            this.f97321e = str;
            this.f97322f = lVar;
            this.f97323g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar2.k();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 c4067xeeae5bd22 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2) pVar.mo149xb9724478(new az0.lc(r0Var, str), new az0.mc(rVar2, str, currentTimeMillis));
            if ((c4067xeeae5bd22 != null ? c4067xeeae5bd22.f129637a : null) == null || !rVar2.n()) {
                c4067xeeae5bd2 = c4067xeeae5bd22;
                j17 = currentTimeMillis;
                rVar = rVar2;
            } else {
                bz0.b bVar = bz0.b.f118257a;
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b error = c4067xeeae5bd22.f129637a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(error, "error");
                c4067xeeae5bd2 = c4067xeeae5bd22;
                j17 = currentTimeMillis;
                rVar = rVar2;
                bz0.b.b(bVar, str, error, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new az0.p7(c4067xeeae5bd2.f129637a))));
            }
            rVar.m(new az0.kc(str, j17, lVar, c4067xeeae5bd2));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            r0Var = (u26.r0) this.f97324h;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        u26.q0 q0Var = (u26.q0) r0Var;
        q0Var.getClass();
        u26.x0.a(q0Var, null, 1, null);
        az0.nc ncVar = new az0.nc(this.f97326m);
        this.f97324h = null;
        this.f97320d = null;
        this.f97321e = null;
        this.f97322f = null;
        this.f97323g = 2;
        if (u26.p0.a(r0Var, ncVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}

package az0;

/* loaded from: classes5.dex */
public final class hc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97074d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f97076f;

    /* renamed from: g, reason: collision with root package name */
    public int f97077g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f97078h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97079i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97080m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f97081n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(yz5.l lVar, java.lang.String str, yz5.l lVar2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97079i = lVar;
        this.f97080m = str;
        this.f97081n = lVar2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        az0.hc hcVar = new az0.hc(this.f97079i, this.f97080m, this.f97081n, interfaceC29045xdcb5ca57);
        hcVar.f97078h = obj;
        return hcVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.hc) mo148xaf65a0fc((u26.r0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        u26.r0 r0Var;
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 c4067xeeae5bd2;
        p3325xe03a0797.p3326xc267989b.r rVar;
        yz5.l lVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f97077g;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r0Var = (u26.r0) this.f97078h;
            java.lang.String str = this.f97080m;
            yz5.l lVar2 = this.f97081n;
            this.f97078h = r0Var;
            yz5.l lVar3 = this.f97079i;
            this.f97074d = lVar3;
            this.f97075e = str;
            this.f97076f = lVar2;
            this.f97077g = 1;
            p3325xe03a0797.p3326xc267989b.r rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar2.k();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2 c4067xeeae5bd22 = (com.p314xaae8f345.p457x3304c6.p470x35bb6d35.C4067xeeae5bd2) lVar3.mo146xb9724478(new az0.fc(r0Var, str));
            com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = c4067xeeae5bd22.f129637a;
            bz0.b bVar = bz0.b.f118257a;
            if (c4093x6b88526b == null || !rVar2.n()) {
                c4067xeeae5bd2 = c4067xeeae5bd22;
                rVar = rVar2;
                lVar = lVar2;
                rVar.s(f0Var, null);
                bz0.b.d(bVar, str, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 4, null);
            } else {
                com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b error = c4067xeeae5bd22.f129637a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(error, "error");
                c4067xeeae5bd2 = c4067xeeae5bd22;
                rVar = rVar2;
                lVar = lVar2;
                bz0.b.b(bVar, str, error, java.lang.System.currentTimeMillis() - currentTimeMillis, 0, 8, null);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new az0.p7(error))));
            }
            rVar.m(new az0.ec(str, currentTimeMillis, lVar, c4067xeeae5bd2));
            if (rVar.j() == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0Var = (u26.r0) this.f97078h;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        u26.q0 q0Var = (u26.q0) r0Var;
        q0Var.getClass();
        u26.x0.a(q0Var, null, 1, null);
        az0.gc gcVar = new az0.gc(this.f97080m);
        this.f97078h = null;
        this.f97074d = null;
        this.f97075e = null;
        this.f97076f = null;
        this.f97077g = 2;
        return u26.p0.a(r0Var, gcVar, this) == aVar ? aVar : f0Var;
    }
}

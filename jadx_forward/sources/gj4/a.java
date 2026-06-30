package gj4;

/* loaded from: classes8.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f353934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f353935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f353936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f353937g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j17, long j18, long j19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f353935e = j17;
        this.f353936f = j18;
        this.f353937g = j19;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gj4.a(this.f353935e, this.f353936f, this.f353937g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gj4.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f353934d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getTextStatusHistoryList >> ");
                long j17 = this.f353935e;
                sb6.append(j17);
                sb6.append(", ");
                long j18 = this.f353936f;
                sb6.append(j18);
                sb6.append(", ");
                long j19 = this.f353937g;
                sb6.append(j19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusHistoryCgiHelper", sb6.toString());
                com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
                pj4.f1 f1Var = new pj4.f1();
                f1Var.f436573e = j17;
                f1Var.f436574f = j18;
                f1Var.f436575g = j19;
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152197a = f1Var;
                lVar.f152198b = new pj4.g1();
                lVar.f152200d = 4245;
                lVar.f152199c = "/cgi-bin/micromsg-bin/textstatusgetselfhistories";
                iVar.p(lVar.a());
                this.f353934d = 1;
                obj = rm0.h.b(iVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            pj4.g1 g1Var = (pj4.g1) ((com.p314xaae8f345.mm.p944x882e457a.f) obj).f152151d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusHistoryCgiHelper", "getTextStatusHistoryList result >> " + g1Var.f436592d.size());
            return g1Var.f436592d;
        } catch (rm0.j e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatusHistoryCgiHelper", "getTextStatusHistoryList error >> " + e17);
            return null;
        }
    }
}

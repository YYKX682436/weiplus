package dk2;

/* loaded from: classes3.dex */
public final class j2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f315165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ek2.z0 f315166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315167f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(com.p314xaae8f345.mm.p944x882e457a.f fVar, ek2.z0 z0Var, dk2.r4 r4Var) {
        super(0);
        this.f315165d = fVar;
        this.f315166e = z0Var;
        this.f315167f = r4Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.ht1 ht1Var;
        ek2.z0 z0Var = this.f315166e;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f315165d;
        if (fVar != null && (ht1Var = (r45.ht1) fVar.f152151d) != null) {
            dk2.r4 r4Var = this.f315167f;
            r45.nw1 nw1Var = ((mm2.e1) r4Var.f315540b.a(mm2.e1.class)).f410521r;
            if (!(nw1Var != null && ht1Var.m75942xfb822ef2(5) == nw1Var.m75942xfb822ef2(0))) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLotteryRecord invalid resp,liveId:");
                sb6.append(java.lang.Long.valueOf(ht1Var.m75942xfb822ef2(5)));
                sb6.append(",current liveId:");
                r45.nw1 nw1Var2 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410521r;
                sb6.append(nw1Var2 != null ? java.lang.Long.valueOf(nw1Var2.m75942xfb822ef2(0)) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, sb6.toString());
                if (z0Var != null) {
                    z0Var.a(3, 10123, "invalid liveId", ht1Var);
                }
                return jz5.f0.f384359a;
            }
        }
        if (z0Var != null) {
            int i17 = fVar.f152148a;
            int i18 = fVar.f152149b;
            java.lang.String str = fVar.f152150c;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            z0Var.a(i17, i18, str, (r45.ht1) resp);
        }
        return jz5.f0.f384359a;
    }
}

package en3;

/* loaded from: classes2.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f336814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f336815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f336817g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f336818h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f336819i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336820m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, java.lang.String str, int i17, int i18, java.lang.String str2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f336815e = j17;
        this.f336816f = str;
        this.f336817g = i17;
        this.f336818h = i18;
        this.f336819i = str2;
        this.f336820m = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new en3.a0(this.f336815e, this.f336816f, this.f336817g, this.f336818h, this.f336819i, this.f336820m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((en3.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f336814d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            i95.m c17 = i95.n0.c(m40.h0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            com.p314xaae8f345.mm.p944x882e457a.i ci6 = m40.h0.ci((m40.h0) c17, this.f336815e, this.f336816f, this.f336817g, this.f336818h, this.f336819i, false, null, null, 0L, null, false, false, null, null, 0, null, 57312, null);
            this.f336814d = 1;
            b17 = rm0.h.b(ci6, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            b17 = obj;
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.NewLifeDataFeatureService", "requestFinderObject " + fVar);
        boolean b18 = fVar.b();
        yz5.l lVar = this.f336820m;
        if (b18) {
            r45.h51 h51Var = (r45.h51) fVar.f152151d;
            if (h51Var != null && (c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var.m75936x14adae67(2)) != null) {
                bu2.j.f106067a.o(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 2097152), new bu2.h(3763, 0L));
            }
            r45.h51 h51Var2 = (r45.h51) fVar.f152151d;
            lVar.mo146xb9724478(h51Var2 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) h51Var2.m75936x14adae67(2) : null);
        } else {
            lVar.mo146xb9724478(null);
        }
        return jz5.f0.f384359a;
    }
}

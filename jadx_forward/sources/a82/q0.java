package a82;

/* loaded from: classes4.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f83665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.re f83666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f83667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f83668g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r45.re reVar, yz5.q qVar, o72.r2 r2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f83666e = reVar;
        this.f83667f = qVar;
        this.f83668g = r2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a82.q0(this.f83666e, this.f83667f, this.f83668g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a82.q0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f83665d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.re reVar = this.f83666e;
            reVar.getClass();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 11485;
            lVar.f152199c = "/cgi-bin/micromsg-bin/batchdelfavitembysourceid";
            lVar.f152197a = reVar;
            lVar.f152198b = new r45.se();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            this.f83665d = 1;
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
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavDeleteService", "deleteBySourceId cgiBack:" + fVar);
        yz5.q qVar = this.f83667f;
        if (qVar != null) {
            java.lang.Integer num = new java.lang.Integer(fVar.f152149b);
            java.lang.Integer num2 = new java.lang.Integer(fVar.f152148a);
            java.lang.String str = fVar.f152150c;
            if (str == null) {
                str = "";
            }
            qVar.mo147xb9724478(num, num2, str);
        }
        if (fVar.b()) {
            gm0.j1.e().j(new a82.p0(this.f83668g, fVar));
        }
        return jz5.f0.f384359a;
    }
}

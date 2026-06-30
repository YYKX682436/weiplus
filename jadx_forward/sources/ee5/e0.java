package ee5;

/* loaded from: classes9.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333393d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ee5.h0 f333395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333396g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ee5.h0 h0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f333395f = h0Var;
        this.f333396g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ee5.e0 e0Var = new ee5.e0(this.f333395f, this.f333396g, interfaceC29045xdcb5ca57);
        e0Var.f333394e = obj;
        return e0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((ee5.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
        return pz5.a.f440719d;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f333393d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f333394e;
            bm5.t0 t0Var = bm5.t0.f104271a;
            if (!t0Var.a() || !t0Var.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryDataModel", "checkInitDB >> entrance is close");
            } else if (aq.o.f94455c == null) {
                aq.o.f94455c = new aq.n();
                com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a.a();
            }
            ee5.h0 h0Var = this.f333395f;
            ce5.d dVar = h0Var.f333444w;
            java.lang.String currentRoomId = h0Var.f333428d;
            aq.c queryType = h0Var.f333443v;
            dVar.getClass();
            java.lang.String queryText = this.f333396g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryText, "queryText");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentRoomId, "currentRoomId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(queryType, "queryType");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LoadMoreImageDataModel", "getLoadMoreDataFlow >> " + queryText + ", " + currentRoomId + ", " + queryType);
            dVar.f122345a = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(0, 0, null, 7, null);
            dVar.f122347c = p3325xe03a0797.p3326xc267989b.l.d(dVar.f122346b, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new ce5.c(queryText, dVar, currentRoomId, queryType, null), 2, null);
            p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 i2Var = dVar.f122345a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i2Var);
            ee5.d0 d0Var = new ee5.d0(h0Var, y0Var);
            this.f333393d = 1;
            if (p3325xe03a0797.p3326xc267989b.p3328x30012e.q2.l((p3325xe03a0797.p3326xc267989b.p3328x30012e.q2) i2Var, d0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        throw new jz5.d();
    }
}

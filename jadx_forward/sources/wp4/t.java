package wp4;

/* loaded from: classes4.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f529971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f529972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f529973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp4.x f529974g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, int i18, wp4.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f529972e = i17;
        this.f529973f = i18;
        this.f529974g = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wp4.t(this.f529972e, this.f529973f, this.f529974g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.t) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f529971d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zp4.e eVar = zp4.e.f556487a;
            int i18 = this.f529973f;
            int i19 = this.f529972e;
            dm.q0 c17 = eVar.c(i19, i18);
            if (c17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f529974g.f529986d, "updateWorkTimeOut get info is null, " + i19);
                return f0Var;
            }
            b5.w.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).b(c17.f68034xcf7ab2c4);
            aq4.a.f94734a.a(c17.f68034xcf7ab2c4);
            l75.k0 a17 = eVar.a();
            p75.n0 n0Var = dm.q0.R;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("work_type", java.lang.Integer.valueOf(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.C2477xcdece81b.f7529x7d0fa359));
            p75.m0 i27 = dm.q0.V.i(java.lang.Integer.valueOf(i19));
            p75.h1 j17 = dm.q0.R.j(contentValues);
            j17.b(i27);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "updateWorkTypeBySnsLocalId >> workType: 4003, result: " + j17.a().f(a17));
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            wp4.s sVar = new wp4.s(c17, null);
            this.f529971d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, sVar, this) == aVar) {
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

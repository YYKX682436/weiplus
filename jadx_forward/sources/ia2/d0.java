package ia2;

/* loaded from: classes2.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f371445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 f371446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f371447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f371448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3, double d17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f371446e = activityC13656x51707ca3;
        this.f371447f = d17;
        this.f371448g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ia2.d0(this.f371446e, this.f371447f, this.f371448g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        gx2.q qVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f371445d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.H1;
            this.f371445d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.H1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = this.f371446e;
        activityC13656x51707ca3.getClass();
        float a17 = (float) (ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 86.0f) + this.f371447f);
        double d17 = activityC13656x51707ca3.f183324z1;
        float a18 = d17 <= 0.0d ? ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 191.0f) : (float) (ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 86.0f) + d17);
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (a17 <= a18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerPeekHeightTask: skip small");
            return f0Var;
        }
        this.f371448g.mo152xb9724478();
        if (!activityC13656x51707ca3.D && (qVar = activityC13656x51707ca3.f183309J) != null) {
            qVar.m132490xf8f6de2f(a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerPeekHeightTask: " + a17 + ' ' + a18);
        yz5.l lVar = activityC13656x51707ca3.M;
        if (lVar != null) {
        }
        return f0Var;
    }
}

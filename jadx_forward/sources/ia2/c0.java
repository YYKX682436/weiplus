package ia2;

/* loaded from: classes2.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f371441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 f371442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f371443f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f371444g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3, double d17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f371442e = activityC13656x51707ca3;
        this.f371443f = d17;
        this.f371444g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ia2.c0(this.f371442e, this.f371443f, this.f371444g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ia2.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f371441d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3.H1;
            this.f371441d = 1;
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
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.p1428xd2ae381c.ActivityC13656x51707ca3 activityC13656x51707ca3 = this.f371442e;
        activityC13656x51707ca3.getClass();
        float a17 = ((float) this.f371443f) + ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 28.0f);
        float j76 = activityC13656x51707ca3.j7(activityC13656x51707ca3.m81186xd24c19fa());
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (a17 <= j76) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerExpandHeightTask: skip small");
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderFlutterPOIActivity", "submitUpdateDrawerExpandHeightTask: newHeight " + a17 + ", curHeight " + j76);
        this.f371444g.mo152xb9724478();
        gx2.q qVar = activityC13656x51707ca3.f183309J;
        if (qVar != null) {
            qVar.m132476xe4d36290(a17);
        }
        return f0Var;
    }
}

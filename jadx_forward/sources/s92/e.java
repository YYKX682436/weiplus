package s92;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f486530d;

    /* renamed from: e, reason: collision with root package name */
    public int f486531e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f486532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f486533g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f486534h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f486535i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.a34 f486536m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(long j17, java.lang.String str, long j18, r45.a34 a34Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f486533g = j17;
        this.f486534h = str;
        this.f486535i = j18;
        this.f486536m = a34Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        s92.e eVar = new s92.e(this.f486533g, this.f486534h, this.f486535i, this.f486536m, interfaceC29045xdcb5ca57);
        eVar.f486532f = obj;
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s92.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f486531e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f486532f;
            long c17 = c01.id.c();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityProfileUI", "preloadCampaignInfo start");
            s92.d dVar = new s92.d(this.f486533g, this.f486534h, this.f486535i, this.f486536m);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            u92.e eVar = new u92.e(dVar, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), null, null, 12, null);
            this.f486530d = c17;
            this.f486531e = 1;
            if (ay1.l.h(eVar, this) == aVar) {
                return aVar;
            }
            j17 = c17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f486530d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ActivityProfileUI", "preloadCampaignInfo end " + (c01.id.c() - j17));
        return jz5.f0.f384359a;
    }
}

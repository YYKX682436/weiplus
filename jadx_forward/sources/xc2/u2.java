package xc2;

/* loaded from: classes2.dex */
public final class u2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f534844d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f534845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f534846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534846f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        xc2.u2 u2Var = new xc2.u2(this.f534846f, interfaceC29045xdcb5ca57);
        u2Var.f534845e = obj;
        return u2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc2.u2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f534844d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f534845e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadTopicInfo: preload topic eventTopicId = ");
            long j17 = this.f534846f;
            sb6.append(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.JumperUtils", sb6.toString());
            xc2.t2 t2Var = new xc2.t2(j17);
            oz5.l f93115e = y0Var.getF93115e();
            int i18 = p3325xe03a0797.p3326xc267989b.r2.O0;
            bz2.a aVar2 = new bz2.a(t2Var, (p3325xe03a0797.p3326xc267989b.r2) f93115e.get(p3325xe03a0797.p3326xc267989b.q2.f392104d), null, 4, null);
            this.f534844d = 1;
            if (ay1.l.h(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}

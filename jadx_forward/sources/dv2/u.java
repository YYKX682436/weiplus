package dv2;

/* loaded from: classes2.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f325482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv2.v f325483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f325484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(dv2.v vVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325483e = vVar;
        this.f325484f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        dv2.u uVar = new dv2.u(this.f325483e, this.f325484f, interfaceC29045xdcb5ca57);
        uVar.f325482d = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dv2.u uVar = (dv2.u) mo148xaf65a0fc((dv2.i) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dv2.i iVar = (dv2.i) this.f325482d;
        dv2.k kVar = this.f325483e.f325494y;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f325484f;
        dv2.i iVar2 = (dv2.i) h0Var.f391656d;
        kVar.getClass();
        if (iVar2 != iVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FollowAggregationTabUIC", "[FollowFreqReport] currentTab transition: " + iVar2 + " -> " + iVar);
            if (iVar2 != null) {
                kVar.a("page_out", iVar2.f325401d, kVar.f325413a > 0 ? android.os.SystemClock.elapsedRealtime() - kVar.f325413a : 0L);
                kVar.f325413a = 0L;
            }
            if (iVar != null) {
                kVar.f325413a = android.os.SystemClock.elapsedRealtime();
                kVar.a("page_in", iVar.f325401d, -1L);
            }
        }
        h0Var.f391656d = iVar;
        return jz5.f0.f384359a;
    }
}

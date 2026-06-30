package cq2;

/* loaded from: classes2.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f302954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f302955e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, boolean z17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f302954d = hVar;
        this.f302955e = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cq2.o(this.f302954d, interfaceC29045xdcb5ca57, this.f302955e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cq2.o oVar = (cq2.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        oVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.dk2 dk2Var = (r45.dk2) ((xg2.i) this.f302954d).f535926b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadLiveSquareRecommendData: success, isKaraPredict=");
        sb6.append(this.f302955e);
        sb6.append(", size=");
        java.util.LinkedList m75941xfb821914 = dk2Var.m75941xfb821914(1);
        sb6.append(m75941xfb821914 != null ? new java.lang.Integer(m75941xfb821914.size()) : null);
        sb6.append(", currentRedPreloadObjectKey=");
        sb6.append(cq2.q.f302968h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewSquarePreloadUtil", sb6.toString());
        return jz5.f0.f384359a;
    }
}

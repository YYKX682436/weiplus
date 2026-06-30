package rn2;

/* loaded from: classes15.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f479267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f479268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gk2.e f479269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f479270g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(rn2.t2 t2Var, gk2.e eVar, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f479268e = t2Var;
        this.f479269f = eVar;
        this.f479270g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rn2.f2(this.f479268e, this.f479269f, this.f479270g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rn2.f2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f479267d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ld2.i iVar = ld2.i.f399636a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f479268e.f479386e;
            this.f479267d = 1;
            if (iVar.a(abstractActivityC21394xb3d2c0cf, this.f479269f, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Object m65361xd4eb96cf = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65361xd4eb96cf(this.f479270g);
        android.app.Activity activity = m65361xd4eb96cf instanceof android.app.Activity ? (android.app.Activity) m65361xd4eb96cf : null;
        if (activity != null) {
            activity.finish();
        }
        return jz5.f0.f384359a;
    }
}

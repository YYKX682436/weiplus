package h41;

/* loaded from: classes11.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.a1 f360436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360438f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(h41.a1 a1Var, long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360436d = a1Var;
        this.f360437e = j17;
        this.f360438f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.z0(this.f360436d, this.f360437e, this.f360438f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h41.z0 z0Var = (h41.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context != null) {
            java.lang.String str = this.f360438f;
            if (str == null) {
                str = "";
            }
            db5.t7.h(context, str);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.p pVar = this.f360436d.f360291a;
        if (pVar != null) {
            pVar.Z(this.f360437e);
        }
        return jz5.f0.f384359a;
    }
}

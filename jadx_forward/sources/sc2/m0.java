package sc2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ long f487598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.b f487601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(sc2.h1 h1Var, in5.s0 s0Var, so2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f487599e = h1Var;
        this.f487600f = s0Var;
        this.f487601g = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        sc2.m0 m0Var = new sc2.m0(this.f487599e, this.f487600f, this.f487601g, interfaceC29045xdcb5ca57);
        m0Var.f487598d = ((java.lang.Number) obj).longValue();
        return m0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sc2.m0 m0Var = (sc2.m0) mo148xaf65a0fc(java.lang.Long.valueOf(((java.lang.Number) obj).longValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        m0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        long j17 = this.f487598d;
        android.widget.TextView textView = this.f487599e.K;
        if (textView != null) {
            textView.setText(this.f487600f.f374654e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572797ni0, new java.lang.Long(j17)));
        }
        so2.b bVar = this.f487601g;
        if (bVar != null) {
            bVar.f491799e = new java.lang.Long(j17 * 1000);
        }
        return jz5.f0.f384359a;
    }
}

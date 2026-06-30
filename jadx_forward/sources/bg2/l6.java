package bg2;

/* loaded from: classes2.dex */
public final class l6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f101803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f101804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f101805f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, bg2.q6 q6Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101803d = hVar;
        this.f101804e = q6Var;
        this.f101805f = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.l6(this.f101803d, interfaceC29045xdcb5ca57, this.f101804e, this.f101805f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.l6 l6Var = (bg2.l6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l6Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.d31 d31Var = (r45.d31) ((xg2.i) this.f101803d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f101804e.f101946e, "[requestFeedBack] success");
        this.f101805f.f391656d = d31Var;
        return jz5.f0.f384359a;
    }
}

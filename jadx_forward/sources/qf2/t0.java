package qf2;

/* loaded from: classes.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f444118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444117d = hVar;
        this.f444118e = g0Var;
        this.f444119f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.t0(this.f444117d, interfaceC29045xdcb5ca57, this.f444118e, this.f444119f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.t0 t0Var = (qf2.t0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.jc2 jc2Var = (r45.jc2) ((xg2.i) this.f444117d).f535926b;
        java.lang.Integer num = new java.lang.Integer(jc2Var.m75939xb282bd08(1));
        if (!java.lang.Boolean.valueOf(num.intValue() > 0).booleanValue()) {
            num = null;
        }
        int intValue = num != null ? num.intValue() : 30;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f444118e;
        g0Var.f391654d = intValue * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "repeatNotifySEISync success, source: " + this.f444119f + " nextDelayTime: " + g0Var.f391654d + " next_regular_req_delay_time_s: " + jc2Var.m75939xb282bd08(1));
        return jz5.f0.f384359a;
    }
}

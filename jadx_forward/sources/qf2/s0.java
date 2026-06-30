package qf2;

/* loaded from: classes.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f444098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f444100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444098d = hVar;
        this.f444099e = str;
        this.f444100f = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qf2.s0(this.f444098d, interfaceC29045xdcb5ca57, this.f444099e, this.f444100f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qf2.s0 s0Var = (qf2.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorMicTRTCController", "repeatNotifySEISync source: " + this.f444099e + " fail: " + ((xg2.a) ((xg2.b) this.f444098d).f535914b));
        this.f444100f.f391654d = 30000L;
        return jz5.f0.f384359a;
    }
}

package md1;

/* loaded from: classes7.dex */
public class t0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f407340b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ md1.u0 f407341c;

    public t0(md1.u0 u0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f407341c = u0Var;
        this.f407339a = c0Var;
        this.f407340b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiSubscribeVoIPMembers", "subscribe result result %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        int i19 = this.f407340b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f407339a;
        md1.u0 u0Var = this.f407341c;
        if (i17 == 0 && i18 == 0) {
            c0Var.a(i19, u0Var.o("ok"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        u0Var.C(hashMap, u0Var.D(i17, i18));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        c0Var.a(i19, u0Var.p(java.lang.String.format("fail: %d, %d, %s, %d", valueOf, valueOf2, str, java.lang.Long.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE.Y)), hashMap));
    }
}

package yo4;

/* loaded from: classes10.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.q f545805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a, yz5.q qVar) {
        super(2);
        this.f545804d = c18794x5f9cad3a;
        this.f545805e = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        if (((java.lang.Boolean) obj).booleanValue()) {
            if (!(str == null || str.length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoFullScreenPluginLayout", "download music success, " + str);
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
                h0Var.f391656d = str;
                p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
                p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new yo4.m0(this.f545804d, h0Var, str, this.f545805e, null), 2, null);
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "download music failed");
        this.f545804d.B.z();
        return jz5.f0.f384359a;
    }
}

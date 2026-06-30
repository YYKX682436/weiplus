package fo5;

/* loaded from: classes14.dex */
public final /* synthetic */ class x extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.a {
    public x(java.lang.Object obj) {
        super(0, obj, fo5.r0.class, "quickConnectTTSComplete", "quickConnectTTSComplete()V", 0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fo5.r0 r0Var = (fo5.r0) this.f72685xcfcbe9ef;
        if (r0Var.r()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startRingAfterQuickConnectTTS() called with: username = ");
            er4.x xVar = r0Var.f346618d;
            sb6.append(xVar != null ? xVar.m128056xfb82e301() : null);
            sb6.append(", roomRole = ");
            sb6.append(r0Var.f346617c);
            sb6.append(", roomType = ");
            sb6.append(r0Var.f346616b);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", sb6.toString());
            r0Var.f346635u = true;
            r0Var.v();
        }
        return jz5.f0.f384359a;
    }
}

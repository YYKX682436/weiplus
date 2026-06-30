package jg0;

/* loaded from: classes12.dex */
public final class v implements com.p314xaae8f345.mm.p947xba6de98f.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jg0.x f381165a;

    public v(jg0.x xVar) {
        this.f381165a = xVar;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.v2
    public void b(com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var) {
        if (n1Var != null) {
            if (n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152613i) {
                jg0.x xVar = this.f381165a;
                java.lang.Integer e17 = qi3.c.e(xVar, false, 1, null);
                if (e17 != null) {
                    e17.intValue();
                    sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
                    dn.m mVar = n1Var.f152639d;
                    java.lang.String str = mVar != null ? mVar.f69601xaca5bdda : null;
                    if (str == null) {
                        str = "";
                    }
                    ((rx.f) b0Var).Bi(str);
                    e17.intValue();
                    return;
                }
                if (xVar.f445210f == qi3.g0.f445242h) {
                    dn.g gVar = n1Var.f152640e;
                    float f17 = gVar != null ? (float) gVar.f69496x83ec3dd : 0.0f;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUploadVoiceProgress fileName:");
                    sb6.append(xVar.f381171i.f122582b);
                    sb6.append(" finishLength: ");
                    sb6.append(f17);
                    sb6.append(" totalLength: ");
                    dn.g gVar2 = n1Var.f152640e;
                    sb6.append(gVar2 != null ? java.lang.Long.valueOf(gVar2.f69500x8ab84c59) : null);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoiceMsg.VoiceMsgSendTask", sb6.toString());
                }
            }
        }
    }
}

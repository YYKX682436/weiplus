package h41;

/* loaded from: classes11.dex */
public final class p0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.t0 f360380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(h41.t0 t0Var) {
        super(0);
        this.f360380d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h41.t0 t0Var = this.f360380d;
        if (t0Var.f360401j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "notifyAllowEvent: already released");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", "notifyAllowEvent");
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, 1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.OVCXLabEnable", "setVoiceAssistantPermission: granted=true, value=1");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", "permission switch saved as ON");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j jVar = t0Var.f360394a;
            if (jVar != null) {
                jVar.o0();
            }
        }
        return jz5.f0.f384359a;
    }
}

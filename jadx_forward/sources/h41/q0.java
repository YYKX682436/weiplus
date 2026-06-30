package h41;

/* loaded from: classes11.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.t0 f360382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h41.t0 t0Var) {
        super(0);
        this.f360382d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h41.t0 t0Var = this.f360382d;
        if (t0Var.f360401j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "notifyDenyEvent: already released");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCPermissionRequestUI", "notifyDenyEvent");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j jVar = t0Var.f360394a;
            if (jVar != null) {
                jVar.v1();
            }
        }
        return jz5.f0.f384359a;
    }
}

package h41;

/* loaded from: classes11.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f360403d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(h41.y0 y0Var) {
        super(0);
        this.f360403d = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h41.y0 y0Var = this.f360403d;
        if (y0Var.f360434j) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "notifyDismissEvent: already released");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCSelectContactUI", "notifyDismissEvent");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l lVar = y0Var.f360427a;
            if (lVar != null) {
                lVar.H();
            }
        }
        return jz5.f0.f384359a;
    }
}

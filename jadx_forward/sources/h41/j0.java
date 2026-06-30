package h41;

/* loaded from: classes11.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f360350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h41.o0 o0Var) {
        super(0);
        this.f360350d = o0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        h41.o0 o0Var = this.f360350d;
        if (o0Var.f360378k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "notifyDismissEvent: already released");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", "notifyDismissEvent");
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h hVar = o0Var.f360370a;
            if (hVar != null) {
                hVar.H();
            }
        }
        return jz5.f0.f384359a;
    }
}

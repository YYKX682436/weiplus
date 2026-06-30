package h41;

/* loaded from: classes11.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f360355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h41.o0 o0Var) {
        super(2);
        this.f360355d = o0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String username = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        h41.o0 o0Var = this.f360355d;
        o0Var.getClass();
        if (o0Var.f360378k) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "notifyConfirmSendEvent: already released");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVCMsgUI", "notifyConfirmSendEvent: username=" + username + ", success=" + booleanValue);
            com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h hVar = o0Var.f360370a;
            if (hVar != null) {
                hVar.K1(username, booleanValue);
            }
        }
        return jz5.f0.f384359a;
    }
}

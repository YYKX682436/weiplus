package gg1;

/* loaded from: classes7.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(gg1.c1 c1Var) {
        super(1);
        this.f353144d = c1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.VideoCastController", "reconnect: isSuccess = " + booleanValue);
        if (booleanValue) {
            gg1.c1 c1Var = this.f353144d;
            c1Var.c(c1Var.f353076i, 5);
        }
        return jz5.f0.f384359a;
    }
}

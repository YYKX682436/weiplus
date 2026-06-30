package uf;

/* loaded from: classes7.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o0 f508547d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(uf.o0 o0Var) {
        super(1);
        this.f508547d = o0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastController", "reconnect: isSuccess = " + booleanValue);
        if (booleanValue) {
            uf.o0 o0Var = this.f508547d;
            o0Var.c(o0Var.f508603m, uf.a.f508494h);
        }
        return jz5.f0.f384359a;
    }
}

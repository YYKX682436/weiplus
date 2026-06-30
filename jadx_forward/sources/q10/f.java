package q10;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f441039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.l lVar) {
        super(1);
        this.f441039d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String token = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBProfileUtil", "startProfile: evaluate done, token=".concat(token));
        this.f441039d.mo146xb9724478(token);
        return jz5.f0.f384359a;
    }
}

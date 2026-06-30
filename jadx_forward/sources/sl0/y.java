package sl0;

/* loaded from: classes10.dex */
public class y implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f490760a;

    public y(sl0.a0 a0Var, java.lang.String str) {
        this.f490760a = str;
    }

    @Override // ll0.b
    /* renamed from: getData */
    public java.lang.Object mo145883xfb7e5820() {
        boolean z17;
        h13.l0 l0Var = (h13.l0) ((f13.e) i95.n0.c(f13.e.class));
        l0Var.getClass();
        java.lang.String username = this.f490760a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        try {
            z17 = l0Var.Ni(username.concat("@wxcontact"));
        } catch (java.lang.Exception unused) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

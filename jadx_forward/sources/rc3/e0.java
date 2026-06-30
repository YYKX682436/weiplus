package rc3;

/* loaded from: classes7.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475506d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(rc3.w0 w0Var) {
        super(2);
        this.f475506d = w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String content = (java.lang.String) obj;
        java.lang.String extra = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        rc3.w0 w0Var = this.f475506d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(w0Var.f475638z, "server lost: " + content + ' ' + extra);
        je3.i.t8(je3.k.f380831e, w0Var.f475635w, "remoteException-IMBServer", content, extra, 0.0f, 16, null);
        w0Var.T(new rc3.c(w0Var));
        return jz5.f0.f384359a;
    }
}

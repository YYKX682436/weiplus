package t00;

/* loaded from: classes7.dex */
public final class m2 implements com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t {

    /* renamed from: a, reason: collision with root package name */
    public c00.n3 f495852a;

    public void a(java.lang.String errorText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorText, "errorText");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ShareToContactsEcsActionHandler", "onFail： ".concat(errorText));
        c00.n3 n3Var = this.f495852a;
        if (n3Var != null) {
            n3Var.a();
        }
        this.f495852a = null;
    }
}

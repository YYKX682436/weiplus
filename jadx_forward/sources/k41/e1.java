package k41;

/* loaded from: classes8.dex */
public final class e1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j41.h0 f385517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(j41.h0 h0Var) {
        super(0);
        this.f385517d = h0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getContactFromRemote url: ");
        j41.h0 h0Var = this.f385517d;
        sb6.append(h0Var.f379165b);
        sb6.append(", username: ");
        sb6.append(h0Var.f379166c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuGetContactService", sb6.toString());
        k41.h1 h1Var = k41.h1.f385540d;
        gm0.j1.d().g(new l41.y(h0Var));
        return jz5.f0.f384359a;
    }
}

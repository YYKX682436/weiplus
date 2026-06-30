package v85;

/* loaded from: classes10.dex */
public final class d implements x85.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f515635a;

    public d(r45.p64 p64Var) {
        this.f515635a = p64Var;
    }

    @Override // x85.c
    public void a(int i17, r45.p64 p64Var) {
        v85.e eVar = v85.e.f515636a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult: ");
        r45.p64 p64Var2 = this.f515635a;
        sb6.append(p64Var2.f464325d);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LensInfoUserCache", sb6.toString());
        pm0.v.X(new v85.c(i17, p64Var2, p64Var));
    }
}

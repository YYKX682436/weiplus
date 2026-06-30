package r61;

/* loaded from: classes4.dex */
public class t0 extends l75.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r61.u0 f474487d;

    public t0(r61.u0 u0Var) {
        this.f474487d = u0Var;
    }

    @Override // l75.a1
    public boolean f() {
        r61.u0 u0Var = this.f474487d;
        l75.k0 k0Var = u0Var.f474496d;
        if (k0Var != null && !k0Var.J()) {
            return true;
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        l75.k0 k0Var2 = u0Var.f474496d;
        objArr[0] = k0Var2 == null ? "null" : java.lang.Boolean.valueOf(k0Var2.J());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GoogleContact.GoogleFriendUI", "shouldProcessEvent db is close :%s", objArr);
        return false;
    }
}

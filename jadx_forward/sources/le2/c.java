package le2;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final le2.c f399676a = new le2.c();

    public void a(java.lang.String userName, boolean z17, int i17, long j17, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        le2.a aVar = le2.a.f399672e;
        aVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(le2.a.f399673f, "rejectNotify userName:" + userName + ", reject:" + z17 + ", notice_type:" + i17 + ", object_id:" + pm0.v.u(j17));
        r45.ph2 ph2Var = new r45.ph2();
        ph2Var.set(0, userName);
        ph2Var.set(1, java.lang.Integer.valueOf(z17 ? 1 : 0));
        ph2Var.set(2, java.lang.Integer.valueOf(i17));
        ph2Var.set(3, java.lang.Long.valueOf(j17));
        hb2.w0.m(aVar, ph2Var, gcVar, false, false, null, null, 60, null);
    }
}

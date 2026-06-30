package h31;

/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final h31.s f359979a = new h31.s();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f359980b = kz5.c1.i(new jz5.l(1, 0), new jz5.l(3, 2), new jz5.l(2, 0));

    public static final int b(int i17) {
        java.lang.Integer num = (java.lang.Integer) f359980b.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public void a(h31.r rVar) {
        if (rVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BrandSubscribeMsgRequestController", "cancel SubscribeMsgRequestTask bizUsername: %s, appId: %s, mRunningTaskId: %s", rVar.f359962c, rVar.f359963d, java.lang.Long.valueOf(rVar.f359974o));
            rVar.f359967h = null;
            rVar.f359960a = null;
            e31.k kVar = rVar.f359973n;
            if (kVar != null) {
                long j17 = rVar.f359974o;
                ((g31.l) kVar).f349622b.getClass();
                k31.o oVar = k31.o.f385383a;
                ((ku5.t0) ku5.t0.f394148d).h(new k31.j(j17), "manager_thread");
            }
        }
    }

    public void c(h31.r requestTask) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestTask, "requestTask");
        requestTask.c();
    }
}

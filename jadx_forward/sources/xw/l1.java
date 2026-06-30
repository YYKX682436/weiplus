package xw;

/* loaded from: classes11.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f539070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.x1 f539071e;

    public l1(xw.m1 m1Var, java.lang.Object obj, com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var) {
        this.f539070d = obj;
        this.f539071e = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2621x8fb0427b.s1 s1Var;
        java.lang.Object obj = this.f539070d;
        if (!(obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.h2)) {
            if (obj instanceof com.p314xaae8f345.mm.p2621x8fb0427b.f1) {
                if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ri()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnBizInfoChange", "onNotifyChange, not canViewBizPhoto");
                    return;
                }
                com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1 t1Var = com.p314xaae8f345.p3133xd0ce8b26.iam.biz.t1.f299325c;
                java.lang.String c17 = t1Var.f().a().c();
                int f17 = r01.q3.ij().f();
                t1Var.f().c().k(f17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnBizInfoChange", "onNotifyChange, biz=%s, unreadCount=%s", c17, java.lang.Integer.valueOf(f17));
                return;
            }
            return;
        }
        if (yw.h1.f547865a.n()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyInfo: eventType=");
            java.lang.Object obj2 = "null";
            com.p314xaae8f345.mm.p2621x8fb0427b.x1 x1Var = this.f539071e;
            sb6.append(x1Var != null ? x1Var.f277854a : "null");
            sb6.append(", talker=");
            sb6.append(x1Var != null ? x1Var.f277856c : "null");
            sb6.append(", msgId=");
            if (x1Var != null && (s1Var = x1Var.f277855b) != null) {
                obj2 = java.lang.Long.valueOf(s1Var.f67292x297eb4f7);
            }
            sb6.append(obj2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OnBizInfoChange", sb6.toString());
            yw.q0.f547962a.a(yw.d0.f547824e, null);
        }
    }
}

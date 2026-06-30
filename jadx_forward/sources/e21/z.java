package e21;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f328135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328137f;

    public z(e21.e0 e0Var, xg3.q0 q0Var, java.lang.String str) {
        this.f328135d = e0Var;
        this.f328136e = q0Var;
        this.f328137f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e21.e0 e0Var = this.f328135d;
        java.util.Map map = e0Var.f328044a;
        xg3.q0 q0Var = this.f328136e;
        if (((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(q0Var.f535956b)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OplogReportHelper", "recordFromScene: operation is exist: " + ((java.lang.String) ((java.util.LinkedHashMap) e0Var.f328044a).get(java.lang.Integer.valueOf(q0Var.f535956b))));
        }
        java.util.Map map2 = e0Var.f328044a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(q0Var.f535956b);
        java.lang.String str = this.f328137f;
        map2.put(valueOf, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogReportHelper", "recordFromScene: op: " + e21.a1.a(q0Var) + ", source:" + str);
    }
}

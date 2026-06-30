package e21;

/* loaded from: classes11.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e21.e0 f328015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xg3.q0 f328016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f328017f;

    public a0(e21.e0 e0Var, xg3.q0 q0Var, int i17) {
        this.f328015d = e0Var;
        this.f328016e = q0Var;
        this.f328017f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e21.e0 e0Var = this.f328015d;
        java.util.Map map = e0Var.f328045b;
        xg3.q0 q0Var = this.f328016e;
        java.util.ArrayList arrayList = (java.util.ArrayList) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(q0Var.f535956b));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        int i17 = this.f328017f;
        arrayList.add(java.lang.Integer.valueOf(i17));
        e0Var.f328045b.put(java.lang.Integer.valueOf(q0Var.f535956b), arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OplogReportHelper", "recordResult: op: " + e21.a1.a(q0Var) + ", result: " + i17);
    }
}

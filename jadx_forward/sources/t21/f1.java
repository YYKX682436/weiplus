package t21;

/* loaded from: classes12.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.g1 f496283d;

    public f1(t21.g1 g1Var) {
        this.f496283d = g1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.g1 g1Var = this.f496283d;
        t21.w0 w0Var = g1Var.f496298b.f496311d;
        w0Var.f496574q = false;
        t21.v2 v2Var = w0Var.f496571n;
        v2Var.f496544i = 104;
        v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        g1Var.f496298b.f496311d.f496571n.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        t21.v2 v2Var2 = g1Var.f496298b.f496311d.f496571n;
        v2Var2.f496539d = 0;
        v2Var2.U = 1800;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", g1Var.f496298b.f496311d.N(), java.lang.Boolean.valueOf(g1Var.f496298b.f496311d.f496574q), java.lang.Boolean.valueOf(t21.d3.Q(v2Var2)), java.lang.Long.valueOf(g1Var.f496298b.f496311d.f496571n.f496545j));
        t21.w0 w0Var2 = g1Var.f496298b.f496311d;
        w0Var2.mo807x6c193ac1(w0Var2.m47995xb7ba1aa7(), g1Var.f496298b.f496311d.f496564d);
    }
}

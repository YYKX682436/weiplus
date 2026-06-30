package t21;

/* loaded from: classes12.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.n1 f496368d;

    public m1(t21.n1 n1Var) {
        this.f496368d = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.n1 n1Var = this.f496368d;
        t21.w0 w0Var = n1Var.f496376b.f496381d;
        w0Var.f496574q = false;
        t21.v2 v2Var = w0Var.f496571n;
        v2Var.f496544i = 104;
        v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        n1Var.f496376b.f496381d.f496571n.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        t21.v2 v2Var2 = n1Var.f496376b.f496381d.f496571n;
        v2Var2.f496539d = 0;
        v2Var2.U = 1800;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", n1Var.f496376b.f496381d.N(), java.lang.Boolean.valueOf(n1Var.f496376b.f496381d.f496574q), java.lang.Boolean.valueOf(t21.d3.Q(v2Var2)), java.lang.Long.valueOf(n1Var.f496376b.f496381d.f496571n.f496545j));
        t21.w0 w0Var2 = n1Var.f496376b.f496381d;
        w0Var2.mo807x6c193ac1(w0Var2.m47995xb7ba1aa7(), n1Var.f496376b.f496381d.f496564d);
    }
}

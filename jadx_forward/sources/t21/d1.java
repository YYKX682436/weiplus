package t21;

/* loaded from: classes12.dex */
public class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.e1 f496264d;

    public d1(t21.e1 e1Var) {
        this.f496264d = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.e1 e1Var = this.f496264d;
        t21.w0 w0Var = e1Var.f496273a;
        w0Var.f496574q = false;
        t21.v2 v2Var = w0Var.f496571n;
        v2Var.f496544i = 104;
        v2Var.f496545j = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        e1Var.f496273a.f496571n.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        t21.v2 v2Var2 = e1Var.f496273a.f496571n;
        v2Var2.f496539d = 0;
        v2Var2.U = 1800;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn MM_ERR_GET_AESKEY_FAILED doScene again enableHitcheck[%b], ret[%b] new createtime:%d", e1Var.f496273a.N(), java.lang.Boolean.valueOf(e1Var.f496273a.f496574q), java.lang.Boolean.valueOf(t21.d3.Q(v2Var2)), java.lang.Long.valueOf(e1Var.f496273a.f496571n.f496545j));
        t21.w0 w0Var2 = e1Var.f496273a;
        w0Var2.mo807x6c193ac1(w0Var2.m47995xb7ba1aa7(), e1Var.f496273a.f496564d);
    }
}

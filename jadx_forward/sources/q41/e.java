package q41;

/* loaded from: classes11.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f441574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f441575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q41.a f441576f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441577g;

    public e(k41.g0 g0Var, int i17, q41.a aVar, java.lang.String str) {
        this.f441574d = g0Var;
        this.f441575e = i17;
        this.f441576f = aVar;
        this.f441577g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
        k41.g0 g0Var = this.f441574d;
        java.lang.String fj6 = ((l41.q2) b0Var).fj(g0Var.f68607xd03b1ae9, g0Var.f68608x1223b30f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[17];
        objArr[0] = g0Var.f68613xdec927b;
        objArr[1] = g0Var.f68604x21f9b213;
        objArr[2] = g0Var.f68607xd03b1ae9;
        objArr[3] = fj6;
        objArr[4] = java.lang.Integer.valueOf(this.f441575e);
        objArr[5] = 0;
        objArr[6] = 0;
        objArr[7] = "";
        objArr[8] = g0Var.f68597x553a5901;
        objArr[9] = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        objArr[10] = java.lang.Integer.valueOf(g0Var.f68600x1c5d3c28);
        q41.a aVar = this.f441576f;
        java.lang.String str = aVar.f441559b;
        if (str == null) {
            str = "";
        }
        objArr[11] = str;
        objArr[12] = java.lang.Integer.valueOf(aVar.f441558a);
        java.lang.String str2 = aVar.f441560c;
        if (str2 == null) {
            str2 = "";
        }
        objArr[13] = str2;
        objArr[14] = java.lang.Integer.valueOf(aVar.f441561d ? 1 : 2);
        java.lang.String str3 = this.f441577g;
        objArr[15] = str3 != null ? str3 : "";
        objArr[16] = java.lang.Integer.valueOf(aVar.f441562e ? 1 : 2);
        g0Var2.d(23393, objArr);
    }
}

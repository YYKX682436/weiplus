package ho1;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f364204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f364205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f364206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364208h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f364209i;

    public g(ho1.v vVar, long j17, long j18, java.lang.String str, java.lang.String str2, long j19) {
        this.f364204d = vVar;
        this.f364205e = j17;
        this.f364206f = j18;
        this.f364207g = str;
        this.f364208h = str2;
        this.f364209i = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f364204d;
        java.lang.String str = vVar.f364362a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadFileAsync, taskId = ");
        long j17 = this.f364205e;
        sb6.append(j17);
        sb6.append(", go in thread time = ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f364206f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ho1.v vVar2 = this.f364204d;
        ro1.g gVar = vVar2.f364364c;
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUDiskChannel");
            throw null;
        }
        ho1.f fVar = new ho1.f(vVar2, this.f364205e, currentTimeMillis, this.f364209i);
        java.lang.String str2 = this.f364207g;
        java.lang.String str3 = this.f364208h;
        ro1.f c17 = gVar.c(str2, str3, fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f364362a, "copyUDisk2Local downloadFileAsync, taskId = " + j17 + ", errCode.value = " + c17.f479519d + ", time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", localFileSize = " + new java.io.File(str3).length());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.t0 t0Var = vVar.f364369h;
        if (t0Var != null) {
            t0Var.k0(j17, c17.f479519d);
        }
    }
}

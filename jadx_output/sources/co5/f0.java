package co5;

/* loaded from: classes11.dex */
public final class f0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co5.m0 f43829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f43830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f43831c;

    public f0(co5.m0 m0Var, long j17, android.content.Context context) {
        this.f43829a = m0Var;
        this.f43830b = j17;
        this.f43831c = context;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] grantResults) {
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            c0Var.f310112d = true;
        }
        boolean z17 = c0Var.f310112d;
        co5.m0 m0Var = this.f43829a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("voipmp.systemauth", "callback is " + m0Var.f43868a);
            com.tencent.mm.plugin.voipmp.platform.r rVar = m0Var.f43868a;
            if (rVar != null) {
                rVar.f0(this.f43830b, true);
            }
        } else {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new co5.e0(this.f43831c, m0Var.f43868a, this.f43830b, c0Var, null), 3, null);
        }
        com.tencent.mars.xlog.Log.i("voipmp.systemauth", "after request camera (isAuthorized=" + c0Var.f310112d + ')');
    }
}

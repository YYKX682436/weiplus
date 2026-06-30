package co5;

/* loaded from: classes11.dex */
public final class l0 implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ co5.m0 f43862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f43863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f43864c;

    public l0(co5.m0 m0Var, long j17, android.content.Context context) {
        this.f43862a = m0Var;
        this.f43863b = j17;
        this.f43864c = context;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] grantResults) {
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
            c0Var.f310112d = true;
        }
        boolean z17 = c0Var.f310112d;
        co5.m0 m0Var = this.f43862a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("voipmp.systemauth", "callback is " + m0Var.f43868a);
            com.tencent.mm.plugin.voipmp.platform.r rVar = m0Var.f43868a;
            if (rVar != null) {
                rVar.f0(this.f43863b, true);
            }
        } else {
            com.tencent.mm.plugin.voipmp.platform.r rVar2 = m0Var.f43868a;
            com.tencent.mars.xlog.Log.i("voipmp.systemauth", "requestAsync it microPhone");
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new co5.k0(this.f43864c, rVar2, this.f43863b, c0Var, null), 3, null);
        }
        com.tencent.mars.xlog.Log.i("voipmp.systemauth", "after request microphone (isAuthorized=" + c0Var.f310112d + ')');
    }
}

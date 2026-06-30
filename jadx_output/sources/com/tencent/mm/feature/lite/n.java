package com.tencent.mm.feature.lite;

/* loaded from: classes8.dex */
public class n implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q80.f0 f67222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f67223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f67224f;

    public n(com.tencent.mm.feature.lite.i iVar, q80.f0 f0Var, q80.d0 d0Var, android.content.Context context) {
        this.f67222d = f0Var;
        this.f67223e = d0Var;
        this.f67224f = context;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCLong iPCLong = (com.tencent.mm.ipcinvoker.type.IPCLong) obj;
        q80.f0 f0Var = this.f67222d;
        if (iPCLong != null) {
            long j17 = iPCLong.f68405d;
            if (j17 >= 0) {
                q80.d0 d0Var = this.f67223e;
                if (j17 > 0) {
                    d0Var.f360663o = j17;
                }
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(this.f67224f, d0Var, f0Var);
                return;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppFeatureService", "Open LiteApp fail");
        f0Var.fail();
    }
}

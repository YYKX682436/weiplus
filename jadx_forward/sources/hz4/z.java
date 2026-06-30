package hz4;

/* loaded from: classes12.dex */
public class z extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hz4.b0 f368012a;

    public z(hz4.b0 b0Var) {
        this.f368012a = b0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        hz4.b0 b0Var = this.f368012a;
        iz4.l lVar = b0Var.f367927m;
        if (lVar != null) {
            if (lVar.f377655z.booleanValue()) {
                b0Var.f367926l.G5();
                b0Var.f367927m.f377655z = java.lang.Boolean.FALSE;
            }
            iz4.l lVar2 = b0Var.f367927m;
            long j17 = b0Var.f367916b;
            long j18 = 0;
            if (j17 != 0) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                j18 = android.os.SystemClock.elapsedRealtime() - j17;
            }
            lVar2.f377693u = (int) c31.a.a(j18);
        }
        mo50307xb9e94560(4096, 250L);
    }
}

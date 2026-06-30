package cw4;

/* loaded from: classes8.dex */
public final class h0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw4.m0 f305756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305757b;

    public h0(cw4.m0 m0Var, java.lang.String str) {
        this.f305756a = m0Var;
        this.f305757b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        try {
            cl0.e eVar = new cl0.e((java.lang.String) obj);
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            java.lang.String[] strArr = new java.lang.String[mo15056xbe0e3ae6];
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                strArr[i17] = eVar.get(i17);
            }
            if (!(mo15056xbe0e3ae6 == 0)) {
                cw4.m0 m0Var = this.f305756a;
                m0Var.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new cw4.l0(m0Var, strArr));
                return;
            }
            cw4.m0 m0Var2 = this.f305756a;
            java.lang.String str = this.f305757b;
            if (m0Var2.f305784t >= m0Var2.f305783s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewTransHelper", "performCyclicTasks finish!");
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new cw4.j0(m0Var2, str), false);
            long j17 = m0Var2.f305782r * (m0Var2.f305784t + 1);
            b4Var.c(j17, j17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WebViewTransHelper", e17, "", new java.lang.Object[0]);
        }
    }
}

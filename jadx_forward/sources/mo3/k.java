package mo3;

/* loaded from: classes9.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j4 f411948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.v8 f411949e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f411950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mo3.l f411951g;

    public k(mo3.l lVar, r45.j4 j4Var, c01.v8 v8Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f411951g = lVar;
        this.f411948d = j4Var;
        this.f411949e = v8Var;
        this.f411950f = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        ot0.q v17;
        int t17;
        r45.j4 j4Var = this.f411948d;
        int i17 = j4Var.f459093g;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f411950f;
        c01.v8 v8Var = this.f411949e;
        if (i17 != 49) {
            v8Var.a(f9Var);
            return;
        }
        this.f411951g.getClass();
        java.lang.String g17 = x51.j1.g(j4Var.f459091e);
        java.lang.String g18 = x51.j1.g(j4Var.f459092f);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncMessageNotifier", "empty fromuser or touser");
        } else {
            str = x51.j1.g(j4Var.f459094h);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(g17) && (t17 = c01.w9.t(str)) != -1) {
                    str = (str + " ").substring(t17 + 2).trim();
                }
                v17 = ot0.q.v(str);
                if (v17.f430189f1 == 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430193g1) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430197h1)) {
                    v8Var.a(f9Var);
                } else {
                    mm.w.e("showNotifyWeb");
                    this.f411949e.b(39, v17.f430197h1, "", v17.f430193g1, null, null);
                    return;
                }
            }
        }
        str = null;
        v17 = ot0.q.v(str);
        if (v17.f430189f1 == 1) {
        }
        v8Var.a(f9Var);
    }
}

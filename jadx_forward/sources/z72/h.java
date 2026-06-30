package z72;

/* loaded from: classes12.dex */
public class h extends l75.s0 implements o72.v4 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b f552098d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae f552099e;

    public h(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b) {
        this.f552098d = c26918x6e83759b;
        this.f552099e = c26918x6e83759b.m106824x752de218("FavSearchInfo", up5.g.f511491b);
    }

    public static up5.u m0(dm.p3 p3Var) {
        if (p3Var == null) {
            return null;
        }
        up5.u uVar = new up5.u();
        uVar.f511616a = p3Var.f67888x88be67a1;
        uVar.f511617b = p3Var.f67887xad49e234;
        uVar.f511618c = p3Var.f67890xffe55fe4;
        uVar.f511619d = p3Var.f67891x2261f6f2;
        uVar.f511620e = p3Var.f67892x2262335f;
        uVar.f511621f = p3Var.f67889x541db35;
        return uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o72.v4
    public dm.p3 F(long j17) {
        try {
            up5.u uVar = (up5.u) this.f552099e.m107127x946de4d9(up5.g.f511492c.eq(j17));
            if (uVar == null) {
                return null;
            }
            o72.a3 a3Var = new o72.a3();
            a3Var.f67888x88be67a1 = uVar.f511616a;
            a3Var.f67887xad49e234 = uVar.f511617b;
            a3Var.f67890xffe55fe4 = uVar.f511618c;
            a3Var.f67891x2261f6f2 = uVar.f511619d;
            a3Var.f67892x2262335f = uVar.f511620e;
            a3Var.f67889x541db35 = uVar.f511621f;
            return a3Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:94:0x01f1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0371 A[Catch: Exception -> 0x0381, TryCatch #0 {Exception -> 0x0381, blocks: (B:59:0x0356, B:61:0x0366, B:66:0x0379, B:68:0x0371, B:70:0x0375, B:71:0x037c, B:63:0x036b), top: B:58:0x0356 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x037c A[Catch: Exception -> 0x0381, TRY_LEAVE, TryCatch #0 {Exception -> 0x0381, blocks: (B:59:0x0356, B:61:0x0366, B:66:0x0379, B:68:0x0371, B:70:0x0375, B:71:0x037c, B:63:0x036b), top: B:58:0x0356 }] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0373 -> B:51:0x0379). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0375 -> B:51:0x0379). Please report as a decompilation issue!!! */
    @Override // o72.v4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List I7(java.util.List r27, java.util.List r28, java.util.List r29) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z72.h.I7(java.util.List, java.util.List, java.util.List):java.util.List");
    }

    @Override // o72.v4
    public boolean J5(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c26924x4cd4bae = this.f552099e;
            com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 m108258x5a7510f = com.p314xaae8f345.p3121x37984a.p3131x37b015.C26997x78a3bf76.all().m108258x5a7510f();
            com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da c26981x40bb0da = up5.g.f511494e;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("%");
            sb6.append(str);
            sb6.append("%");
            return c26924x4cd4bae.m107277x754a37bb(m108258x5a7510f, c26981x40bb0da.m108288x32af97(sb6.toString())).m106360xb58848b9() > 0;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.v4
    public boolean Md(dm.p3 p3Var) {
        try {
            this.f552099e.m107150x251da358(m0(p3Var));
            mo142179xf35bbb4(java.lang.Long.toString(p3Var.f67888x88be67a1), 2, p3Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }

    @Override // o72.v4
    public java.util.List V7() {
        try {
            return this.f552099e.m107251x2e0e7242(up5.g.f511492c, up5.g.f511494e.m108328x6424adf(""));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return java.util.Collections.emptyList();
        }
    }

    @Override // o72.v4
    public void m3(long j17) {
        try {
            this.f552099e.m107088x90df30e9(up5.g.f511492c.eq(j17));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
        }
    }

    @Override // o72.v4
    public boolean q7(dm.p3 p3Var, java.lang.String... strArr) {
        try {
            tp5.a.i(m0(p3Var), this.f552099e, strArr);
            mo142179xf35bbb4(java.lang.Long.toString(p3Var.f67888x88be67a1), 3, p3Var);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavSearchStorage", "Operation failed: " + e17.getMessage());
            return false;
        }
    }
}

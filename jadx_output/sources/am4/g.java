package am4;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am4.h f8813d;

    public g(am4.h hVar) {
        this.f8813d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.dr0 c17;
        bw5.cp0 b17;
        am4.h hVar = this.f8813d;
        bw5.jq0 jq0Var = hVar.f420305j;
        bw5.o50 o50Var = null;
        bw5.lp0 b18 = jq0Var != null ? jq0Var.b() : null;
        bw5.jq0 jq0Var2 = hVar.f420305j;
        if (jq0Var2 != null && (c17 = jq0Var2.c()) != null && (b17 = c17.b()) != null) {
            o50Var = b17.b();
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        yl4.a.b(hashMap, "tyt_lock_scr_previous", b18, o50Var);
        yl4.a.a(hashMap, b18, o50Var);
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
    }
}

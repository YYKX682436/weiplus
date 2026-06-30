package m75;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f406064a;

    /* renamed from: b, reason: collision with root package name */
    public final o75.c f406065b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.e f406066c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f406067d;

    public e(l75.f0 item, o75.c cVar, o75.e eVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f406064a = item;
        this.f406065b = cVar;
        this.f406066c = eVar;
        this.f406067d = str;
    }

    public final int a(l75.k0 k0Var) {
        o75.e eVar;
        o75.c cVar;
        l75.f0 f0Var = this.f406064a;
        l75.e0 mo232x1380a922 = f0Var.mo232x1380a922();
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        boolean z17 = true;
        if (!(mo9763xeb27878e.size() > 0)) {
            mo9763xeb27878e = null;
        }
        java.lang.Object obj = mo9763xeb27878e != null ? mo9763xeb27878e.get(mo232x1380a922.f398486b) : null;
        java.lang.String str = this.f406067d;
        if (k0Var == null || mo9763xeb27878e == null || obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str != null ? str : "MicroMsg.Mvvm.UpdateExecutor", "update table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
            return 0;
        }
        int p17 = k0Var.p(f0Var.mo9768x88e404c3(), mo9763xeb27878e, mo232x1380a922.f398486b + " = ?", new java.lang.String[]{obj.toString()});
        if (p17 > 0 && (eVar = this.f406066c) != null && (cVar = this.f406065b) != null) {
            eVar.m127125x715f39e3(cVar);
        }
        if (p17 > 0) {
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "update table:" + f0Var.mo9768x88e404c3() + " success primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
            }
        }
        if (p17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str != null ? str : "MicroMsg.Mvvm.UpdateExecutor", "update effectRow:" + p17 + " table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
        }
        return p17;
    }
}

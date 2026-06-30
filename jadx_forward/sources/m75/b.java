package m75;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f406051a;

    /* renamed from: b, reason: collision with root package name */
    public final o75.c f406052b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.e f406053c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f406054d;

    public b(l75.f0 item, o75.c cVar, o75.e eVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f406051a = item;
        this.f406052b = cVar;
        this.f406053c = eVar;
        this.f406054d = str;
    }

    public final int a(l75.k0 k0Var) {
        o75.e eVar;
        o75.c cVar;
        l75.f0 f0Var = this.f406051a;
        l75.e0 mo232x1380a922 = f0Var.mo232x1380a922();
        java.lang.Object mo9766x4c6b483e = f0Var.mo9766x4c6b483e();
        java.lang.String str = this.f406054d;
        if (k0Var == null || mo9766x4c6b483e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str != null ? str : "MicroMsg.Mvvm.DeleteExecutor", "delete table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + mo9766x4c6b483e);
            return -1;
        }
        int mo70514xb06685ab = k0Var.mo70514xb06685ab(f0Var.mo9768x88e404c3(), mo232x1380a922.f398486b + " = ?", new java.lang.String[]{mo9766x4c6b483e.toString()});
        if (mo70514xb06685ab > 0 && (eVar = this.f406053c) != null && (cVar = this.f406052b) != null) {
            eVar.m127125x715f39e3(cVar);
        }
        if (mo70514xb06685ab > 0) {
            if (!(str == null || r26.n0.N(str))) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "delete table:" + f0Var.mo9768x88e404c3() + " success primaryKey:" + mo232x1380a922.f398486b + " value:" + mo9766x4c6b483e);
            }
        }
        if (mo70514xb06685ab <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str != null ? str : "MicroMsg.Mvvm.DeleteExecutor", "delete effectRow:" + mo70514xb06685ab + " table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + mo9766x4c6b483e);
        }
        return mo70514xb06685ab;
    }
}

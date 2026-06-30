package m75;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f406060a;

    /* renamed from: b, reason: collision with root package name */
    public final o75.c f406061b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.e f406062c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f406063d;

    public d(l75.f0 item, o75.c cVar, o75.e eVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f406060a = item;
        this.f406061b = cVar;
        this.f406062c = eVar;
        this.f406063d = str;
    }

    public final long a(l75.k0 k0Var) {
        o75.e eVar;
        o75.c cVar;
        l75.f0 f0Var = this.f406060a;
        l75.e0 mo232x1380a922 = f0Var.mo232x1380a922();
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        boolean z17 = true;
        if (!(mo9763xeb27878e.size() > 0)) {
            mo9763xeb27878e = null;
        }
        java.lang.Object obj = mo9763xeb27878e != null ? mo9763xeb27878e.get(mo232x1380a922.f398486b) : null;
        java.lang.String str = this.f406063d;
        if (k0Var == null || mo9763xeb27878e == null || obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str != null ? str : "MicroMsg.Mvvm.ReplaceExecutor", "replace table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
            return -1L;
        }
        long m17 = k0Var.m(f0Var.mo9768x88e404c3(), mo232x1380a922.f398486b, mo9763xeb27878e);
        if (m17 > 0 && (eVar = this.f406062c) != null && (cVar = this.f406061b) != null) {
            eVar.m127125x715f39e3(cVar);
        }
        if (m17 > 0) {
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "replace table:" + f0Var.mo9768x88e404c3() + " success primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
            }
        }
        if (m17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str != null ? str : "MicroMsg.Mvvm.ReplaceExecutor", "replace effectRow:" + m17 + " table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
        }
        return m17;
    }
}

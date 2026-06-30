package m75;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l75.f0 f406055a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f406056b;

    /* renamed from: c, reason: collision with root package name */
    public final o75.c f406057c;

    /* renamed from: d, reason: collision with root package name */
    public final o75.e f406058d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f406059e;

    public c(l75.f0 item, boolean z17, o75.c cVar, o75.e eVar, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f406055a = item;
        this.f406056b = z17;
        this.f406057c = cVar;
        this.f406058d = eVar;
        this.f406059e = str;
    }

    public final long a(l75.k0 k0Var) {
        o75.c cVar;
        l75.f0 f0Var = this.f406055a;
        l75.e0 mo232x1380a922 = f0Var.mo232x1380a922();
        android.content.ContentValues mo9763xeb27878e = f0Var.mo9763xeb27878e();
        boolean z17 = true;
        if (!(mo9763xeb27878e.size() > 0)) {
            mo9763xeb27878e = null;
        }
        java.lang.Object obj = mo9763xeb27878e != null ? mo9763xeb27878e.get(mo232x1380a922.f398486b) : null;
        java.lang.String str = this.f406059e;
        if (k0Var == null || mo9763xeb27878e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str != null ? str : "MicroMsg.Mvvm.InsertExecutor", "insert table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
            return -1L;
        }
        long v17 = this.f406056b ? k0Var.v(f0Var.mo9768x88e404c3(), mo232x1380a922.f398486b, mo9763xeb27878e) : k0Var.l(f0Var.mo9768x88e404c3(), mo232x1380a922.f398486b, mo9763xeb27878e);
        if (v17 > 0) {
            f0Var.f72763xa3c65b86 = v17;
            o75.e eVar = this.f406058d;
            if (eVar != null && (cVar = this.f406057c) != null) {
                eVar.m127125x715f39e3(cVar);
            }
        }
        if (v17 > 0) {
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "insert table:" + f0Var.mo9768x88e404c3() + " success primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
            }
        }
        if (v17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str != null ? str : "MicroMsg.Mvvm.InsertExecutor", "insert resultRowId" + v17 + " table:" + f0Var.mo9768x88e404c3() + " fail primaryKey:" + mo232x1380a922.f398486b + " value:" + obj);
        }
        return v17;
    }
}

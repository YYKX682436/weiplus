package ml0;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ml0.b f408717d;

    public a(ml0.b bVar) {
        this.f408717d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f408717d.a()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = this.f408717d.c() != null ? this.f408717d.c() : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.BaseCollector", "%s no working", objArr);
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = this.f408717d.c() != null ? this.f408717d.c() : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.BaseCollector", "%s finish working", objArr2);
        ku5.u0 u0Var = ku5.t0.f394148d;
        ml0.b bVar = this.f408717d;
        java.lang.Runnable runnable = bVar.f408718a;
        long b17 = bVar.b() == 0 ? 1800000L : this.f408717d.b();
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        java.util.Objects.requireNonNull(runnable);
        t0Var.t(runnable, b17, null);
    }
}

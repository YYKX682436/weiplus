package zs1;

/* loaded from: classes7.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zs1.d f556773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556776g;

    public f(zs1.d dVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f556773d = dVar;
        this.f556774e = str;
        this.f556775f = str2;
        this.f556776g = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f556774e;
        zs1.d dVar = this.f556773d;
        java.lang.String str2 = dVar.f556769a;
        nu4.b bVar = nu4.b0.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2 t2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175978a;
        ts1.o oVar = new ts1.o(str2, str, bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t2.f175981d, null, null, null, null, false, null, null, 2032, null);
        ws1.d.a(t2Var.c(dVar.f556769a, oVar), new zs1.e(this.f556775f, this.f556776g, oVar));
    }
}

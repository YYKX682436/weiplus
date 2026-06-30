package at0;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f13578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at0.n f13579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f13580f;

    public g(kotlin.jvm.internal.h0 h0Var, at0.n nVar, yz5.l lVar) {
        this.f13578d = h0Var;
        this.f13579e = nVar;
        this.f13580f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!((ct0.b) this.f13578d.f310123d).a()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 151L, 1L, false);
            ht0.b bVar = this.f13579e.f13595c;
            if (bVar != null) {
                bVar.cancel();
            }
        }
        if (!((ct0.b) this.f13578d.f310123d).b()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(985L, 152L, 1L, false);
            ht0.b bVar2 = this.f13579e.f13596d;
            if (bVar2 != null) {
                bVar2.cancel();
            }
        }
        this.f13579e.f13608p = true;
        yz5.l lVar = this.f13580f;
        if (lVar != null) {
            lVar.invoke(this.f13578d.f310123d);
        }
    }
}

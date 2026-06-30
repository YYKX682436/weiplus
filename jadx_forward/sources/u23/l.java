package u23;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u23.n f505626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f505627e;

    public l(u23.n nVar, java.util.List list) {
        this.f505626d = nVar;
        this.f505627e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u23.o oVar = this.f505626d.f505631b;
        if (oVar != null) {
            oVar.b(this.f505627e, true);
        }
    }
}

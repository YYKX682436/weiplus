package u23;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u23.n f505628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f505629e;

    public m(u23.n nVar, java.util.List list) {
        this.f505628d = nVar;
        this.f505629e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u23.o oVar = this.f505628d.f505631b;
        if (oVar != null) {
            oVar.b(this.f505629e, false);
        }
    }
}

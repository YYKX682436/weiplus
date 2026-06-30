package k71;

/* loaded from: classes14.dex */
public final class i implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f386221d;

    public i(java.util.List list) {
        this.f386221d = list;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.size() == 0) {
            for (k71.m mVar : this.f386221d) {
                g4Var.a(mVar.f386232d, mVar.f386233e);
            }
        }
    }
}

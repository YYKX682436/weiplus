package aa2;

/* loaded from: classes2.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa2.j f2501d;

    public g(aa2.j jVar) {
        this.f2501d = jVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            aa2.j jVar = this.f2501d;
            g4Var.d(10001, jVar.f434158a.getResources().getColor(com.tencent.mm.R.color.f478532ac), jVar.f434158a.getResources().getString(com.tencent.mm.R.string.cic));
        }
    }
}

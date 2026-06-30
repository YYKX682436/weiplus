package pk2;

/* loaded from: classes3.dex */
public final class p9 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.e9 f437702d;

    public p9(pk2.e9 e9Var) {
        this.f437702d = e9Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        java.util.Iterator it = this.f437702d.f437245a.iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
    }
}

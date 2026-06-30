package pk2;

/* loaded from: classes3.dex */
public final class s8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437775d;

    public s8(pk2.d9 d9Var) {
        this.f437775d = d9Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        java.util.Iterator it = this.f437775d.f437205o.iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
    }
}

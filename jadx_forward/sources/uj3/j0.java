package uj3;

/* loaded from: classes3.dex */
public final class j0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.l0 f509823d;

    public j0(uj3.l0 l0Var) {
        this.f509823d = l0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        java.util.HashSet<uj3.j> hashSet;
        uj3.k kVar = this.f509823d.f509851c;
        if (kVar == null || (hashSet = kVar.f509835b) == null) {
            return;
        }
        for (uj3.j jVar : hashSet) {
            g4Var.d(jVar.f509822b, -1, jVar.f509821a);
        }
    }
}

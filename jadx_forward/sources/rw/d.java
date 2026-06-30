package rw;

/* loaded from: classes.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f482104d;

    public d(java.util.List list) {
        this.f482104d = list;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        int i17 = 0;
        for (java.lang.Object obj : this.f482104d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            g4Var.t(i17, ((rw.a) obj).f482100a, false);
            i17 = i18;
        }
    }
}

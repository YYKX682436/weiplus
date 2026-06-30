package pk2;

/* loaded from: classes3.dex */
public final class j8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437417e;

    public j8(pk2.d9 d9Var, pk2.o9 o9Var) {
        this.f437416d = d9Var;
        this.f437417e = o9Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        android.view.View view;
        pk2.d9 d9Var;
        o25.y1 y1Var;
        pk2.d9 d9Var2 = this.f437416d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = d9Var2.f437194d;
        if (k0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
            pk2.o9 o9Var = this.f437417e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(o9Var, "<this>");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
            if ((c19792x256d2725 != null && hc2.o0.d(c19792x256d2725)) && zl2.r4.f555483a.n(((mm2.c1) o9Var.c(mm2.c1.class)).Q1) && ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = ((mm2.c1) o9Var.c(mm2.c1.class)).f410379n;
                if (!(c19792x256d27252 != null && c19792x256d27252.m76784x5db1b11() == 0) && (d9Var = o9Var.f437615f) != null && (y1Var = d9Var.f437199i) != null) {
                    view = ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).Ai(o9Var.f437611d, g4Var, k0Var, 2, new pk2.cb(o9Var));
                    pk2.d9.a(d9Var2, d9Var2.f437194d, view);
                }
            }
            view = null;
            pk2.d9.a(d9Var2, d9Var2.f437194d, view);
        }
    }
}

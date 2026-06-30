package ni2;

/* loaded from: classes3.dex */
public final class t1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f419003d;

    public t1(ni2.z1 z1Var) {
        this.f419003d = z1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        ni2.z1 z1Var = this.f419003d;
        if (i17 > 0) {
            fg2.p1 p1Var = z1Var.K;
            if (p1Var != null) {
                p1Var.f343776w.animate().translationY(-i65.a.b(z1Var.f199716e, 64)).setDuration(240L).start();
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
        }
        fg2.p1 p1Var2 = z1Var.K;
        if (p1Var2 != null) {
            p1Var2.f343776w.animate().translationY(0.0f).setDuration(240L).start();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
    }
}

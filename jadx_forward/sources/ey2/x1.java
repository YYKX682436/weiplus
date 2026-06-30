package ey2;

/* loaded from: classes2.dex */
public final class x1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.z1 f339100a;

    public x1(ey2.z1 z1Var) {
        this.f339100a = z1Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        ey2.z1 z1Var = this.f339100a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotSessionVM", "enterFindPage isEnable=" + z1Var.f339128h);
        } else if (z1Var.f339128h) {
            if (!z1Var.f339129i) {
                z1Var.T6(1);
                z1Var.S6(z1Var.P6(1));
            }
            z1Var.f339129i = false;
        }
    }
}

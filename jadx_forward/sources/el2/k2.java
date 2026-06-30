package el2;

/* loaded from: classes3.dex */
public final class k2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ el2.r2 f335375a;

    public k2(el2.r2 r2Var) {
        this.f335375a = r2Var;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (z17) {
            el2.r2 r2Var = this.f335375a;
            r2Var.f335432d.postDelayed(new el2.j2(r2Var), 3000L);
        }
    }
}

package dy4;

/* loaded from: classes15.dex */
public final class b1 implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f326143a;

    public b1(dy4.f1 f1Var) {
        this.f326143a = f1Var;
    }

    @Override // sf.e
    public void a(int i17) {
        dy4.f1 f1Var = this.f326143a;
        if (1 != i17) {
            f1Var.y();
            return;
        }
        sf.f fVar = f1Var.F;
        dy4.d dVar = fVar instanceof dy4.d ? (dy4.d) fVar : null;
        nw4.k kVar = dVar != null ? dVar.f326146a : null;
        if (kVar != null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            kVar.f422393a = context;
        }
        dy4.w wVar = f1Var.U;
        if (wVar != null) {
            dy4.d dVar2 = wVar.f326249b;
            nw4.k kVar2 = dVar2 != null ? dVar2.f326146a : null;
            if (kVar2 == null) {
                return;
            }
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            kVar2.f422393a = context2;
        }
    }

    @Override // sf.e
    public void b() {
        r45.n23 n23Var;
        dy4.f1 f1Var = this.f326143a;
        if (f1Var.M) {
            java.lang.String str = f1Var.B;
            if (!(str == null || str.length() == 0) && (n23Var = f1Var.C) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2432x6b0147b.p2433x2f9064ab.p2434xb4097826.u.a(1, n23Var);
            }
        }
        f1Var.M = false;
        f1Var.x();
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f1Var.Y;
        boolean z17 = atomicBoolean != null ? atomicBoolean.get() : false;
        f1Var.Y = null;
        if (f1Var.f326160n != null && f1Var.f326168u && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f1Var.x(), "handleWebViewForeground runnable, video playing when enter background");
            f1Var.A(false, false);
        }
    }

    @Override // sf.e
    /* renamed from: onDestroy */
    public void mo10362xac79a11b() {
        this.f326143a.C();
    }
}

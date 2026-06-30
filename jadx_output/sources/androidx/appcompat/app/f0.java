package androidx.appcompat.app;

/* loaded from: classes15.dex */
public final class f0 implements o.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g0 f9104d;

    public f0(androidx.appcompat.app.g0 g0Var) {
        this.f9104d = g0Var;
    }

    @Override // o.f0
    public void a(o.r rVar, boolean z17) {
        androidx.appcompat.app.e0 e0Var;
        o.r k17 = rVar.k();
        int i17 = 0;
        boolean z18 = k17 != rVar;
        if (z18) {
            rVar = k17;
        }
        androidx.appcompat.app.g0 g0Var = this.f9104d;
        androidx.appcompat.app.e0[] e0VarArr = g0Var.I;
        int length = e0VarArr != null ? e0VarArr.length : 0;
        while (true) {
            if (i17 < length) {
                e0Var = e0VarArr[i17];
                if (e0Var != null && e0Var.f9093h == rVar) {
                    break;
                } else {
                    i17++;
                }
            } else {
                e0Var = null;
                break;
            }
        }
        if (e0Var != null) {
            if (!z18) {
                g0Var.l(e0Var, z17);
            } else {
                g0Var.j(e0Var.f9086a, e0Var, k17);
                g0Var.l(e0Var, true);
            }
        }
    }

    @Override // o.f0
    public boolean c(o.r rVar) {
        android.view.Window.Callback r17;
        if (rVar != null) {
            return true;
        }
        androidx.appcompat.app.g0 g0Var = this.f9104d;
        if (!g0Var.C || (r17 = g0Var.r()) == null || g0Var.L) {
            return true;
        }
        r17.onMenuOpened(108, rVar);
        return true;
    }
}

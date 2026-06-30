package k13;

/* loaded from: classes10.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f384766d;

    public l0(k13.l1 l1Var) {
        this.f384766d = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k13.l1 l1Var = this.f384766d;
        if (((android.app.KeyguardManager) ((jz5.n) l1Var.f384776u).mo141623x754a37bb()).inKeyguardRestrictedInputMode()) {
            l1Var.s();
        } else {
            k13.l1 l1Var2 = this.f384766d;
            i50.r.a(l1Var2, l1Var2.F, 100L, null, 4, null);
        }
    }
}

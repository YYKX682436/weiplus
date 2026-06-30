package sz4;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.e0 f495722d;

    public d0(sz4.e0 e0Var) {
        this.f495722d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        sz4.e0 e0Var = this.f495722d;
        if (e0Var.f495725d.f377646k != 0) {
            int i17 = e0Var.f495727f.f495728f.m74973x9925e2d6().f414883d;
            if (i17 == e0Var.f495725d.f377688t.length()) {
                e0Var.f495727f.f495728f.x();
                e0Var.f495727f.f495728f.getText().append((java.lang.CharSequence) "\n");
                e0Var.f495727f.f495728f.C();
                e0Var.f495727f.f495728f.setSelection(i17);
            }
            iz4.i iVar = e0Var.f495725d;
            iVar.f377646k = 0;
            int i18 = iVar.f377647l;
            if (i18 == 1) {
                e0Var.f495727f.f495728f.u(oz4.w.f431851d, java.lang.Boolean.TRUE);
            } else if (i18 == 3) {
                e0Var.f495727f.f495728f.u(oz4.w.f431850c, java.lang.Boolean.TRUE);
            } else if (i18 == 2) {
                e0Var.f495727f.f495728f.u(oz4.w.f431852e, java.lang.Boolean.TRUE);
            }
        }
    }
}

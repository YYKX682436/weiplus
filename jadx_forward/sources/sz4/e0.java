package sz4;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iz4.i f495725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f495726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sz4.f0 f495727f;

    public e0(sz4.f0 f0Var, iz4.i iVar, android.os.Bundle bundle) {
        this.f495727f = f0Var;
        this.f495725d = iVar;
        this.f495726e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        sz4.f0 f0Var = this.f495727f;
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a = f0Var.f495728f;
        iz4.i iVar = this.f495725d;
        c19515x154ec45a.m74978xe08d546d(iVar.f377688t);
        f0Var.f495728f.x();
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a2 = f0Var.f495728f;
        synchronized (c19515x154ec45a2) {
            c19515x154ec45a2.f269653v = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a3 = f0Var.f495728f;
        le0.r rVar = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272726c;
        int i17 = f0Var.f495715d.f414842q;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.q(c19515x154ec45a3, this.f495726e, rVar, i17 == 2 ? 9 : i17 == 1 ? 8 : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a4 = f0Var.f495728f;
        synchronized (c19515x154ec45a4) {
            c19515x154ec45a4.f269653v = false;
        }
        f0Var.f495728f.C();
        if (iVar.f377637b) {
            int i18 = iVar.f377638c;
            if (i18 == -1 || i18 >= f0Var.f495728f.getText().toString().length()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a5 = f0Var.f495728f;
                c19515x154ec45a5.setSelection(c19515x154ec45a5.getText().toString().length());
            } else {
                f0Var.f495728f.setSelection(iVar.f377638c);
            }
            f0Var.f495728f.requestFocus();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new sz4.d0(this), 500L);
        } else if (f0Var.f495728f.hasFocus()) {
            f0Var.f495728f.clearFocus();
        }
        if (iVar.f377645j) {
            iVar.f377645j = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2447x633fb29.p2448xb9121c89.p2449x31c90fad.C19515x154ec45a c19515x154ec45a6 = f0Var.f495728f;
            c19515x154ec45a6.D = true;
            c19515x154ec45a6.onTextContextMenuItem(android.R.id.paste);
        }
    }
}

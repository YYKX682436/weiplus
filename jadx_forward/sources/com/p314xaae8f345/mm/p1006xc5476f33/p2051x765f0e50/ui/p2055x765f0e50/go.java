package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class go implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f242616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f242618f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ho f242619g;

    public go(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ho hoVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f242619g = hoVar;
        this.f242616d = m1Var;
        this.f242617e = i17;
        this.f242618f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ho hoVar = this.f242619g;
        d17.q(255, hoVar.f242654d.f242281q);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = hoVar.f242654d;
        activityC17477x76962617.f242281q = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC17477x76962617.f242279o;
        if (b4Var != null) {
            b4Var.d();
            hoVar.f242654d.f242279o = null;
        }
        android.app.ProgressDialog progressDialog = hoVar.f242654d.f242275h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f242616d;
        if (m1Var.mo808xfb85f7b0() == 255 && ((com.p314xaae8f345.mm.p957x53236a1b.w0) m1Var).f152977f == 2) {
            if (this.f242617e != -3 || this.f242618f != 4) {
                hoVar.f242654d.Y6();
                return;
            }
            android.content.Intent intent = new android.content.Intent(hoVar.f242654d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
            intent.putExtra("kintent_hint", hoVar.f242654d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hx9));
            hoVar.f242654d.startActivityForResult(intent, 5);
        }
    }
}

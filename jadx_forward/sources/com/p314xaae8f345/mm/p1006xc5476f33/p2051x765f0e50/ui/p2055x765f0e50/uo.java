package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes11.dex */
public class uo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.m1 f243152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f243153e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f243154f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vo f243155g;

    public uo(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vo voVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var, int i17, int i18) {
        this.f243155g = voVar;
        this.f243152d = m1Var;
        this.f243153e = i17;
        this.f243154f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.vo voVar = this.f243155g;
        d17.q(255, voVar.f243209d.f242281q);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17477x76962617 activityC17477x76962617 = voVar.f243209d;
        activityC17477x76962617.f242281q = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = activityC17477x76962617.f242279o;
        if (b4Var != null) {
            b4Var.d();
            voVar.f243209d.f242279o = null;
        }
        android.app.ProgressDialog progressDialog = voVar.f243209d.f242275h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = this.f243152d;
        if (m1Var.mo808xfb85f7b0() == 255 && ((com.p314xaae8f345.mm.p957x53236a1b.w0) m1Var).f152977f == 1) {
            if (this.f243153e != -3 || this.f243154f != 4) {
                voVar.f243209d.a7(true);
                return;
            }
            android.content.Intent intent = new android.content.Intent(voVar.f243209d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
            intent.putExtra("kintent_hint", voVar.f243209d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hx9));
            voVar.f243209d.startActivityForResult(intent, 0);
        }
    }
}

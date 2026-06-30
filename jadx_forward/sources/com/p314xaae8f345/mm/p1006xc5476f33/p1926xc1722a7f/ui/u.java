package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes14.dex */
public class u implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.w f233753d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.w wVar) {
        this.f233753d = wVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.w wVar = this.f233753d;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a = wVar.f233755d;
            activityC16724xf2604f0a.f233629p = 4;
            activityC16724xf2604f0a.f233628o = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(wVar.f233755d.f233629p));
            wVar.f233755d.U6();
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a2 = wVar.f233755d;
            activityC16724xf2604f0a2.f233629p = 3;
            activityC16724xf2604f0a2.f233628o = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(wVar.f233755d.f233629p));
            wVar.f233755d.U6();
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a3 = wVar.f233755d;
            activityC16724xf2604f0a3.f233629p = 1;
            activityC16724xf2604f0a3.f233628o = false;
            gm0.j1.u().c().w(16386, java.lang.Integer.valueOf(wVar.f233755d.f233629p));
            wVar.f233755d.U6();
            return;
        }
        if (i17 == 3) {
            android.content.Intent intent = new android.content.Intent(wVar.f233755d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff.class);
            intent.putExtra("k_say_hi_type", 2);
            wVar.f233755d.startActivityForResult(intent, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46348x908ed654);
        } else {
            if (i17 != 4) {
                return;
            }
            wVar.f233755d.f233624h = new an3.f(2, 0.0f, 0.0f, 0, 0, "", "");
            gm0.j1.d().g(wVar.f233755d.f233624h);
            com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16724xf2604f0a activityC16724xf2604f0a4 = wVar.f233755d;
            activityC16724xf2604f0a4.f233620d = db5.e1.Q(activityC16724xf2604f0a4.mo55332x76847179(), wVar.f233755d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), wVar.f233755d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5z), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.t(this));
        }
    }
}

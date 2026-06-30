package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes8.dex */
public class t0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1 f233752d;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1 activityC16725xc15abea1) {
        this.f233752d = activityC16725xc15abea1;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1 activityC16725xc15abea1 = this.f233752d;
        if (activityC16725xc15abea1.f233642e != -1) {
            c01.fb a17 = c01.fb.a();
            a17.f118721b = activityC16725xc15abea1.f233642e;
            c01.fb.e(a17);
        }
        c01.fb b17 = c01.fb.b();
        if (b17 == null) {
            db5.e1.m(activityC16725xc15abea1.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.h78, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.v0(activityC16725xc15abea1));
        } else {
            java.lang.String d17 = b17.d();
            if (d17 == null) {
                d17 = "";
            }
            b17.c();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            int i17 = b17.f118721b;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || i17 == 0) {
                db5.e1.m(activityC16725xc15abea1.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.h78, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.v0(activityC16725xc15abea1));
            } else {
                m25.a.a(activityC16725xc15abea1.mo55332x76847179(), new android.content.Intent());
                c01.fb a18 = c01.fb.a();
                if (i17 != -1) {
                    a18.f118721b = i17;
                }
                ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(1, c01.fb.e(a18)));
                activityC16725xc15abea1.finish();
            }
        }
        return true;
    }
}

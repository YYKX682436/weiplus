package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q2 f182575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f182576e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 f182577f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f182578g;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q2 q2Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 o1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f182575d = q2Var;
        this.f182576e = i17;
        this.f182577f = o1Var;
        this.f182578g = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.q2 q2Var = this.f182575d;
        if (q2Var.f182590i) {
            int i17 = q2Var.f182599u;
            int i18 = this.f182576e;
            if (i17 == i18) {
                q2Var.f182590i = false;
                q2Var.f182589h = true;
                q2Var.f182592n = i18;
                q2Var.f182593o = i18;
                q2Var.f182594p = kz5.r0.f395535d;
                q2Var.f182591m = !com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.d1.f182441a.d(this.f182577f.f182569b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwipeMultiSelectTouchListener", "========== START (LONG PRESS) ==========");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Start=");
                sb6.append(i18);
                sb6.append(", Mode=");
                sb6.append(q2Var.f182591m ? "SELECT" : "DESELECT");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SwipeMultiSelectTouchListener", sb6.toString());
                android.view.ViewParent parent = this.f182578g.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                q2Var.f();
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes11.dex */
public class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff f233758d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff) {
        this.f233758d = activityC16726x80180cff;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        gm0.j1.b().c();
        xg3.c0 Zi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16726x80180cff activityC16726x80180cff = this.f233758d;
        ((com.p314xaae8f345.mm.p2621x8fb0427b.u8) Zi).y0(java.lang.String.valueOf(activityC16726x80180cff.f233654r));
        activityC16726x80180cff.f233644e.f();
        int i18 = activityC16726x80180cff.f233647h;
        if (i18 > 0) {
            activityC16726x80180cff.f233647h = i18 - 1;
        }
        if (activityC16726x80180cff.f233647h == 0) {
            android.widget.TextView textView = (android.widget.TextView) activityC16726x80180cff.findViewById(com.p314xaae8f345.mm.R.id.dfo);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.i8k);
            textView.setVisibility(0);
            activityC16726x80180cff.m78501x43e00957(false);
        }
    }
}

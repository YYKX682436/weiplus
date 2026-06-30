package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class i2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230878a;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230878a = activityC16554x70dcab5d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void a() {
        di3.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230878a;
        if (activityC16554x70dcab5d.f230764g == 0 || (nVar = activityC16554x70dcab5d.f230766i) == null) {
            return;
        }
        nVar.q(true, false, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void b() {
        di3.n nVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230878a;
        if (activityC16554x70dcab5d.f230764g == 0 || (nVar = activityC16554x70dcab5d.f230766i) == null) {
            return;
        }
        nVar.q(false, false, 1);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void c(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.p1876xea0e606f.C16557x646260ab c16557x646260ab;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230878a;
        int i17 = activityC16554x70dcab5d.f230764g;
        if (i17 == 0 || i17 == 3 || i17 == 4 || (c16557x646260ab = activityC16554x70dcab5d.C) == null) {
            return;
        }
        di3.n nVar = activityC16554x70dcab5d.f230766i;
        int width = c16557x646260ab.getWidth();
        int height = activityC16554x70dcab5d.C.getHeight();
        if (fp.h.a(14)) {
            nVar.getClass();
        } else {
            di3.m mVar = nVar.P;
            mVar.mo50303x856b99f0(4354);
            mVar.f314264b = f17;
            mVar.f314265c = f18;
            mVar.f314266d = width;
            mVar.f314267e = height;
            mVar.mo50311x7ab51103(mVar.mo50292x733c63a2(4354, nVar.f314274h), 400L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e c16545x39e5705e = activityC16554x70dcab5d.f230787z;
        if (c16545x39e5705e == null) {
            return;
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c16545x39e5705e.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e c16545x39e5705e2 = activityC16554x70dcab5d.f230787z;
        layoutParams.leftMargin = ((int) f17) - (c16545x39e5705e2.f230656i / 2);
        layoutParams.topMargin = ((int) f18) - (c16545x39e5705e2.f230657m / 2);
        c16545x39e5705e2.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16545x39e5705e c16545x39e5705e3 = activityC16554x70dcab5d.f230787z;
        c16545x39e5705e3.setVisibility(0);
        c16545x39e5705e3.f230652e = true;
        c16545x39e5705e3.f230653f = false;
        c16545x39e5705e3.f230654g = false;
        c16545x39e5705e3.f230655h = java.lang.System.currentTimeMillis();
        c16545x39e5705e3.invalidate();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.u
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230878a;
        if (activityC16554x70dcab5d.f230764g == 0 || activityC16554x70dcab5d.f230785y0 <= 1) {
            return;
        }
        activityC16554x70dcab5d.f230766i.P.mo50303x856b99f0(4354);
        activityC16554x70dcab5d.g7();
    }
}

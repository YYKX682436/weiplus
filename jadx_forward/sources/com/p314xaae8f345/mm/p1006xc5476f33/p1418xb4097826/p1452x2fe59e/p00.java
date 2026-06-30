package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class p00 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 f190224e;

    public p00(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v00 v00Var) {
        this.f190223d = c1163xf1deaba4;
        this.f190224e = v00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.n2 m7949x5701d990;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190223d;
        int childCount = c1163xf1deaba4.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            c1163xf1deaba4.getChildAt(i17).setTranslationY(0.0f);
        }
        this.f190224e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.TimelineViewCallback", "checkResetItemAnimator: " + c1163xf1deaba4.m7949x5701d990() + ' ');
        if ((c1163xf1deaba4.m7949x5701d990() instanceof tb2.h) && (m7949x5701d990 = c1163xf1deaba4.m7949x5701d990()) != null) {
            m7949x5701d990.k();
        }
        c1163xf1deaba4.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
    }
}

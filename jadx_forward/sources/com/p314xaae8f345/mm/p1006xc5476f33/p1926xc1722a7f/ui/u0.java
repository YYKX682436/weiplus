package com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui;

/* loaded from: classes8.dex */
public class u0 implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1 f233754a;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1 activityC16725xc15abea1) {
        this.f233754a = activityC16725xc15abea1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        boolean equalsIgnoreCase = "male".equalsIgnoreCase(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1926xc1722a7f.ui.ActivityC16725xc15abea1 activityC16725xc15abea1 = this.f233754a;
        if (equalsIgnoreCase) {
            activityC16725xc15abea1.f233642e = 1;
            return false;
        }
        if (!"female".equalsIgnoreCase(str)) {
            return false;
        }
        activityC16725xc15abea1.f233642e = 2;
        return false;
    }
}

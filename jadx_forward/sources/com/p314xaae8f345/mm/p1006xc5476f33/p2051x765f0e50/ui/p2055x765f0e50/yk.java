package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes8.dex */
public class yk implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e f243324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17453xf4ad1945 f243326c;

    public yk(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17453xf4ad1945 activityC17453xf4ad1945, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21575x1b6b730e c21575x1b6b730e, java.lang.String str) {
        this.f243326c = activityC17453xf4ad1945;
        this.f243324a = c21575x1b6b730e;
        this.f243325b = str;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        java.lang.String str;
        r45.fs3 fs3Var = (r45.fs3) obj;
        boolean z17 = fs3Var.f456119e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17453xf4ad1945 activityC17453xf4ad1945 = this.f243326c;
        if (z17) {
            str = activityC17453xf4ad1945.getString(com.p314xaae8f345.mm.R.C30867xcad56011.isy);
        } else if (fs3Var.f456118d > 0) {
            str = fs3Var.f456118d + " " + activityC17453xf4ad1945.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j1_);
        } else {
            str = "";
        }
        this.f243324a.H(str);
        if (str.equals(this.f243325b)) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = activityC17453xf4ad1945.f242135g;
        if (rVar instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
        }
    }
}

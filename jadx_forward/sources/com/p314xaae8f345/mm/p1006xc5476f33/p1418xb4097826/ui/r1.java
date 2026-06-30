package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes10.dex */
public final class r1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f211293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 f211294e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f211295f;

    public r1(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 activityC15014x7ce71a81, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        this.f211293d = i17;
        this.f211294e = activityC15014x7ce71a81;
        this.f211295f = f2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.uj0 uj0Var;
        int i18 = this.f211293d;
        if (i18 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15014x7ce71a81 activityC15014x7ce71a81 = this.f211294e;
            if (i18 >= activityC15014x7ce71a81.f210057v.size() || (uj0Var = activityC15014x7ce71a81.f210059x) == null) {
                return;
            }
            uj0Var.d(((so2.i0) activityC15014x7ce71a81.f210057v.get(i18)).f491948d, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.q1(activityC15014x7ce71a81, i18, this.f211295f));
        }
    }
}

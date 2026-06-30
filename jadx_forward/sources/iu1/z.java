package iu1;

/* loaded from: classes9.dex */
public final class z implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xt f376513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 f376514e;

    public z(r45.xt xtVar, com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v2.ActivityC13064xaf775f76 activityC13064xaf775f76) {
        this.f376513d = xtVar;
        this.f376514e = activityC13064xaf775f76;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            r45.xt xtVar = this.f376513d;
            int i18 = xtVar.f471918e;
            if (i18 == 1) {
                lu1.d.j(this.f376514e, xtVar.f471919f, 0);
            } else {
                if (i18 != 2) {
                    return;
                }
                r45.iu iuVar = xtVar.f471920g;
                lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
            }
        }
    }
}

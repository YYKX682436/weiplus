package ju1;

/* loaded from: classes9.dex */
public final class w0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383333d;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76) {
        this.f383333d = activityC13077xb3b83e76;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        r45.iu iuVar;
        r45.xt xtVar = (r45.xt) obj;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76.f176955r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76 = this.f383333d;
        activityC13077xb3b83e76.getClass();
        if (xtVar != null) {
            int i18 = xtVar.f471918e;
            if (i18 != 1) {
                if (i18 == 2 && (iuVar = xtVar.f471920g) != null) {
                    lu1.d.f(iuVar.f458861d, iuVar.f458862e, iuVar.f458863f);
                    return;
                }
                return;
            }
            java.lang.String str = xtVar.f471919f;
            if (str != null) {
                lu1.d.j(activityC13077xb3b83e76, str, 0);
            }
        }
    }
}

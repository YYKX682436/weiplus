package hr3;

/* loaded from: classes11.dex */
public class fc implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d f365084a;

    public fc(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d) {
        this.f365084a = activityC16864x5bbaf71d;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
        am.jw jwVar = c6082xbd84dd0a.f136360g;
        jwVar.getClass();
        jwVar.f88635a = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16864x5bbaf71d activityC16864x5bbaf71d = this.f365084a;
        jwVar.f88636b = activityC16864x5bbaf71d.f235300o;
        c6082xbd84dd0a.e();
        if (activityC16864x5bbaf71d.f235301p.x2()) {
            c01.e2.x0(activityC16864x5bbaf71d.f235301p, false, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16864x5bbaf71d.getIntent(), 21, 2, activityC16864x5bbaf71d.f235300o);
            activityC16864x5bbaf71d.V6(false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16864x5bbaf71d.getIntent(), 21, 3, activityC16864x5bbaf71d.f235300o);
            c01.e2.x0(activityC16864x5bbaf71d.f235301p, true, true);
            activityC16864x5bbaf71d.V6(true);
        }
        activityC16864x5bbaf71d.X6();
    }
}

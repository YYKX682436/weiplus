package hr3;

/* loaded from: classes11.dex */
public class zb implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f365773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 f365774b;

    public zb(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5, boolean z17) {
        this.f365774b = activityC16863xc0e4ffb5;
        this.f365773a = z17;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        android.content.res.Resources resources;
        int i17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a c6082xbd84dd0a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6082xbd84dd0a();
        am.jw jwVar = c6082xbd84dd0a.f136360g;
        jwVar.getClass();
        jwVar.f88635a = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5 = this.f365774b;
        jwVar.f88636b = activityC16863xc0e4ffb5.f235282n;
        c6082xbd84dd0a.e();
        boolean x27 = activityC16863xc0e4ffb5.f235283o.x2();
        boolean z18 = this.f365773a;
        if (x27) {
            c01.e2.x0(activityC16863xc0e4ffb5.f235283o, false, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16863xc0e4ffb5.getIntent(), z18 ? 12 : 21, 2, activityC16863xc0e4ffb5.f235282n);
            activityC16863xc0e4ffb5.V6(false);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16863xc0e4ffb5.getIntent(), z18 ? 12 : 21, 3, activityC16863xc0e4ffb5.f235282n);
            c01.e2.x0(activityC16863xc0e4ffb5.f235283o, true, true);
            activityC16863xc0e4ffb5.V6(true);
        }
        activityC16863xc0e4ffb5.W6();
        ir3.e eVar = (ir3.e) pf5.z.f435481a.a(activityC16863xc0e4ffb5).a(ir3.e.class);
        if (z17) {
            resources = activityC16863xc0e4ffb5.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.i8l;
        } else {
            resources = activityC16863xc0e4ffb5.getResources();
            i17 = com.p314xaae8f345.mm.R.C30867xcad56011.i8m;
        }
        eVar.m42291x53d8522f("not_allow_see_sns_permission_cb_key", resources.getString(i17));
    }
}

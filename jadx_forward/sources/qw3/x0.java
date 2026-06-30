package qw3;

/* loaded from: classes9.dex */
public class x0 implements com.p314xaae8f345.mm.p2802xd031a825.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448755a;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7) {
        this.f448755a = activityC17105xa1fb9be7;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
    /* renamed from: onVisibleStateChange */
    public void mo26891xca4e600e(boolean z17) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7 = this.f448755a;
        if (!z17) {
            activityC17105xa1fb9be7.f238051i.scrollTo(0, 0);
            return;
        }
        if (activityC17105xa1fb9be7.f238051i != null) {
            int[] iArr = new int[2];
            activityC17105xa1fb9be7.f238058s.getLocationInWindow(iArr);
            int k17 = (i65.a.k(activityC17105xa1fb9be7) - (iArr[1] + activityC17105xa1fb9be7.f238058s.getHeight())) - i65.a.b(activityC17105xa1fb9be7, 30);
            if (k17 <= 0 || k17 >= (i17 = activityC17105xa1fb9be7.f238047e)) {
                return;
            }
            activityC17105xa1fb9be7.f238051i.post(new qw3.s0(activityC17105xa1fb9be7, i17 - k17));
        }
    }
}

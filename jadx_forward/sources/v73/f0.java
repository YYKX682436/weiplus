package v73;

/* loaded from: classes9.dex */
public class f0 implements com.p314xaae8f345.mm.p2802xd031a825.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 f515221a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82) {
        this.f515221a = activityC16101x10c7b82;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
    /* renamed from: onVisibleStateChange */
    public void mo26891xca4e600e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82 = this.f515221a;
        if (z17) {
            activityC16101x10c7b82.m83123x97a0486(activityC16101x10c7b82.f223849f, activityC16101x10c7b82.f223854n, 10);
            return;
        }
        activityC16101x10c7b82.f223849f.scrollTo(0, 0);
        activityC16101x10c7b82.f223850g.e();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16101x10c7b82.f223850g.m83183xfb85ada3())) {
            activityC16101x10c7b82.f223850g.setVisibility(8);
            activityC16101x10c7b82.f223855o.setVisibility(0);
            activityC16101x10c7b82.W6(false);
            activityC16101x10c7b82.X6(false);
        }
    }
}

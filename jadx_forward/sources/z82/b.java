package z82;

/* loaded from: classes9.dex */
public class b implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d f552255d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d activityC13629xedc2457d) {
        this.f552255d = activityC13629xedc2457d;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1417x3ea1c99c.ui.ActivityC13629xedc2457d activityC13629xedc2457d = this.f552255d;
        if (activityC13629xedc2457d.getWindow() != null && activityC13629xedc2457d.getWindow().getDecorView() != null && activityC13629xedc2457d.getWindow().getDecorView().getWindowToken() != null) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.k(activityC13629xedc2457d, activityC13629xedc2457d.f183217f, activityC13629xedc2457d.f183219h.f32865xc3c3c505, new z82.a(this)).a();
            return false;
        }
        int i17 = activityC13629xedc2457d.f183221m;
        if (i17 >= 10) {
            return false;
        }
        activityC13629xedc2457d.f183221m = i17 + 1;
        return true;
    }
}

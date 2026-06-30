package h71;

/* loaded from: classes.dex */
public class h0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a f360925d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a) {
        this.f360925d = activityC11395xb9d37a9a;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11395xb9d37a9a activityC11395xb9d37a9a = this.f360925d;
        int intValue = ((java.lang.Integer) activityC11395xb9d37a9a.f154769g.getTag()).intValue();
        if (intValue <= 1) {
            activityC11395xb9d37a9a.f154771i.setVisibility(0);
            activityC11395xb9d37a9a.f154769g.setVisibility(8);
            return false;
        }
        int i17 = intValue - 1;
        activityC11395xb9d37a9a.f154769g.setTag(java.lang.Integer.valueOf(i17));
        activityC11395xb9d37a9a.f154769g.setText(activityC11395xb9d37a9a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574445i80, java.lang.Integer.valueOf(i17)));
        if (activityC11395xb9d37a9a.f154769g.getVisibility() != 0) {
            activityC11395xb9d37a9a.f154769g.setVisibility(0);
        }
        return true;
    }
}

package dk5;

/* loaded from: classes9.dex */
public class e3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316136b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk5.p7 f316137c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316138d;

    public e3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, java.lang.String str, android.view.View view, dk5.p7 p7Var) {
        this.f316138d = activityC22571x51759e93;
        this.f316135a = str;
        this.f316136b = view;
        this.f316137c = p7Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316138d;
        if (z17) {
            java.lang.String str2 = this.f316135a;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
                activityC22571x51759e93.W7();
            } else {
                int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
                activityC22571x51759e93.X7(str2);
            }
        }
        activityC22571x51759e93.mo48674x36654fab();
        java.lang.Object tag = this.f316136b.getTag(com.p314xaae8f345.mm.R.id.a0m);
        this.f316137c.b(z17, str, i17, tag == null ? false : ((java.lang.Boolean) tag).booleanValue());
    }
}

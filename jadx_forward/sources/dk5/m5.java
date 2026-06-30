package dk5;

/* loaded from: classes9.dex */
public class m5 implements zy2.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11292x2902f812 f316267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 f316268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316269c;

    public m5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11292x2902f812 c11292x2902f812, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5) {
        this.f316269c = activityC22573x19a79d99;
        this.f316267a = c11292x2902f812;
        this.f316268b = c11295xb9c370e5;
    }

    public void a(int i17, int i18, java.lang.Object obj) {
        int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316269c;
        activityC22573x19a79d99.a7();
        if (activityC22573x19a79d99.f292568x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus cancelled");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus getFinderContact errType: %s, errCode: %s, ret: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), obj);
        if (i17 != 0 || i18 != 0 || !(obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa)) {
            this.f316269c.c7(this.f316268b, null, null, true, "");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageWrapperUI", "handleSendStatus getFinderContact success username: %s nickName:%s", c19782x23db1cfa.m76197x6c03c64c(), c19782x23db1cfa.m76184x8010e5e4());
        java.lang.String m76197x6c03c64c = c19782x23db1cfa.m76197x6c03c64c();
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11292x2902f812 c11292x2902f812 = this.f316267a;
        c11292x2902f812.f33212xf02988d6 = m76197x6c03c64c;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5 c11295xb9c370e5 = this.f316268b;
        c11295xb9c370e5.f33221x30e70dad = c11292x2902f812;
        activityC22573x19a79d99.c7(c11295xb9c370e5, null, c19782x23db1cfa.m76175x6d346f39(), false, c19782x23db1cfa.m76184x8010e5e4());
    }
}

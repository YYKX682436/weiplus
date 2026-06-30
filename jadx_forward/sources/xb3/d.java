package xb3;

/* loaded from: classes9.dex */
public class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f534429a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff f534430b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff activityC16334x8c51adff, java.lang.String str) {
        this.f534430b = activityC16334x8c51adff;
        this.f534429a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail: errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff activityC16334x8c51adff = this.f534430b;
        if (i17 != 0 || fVar.f152149b != 0) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff.f226665m;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(fVar.f152150c)) {
                str = fVar.f152150c;
            }
            db5.e1.T(activityC16334x8c51adff.mo55332x76847179(), str);
            activityC16334x8c51adff.finish();
            return null;
        }
        r45.p43 p43Var = (r45.p43) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail: retcode: %s, retmsg: %s", java.lang.Integer.valueOf(p43Var.f464260d), p43Var.f464261e);
        if (p43Var.f464260d != 0) {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff.f226665m;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(p43Var.f464261e)) {
                str2 = p43Var.f464261e;
            }
            db5.e1.T(activityC16334x8c51adff.mo55332x76847179(), str2);
            activityC16334x8c51adff.finish();
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.e1 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.g5.e(p43Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522 c16337xbe204522 = new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.C16337xbe204522();
        c16337xbe204522.f226689g = p43Var.I;
        c16337xbe204522.f226688f = p43Var.H;
        activityC16334x8c51adff.getIntent().putExtra("key_emoji_switch", c16337xbe204522);
        gb3.l.b(this.f534429a, e17);
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.hk.ui.ActivityC16334x8c51adff.f226665m;
        activityC16334x8c51adff.V6(false);
        return null;
    }
}

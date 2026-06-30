package it3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f376095e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2, java.lang.String str) {
        this.f376094d = activityC16983x775783e2;
        this.f376095e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376094d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16983x775783e2.f237157s;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        activityC16983x775783e2.f237157s = null;
        java.lang.String str = this.f376095e;
        if (!(str.length() > 0)) {
            activityC16983x775783e2.X6();
            return;
        }
        r45.ic4 ic4Var = new r45.ic4();
        ic4Var.set(0, str);
        it3.a aVar = activityC16983x775783e2.f237151m;
        ic4Var.set(1, aVar != null ? aVar.m139853x8d8bdf40() : null);
        r45.cb4 cb4Var = new r45.cb4();
        cb4Var.set(0, java.lang.Float.valueOf(new java.math.BigDecimal(((float) activityC16983x775783e2.f237154p) / 1000.0f).setScale(3, 4).floatValue()));
        cb4Var.set(1, java.lang.Float.valueOf(new java.math.BigDecimal(((float) (activityC16983x775783e2.f237155q - activityC16983x775783e2.f237154p)) / 1000.0f).setScale(3, 4).floatValue()));
        ic4Var.set(2, cb4Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[callBack] thumbUrl:");
        sb6.append(ic4Var.m75945x2fec8307(0));
        sb6.append(" range:[");
        r45.cb4 cb4Var2 = (r45.cb4) ic4Var.m75936x14adae67(2);
        sb6.append(cb4Var2 != null ? java.lang.Float.valueOf(cb4Var2.m75938x746dc8a6(0)) : null);
        sb6.append(", ");
        r45.cb4 cb4Var3 = (r45.cb4) ic4Var.m75936x14adae67(2);
        sb6.append(cb4Var3 != null ? java.lang.Float.valueOf(cb4Var3.m75938x746dc8a6(1)) : null);
        sb6.append("] rect:[");
        r45.bb4 bb4Var = (r45.bb4) ic4Var.m75936x14adae67(1);
        sb6.append(bb4Var != null ? java.lang.Float.valueOf(bb4Var.m75938x746dc8a6(0)) : null);
        sb6.append(", ");
        r45.bb4 bb4Var2 = (r45.bb4) ic4Var.m75936x14adae67(1);
        sb6.append(bb4Var2 != null ? java.lang.Float.valueOf(bb4Var2.m75938x746dc8a6(1)) : null);
        sb6.append(", ");
        r45.bb4 bb4Var3 = (r45.bb4) ic4Var.m75936x14adae67(1);
        sb6.append(bb4Var3 != null ? java.lang.Float.valueOf(bb4Var3.m75938x746dc8a6(2)) : null);
        sb6.append(',');
        r45.bb4 bb4Var4 = (r45.bb4) ic4Var.m75936x14adae67(1);
        sb6.append(bb4Var4 != null ? java.lang.Float.valueOf(bb4Var4.m75938x746dc8a6(3)) : null);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", sb6.toString());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Rk(ic4Var);
        activityC16983x775783e2.finish();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes.dex */
public final class a2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public long f239872d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f239873e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f239872d = c01.z1.i();
        this.f239873e = new java.util.HashMap();
    }

    public final void O6() {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_STATUS2_LONG_SYNC, java.lang.Long.valueOf(this.f239872d));
        java.util.HashMap hashMap = this.f239873e;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Number) entry.getValue()).intValue();
            r45.p53 p53Var = new r45.p53();
            p53Var.f464294d = intValue;
            p53Var.f464295e = intValue2;
            ((e21.z0) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).e(new xg3.p0(23, p53Var));
        }
        hashMap.clear();
    }

    public final void P6(boolean z17, long j17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePrivacyUIC", "switchChange isOpen:" + z17 + ", itemValue:" + j17 + ", functionId:" + i17);
        this.f239872d = z17 ? (~j17) & this.f239872d : j17 | this.f239872d;
        this.f239873e.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(z17 ? 1 : 2));
    }
}

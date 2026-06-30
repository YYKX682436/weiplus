package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd;

/* loaded from: classes4.dex */
public final class m extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f250471d;

    /* renamed from: e, reason: collision with root package name */
    public long f250472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f250471d = new java.util.HashSet();
    }

    public final java.util.HashSet O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getList", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        java.util.HashSet hashSet = this.f250471d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getList", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        return hashSet;
    }

    public final void P6(tc4.s0 item) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.HashSet hashSet = this.f250471d;
        boolean contains = hashSet.contains(item);
        hashSet.add(item);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ImproveAvoidLeakUIC", hashCode() + " onBindViewHolder item:" + item.hashCode() + ", hadExist=" + contains + ", now count=" + hashSet.size());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f250472e < 60000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
            return;
        }
        this.f250472e = currentTimeMillis;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc4.s0) it.next()).b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
    }

    public final void Q6(tc4.s0 item) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.util.HashSet hashSet = this.f250471d;
        hashSet.remove(item);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ImproveAvoidLeakUIC", hashCode() + " onViewRecycled item:" + item.hashCode() + ", now count=" + hashSet.size());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.ImproveAvoidLeakUIC", hashCode() + " may leak count:" + this.f250471d.size());
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.l(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveAvoidLeakUIC");
    }
}

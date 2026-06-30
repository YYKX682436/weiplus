package df2;

/* loaded from: classes10.dex */
public final class a7 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f311216m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f311217n;

    /* renamed from: o, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311218o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f311216m = "Finder.GiftEffectPlayQueueController";
        this.f311217n = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public final void Z6(java.lang.String tag, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f311217n.addAll(list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[checkStartJob-");
        sb6.append(tag);
        sb6.append("] displayGiftJob: isCancelled=");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311218o;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.mo143975x62a56b47()) : null);
        sb6.append(", isCompleted=");
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f311218o;
        sb6.append(r2Var2 != null ? java.lang.Boolean.valueOf(r2Var2.A()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f311216m, sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var3 = this.f311218o;
        if ((r2Var3 == null || r2Var3.mo143975x62a56b47()) ? false : true) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var4 = this.f311218o;
            if ((r2Var4 == null || r2Var4.A()) ? false : true) {
                return;
            }
        }
        this.f311218o = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(this, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new df2.z6(this, null), 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onLivePause */
    public void mo14861x3972754b() {
        this.f311217n.clear();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311218o;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f311218o = null;
    }
}

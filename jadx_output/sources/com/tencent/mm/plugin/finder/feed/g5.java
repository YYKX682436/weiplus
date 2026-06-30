package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106825e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f106826f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.iu0 f106827g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.plugin.finder.feed.a7 a7Var, java.lang.String str, long j17, r45.iu0 iu0Var) {
        super(0);
        this.f106824d = a7Var;
        this.f106825e = str;
        this.f106826f = j17;
        this.f106827g = iu0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.wy0 wy0Var;
        com.tencent.mm.plugin.finder.feed.q2 q2Var = new com.tencent.mm.plugin.finder.feed.q2(this.f106825e, this.f106826f, (r45.wy0) this.f106827g.getCustom(1));
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106824d;
        a7Var.f106226w = q2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refresh title wording: ");
        com.tencent.mm.plugin.finder.feed.q2 q2Var2 = a7Var.f106226w;
        sb6.append((q2Var2 == null || (wy0Var = q2Var2.f108793c) == null) ? null : wy0Var.getString(0));
        com.tencent.mars.xlog.Log.i("Finder.DrawerPresenter", sb6.toString());
        a7Var.x0();
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class rh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f108912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uh f108913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(java.util.List list, com.tencent.mm.plugin.finder.feed.uh uhVar, boolean z17) {
        super(0);
        this.f108912d = list;
        this.f108913e = uhVar;
        this.f108914f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tobe mergeData from db data from DB:");
        java.util.List list = this.f108912d;
        sb6.append(list.size());
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyPresenter", sb6.toString());
        long uptimeMillis = android.os.SystemClock.uptimeMillis() - com.tencent.mm.plugin.finder.feed.mi.f107384a;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        pm0.v.V(uptimeMillis >= ((java.lang.Number) t70Var.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var.F2().r()).longValue() - uptimeMillis, new com.tencent.mm.plugin.finder.feed.qh(this.f108913e, list, this.f108914f));
        return jz5.f0.f302826a;
    }
}

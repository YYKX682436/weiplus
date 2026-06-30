package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class fw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderTimelineRefreshEvent f106782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(com.tencent.mm.autogen.events.FinderTimelineRefreshEvent finderTimelineRefreshEvent, com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f106782d = finderTimelineRefreshEvent;
        this.f106783e = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f106782d.f54334g.f7420a;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106783e;
        if (i17 == pzVar.f108762p) {
            com.tencent.mars.xlog.Log.i(pzVar.U, "autoRefreshEventListener: trigger refresh tabType = " + pzVar.f108762p);
            com.tencent.mm.plugin.finder.feed.ct ctVar = pzVar.f108759m;
            if (ctVar != null) {
                com.tencent.mm.plugin.finder.feed.ct.i(ctVar, 150L, false, false, null, 12, null);
            }
        }
        return jz5.f0.f302826a;
    }
}

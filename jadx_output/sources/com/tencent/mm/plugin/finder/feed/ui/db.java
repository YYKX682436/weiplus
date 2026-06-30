package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePersonalCenterUI f109940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(com.tencent.mm.plugin.finder.feed.ui.FinderLivePersonalCenterUI finderLivePersonalCenterUI) {
        super(1);
        this.f109940d = finderLivePersonalCenterUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePersonalCenterUI finderLivePersonalCenterUI = this.f109940d;
        boolean z17 = it.f105327a;
        finderLivePersonalCenterUI.updateOptionMenuRedDot(0, z17);
        if (z17) {
            com.tencent.mars.xlog.Log.i(finderLivePersonalCenterUI.f109392v, "createLiveReddot Live_PersonalCenter_StartLive expose, time:" + c01.id.c());
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = it.f105329c;
            if (jbVar != null) {
                zy2.fa.K0(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), jbVar, "live.personalcenter.startlive", c01.id.c(), false, 8, null);
            }
        }
        return jz5.f0.f302826a;
    }
}

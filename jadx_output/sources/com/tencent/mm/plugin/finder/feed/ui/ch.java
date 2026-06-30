package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ch implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI f109756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f109757b;

    public ch(com.tencent.mm.plugin.finder.feed.ui.FinderNewManagementUI finderNewManagementUI, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn) {
        this.f109756a = finderNewManagementUI;
        this.f109757b = mMSwitchBtn;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        if (z17) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.r.f460525a.d(1, new java.util.LinkedList(), new java.util.LinkedList(), new com.tencent.mm.plugin.finder.feed.ui.bh());
        } else {
            com.tencent.mm.plugin.finder.ui.FinderAggregationSettingUI.f128503t.a(this.f109756a, new com.tencent.mm.plugin.finder.feed.ui.ah(this.f109757b));
        }
    }
}

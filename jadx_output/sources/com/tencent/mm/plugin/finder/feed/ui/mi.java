package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class mi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI f110311d;

    public mi(com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI) {
        this.f110311d = finderPostPreviewUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.feed.ui.FinderPostPreviewUI finderPostPreviewUI = this.f110311d;
        com.tencent.mm.plugin.finder.feed.ap apVar = finderPostPreviewUI.f109503z;
        if (apVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        apVar.o().setEnableLoadMore(false);
        com.tencent.mm.plugin.finder.feed.ap apVar2 = finderPostPreviewUI.f109503z;
        if (apVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        apVar2.o().setEnableRefresh(false);
        com.tencent.mm.plugin.finder.feed.ap apVar3 = finderPostPreviewUI.f109503z;
        if (apVar3 != null) {
            apVar3.o().setEnablePullDownHeader(false);
        } else {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
    }
}

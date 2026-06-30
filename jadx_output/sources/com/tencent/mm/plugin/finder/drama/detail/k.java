package com.tencent.mm.plugin.finder.drama.detail;

/* loaded from: classes2.dex */
public final class k extends com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider {
    public k(com.tencent.mm.plugin.finder.drama.detail.p pVar) {
        setTabContainer(new com.tencent.mm.plugin.finder.drama.detail.l(pVar));
        setTabViewAction(new rs2.d());
        setTabs(new java.util.LinkedList());
        setFragments(new java.util.LinkedList());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }
}

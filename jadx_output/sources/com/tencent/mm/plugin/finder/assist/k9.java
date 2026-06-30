package com.tencent.mm.plugin.finder.assist;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/assist/k9;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/finder/assist/SearchFinderViewEventNotifier$OnSearchFinderViewInfo;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class k9 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void invoke(com.tencent.mm.plugin.finder.assist.SearchFinderViewEventNotifier$OnSearchFinderViewInfo searchFinderViewEventNotifier$OnSearchFinderViewInfo, com.tencent.mm.ipcinvoker.r rVar) {
        if (searchFinderViewEventNotifier$OnSearchFinderViewInfo != null) {
            com.tencent.mm.autogen.events.OnSearchFinderViewEvent onSearchFinderViewEvent = new com.tencent.mm.autogen.events.OnSearchFinderViewEvent();
            java.lang.String str = searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101992d;
            am.bn bnVar = onSearchFinderViewEvent.f54582g;
            bnVar.f6263a = str;
            bnVar.f6264b = searchFinderViewEventNotifier$OnSearchFinderViewInfo.f101993e;
            onSearchFinderViewEvent.e();
            if (rVar != null) {
                rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
            }
        }
    }
}

package com.tencent.mm.plugin.appbrand.widget.halfscreen;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/halfscreen/r;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$UpdateHistoryListData;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
public final class r implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$UpdateHistoryListData halfScreenManger$UpdateHistoryListData = (com.tencent.mm.plugin.appbrand.widget.halfscreen.HalfScreenManger$UpdateHistoryListData) obj;
        if (halfScreenManger$UpdateHistoryListData == null) {
            return;
        }
        pq5.h.a().i(new com.tencent.mm.plugin.appbrand.widget.halfscreen.q(halfScreenManger$UpdateHistoryListData)).B();
    }
}

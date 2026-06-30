package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class cf implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI f109753a;

    public cf(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
        this.f109753a = finderLiveVoteHistoryUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.g byteString = ((r45.jv1) fVar.f70618d).getByteString(2);
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI = this.f109753a;
            finderLiveVoteHistoryUI.f109448z = byteString;
            finderLiveVoteHistoryUI.f109447y = ((r45.jv1) fVar.f70618d).getInteger(3);
            ky2.z zVar = finderLiveVoteHistoryUI.f109444v;
            if (zVar != null) {
                java.util.LinkedList list = ((r45.jv1) fVar.f70618d).getList(1);
                java.util.ArrayList arrayList = zVar.f313603d;
                if (list != null) {
                    arrayList.addAll(list);
                    zVar.notifyDataSetChanged();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

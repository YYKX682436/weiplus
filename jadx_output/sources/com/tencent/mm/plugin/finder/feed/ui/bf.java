package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class bf extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI f109706d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI) {
        super(1);
        this.f109706d = finderLiveVoteHistoryUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.me2 cfg = (r45.me2) obj;
        kotlin.jvm.internal.o.g(cfg, "cfg");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI finderLiveVoteHistoryUI = this.f109706d;
        intent.setClass(finderLiveVoteHistoryUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryItemUI.class);
        intent.putExtra("finderlivedetailparamvotinginfo", cfg.toByteArray());
        androidx.appcompat.app.AppCompatActivity context = finderLiveVoteHistoryUI.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveVotingInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveVoteHistoryUI$onCreate$1$1", "invoke", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveVotingInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}

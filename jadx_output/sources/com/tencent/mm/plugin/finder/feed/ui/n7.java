package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class n7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI f110328a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110329b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f110330c;

    public n7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI, java.lang.String str, long j17) {
        this.f110328a = finderLiveAnchorCreateVoteUI;
        this.f110329b = str;
        this.f110330c = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveAnchorCreateVoteUI finderLiveAnchorCreateVoteUI = this.f110328a;
        if (i17 == 0 && fVar.f70616b == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(finderLiveAnchorCreateVoteUI.getContext(), com.tencent.mm.plugin.finder.feed.ui.FinderLiveVoteHistoryUI.class);
            r45.ke2 ke2Var = new r45.ke2();
            ke2Var.set(0, ((r45.jv1) fVar.f70618d).getList(1));
            ke2Var.set(2, java.lang.Integer.valueOf(((r45.jv1) fVar.f70618d).getInteger(3)));
            ke2Var.set(1, ((r45.jv1) fVar.f70618d).getByteString(2));
            intent.putExtra("finderlivehistoryparamvotinginfo", ke2Var.toByteArray());
            intent.putExtra("finderlivedetailparamusername", this.f110329b);
            intent.putExtra("finderlivehistoryparamobjectid", this.f110330c);
            androidx.appcompat.app.AppCompatActivity context = finderLiveAnchorCreateVoteUI.getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCreateVoteUI$onCreate$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveAnchorCreateVoteUI$onCreate$1$1", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            db5.t7.g(finderLiveAnchorCreateVoteUI.getContext(), finderLiveAnchorCreateVoteUI.getContext().getResources().getString(com.tencent.mm.R.string.ejg));
        }
        return jz5.f0.f302826a;
    }
}

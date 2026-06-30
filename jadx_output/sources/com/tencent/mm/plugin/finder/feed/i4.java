package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw2.a0 f106988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f106990f;

    public i4(yw2.a0 a0Var, com.tencent.mm.plugin.finder.feed.a7 a7Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f106988d = a0Var;
        this.f106989e = a7Var;
        this.f106990f = finderItem;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ec2.d e27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$replayListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yw2.a0 a0Var = this.f106988d;
        int commentTextLimit = (a0Var.n().getCommentTextLimit() / 2) - com.tencent.mm.ui.tools.v4.g(a0Var.n().getEditText().getText().toString());
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106989e;
        if (commentTextLimit < 0) {
            android.content.Context context = a7Var.f106207d;
            db5.t7.makeText(context, ((com.tencent.mm.ui.MMActivity) context).getResources().getString(com.tencent.mm.R.string.kby, java.lang.Integer.valueOf(a0Var.n().getCommentTextLimit() / 2)), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$replayListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        a7Var.p0(a0Var.n().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String(), a0Var.n().getMentionListWhenReply(), null);
        android.content.Context context2 = a7Var.f106207d;
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null && (e27 = zy2.ra.e2(nyVar, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f106990f;
            e27.a(new ec2.a(24, finderItem.getId(), finderItem.getDupFlag()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$replayListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

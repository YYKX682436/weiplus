package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class v7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104771e;

    public v7(com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter presenter) {
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f104771e = presenter;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.drq;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        so2.b1 item = (so2.b1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tcm);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tcl);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.tcj);
        r45.ns2 ns2Var = item.F;
        int i19 = 0;
        java.lang.String string = ns2Var.getString(0);
        java.lang.String str2 = string == null ? "" : string;
        if (str2.length() > 16) {
            str = str2.substring(0, 16);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        } else {
            str = str2;
        }
        textView.setText(str);
        java.lang.String string2 = ns2Var.getString(1);
        textView2.setText(string2 != null ? string2 : "");
        android.content.Context context = holder.itemView.getContext();
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = item.E;
        long id6 = finderItem.getId();
        int commentCount = finderItem.getFeedObject().getCommentCount();
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = (androidx.appcompat.app.AppCompatActivity) context;
            kotlin.jvm.internal.o.g(activity, "activity");
            i19 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
        }
        int i27 = i19;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dy1.a.i(itemView, "comment_area_start_live_banner");
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        dy1.a.e(itemView2, 32, new com.tencent.mm.plugin.finder.convert.t7(id6, commentCount, i27));
        textView3.setOnClickListener(new com.tencent.mm.plugin.finder.convert.u7(str2, id6, commentCount, i27));
    }
}

package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class m3 extends com.tencent.mm.plugin.finder.convert.q6 {
    public m3(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(a7Var, true);
    }

    @Override // com.tencent.mm.plugin.finder.convert.q6
    public android.text.SpannableString q(so2.z0 item) {
        kotlin.jvm.internal.o.g(item, "item");
        return item.E.createDescSpanWithoutClick();
    }

    @Override // com.tencent.mm.plugin.finder.convert.q6, in5.r
    /* renamed from: t */
    public void h(in5.s0 holder, so2.z0 item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.kbf);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.a_4);
        com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView finderCollapsibleTextView = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) holder.p(com.tencent.mm.R.id.f487278o45);
        textView.setClickable(false);
        textView.setEnabled(false);
        p17.setClickable(false);
        p17.setEnabled(false);
        finderCollapsibleTextView.getContentTextView().setClickable(false);
        finderCollapsibleTextView.getContentTextView().setEnabled(false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.c77);
        android.content.Context context = holder.f293121e;
        linearLayout.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478494f));
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
    }

    @Override // com.tencent.mm.plugin.finder.convert.q6
    public void u(in5.s0 holder, so2.z0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.f482563hv);
        if (p17 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshActivity", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.convert.q6
    public void y(in5.s0 holder, so2.z0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.i2x);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshLink", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.finder.convert.q6
    public void z(in5.s0 holder, so2.z0 item) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.kzl);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$getAdapter$adapter$1$getItemConvert$1", "refreshPoi", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedCommentHeaderContent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

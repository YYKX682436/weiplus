package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class kc extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f110223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI f110224e;

    public kc(com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI finderLiveRemindConsumeWecoinUI, java.util.List itemList) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f110224e = finderLiveRemindConsumeWecoinUI;
        this.f110223d = itemList;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f110223d.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.feed.ui.mc holder = (com.tencent.mm.plugin.finder.feed.ui.mc) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveRemindConsumeWecoinUI finderLiveRemindConsumeWecoinUI = this.f110224e;
        holder.f110303d.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.jc(finderLiveRemindConsumeWecoinUI, i17));
        android.content.res.Resources resources = finderLiveRemindConsumeWecoinUI.getContext().getResources();
        java.util.List list = this.f110223d;
        holder.f110304e.setText(resources.getString(com.tencent.mm.R.string.ebm, java.lang.Long.valueOf(((com.tencent.mm.plugin.finder.feed.ui.lc) list.get(i17)).f110267a)));
        holder.f110305f.setVisibility(((com.tencent.mm.plugin.finder.feed.ui.lc) list.get(i17)).f110268b ? 0 : 8);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ayg, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new com.tencent.mm.plugin.finder.feed.ui.mc(inflate);
    }
}

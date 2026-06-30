package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class v9 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI f110645d;

    public v9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI) {
        this.f110645d = finderLiveHistoryUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f110645d.f109375y).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        com.tencent.mm.plugin.finder.feed.ui.t9 holder = (com.tencent.mm.plugin.finder.feed.ui.t9) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveHistoryUI finderLiveHistoryUI = this.f110645d;
        r45.ib1 ib1Var = (r45.ib1) ((java.util.ArrayList) finderLiveHistoryUI.f109375y).get(i17);
        holder.f110559d.setText(zl2.q4.r(zl2.q4.f473933a, ib1Var.getInteger(2) * 1000, null, false, false, 14, null));
        holder.f110560e.setText(ib1Var.getString(3));
        holder.f110561f.setText(finderLiveHistoryUI.getContext().getResources().getString(com.tencent.mm.R.string.dtv, com.tencent.mm.plugin.finder.assist.w2.f(ib1Var.getInteger(4))));
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.u9(finderLiveHistoryUI, ib1Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f110645d.getContext()).inflate(com.tencent.mm.R.layout.aso, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.feed.ui.t9(this, inflate);
    }
}

package com.tencent.mm.plugin.finder.feed;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007J\u0014\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/FinderSurveyView;", "Landroid/widget/FrameLayout;", "", "Lcom/tencent/mm/plugin/finder/feed/model/a8;", "list", "Ljz5/f0;", "setSurveyList", "Lin5/x;", "Lin5/s0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setItemClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class FinderSurveyView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerView f106115d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f106116e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderSurveyView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f106116e = arrayList;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.b9t, (android.view.ViewGroup) this, true);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.nsn);
        this.f106115d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.profile.FlowLayoutManager());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderSurveyView$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.zw();
            }
        }, arrayList, false);
        if (wxRecyclerView == null) {
            return;
        }
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
    }

    public final void setItemClickListener(in5.x listener) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f106115d;
        if (wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null || !(adapter instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter)) {
            return;
        }
        ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).f293105o = listener;
    }

    public final void setSurveyList(java.util.Collection<com.tencent.mm.plugin.finder.feed.model.a8> list) {
        androidx.recyclerview.widget.f2 adapter;
        kotlin.jvm.internal.o.g(list, "list");
        java.util.ArrayList arrayList = this.f106116e;
        arrayList.clear();
        arrayList.addAll(list);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f106115d;
        if (wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderSurveyView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f106116e = arrayList;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.b9t, (android.view.ViewGroup) this, true);
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) findViewById(com.tencent.mm.R.id.nsn);
        this.f106115d = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.profile.FlowLayoutManager());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderSurveyView$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.zw();
            }
        }, arrayList, false);
        if (wxRecyclerView == null) {
            return;
        }
        wxRecyclerView.setAdapter(wxRecyclerAdapter);
    }
}

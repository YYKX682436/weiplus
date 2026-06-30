package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833;

/* loaded from: classes4.dex */
public class d extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc f244099d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc c17700xab779dfc) {
        this.f244099d = c17700xab779dfc;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc.f244093f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return 3;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc.f244093f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc.f244093f[i17]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return valueOf;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        long j17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return j17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getView", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        if (view == null) {
            int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc.f244093f;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            android.content.Context context = this.f244099d.f244095e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
            view = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570885c84, viewGroup, false);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.c cVar = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.c(this);
            cVar.f244098a = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kdx);
            view.setTag(cVar);
        }
        android.widget.TextView textView = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.c) view.getTag()).f244098a;
        int[] iArr2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc.f244093f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu");
        textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.C17700xab779dfc.f244093f[i17]);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getView", "com.tencent.mm.plugin.sns.abtest.NotInterestMenu$NotInterestListAdapter");
        return view;
    }
}

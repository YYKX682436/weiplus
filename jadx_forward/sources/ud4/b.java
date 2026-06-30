package ud4;

/* loaded from: classes4.dex */
public abstract class b extends ud4.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f508214f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f508215g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final int f508216h;

    public b(android.content.Context context, int i17) {
        this.f508214f = context;
        this.f508216h = i17;
    }

    public void c(java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("set", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        ud4.h hVar = (ud4.h) this;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearStableIdMap", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        hVar.f508212e.clear();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearStableIdMap", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        hVar.f508215g.clear();
        hVar.notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        hVar.f508240o = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clear", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addAllStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addAllStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        this.f508215g.addAll(list);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        notifyDataSetChanged();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("set", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        int size = this.f508215g.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCount", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        return size;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItem", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        java.lang.Object obj = this.f508215g.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItem", "com.tencent.mm.plugin.sns.ui.previewimageview.BaseDynamicGridAdapter");
        return obj;
    }
}

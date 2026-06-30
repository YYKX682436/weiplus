package ud4;

/* loaded from: classes4.dex */
public abstract class a extends android.widget.BaseAdapter implements ud4.i {

    /* renamed from: d, reason: collision with root package name */
    public int f508211d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f508212e = new java.util.HashMap();

    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        java.util.HashMap hashMap = this.f508212e;
        int i17 = this.f508211d;
        this.f508211d = i17 + 1;
        hashMap.put(obj, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addStableId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        if (i17 >= 0) {
            java.util.HashMap hashMap = this.f508212e;
            if (i17 < hashMap.size()) {
                long intValue = ((java.lang.Integer) hashMap.get(((ud4.b) this).getItem(i17))).intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
                return intValue;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemId", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        return -1L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasStableIds", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasStableIds", "com.tencent.mm.plugin.sns.ui.previewimageview.AbstractDynamicGridAdapter");
        return true;
    }
}

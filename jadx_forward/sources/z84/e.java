package z84;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseBooleanArray f552302a = new android.util.SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f552303b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 f552304c;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3) {
        this.f552304c = c17808x428917d3;
    }

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
        android.util.SparseBooleanArray sparseBooleanArray = this.f552302a;
        java.util.List<java.lang.Integer> list = this.f552303b;
        if (sparseBooleanArray == null || sparseBooleanArray.size() == 0 || list == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) list;
        linkedList.clear();
        for (int i17 = 0; i17 < sparseBooleanArray.size(); i17++) {
            int keyAt = sparseBooleanArray.keyAt(i17);
            boolean z17 = sparseBooleanArray.get(keyAt);
            if (keyAt >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2149xe821e364.C17808x428917d3 c17808x428917d3 = this.f552304c;
                if (keyAt < c17808x428917d3.f245317h && !z17) {
                    android.view.View f17 = z2Var.f(keyAt);
                    java.util.Objects.toString(f17);
                    c17808x428917d3.m8079xef099f25(f17, z2Var);
                    linkedList.add(java.lang.Integer.valueOf(keyAt));
                }
            }
        }
        for (java.lang.Integer num : list) {
            if (num != null) {
                sparseBooleanArray.delete(num.intValue());
            }
        }
        z2Var.c();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recycle", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutManagerRecycleHelper");
    }
}

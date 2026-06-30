package ud4;

/* loaded from: classes13.dex */
public class v implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public int f508279d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f508280e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f508281f;

    /* renamed from: g, reason: collision with root package name */
    public int f508282g;

    /* renamed from: h, reason: collision with root package name */
    public int f508283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a f508284i;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a) {
        this.f508284i = c18379xb7ff44a;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.lang.Boolean bool;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        this.f508281f = i17;
        this.f508282g = i18;
        int i27 = this.f508279d;
        if (i27 == -1) {
            i27 = i17;
        }
        this.f508279d = i27;
        int i28 = this.f508280e;
        if (i28 == -1) {
            i28 = i18;
        }
        this.f508280e = i28;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAndHandleFirstVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        int i29 = this.f508281f;
        int i37 = this.f508279d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = this.f508284i;
        if (i29 != i37) {
            int i38 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.f251788y0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z17 = c18379xb7ff44a.f251808x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (z17 && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a) != -1) {
                long b17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                c18379xb7ff44a.B(b17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                c18379xb7ff44a.p();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndHandleFirstVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkAndHandleLastVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        if (this.f508281f + this.f508282g != this.f508279d + this.f508280e) {
            int i39 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.f251788y0;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z18 = c18379xb7ff44a.f251808x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (z18 && com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a) != -1) {
                long b18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                c18379xb7ff44a.B(b18);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                c18379xb7ff44a.p();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2900", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkAndHandleLastVisibleCellChange", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        this.f508279d = this.f508281f;
        this.f508280e = this.f508282g;
        int i47 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.f251788y0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        c18379xb7ff44a.s();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1700", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        boolean z19 = c18379xb7ff44a.F;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1800", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        if (z19) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateWobbleState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
            for (int i48 = 0; i48 < i18; i48++) {
                android.view.View childAt = c18379xb7ff44a.getChildAt(i48);
                if (childAt != null) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a) == -1 || (bool = java.lang.Boolean.TRUE) == childAt.getTag(com.p314xaae8f345.mm.R.id.cxa)) {
                        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.b(c18379xb7ff44a) == -1 && childAt.getRotation() != 0.0f) {
                            childAt.setRotation(0.0f);
                            childAt.setTag(com.p314xaae8f345.mm.R.id.cxa, java.lang.Boolean.FALSE);
                        }
                    } else {
                        if (i48 % 2 == 0) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            c18379xb7ff44a.i(childAt);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2000", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                            c18379xb7ff44a.j(childAt);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2100", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                        }
                        childAt.setTag(com.p314xaae8f345.mm.R.id.cxa, bool);
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWobbleState", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.d(c18379xb7ff44a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.d(c18379xb7ff44a).onScroll(absListView, i17, i18, i19);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScroll", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        this.f508283h = i17;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.f251788y0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a = this.f508284i;
        c18379xb7ff44a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2202", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isScrollCompleted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        if (this.f508282g > 0 && this.f508283h == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            boolean z17 = c18379xb7ff44a.f251808x;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2300", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                boolean z18 = c18379xb7ff44a.f251811z;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2400", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                    c18379xb7ff44a.q();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2500", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$2600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$2600", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isScrollCompleted", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.d(c18379xb7ff44a) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a.d(c18379xb7ff44a).onScrollStateChanged(absListView, i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/previewimageview/DynamicGridView$10", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$10");
    }
}

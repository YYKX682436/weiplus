package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110360d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        super(0);
        this.f110360d = finderGallerySearchUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f110360d.findViewById(com.tencent.mm.R.id.orv);
        int i17 = com.tencent.mm.R.id.h0r;
        android.widget.ListView listView = (android.widget.ListView) x4.b.a(findViewById, com.tencent.mm.R.id.h0r);
        if (listView != null) {
            i17 = com.tencent.mm.R.id.im7;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.im7);
            if (linearLayout != null) {
                i17 = com.tencent.mm.R.id.j8y;
                androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) x4.b.a(findViewById, com.tencent.mm.R.id.j8y);
                if (coordinatorLayout != null) {
                    i17 = com.tencent.mm.R.id.kcj;
                    android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.kcj);
                    if (textView != null) {
                        i17 = com.tencent.mm.R.id.lqa;
                        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.lqa);
                        if (recyclerView != null) {
                            i17 = com.tencent.mm.R.id.m6e;
                            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                            if (refreshLoadMoreLayout != null) {
                                i17 = com.tencent.mm.R.id.mea;
                                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.mea);
                                if (textView2 != null) {
                                    i17 = com.tencent.mm.R.id.f487177ns4;
                                    android.widget.ListView listView2 = (android.widget.ListView) x4.b.a(findViewById, com.tencent.mm.R.id.f487177ns4);
                                    if (listView2 != null) {
                                        com.tencent.mm.view.TouchableLayout touchableLayout = (com.tencent.mm.view.TouchableLayout) findViewById;
                                        return new vb2.n(touchableLayout, listView, linearLayout, coordinatorLayout, textView, recyclerView, refreshLoadMoreLayout, textView2, listView2, touchableLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}

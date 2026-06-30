package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752;

/* loaded from: classes12.dex */
public class n0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f182549d = new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.m0(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 f182550e;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var) {
        this.f182550e = h0Var;
    }

    public void b(boolean z17) {
        java.lang.Runnable runnable = this.f182549d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182550e;
        if (!z17) {
            h0Var.f182477d.removeCallbacks(runnable);
            h0Var.f182477d.postDelayed(runnable, 256L);
            return;
        }
        h0Var.f182477d.removeCallbacks(runnable);
        if (h0Var.f182477d.getVisibility() != 0) {
            h0Var.f182477d.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(h0Var.f182485l, com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
            h0Var.f182477d.setVisibility(0);
            h0Var.f182477d.startAnimation(loadAnimation);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (1 == i17) {
            b(true);
            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc m45812x9cf0d20b = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b();
            boolean mo45892xbfcecaf = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45892xbfcecaf();
            com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182550e;
            m45812x9cf0d20b.mo46128x89c4face(mo45892xbfcecaf, h0Var.f182484k);
            h0Var.f182484k = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45892xbfcecaf(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45891x31dd5cd7(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45890x8fe6e5fc(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45893xfc624a32(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45894x8fe728d2() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45895x85406bb5(), 703, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45889x4974562(), "MicroMsg.MediaHistoryGalleryUI");
        } else if (i17 == 0) {
            b(false);
        }
        if (c1163xf1deaba4.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager()).w();
            n11.a.b().n(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.h0 h0Var = this.f182550e;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) h0Var.f182474a).c(h0Var.f182485l);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.x1 x1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.l2) h0Var.f182474a).f182529d;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1415xf44c7752.o1 x17 = x1Var.x(c1162x665295de.w());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().c(new java.util.Date(x17.f182571d), x1Var.f182634d);
        android.widget.TextView textView = h0Var.f182477d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (c17 == null) {
            c17 = "";
        }
        textView.setText(c17);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

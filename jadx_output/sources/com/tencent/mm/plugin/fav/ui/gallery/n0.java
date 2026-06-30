package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class n0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f101016d = new com.tencent.mm.plugin.fav.ui.gallery.m0(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.gallery.h0 f101017e;

    public n0(com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var) {
        this.f101017e = h0Var;
    }

    public void b(boolean z17) {
        java.lang.Runnable runnable = this.f101016d;
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f101017e;
        if (!z17) {
            h0Var.f100944d.removeCallbacks(runnable);
            h0Var.f100944d.postDelayed(runnable, 256L);
            return;
        }
        h0Var.f100944d.removeCallbacks(runnable);
        if (h0Var.f100944d.getVisibility() != 0) {
            h0Var.f100944d.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(h0Var.f100952l, com.tencent.mm.R.anim.f477783bc);
            h0Var.f100944d.setVisibility(0);
            h0Var.f100944d.startAnimation(loadAnimation);
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (1 == i17) {
            b(true);
            com.tencent.mm.hardcoder.WXHardCoderJNI wXHardCoderJNI = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance();
            boolean hcMediaGalleryScrollEnable = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollEnable();
            com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f101017e;
            wXHardCoderJNI.stopPerformance(hcMediaGalleryScrollEnable, h0Var.f100951k);
            h0Var.f100951k = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollTimeout(), 703, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcMediaGalleryScrollAction(), "MicroMsg.MediaHistoryGalleryUI");
        } else if (i17 == 0) {
            b(false);
        }
        if (recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            ((androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager()).w();
            n11.a.b().n(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.fav.ui.gallery.h0 h0Var = this.f101017e;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) ((com.tencent.mm.plugin.fav.ui.gallery.l2) h0Var.f100941a).c(h0Var.f100952l);
        com.tencent.mm.plugin.fav.ui.gallery.x1 x1Var = ((com.tencent.mm.plugin.fav.ui.gallery.l2) h0Var.f100941a).f100996d;
        com.tencent.mm.plugin.fav.ui.gallery.o1 x17 = x1Var.x(linearLayoutManager.w());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        java.lang.String c17 = com.tencent.mm.ui.gridviewheaders.a.e().c(new java.util.Date(x17.f101038d), x1Var.f101101d);
        android.widget.TextView textView = h0Var.f100944d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (c17 == null) {
            c17 = "";
        }
        textView.setText(c17);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/gallery/FavMediaHistoryGallery$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

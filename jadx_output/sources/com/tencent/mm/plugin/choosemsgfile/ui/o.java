package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class o extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f95628d = new com.tencent.mm.plugin.choosemsgfile.ui.n(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI f95629e;

    public o(com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI) {
        this.f95629e = chooseMsgFileUI;
    }

    public void b(boolean z17) {
        java.lang.Runnable runnable = this.f95628d;
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95629e;
        if (!z17) {
            chooseMsgFileUI.f95601o.removeCallbacks(runnable);
            chooseMsgFileUI.f95601o.postDelayed(runnable, 256L);
            return;
        }
        chooseMsgFileUI.f95601o.removeCallbacks(runnable);
        if (chooseMsgFileUI.f95601o.getVisibility() != 0) {
            chooseMsgFileUI.f95601o.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(chooseMsgFileUI.getContext(), com.tencent.mm.R.anim.f477783bc);
            chooseMsgFileUI.f95601o.setVisibility(0);
            chooseMsgFileUI.f95601o.startAnimation(loadAnimation);
        }
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (1 == i17) {
            b(true);
        } else if (i17 == 0) {
            b(false);
        }
        if (recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) {
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) recyclerView.getLayoutManager()).w();
            com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95629e;
            if (w17 == 0 && !chooseMsgFileUI.f95609w) {
                chooseMsgFileUI.f95598i.c(false, chooseMsgFileUI.f95595f, chooseMsgFileUI.f95597h);
            }
            chooseMsgFileUI.f95609w = false;
            n11.a.b().n(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.tencent.mm.plugin.choosemsgfile.ui.ChooseMsgFileUI chooseMsgFileUI = this.f95629e;
        wv1.a x17 = chooseMsgFileUI.f95598i.f95561d.x(((androidx.recyclerview.widget.LinearLayoutManager) chooseMsgFileUI.f95598i.b(chooseMsgFileUI)).w());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        long g17 = x17.g();
        com.tencent.mm.sdk.platformtools.r2 r2Var = xv1.d.f457391a;
        java.lang.String d17 = com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(g17), com.tencent.mm.sdk.platformtools.x2.f193071a);
        android.widget.TextView textView = chooseMsgFileUI.f95601o;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (d17 == null) {
            d17 = "";
        }
        textView.setText(d17);
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f177161d = new com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.n(this);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a f177162e;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a) {
        this.f177162e = activityC13098x53df0b7a;
    }

    public void b(boolean z17) {
        java.lang.Runnable runnable = this.f177161d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a = this.f177162e;
        if (!z17) {
            activityC13098x53df0b7a.f177134o.removeCallbacks(runnable);
            activityC13098x53df0b7a.f177134o.postDelayed(runnable, 256L);
            return;
        }
        activityC13098x53df0b7a.f177134o.removeCallbacks(runnable);
        if (activityC13098x53df0b7a.f177134o.getVisibility() != 0) {
            activityC13098x53df0b7a.f177134o.clearAnimation();
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(activityC13098x53df0b7a.mo55332x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc);
            activityC13098x53df0b7a.f177134o.setVisibility(0);
            activityC13098x53df0b7a.f177134o.startAnimation(loadAnimation);
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
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        if (1 == i17) {
            b(true);
        } else if (i17 == 0) {
            b(false);
        }
        if (c1163xf1deaba4.getLayoutManager() instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) {
            int w17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) c1163xf1deaba4.getLayoutManager()).w();
            com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a = this.f177162e;
            if (w17 == 0 && !activityC13098x53df0b7a.f177142w) {
                activityC13098x53df0b7a.f177131i.c(false, activityC13098x53df0b7a.f177128f, activityC13098x53df0b7a.f177130h);
            }
            activityC13098x53df0b7a.f177142w = false;
            n11.a.b().n(i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
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
        yj0.a.b("com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a = this.f177162e;
        wv1.a x17 = activityC13098x53df0b7a.f177131i.f177094d.x(((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) activityC13098x53df0b7a.f177131i.b(activityC13098x53df0b7a)).w());
        if (x17 == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        long g17 = x17.g();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = xv1.d.f538924a;
        java.lang.String d17 = com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(g17), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        android.widget.TextView textView = activityC13098x53df0b7a.f177134o;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (d17 == null) {
            d17 = "";
        }
        textView.setText(d17);
        yj0.a.h(this, "com/tencent/mm/plugin/choosemsgfile/ui/ChooseMsgFileUI$10", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}

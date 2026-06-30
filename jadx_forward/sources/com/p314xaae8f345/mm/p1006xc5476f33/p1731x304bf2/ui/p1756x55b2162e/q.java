package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

/* loaded from: classes8.dex */
public class q implements com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f f222838a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f activityC16002xae5f607f) {
        this.f222838a = activityC16002xae5f607f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s1
    public void a(int i17) {
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f.f222650r;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.ActivityC16002xae5f607f activityC16002xae5f607f = this.f222838a;
        android.view.ViewGroup.LayoutParams layoutParams = activityC16002xae5f607f.T6().f83283b.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = i17;
        }
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams3.topMargin = i65.a.b(activityC16002xae5f607f, 152);
        android.widget.FrameLayout frameLayout = activityC16002xae5f607f.T6().f83284c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16047x8b5fe36e c16047x8b5fe36e = activityC16002xae5f607f.f223526i;
        if (c16047x8b5fe36e == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingCoverView");
            throw null;
        }
        frameLayout.addView(c16047x8b5fe36e, layoutParams3);
        android.widget.FrameLayout frameLayout2 = activityC16002xae5f607f.T6().f83284c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1760x9697b1ee.ui.C16046x45eb7dfd c16046x45eb7dfd = activityC16002xae5f607f.f223527m;
        if (c16046x45eb7dfd != null) {
            frameLayout2.addView(c16046x45eb7dfd, layoutParams3);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyCoverView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.s1
    public void b(java.lang.String str) {
        this.f222838a.f222652q = str;
    }
}

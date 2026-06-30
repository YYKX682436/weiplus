package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f211571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 f211572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f211573f;

    public y3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2, int i17) {
        this.f211571d = z17;
        this.f211572e = activityC15025x361cfff2;
        this.f211573f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f211571d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f211572e;
        if (z17) {
            android.view.View view = activityC15025x361cfff2.f210076t;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollContainer");
                throw null;
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(view.getLayoutParams());
            layoutParams.height = activityC15025x361cfff2.X - this.f211573f;
            android.view.View view2 = activityC15025x361cfff2.f210076t;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollContainer");
                throw null;
            }
            view2.setLayoutParams(layoutParams);
            android.view.View view3 = activityC15025x361cfff2.H;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editTopSpace");
                throw null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(view3.getLayoutParams());
            layoutParams2.height = i65.a.h(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            android.view.View view4 = activityC15025x361cfff2.H;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editTopSpace");
                throw null;
            }
            view4.setLayoutParams(layoutParams2);
            android.view.View view5 = activityC15025x361cfff2.I;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editMiddleSpace");
                throw null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(view5.getLayoutParams());
            layoutParams3.height = i65.a.h(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
            android.view.View view6 = activityC15025x361cfff2.I;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editMiddleSpace");
                throw null;
            }
            view6.setLayoutParams(layoutParams3);
            android.view.View view7 = activityC15025x361cfff2.f210072J;
            if (view7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editBottomSpace");
                throw null;
            }
            android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(view7.getLayoutParams());
            layoutParams4.height = i65.a.h(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            android.view.View view8 = activityC15025x361cfff2.f210072J;
            if (view8 != null) {
                view8.setLayoutParams(layoutParams4);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editBottomSpace");
                throw null;
            }
        }
        android.view.View view9 = activityC15025x361cfff2.f210076t;
        if (view9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollContainer");
            throw null;
        }
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(view9.getLayoutParams());
        layoutParams5.height = -1;
        android.view.View view10 = activityC15025x361cfff2.f210076t;
        if (view10 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scrollContainer");
            throw null;
        }
        view10.setLayoutParams(layoutParams5);
        android.view.View view11 = activityC15025x361cfff2.H;
        if (view11 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editTopSpace");
            throw null;
        }
        android.widget.LinearLayout.LayoutParams layoutParams6 = new android.widget.LinearLayout.LayoutParams(view11.getLayoutParams());
        layoutParams6.height = i65.a.h(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
        android.view.View view12 = activityC15025x361cfff2.H;
        if (view12 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editTopSpace");
            throw null;
        }
        view12.setLayoutParams(layoutParams6);
        android.view.View view13 = activityC15025x361cfff2.I;
        if (view13 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editMiddleSpace");
            throw null;
        }
        android.widget.LinearLayout.LayoutParams layoutParams7 = new android.widget.LinearLayout.LayoutParams(view13.getLayoutParams());
        layoutParams7.height = -2;
        layoutParams7.weight = 1.0f;
        android.view.View view14 = activityC15025x361cfff2.I;
        if (view14 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editMiddleSpace");
            throw null;
        }
        view14.setLayoutParams(layoutParams7);
        android.view.View view15 = activityC15025x361cfff2.f210072J;
        if (view15 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editBottomSpace");
            throw null;
        }
        android.widget.LinearLayout.LayoutParams layoutParams8 = new android.widget.LinearLayout.LayoutParams(view15.getLayoutParams());
        layoutParams8.height = i65.a.h(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
        android.view.View view16 = activityC15025x361cfff2.f210072J;
        if (view16 != null) {
            view16.setLayoutParams(layoutParams8);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editBottomSpace");
            throw null;
        }
    }
}

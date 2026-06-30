package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes5.dex */
public class c6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f261708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 f261709e;

    public c6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1, android.widget.ImageView imageView) {
        this.f261709e = activityC19116x82bf90f1;
        this.f261708d = imageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f261708d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19116x82bf90f1 activityC19116x82bf90f1 = this.f261709e;
        layoutParams.width = activityC19116x82bf90f1.Q.getWidth();
        layoutParams.height = activityC19116x82bf90f1.Q.getHeight();
        imageView.setLayoutParams(layoutParams);
    }
}

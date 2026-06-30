package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes4.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f239520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f239521e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17130xb547a358 activityC17130xb547a358, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        this.f239520d = imageView;
        this.f239521e = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = this.f239520d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        android.view.ViewGroup viewGroup = this.f239521e;
        if (viewGroup != null) {
            layoutParams.width = viewGroup.getWidth();
            layoutParams.height = viewGroup.getHeight();
            imageView.setLayoutParams(layoutParams);
        }
    }
}

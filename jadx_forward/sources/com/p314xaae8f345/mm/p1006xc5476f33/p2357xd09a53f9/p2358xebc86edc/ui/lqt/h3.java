package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f259727d;

    public h3(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936 activityC19014x45f83936, android.widget.TextView textView) {
        this.f259727d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f259727d;
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}

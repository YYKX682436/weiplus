package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f260036d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.ActivityC19003x7959c734 activityC19003x7959c734, android.widget.TextView textView) {
        this.f260036d = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView = this.f260036d;
        if (textView != null) {
            textView.sendAccessibilityEvent(8);
        }
    }
}

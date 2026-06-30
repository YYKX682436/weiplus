package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes9.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f220783d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f220784e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15861xcec1ad88 f220785f;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15861xcec1ad88 c15861xcec1ad88, android.view.View view, android.view.View view2) {
        this.f220785f = c15861xcec1ad88;
        this.f220783d = view;
        this.f220784e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15861xcec1ad88 c15861xcec1ad88 = this.f220785f;
        c15861xcec1ad88.f220523h.removeAllViews();
        android.view.View view = this.f220783d;
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        android.view.View view2 = this.f220784e;
        if (measuredWidth + (view2 != null ? view2.getMeasuredWidth() : 0) > c15861xcec1ad88.f220523h.getMeasuredWidth()) {
            c15861xcec1ad88.f220523h.setOrientation(1);
        } else {
            c15861xcec1ad88.f220523h.setOrientation(0);
        }
        if (view != null) {
            c15861xcec1ad88.f220523h.addView(view);
        }
        if (view2 != null) {
            c15861xcec1ad88.f220523h.addView(view2);
        }
    }
}

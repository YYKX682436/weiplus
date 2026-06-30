package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f239172d;

    public b(android.view.View view) {
        this.f239172d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f239172d;
        boolean performLongClick = view.performLongClick();
        while (!performLongClick) {
            view = (android.view.View) view.getParent();
            if (view == null) {
                return;
            } else {
                performLongClick = view.performLongClick();
            }
        }
    }
}

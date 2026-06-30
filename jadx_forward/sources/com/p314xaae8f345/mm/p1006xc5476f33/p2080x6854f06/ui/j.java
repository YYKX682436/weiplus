package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.k f243816d;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.k kVar) {
        this.f243816d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.k kVar = this.f243816d;
        android.view.View view = kVar.f243819d;
        if (view != null) {
            view.clearAnimation();
            com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.ui.C17663x54eef15d c17663x54eef15d = kVar.f243821f;
            android.view.View view2 = kVar.f243819d;
            ((java.util.ArrayList) c17663x54eef15d.f243625d).remove(view2);
            c17663x54eef15d.removeView(view2);
        }
    }
}

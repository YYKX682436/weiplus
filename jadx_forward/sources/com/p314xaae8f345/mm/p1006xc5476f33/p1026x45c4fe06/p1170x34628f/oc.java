package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class oc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pc f168506e;

    public oc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.pc pcVar, android.view.View view) {
        this.f168506e = pcVar;
        this.f168505d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        android.view.View view = this.f168505d;
        if (n3.x0.b(view) && !n3.x0.c(view)) {
            java.lang.String str = this.f168506e.f168549d.f167908m;
            view.forceLayout();
            android.view.ViewParent parent = view.getParent();
            do {
                ((android.view.View) parent).forceLayout();
                parent = parent.getParent();
            } while (parent instanceof android.view.View);
            if (parent != null) {
                parent.requestLayout();
            }
        }
    }
}

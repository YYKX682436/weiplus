package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class x2 implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d3 f168776d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.d3 d3Var) {
        this.f168776d = d3Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        java.util.Iterator it = ((java.util.HashSet) this.f168776d.f168049i).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        java.util.Iterator it = ((java.util.HashSet) this.f168776d.f168050m).iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
    }
}

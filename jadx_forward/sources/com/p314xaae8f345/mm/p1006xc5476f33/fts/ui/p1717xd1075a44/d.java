package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class d implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219792d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar) {
        this.f219792d = vVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f219792d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(vVar.f291495e.getLineCount());
        if (!(vVar.f219867z && valueOf.intValue() != vVar.B)) {
            valueOf = null;
        }
        if (valueOf != null) {
            vVar.B = valueOf.intValue();
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) vVar.findViewById(com.p314xaae8f345.mm.R.id.v1h);
            if (c1073x7e08a787 != null) {
                android.transition.AutoTransition autoTransition = new android.transition.AutoTransition();
                autoTransition.setDuration(200L);
                autoTransition.setOrdering(0);
                android.transition.TransitionManager.beginDelayedTransition(c1073x7e08a787, autoTransition);
                c1073x7e08a787.getLayoutParams().height = vVar.r();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
                cVar.d(c1073x7e08a787);
                cVar.b(c1073x7e08a787);
                c1073x7e08a787.m7179xd020a803(null);
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class e implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v f219795d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar) {
        this.f219795d = vVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787;
        int i39 = i27 - i18;
        if (i39 != i38 - i29) {
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.v vVar = this.f219795d;
            if (vVar.f219867z || (c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) vVar.findViewById(com.p314xaae8f345.mm.R.id.v1h)) == null) {
                return;
            }
            p012xc85e97e9.p071xe6df7747.p072xd1075a44.c cVar = new p012xc85e97e9.p071xe6df7747.p072xd1075a44.c();
            cVar.d(c1073x7e08a787);
            cVar.f(vVar.f291495e.getId(), 3, 0, 3, (c1073x7e08a787.getHeight() - i39) / 2);
            cVar.b(c1073x7e08a787);
            c1073x7e08a787.m7179xd020a803(null);
        }
    }
}

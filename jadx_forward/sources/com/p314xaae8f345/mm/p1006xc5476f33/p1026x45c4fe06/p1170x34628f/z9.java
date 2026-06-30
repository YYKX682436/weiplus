package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class z9 extends xi1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia f168848d;

    public z9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar) {
        this.f168848d = iaVar;
    }

    @Override // xi1.c
    public void p() {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p17;
        java.lang.ref.WeakReference weakReference2;
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ia iaVar = this.f168848d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ha p18 = iaVar.p(iaVar.f168298i);
        float[] fArr = iaVar.f168294e;
        if (p18 != null && (weakReference = p18.f168214a) != null && fArr != null && (view = (android.view.View) weakReference.get()) != null) {
            int i17 = iaVar.f168298i;
            int i18 = iaVar.f168293d;
            boolean z17 = p18.f168218e;
            if (i17 != i18 && (p17 = iaVar.p(i18)) != null && (weakReference2 = p17.f168214a) != null && (view2 = (android.view.View) weakReference2.get()) != null) {
                iaVar.x(iaVar.f168293d, fArr, view2.getVisibility(), java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE);
            }
            int i19 = iaVar.f168298i;
            iaVar.f168293d = -1;
            iaVar.f168298i = -1;
            iaVar.x(i19, fArr, view.getVisibility(), java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qd qdVar = iaVar.f168296g;
        if (qdVar != null) {
            qdVar.a();
            iaVar.f168296g = null;
        }
    }
}

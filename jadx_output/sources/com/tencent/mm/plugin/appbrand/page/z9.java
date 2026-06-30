package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class z9 extends xi1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.ia f87315d;

    public z9(com.tencent.mm.plugin.appbrand.page.ia iaVar) {
        this.f87315d = iaVar;
    }

    @Override // xi1.c
    public void p() {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        com.tencent.mm.plugin.appbrand.page.ha p17;
        java.lang.ref.WeakReference weakReference2;
        android.view.View view2;
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f87315d;
        com.tencent.mm.plugin.appbrand.page.ha p18 = iaVar.p(iaVar.f86765i);
        float[] fArr = iaVar.f86761e;
        if (p18 != null && (weakReference = p18.f86681a) != null && fArr != null && (view = (android.view.View) weakReference.get()) != null) {
            int i17 = iaVar.f86765i;
            int i18 = iaVar.f86760d;
            boolean z17 = p18.f86685e;
            if (i17 != i18 && (p17 = iaVar.p(i18)) != null && (weakReference2 = p17.f86681a) != null && (view2 = (android.view.View) weakReference2.get()) != null) {
                iaVar.x(iaVar.f86760d, fArr, view2.getVisibility(), java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE);
            }
            int i19 = iaVar.f86765i;
            iaVar.f86760d = -1;
            iaVar.f86765i = -1;
            iaVar.x(i19, fArr, view.getVisibility(), java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE);
        }
        com.tencent.mm.plugin.appbrand.page.qd qdVar = iaVar.f86763g;
        if (qdVar != null) {
            qdVar.a();
            iaVar.f86763g = null;
        }
    }
}

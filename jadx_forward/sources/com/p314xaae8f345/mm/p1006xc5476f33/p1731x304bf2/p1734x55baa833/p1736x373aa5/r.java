package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t f220806d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t tVar) {
        this.f220806d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.t tVar = this.f220806d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.u uVar = tVar.f220829s;
        android.widget.TextView textView = tVar.f220823m;
        java.lang.String str = tVar.f220826p.f36637xf02988d6;
        uVar.getClass();
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setIntValues(textView.getWidth(), 0);
        valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.p(uVar, textView));
        valueAnimator.setDuration(350L);
        valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.q(uVar, textView, str));
        valueAnimator.start();
        if (tVar.f220823m.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w) tVar.f220823m.getTag();
            java.lang.String str2 = wVar.f220858a;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(tVar.f220826p.f36637xf02988d6)) {
                wVar.f220860c = valueAnimator;
                tVar.f220823m.setTag(wVar);
            }
        }
    }
}

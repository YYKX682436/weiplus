package com.tencent.mm.plugin.choosemsgfile.ui;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.choosemsgfile.ui.o f95627d;

    public n(com.tencent.mm.plugin.choosemsgfile.ui.o oVar) {
        this.f95627d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.choosemsgfile.ui.o oVar = this.f95627d;
        oVar.f95629e.f95601o.startAnimation(android.view.animation.AnimationUtils.loadAnimation(oVar.f95629e.getContext(), com.tencent.mm.R.anim.f477784bd));
        oVar.f95629e.f95601o.setVisibility(8);
    }
}

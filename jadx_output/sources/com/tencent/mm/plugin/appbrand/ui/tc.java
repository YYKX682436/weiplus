package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class tc implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.kd f90240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.uc f90241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ al1.l f90242f;

    public tc(com.tencent.mm.plugin.appbrand.ui.kd kdVar, com.tencent.mm.plugin.appbrand.ui.uc ucVar, al1.l lVar) {
        this.f90240d = kdVar;
        this.f90241e = ucVar;
        this.f90242f = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.appbrand.ui.uc ucVar = this.f90241e;
        com.tencent.mm.plugin.appbrand.ui.sc scVar = new com.tencent.mm.plugin.appbrand.ui.sc(ucVar);
        com.tencent.mm.plugin.appbrand.ui.kd kdVar = this.f90240d;
        kdVar.setCloseButtonClickListener(scVar);
        kdVar.setMainTitle(ucVar.getContext().getString(com.tencent.mm.R.string.f490248p8));
        kdVar.setForegroundStyle(com.tencent.mm.ui.bk.C() ? "white" : "black");
        kdVar.setBackgroundColor(b3.l.getColor(ucVar.getContext(), com.tencent.mm.R.color.a07));
        kdVar.setLoadingIconVisibility(true);
        this.f90242f.x(kdVar.getF5791d(), true ^ com.tencent.mm.ui.bk.C());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
    }
}

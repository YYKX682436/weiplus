package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASActivity f102249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx2.q f102250e;

    public i3(com.tencent.mm.ui.vas.VASActivity vASActivity, gx2.q qVar) {
        this.f102249d = vASActivity;
        this.f102250e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f102249d;
        if (vASActivity.isFinishing() || vASActivity.isDestroyed()) {
            return;
        }
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(this.f102250e, false, 1, null);
    }
}

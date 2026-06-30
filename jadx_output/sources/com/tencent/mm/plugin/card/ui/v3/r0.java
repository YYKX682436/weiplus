package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes8.dex */
public final class r0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.iu f95364d;

    public r0(r45.iu iuVar) {
        this.f95364d = iuVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            r45.iu iuVar = this.f95364d;
            lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 2, 2);
        }
    }
}

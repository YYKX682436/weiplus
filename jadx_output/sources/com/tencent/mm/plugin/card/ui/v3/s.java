package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes9.dex */
public final class s implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.xt f95368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI f95369e;

    public s(r45.xt xtVar, com.tencent.mm.plugin.card.ui.v3.CardHomePageV3UI cardHomePageV3UI) {
        this.f95368d = xtVar;
        this.f95369e = cardHomePageV3UI;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            r45.xt xtVar = this.f95368d;
            int i18 = xtVar.f390385e;
            if (i18 == 1) {
                lu1.d.j((com.tencent.mm.ui.MMActivity) this.f95369e.getContext(), xtVar.f390386f, 0);
            } else {
                if (i18 != 2) {
                    return;
                }
                r45.iu iuVar = xtVar.f390387g;
                lu1.d.f(iuVar.f377328d, iuVar.f377329e, iuVar.f377330f);
            }
        }
    }
}

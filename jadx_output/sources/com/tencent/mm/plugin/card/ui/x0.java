package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftImageUI f95434d;

    public x0(com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI) {
        this.f95434d = cardGiftImageUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            return;
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.tencent.mm.plugin.card.ui.CardGiftImageUI cardGiftImageUI = this.f95434d;
        java.lang.String str = cardGiftImageUI.f94804e;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.a(str, cardGiftImageUI, null);
    }
}

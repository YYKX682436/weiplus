package uc4;

/* loaded from: classes4.dex */
public final class q0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.t0 f507979d;

    public q0(uc4.t0 t0Var) {
        this.f507979d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        uc4.t0 t0Var = this.f507979d;
        v17.setTag(t0Var.n());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 h1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1) ((jz5.n) t0Var.f507967f).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUrlMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveLinkClick");
        h1Var.onCreateContextMenu(menu, v17, contextMenuInfo);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMusicClick$linkMenuListener$2$1");
        return true;
    }
}

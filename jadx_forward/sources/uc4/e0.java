package uc4;

/* loaded from: classes4.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.g0 f507924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f507925e;

    public e0(uc4.g0 g0Var, android.content.Context context) {
        this.f507924d = g0Var;
        this.f507925e = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        r45.a90 a90Var;
        r45.kv2 kv2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        j45.l.g("favorite");
        xc4.p c17 = this.f507924d.c();
        if ((((c17 == null || (h17 = c17.h1()) == null || (a90Var = h17.f39014x86965dde) == null || (kv2Var = a90Var.f451377o) == null) ? 0 : kv2Var.m75939xb282bd08(25)) & 4) > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        } else {
            menu.add(0, 25, 0, this.f507925e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        uc4.g0 g0Var = this.f507924d;
        xc4.p c17 = g0Var.c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = c17.h1();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "finderMediaMenuListener onbindOnSelectedView : %s", h17.Id);
        if (android.text.TextUtils.isEmpty(h17.Id)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
            return false;
        }
        g0Var.e().e(view, c17.W0(), h17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveFinderMediaClick$finderMediaMenuListener$2$1");
        return true;
    }
}

package uc4;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f507980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.v f507981e;

    public r(r45.e86 e86Var, uc4.v vVar) {
        this.f507980d = e86Var;
        this.f507981e = vVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuListener$1");
        r45.e86 e86Var = this.f507980d;
        boolean i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(e86Var.f454672t, 64);
        uc4.v vVar = this.f507981e;
        if (!i17 && !com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.t2.i(e86Var.f454672t, 16)) {
            contextMenu.add(0, 0, 0, vVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571892sr));
        }
        contextMenu.add(1, 1, 0, vVar.b().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuListener$1");
    }
}

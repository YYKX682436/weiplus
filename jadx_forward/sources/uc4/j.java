package uc4;

/* loaded from: classes4.dex */
public final class j implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.o f507954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f507955e;

    public j(uc4.o oVar, android.content.Context context) {
        this.f507954d = oVar;
        this.f507955e = context;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
        xc4.p c17 = this.f507954d.c();
        java.lang.String m125483x6bf53a6c = c17 != null ? c17.m125483x6bf53a6c() : null;
        if (m125483x6bf53a6c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(m125483x6bf53a6c);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = true;
        boolean z18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("popMenuPermissionWordingSwitch", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        android.content.Context context = this.f507955e;
        if (f07 != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(m125483x6bf53a6c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b("3552365301", f07.Q0())) {
            contextMenu.add(0, 0, 0, z18 ? i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.bfm) : i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.bfo));
        } else {
            contextMenu.add(0, 0, 0, z18 ? i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.bfm) : i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.bfn));
        }
        contextMenu.add(1, 1, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574788jg4));
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        if (z17) {
            contextMenu.add(2, 2, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_z));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$menuCreator$2$1");
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class j implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f251359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.m f251360e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f251360e = mVar;
        this.f251359d = c17933xe8d1b226;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$1");
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f251359d;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = Bi.f0(c17933xe8d1b226.m70374x6bf53a6c());
        boolean z17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMSocialBlackListFlag", 1) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.m mVar = this.f251360e;
        if (f07 == null || c17933xe8d1b226 == null || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c17933xe8d1b226.m70374x6bf53a6c()) || !"3552365301".equals(f07.Q0())) {
            android.app.Activity e17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(mVar.f251370d);
            contextMenu.add(0, 0, 0, z17 ? e17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfm) : e17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfn));
        } else {
            android.app.Activity e18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(mVar.f251370d);
            contextMenu.add(0, 0, 0, z17 ? e18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfm) : e18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bfo));
        }
        contextMenu.add(1, 1, 0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(mVar.f251370d).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574788jg4));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$10$1");
    }
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class al implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bl f280172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 f280173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f280174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f280175g;

    public al(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bl blVar, com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8, int i17, int i18) {
        this.f280172d = blVar;
        this.f280173e = c19510x90fb7cb8;
        this.f280174f = i17;
        this.f280175g = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/component/ShortcutCommandTagComponent$createTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.bl blVar = this.f280172d;
        sb5.s0 s0Var = (sb5.s0) blVar.f280113d.f542241c.a(sb5.s0.class);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = s0Var != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e : null;
        if (c19666xfd6e2f33 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShortcutCommandTagComponent", "onTagClicked: footer is null");
        } else {
            c19666xfd6e2f33.m75502x764d6925(1);
            java.lang.String m75458x24dd4e59 = c19666xfd6e2f33.m75458x24dd4e59();
            if (m75458x24dd4e59 == null) {
                m75458x24dd4e59 = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(m75458x24dd4e59);
            com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8 = this.f280173e;
            sb6.append(c19510x90fb7cb8.f269614f);
            c19666xfd6e2f33.m75500x1f95af65(sb6.toString());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandTagComponent", "onTagClicked: appended content, id=%s", java.lang.Integer.valueOf(c19510x90fb7cb8.f269612d));
        }
        int i17 = this.f280174f;
        int i18 = this.f280175g;
        blVar.getClass();
        try {
            int i19 = blVar.f280371i;
            if (i19 < 1) {
                i19 = 1;
            }
            int i27 = i17 + 1;
            java.util.Map k17 = kz5.c1.k(new jz5.l("view_id", "shortcut_name_btn"), new jz5.l("weclawbot_username", blVar.f280113d.x()), new jz5.l("clawbot_shortcut_count", java.lang.Integer.valueOf(i18)), new jz5.l("clawbot_visible_shortcut_count", java.lang.Integer.valueOf(i19)), new jz5.l("clawbot_shortcut_index_list", java.lang.String.valueOf(i27)));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", k17, 37790);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShortcutCommandTagComponent", "reportTagClick: index=%d, params=%s", java.lang.Integer.valueOf(i27), k17);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShortcutCommandTagComponent", e17, "reportTagClick failed", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/component/ShortcutCommandTagComponent$createTagView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

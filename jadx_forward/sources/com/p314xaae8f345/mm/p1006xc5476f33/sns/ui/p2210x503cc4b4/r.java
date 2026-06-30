package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class r extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251380d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251380d = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        if (view != null && (view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) view.getTag();
            java.lang.String str = ojVar.f251635a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
            if (k17 != null && k17.m70377x3172ed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineOnCreateContextMenuListener", "photoMenuListner skip for ad, localId=" + str);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
                return;
            }
            j45.l.g("favorite");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar = this.f251380d;
            if (k17 != null && !k17.m70377x3172ed()) {
                contextMenu.add(0, 2, 0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
            c5348xb8e1a564.f135674g.f87754c = str;
            c5348xb8e1a564.e();
            if (c5348xb8e1a564.f135675h.f87869a) {
                contextMenu.add(0, 18, 0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(contextMenu, k17);
            android.view.MenuItem add = contextMenu.add(0, 21, 0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_f));
            int[] iArr = new int[2];
            int width = view.getWidth();
            int height = view.getHeight();
            view.getLocationInWindow(iArr);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
            add.setIntent(intent);
            if ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) || (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18022x27bfedac)) {
                ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                if (!su4.r2.l()) {
                    if (k17.m70371x485d7().f39026x8eaeecf7 || !((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(2, 5)) {
                        contextMenu.add(0, 26, 0, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572774cg4));
                    } else {
                        contextMenu.add(0, 36, 0, ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(2, 5));
                        ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(2, 5, tg0.e1.f500594d);
                    }
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(iVar) instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5 ? 10 : 7;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = k17.m70371x485d7();
                    r45.jj4 jj4Var = ojVar.f251636b < m70371x485d7.f39014x86965dde.f451373h.size() ? (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(ojVar.f251636b) : new r45.jj4();
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 c6367x7875a8e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4();
                    c6367x7875a8e4.t("");
                    c6367x7875a8e4.r(ca4.z0.t0(k17.f68891x29d1292e));
                    c6367x7875a8e4.f137161f = i17;
                    c6367x7875a8e4.f137160e = 1;
                    c6367x7875a8e4.f137162g = 81;
                    c6367x7875a8e4.q("");
                    c6367x7875a8e4.p("");
                    c6367x7875a8e4.s(kk.k.e(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d) + ca4.z0.J(jj4Var)));
                    c6367x7875a8e4.f137168m = java.lang.System.currentTimeMillis();
                    c6367x7875a8e4.k();
                    ((sg0.q3) ((tg0.v1) i95.n0.c(tg0.v1.class))).getClass();
                    su4.k3.m(c6367x7875a8e4);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
            return false;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) view.getTag()).f251635a;
        this.f251380d.f251342l.e(view, str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str).m70371x485d7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$16");
        return true;
    }
}

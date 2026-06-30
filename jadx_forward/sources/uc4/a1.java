package uc4;

/* loaded from: classes4.dex */
public final class a1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f507909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.b1 f507910e;

    public a1(android.content.Context context, uc4.b1 b1Var) {
        this.f507909d = context;
        this.f507910e = b1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public void a(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        if (v17.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) {
            java.lang.Object tag = v17.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj ojVar = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) tag;
            java.lang.String str = ojVar.f251635a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(str, "null cannot be cast to non-null type kotlin.String");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
            int i17 = ojVar.f251636b;
            java.util.HashMap hashMap = sb4.z.f487124d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("recordClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Uj().mo50293x3498a0(new sb4.b0(k17, i17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("recordClick", "com.tencent.mm.plugin.sns.ui.adapter.SnsTimeLineVendingAdapter");
            sb4.z.g(k17, ojVar.f251636b);
            j45.l.g("favorite");
            android.content.Context context = this.f507909d;
            if (k17 != null && !k17.m70377x3172ed()) {
                menu.add(0, 2, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg));
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564 c5348xb8e1a564 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5348xb8e1a564();
            c5348xb8e1a564.f135674g.f87754c = str;
            c5348xb8e1a564.e();
            if (c5348xb8e1a564.f135675h.f87869a) {
                menu.add(0, 18, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572041x2));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2087xab215833.a.b(menu, k17);
            android.view.MenuItem add = menu.add(0, 21, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.j_f));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(add, "add(...)");
            int[] iArr = new int[2];
            int width = v17.getWidth();
            int height = v17.getHeight();
            v17.getLocationInWindow(iArr);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
            add.setIntent(intent);
            ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
            if (!su4.r2.l()) {
                if (((k17 == null || (m70371x485d7 = k17.m70371x485d7()) == null || !m70371x485d7.f39026x8eaeecf7) ? false : true) || !((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(2, 5)) {
                    menu.add(0, 26, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572774cg4));
                } else {
                    menu.add(0, 36, 0, ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Di(2, 5));
                    ((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ri(2, 5, tg0.e1.f500594d);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(k17);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d72 = k17.m70371x485d7();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d72, "getTimeLine(...)");
                r45.jj4 jj4Var = ojVar.f251636b < m70371x485d72.f39014x86965dde.f451373h.size() ? (r45.jj4) m70371x485d72.f39014x86965dde.f451373h.get(ojVar.f251636b) : new r45.jj4();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4 c6367x7875a8e4 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6367x7875a8e4();
                c6367x7875a8e4.t("");
                c6367x7875a8e4.r(ca4.z0.t0(k17.f68891x29d1292e));
                c6367x7875a8e4.f137161f = 10;
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
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMMCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
            return false;
        }
        java.lang.Object tag = view.getTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.SnsImageViewTag");
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.oj) tag).f251635a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(str, "null cannot be cast to non-null type kotlin.String");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineOnCreateContextMenuListener", "onbindOnSelectedView error,localId:".concat(str));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
            return true;
        }
        this.f507910e.e().e(view, str, k17.m70371x485d7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick$photoMenuListener$1");
        return true;
    }
}

package uc4;

/* loaded from: classes4.dex */
public final class o extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f507970f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f507971g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f507970f = jz5.h.b(new uc4.k(this, context));
        this.f507971g = "";
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17;
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        xc4.p c17 = c();
        java.lang.String m125483x6bf53a6c = c17 != null ? c17.m125483x6bf53a6c() : null;
        if (m125483x6bf53a6c == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return;
        }
        this.f507971g = m125483x6bf53a6c;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737 c6070x7cbfe737 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6070x7cbfe737();
        java.lang.String str2 = this.f507971g;
        am.cw cwVar = c6070x7cbfe737.f136353g;
        cwVar.f87939a = str2;
        xc4.p c18 = c();
        cwVar.f87943e = c18 != null ? c18.a1() : "";
        xc4.p c19 = c();
        cwVar.f87942d = (c19 == null || (h17 = c19.h1()) == null || (a90Var = h17.f39014x86965dde) == null) ? 0 : a90Var.f451370e;
        xc4.p c27 = c();
        cwVar.f87941c = c27 != null ? c27.m175348xf9b3b2c7() : false;
        xc4.p c28 = c();
        if (c28 == null || (str = c28.m125483x6bf53a6c()) == null) {
            str = "";
        }
        cwVar.f87944f = str;
        if (b() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5) {
            cwVar.f87940b = 1;
        } else if ((b() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a) || (b() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2227xd1954cdd.ActivityC18439x36286657)) {
            cwVar.f87940b = 2;
        }
        c6070x7cbfe737.e();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        xc4.p c29 = c();
        java.lang.String a17 = c29 != null ? c29.a1() : "";
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickAlbumCount", this.f507971g);
        ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "ClickAvatarFeedIdCount", a17);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f507971g, 6L);
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f507971g, 11L);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuCreator", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        android.view.View.OnCreateContextMenuListener onCreateContextMenuListener = (android.view.View.OnCreateContextMenuListener) ((jz5.n) this.f507970f).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuCreator", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        return onCreateContextMenuListener;
    }

    @Override // uc4.g
    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return false;
        }
        java.lang.String m125483x6bf53a6c = c17.m125483x6bf53a6c();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m125483x6bf53a6c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return true;
        }
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            uc4.g.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_PERMISSION");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf c6069xab724edf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6069xab724edf();
            am.bw bwVar = c6069xab724edf.f136352g;
            bwVar.f87824a = m125483x6bf53a6c;
            bwVar.f87825b = c17.y0();
            c6069xab724edf.e();
        } else if (itemId == 1) {
            uc4.g.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_EXPOSE");
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040 c6071x2b665040 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6071x2b665040();
            long y07 = c17.y0();
            am.dw dwVar = c6071x2b665040.f136354g;
            dwVar.f88037b = y07;
            dwVar.f88036a = c17.m125483x6bf53a6c();
            c6071x2b665040.e();
        } else if (itemId == 2) {
            uc4.g.g();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.Click", "click AVATER_MENU_ID_DETAIL");
            n();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        return true;
    }

    @Override // uc4.g
    public void m(in5.s0 s0Var, xc4.p info, int i17) {
        android.view.View h17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.m(s0Var, info, i17);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(info.m125483x6bf53a6c(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.sj())) {
            android.view.View h18 = h();
            if (h18 != null) {
                h18.setOnLongClickListener(null);
            }
            int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
            if (((i18 == 788529167 || i18 == 788529166) || z65.c.a()) && (h17 = h()) != null) {
                h17.setOnLongClickListener(new uc4.n(this));
            }
        } else {
            uc4.g.l(this, h(), true, true, false, 8, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
    }

    public final void n() {
        r45.a90 a90Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("position:" + j() + '\n');
        sb6.append("hash:" + hashCode() + '\n');
        sb6.append("displayName:" + c17.Q0() + '\n');
        sb6.append("username:" + c17.m125483x6bf53a6c() + '\n');
        sb6.append("sns_id:" + c17.a1() + '\n');
        sb6.append("local_id:" + c17.W0() + '\n');
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = c17.h1();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = null;
        java.util.LinkedList<r45.jj4> linkedList = (h17 == null || (a90Var = h17.f39014x86965dde) == null) ? null : a90Var.f451373h;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (linkedList != null) {
            for (r45.jj4 jj4Var : linkedList) {
                sb7.append(jj4Var.f459388d);
                if (!android.text.TextUtils.isEmpty(jj4Var.f459412y0)) {
                    sb7.append(" [uhd]");
                }
                if (!android.text.TextUtils.isEmpty(jj4Var.A1)) {
                    sb7.append(" [hd]");
                }
                if (!android.text.TextUtils.isEmpty(jj4Var.f459391g)) {
                    sb7.append(" [0]");
                }
                sb7.append("\n");
            }
        }
        sb6.append("media_list:\n" + ((java.lang.Object) sb7) + '\n');
        android.widget.TextView textView = new android.widget.TextView(b());
        textView.setText(sb6);
        textView.setGravity(19);
        textView.setTextSize(1, 13.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(i65.a.d(b(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int h18 = i65.a.h(b(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(h18, h18, h18, h18);
        android.content.Context b17 = b();
        uc4.l lVar = uc4.l.f507961d;
        if (!(b17 instanceof android.app.Activity) || !((android.app.Activity) b17).isFinishing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = null;
            aVar.L = textView;
            aVar.G = lVar;
            j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(b17, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.show();
            db5.e1.a(b17, j0Var);
        }
        j0Var.A("复制", true, new uc4.m(this, sb6));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedDetailDialog", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick");
    }
}

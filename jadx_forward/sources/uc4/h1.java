package uc4;

/* loaded from: classes4.dex */
public final class h1 extends uc4.g {

    /* renamed from: f, reason: collision with root package name */
    public final uc4.g1 f507950f;

    /* renamed from: g, reason: collision with root package name */
    public int f507951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f507950f = new uc4.g1(this, context);
    }

    @Override // uc4.g
    public void a(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        super.a(view);
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onsight click ");
        xc4.p c18 = c();
        sb6.append(c18 != null ? c18.W0() : null);
        sb6.append(' ');
        xc4.p c19 = c();
        sb6.append(c19 != null ? c19.a1() : null);
        sb6.append(' ');
        xc4.p c27 = c();
        sb6.append(c27 != null ? java.lang.Integer.valueOf(c27.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.VideoClick", sb6.toString());
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 h17 = c17.h1();
        java.util.LinkedList linkedList = h17.f39014x86965dde.f451373h;
        if (linkedList == null || linkedList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Improve.VideoClick", "the obj.ContentObj.MediaObjList is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        r45.jj4 jj4Var = (r45.jj4) h17.f39014x86965dde.f451373h.get(0);
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getMediaFilePath(...)");
        java.lang.String R = ca4.z0.R(jj4Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(R, "getSnsSightName(...)");
        java.lang.String str2 = "";
        java.lang.String concat = com.p314xaae8f345.mm.vfs.w6.j(d17.concat(R)) ? d17.concat(R) : "";
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.U(jj4Var))) {
            str2 = d17 + ca4.z0.U(jj4Var);
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
            concat = d17 + ca4.z0.Y(jj4Var);
            str2 = d17 + ca4.z0.a0(jj4Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.VideoClick", "click: sight:" + concat + ", thumb:" + str2);
        int[] iArr = new int[2];
        if (com.p314xaae8f345.mm.ui.bk.y()) {
            view.getLocationOnScreen(iArr);
        } else {
            view.getLocationInWindow(iArr);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11444, 3);
        if (jj4Var.f459389e == 8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.VideoClick", "click to play fake sns video");
            android.content.Intent intent = new android.content.Intent();
            if (h17.f39043xa1529a15 == null) {
                intent.setClassName(b(), "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoActivity");
            } else {
                intent.setClassName(b(), "com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoActivity");
            }
            intent.putExtra("intent_video_is_preview", false);
            intent.putExtra("intent_video_sns_local_id", com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.w2.m(c17.W0()));
            intent.putExtra("intent_video_sns_create_time", c17.m125473x3fdd41df());
            intent.putExtra("intent_left", iArr[0]);
            intent.putExtra("intent_top", iArr[1]);
            intent.putExtra("intent_width", width);
            intent.putExtra("intent_height", height);
            intent.putExtra("intent_video_thumb_path", str2);
            intent.putExtra("sns_position", this.f507951g);
            android.content.Context b17 = b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            b17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(b17, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "click", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            str = "click";
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.VideoClick", "it not ad video, use online video activity to play.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpToFullScreenUI", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            android.content.Intent intent2 = new android.content.Intent();
            xd4.k0 k0Var = xd4.k0.f535197a;
            int a17 = k0Var.a(b());
            str = "click";
            java.lang.String b18 = k0Var.b(a17, false);
            intent2.putExtra("intent_videopath", concat);
            intent2.putExtra("intent_thumbpath", str2);
            intent2.putExtra("intent_localid", c17.W0());
            intent2.putExtra("intent_isad", false);
            intent2.putExtra("intent_from_scene", 0);
            intent2.putExtra("intent_sns_scene", a17);
            intent2.putExtra("intent_session_id_sns", b18);
            intent2.putExtra("sns_video_scene", 2);
            gc4.n nVar = gc4.n.f351998a;
            r45.m1 m1Var = h17.f39019x6e5c4c04.f465089m;
            intent2.putExtra("intent_third_sdk_msg", nVar.b(m1Var.f461587d, m1Var.f461589f));
            intent2.putExtra("intent_publish_id", ca4.z0.s0(c17.y0()));
            intent2.putExtra("intent_bottom_height", com.p314xaae8f345.mm.ui.bl.c(b()));
            intent2.putExtra("img_gallery_left", iArr[0]);
            intent2.putExtra("img_gallery_top", iArr[1]);
            intent2.putExtra("img_gallery_width", width);
            intent2.putExtra("img_gallery_height", height);
            intent2.putExtra("sns_position", this.f507951g);
            if (!pc4.d.f434943a.d(c17.h1()) || c17.mo133058x3172ed()) {
                intent2.setClass(b(), com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.class);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 b19 = xd4.o0.d().b(h17.Id);
                if (b19 != null && b19.w()) {
                    intent2.putExtra("intent_fromplayingvideo", true);
                    intent2.putExtra("intent_fromplayingvideo_tlobjid", h17.Id);
                    intent2.putExtra("intent_session_id", b19.m70630x23a7af9b());
                    intent2.putExtra("intent_session_timestamp", b19.m70632x34bdb696());
                }
                android.content.Context b27 = b();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(b27, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "jumpToFullScreenUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                b27.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(b27, "com/tencent/mm/plugin/sns/ui/improve/item/click/ImproveVideoClick", "jumpToFullScreenUI", "(Landroid/view/View;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;Ljava/lang/String;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                android.content.Context b28 = b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b28, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) b28).overridePendingTransition(0, 0);
            } else {
                if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) {
                    intent2.putExtra("intent_fromplayingvideo", ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.p2198x67fe93cb.ViewOnLongClickListenerC18284x499dee15) view).m71050xf1a50009());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2184x67fe93cb.ActivityC18194xa82f7027.f249883d.a(b(), intent2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.Q(b(), c17.h1());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpToFullScreenUI", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        }
        n();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }

    @Override // uc4.g
    public android.view.View.OnCreateContextMenuListener d() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        return this.f507950f;
    }

    @Override // uc4.g
    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        if (menuItem.getItemId() == 18 || menuItem.getItemId() == 19) {
            n();
        } else if (menuItem.getItemId() == 10) {
            xc4.p c17 = c();
            if (c17 == null) {
                super.i(menuItem, i17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
                return false;
            }
            ((zy1.f) ((dy1.s) i95.n0.c(dy1.s.class))).Di(12076, "FavFeedCount", c17.a1());
        }
        super.i(menuItem, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        return false;
    }

    @Override // uc4.g
    public void m(in5.s0 s0Var, xc4.p info, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        super.m(s0Var, info, i17);
        this.f507951g = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }

    public final void n() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
        xc4.p c17 = c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
            return;
        }
        java.lang.String a17 = c17.a1();
        xc4.p c18 = c();
        java.lang.Integer valueOf = c18 != null ? java.lang.Integer.valueOf(c18.m125482xfb85f7b0()) : null;
        if (valueOf != null && valueOf.intValue() == 15) {
            str = "ClickSightFeedCount";
        } else {
            if (valueOf == null || valueOf.intValue() != 5) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
                return;
            }
            str = "ClickVideoFeedCount";
        }
        zy1.f fVar = (zy1.f) ((dy1.s) i95.n0.c(dy1.s.class));
        fVar.Bi(12076, "ClickFeedCount", 1);
        fVar.Di(12076, "ClickFeedId", a17);
        fVar.Di(12076, str, a17);
        fVar.Ni(12076, "BrowseFullScreenSightTime");
        yc4.b0 b0Var = yc4.b0.f542372a;
        xc4.p c19 = c();
        b0Var.b(c19 != null ? c19.a1() : "");
        xc4.p c27 = c();
        b0Var.c(c27 != null ? c27.a1() : "", 1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickReport", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick");
    }
}

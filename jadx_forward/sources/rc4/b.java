package rc4;

/* loaded from: classes2.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f475662d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c50.w0 f475663e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f475664f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c50.v0 f475665g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f475666h;

    public b(yz5.a aVar, c50.w0 w0Var, android.content.Context context, c50.v0 v0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar) {
        this.f475662d = aVar;
        this.f475663e = w0Var;
        this.f475664f = context;
        this.f475665g = v0Var;
        this.f475666h = jbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.String str2;
        jz5.f0 f0Var;
        boolean z17;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$attachFinderTierView$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/finder/FinderTierManager$attachFinderTierView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f475662d.mo152xb9724478();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.ArrayList arrayList2 = rc4.e.f475673e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getReportData$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            rc4.a aVar = (rc4.a) obj;
            aVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            long j17 = aVar.f475654a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getIndicator", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getFinderTierId$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            long j18 = rc4.e.f475672d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getFinderTierId$p", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            if (j17 == j18) {
                break;
            }
        }
        rc4.a aVar2 = (rc4.a) obj;
        if (aVar2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            int i17 = aVar2.f475656c;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
            aVar2.f475656c = i17 + 1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setClickCount", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$TierReportData");
        }
        java.lang.String finderContextId = this.f475665g.f120156d;
        c61.h9 h9Var = (c61.h9) this.f475663e;
        h9Var.getClass();
        android.content.Context context = this.f475664f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderContextId, "finderContextId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb ctrlInfo = this.f475666h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrlInfo, "ctrlInfo");
        r45.sf6 Ai = h9Var.Ai(ctrlInfo);
        long m75942xfb822ef2 = Ai.m75942xfb822ef2(0);
        android.content.Intent intent = new android.content.Intent();
        r45.xs2 xs2Var = ctrlInfo.N;
        int m75939xb282bd08 = xs2Var.m75939xb282bd08(9);
        cl0.g gVar = new cl0.g();
        java.lang.String str3 = ctrlInfo.f65874xb5f7102a.f470036x;
        if (str3 == null) {
            str3 = "";
        }
        gVar.h("tips_uuid", str3);
        intent.putExtra("key_extra_info", gVar.toString());
        if (m75939xb282bd08 == 6) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 37, 25, intent);
            intent.putExtra("feed_object_id", Ai.m75942xfb822ef2(0));
            intent.putExtra("streamtabtipsinfo", Ai.mo14344x5f01b1f6());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).uk(context, intent, false);
            str2 = "onClick";
            str = "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$attachFinderTierView$3";
        } else {
            pf5.u uVar = pf5.u.f435469a;
            str = "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager$attachFinderTierView$3";
            p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ey2.o0 N6 = ((ey2.t0) a17).N6(xs2Var.m75939xb282bd08(9));
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            str2 = "onClick";
            ey2.h hVar = (ey2.h) uVar.e(c61.l7.class).a(ey2.h.class);
            hVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlternateRedDotVM", "[markNeed] scene=22");
            hVar.f338916f = 22;
            r45.vs2 vs2Var = ctrlInfo.f65874xb5f7102a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[markSnsCtrlInfo] ctrlInfo=");
            sb6.append(vs2Var != null ? vs2Var.f470023h : null);
            sb6.append(" show_infos=");
            sb6.append((vs2Var == null || (linkedList = vs2Var.f470022g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
            sb6.append(", localCtrlInfo=");
            sb6.append(ctrlInfo.f65880x11c19d58);
            sb6.append('_');
            sb6.append(ctrlInfo.f65882x5364c75d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AlternateRedDotVM", sb6.toString());
            if (vs2Var != null) {
                hVar.f338918h = ctrlInfo;
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                hVar.f338918h = null;
            }
            hVar.P6(nk6.L0("FinderEntrance"));
            nk6.N("FinderEntrance");
            nk6.a0(ctrlInfo);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(m75942xfb822ef2);
            bs2.n1 R6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379) uVar.e(c61.l7.class).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1605xed046e09.p1606xf3a584b4.C14614xb913e379.class)).R6(m75939xb282bd08);
            if (R6 != null) {
                R6.e(true, "Finder.SnsDeliveryBubbleService");
            }
            N6.a(ey2.q0.f339005e);
            N6.f338981h = 0L;
            if (h17 != null) {
                java.util.List list = N6.f338976c;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 p17 = cu2.u.f303974a.p(h17);
                p17.c2(true);
                r45.hl2 m76756xf0f8a852 = p17.getFeedObject().getFeedObject().m76756xf0f8a852();
                if ((m76756xf0f8a852 != null ? m76756xf0f8a852.m75942xfb822ef2(0) : 0L) <= 0) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).uk(p17.getFeedObject().getFeedObject());
                }
                list.add(0, p17);
                intent.putExtra("isEnableShowUnreadFeed", true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "use cached feed to unreadList");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "without cache force to refresh.");
                intent.putExtra("isEnableShowUnreadFeed", false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsDeliveryBubbleService", "[enterFinder] " + pm0.v.u(m75942xfb822ef2) + " tabType=" + m75939xb282bd08);
            if (m75939xb282bd08 == 1) {
                z17 = true;
                intent.putExtra("KEY_FINDER_JUMP_FRIEND_TAB", true);
            } else if (m75939xb282bd08 != 3) {
                intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                zy2.fa.y0(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk(), 7, null, null, 6, null);
                z17 = true;
            } else {
                z17 = true;
                intent.putExtra("KEY_FINDER_JUMP_FOLLOW_TAB", true);
            }
            if (h9Var.aj().m75939xb282bd08(8) == 0) {
                intent.putExtra("KEY_BACK_TO_NORMAL", z17);
            }
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Cj(finderContextId, intent);
            intent.putExtra("KEY_FROM_PATH", "from_sns");
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub.L7((c61.ub) c17, context, intent, 0, false, 12, null);
        }
        java.lang.String str4 = str2;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/finder/FinderTierManager$attachFinderTierView$3", "android/view/View$OnClickListener", str4, "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, str);
    }
}

package bg2;

/* loaded from: classes3.dex */
public final class d0 extends tc2.c implements tc2.h, uc2.a {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f19998e;

    /* renamed from: f, reason: collision with root package name */
    public we2.p f19999f;

    /* renamed from: g, reason: collision with root package name */
    public ag2.d f20000g;

    /* renamed from: h, reason: collision with root package name */
    public volatile r45.b94 f20001h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f20002i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20003m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20004n;

    /* renamed from: o, reason: collision with root package name */
    public int f20005o;

    /* renamed from: p, reason: collision with root package name */
    public int f20006p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Boolean f20007q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f19998e = "LiveConvertCommentListController";
        r45.b94 b94Var = new r45.b94();
        b94Var.set(0, 100);
        b94Var.set(10, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_INT_SYNC, 400)));
        b94Var.set(11, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_COUNT_INT_SYNC, 1)));
        b94Var.set(12, java.lang.Integer.valueOf(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_COMMENT_INTERVAL_SPEED_INT_SYNC, 400)));
        this.f20001h = b94Var;
        this.f20002i = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f20007q = java.lang.Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0 A[SYNTHETIC] */
    @Override // tc2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H0(r45.r71 r14) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.d0.H0(r45.r71):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tc2.c
    public void Q6() {
        in5.s0 s0Var;
        r45.zg6 zg6Var;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        r45.kr0 d17;
        java.util.LinkedList list;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        r45.kz3 kz3Var = null;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (finderObject = feedObject.getFinderObject()) != null && (d17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject)) != null && (list = d17.getList(12)) != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                r45.kz3 kz3Var2 = (r45.kz3) next;
                if (kz3Var2.getInteger(0) == 23 && ((r45.zg6) kz3Var2.getCustom(14)) != null) {
                    kz3Var = next;
                    break;
                }
            }
            kz3Var = kz3Var;
        }
        boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.H7).getValue()).r()).booleanValue();
        this.f20004n = kz3Var != null || booleanValue;
        this.f20005o = (kz3Var == null || (zg6Var = (r45.zg6) kz3Var.getCustom(14)) == null) ? 0 : zg6Var.getInteger(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svr = ");
        sb6.append(kz3Var != null);
        sb6.append(", local = ");
        sb6.append(booleanValue);
        sb6.append(", delay:");
        sb6.append(this.f20005o);
        com.tencent.mars.xlog.Log.i(this.f19998e, sb6.toString());
        if (this.f20004n && (s0Var = gVar.f417149i) != null) {
            we2.p pVar = new we2.p();
            pVar.g(new bg2.y(this));
            this.f19999f = pVar;
            this.f20000g = new ag2.d(pVar, new bg2.z(this, s0Var), new bg2.a0(this));
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z6 = Z6();
            if (Z6 != null) {
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                Z6.setLayoutManager(new com.tencent.mm.plugin.finder.live.widget.manager.FinderLiveMsgLinearLayoutManager(context));
            }
            com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z62 = Z6();
            if (Z62 == null) {
                return;
            }
            Z62.setAdapter(this.f20000g);
        }
    }

    @Override // tc2.c
    public void U6() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        android.content.Context context;
        zy2.ra Sj;
        if (this.f20004n) {
            tc2.g gVar = this.f417141d;
            in5.s0 s0Var = gVar.f417149i;
            r45.qt2 V6 = (s0Var == null || (context = s0Var.f293121e) == null || (Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(context)) == null) ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6();
            in5.s0 s0Var2 = gVar.f417149i;
            so2.j5 j5Var = s0Var2 != null ? (so2.j5) s0Var2.f293125i : null;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
            com.tencent.mm.plugin.finder.assist.v3 v3Var = com.tencent.mm.plugin.finder.assist.v3.f102621a;
            ml2.u1 u1Var = ml2.u1.f328048g3;
            jz5.l[] lVarArr = new jz5.l[2];
            if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("liveid", str);
            lVarArr[1] = new jz5.l("comment_count", java.lang.String.valueOf(this.f20006p));
            v3Var.c(V6, u1Var, kz5.c1.i(lVarArr));
        }
        this.f20004n = false;
        ag2.d dVar = this.f20000g;
        if (dVar != null) {
            dVar.f4695n.clear();
            dVar.notifyDataSetChanged();
        }
        com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z6 = Z6();
        if (Z6 != null) {
            Z6.setVisibility(8);
        }
        this.f20002i.clear();
        kotlinx.coroutines.r2 r2Var = this.f20003m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f20003m = null;
        this.f20006p = 0;
    }

    public final void Y6(java.util.List list) {
        if (!list.isEmpty()) {
            com.tencent.mars.xlog.Log.i(this.f19998e, "dealWithMsgList  msgList size:" + list.size());
            pm0.v.X(new bg2.x(this, list));
        }
    }

    public final com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView Z6() {
        in5.s0 s0Var = this.f417141d.f417149i;
        if (s0Var != null) {
            return (com.tencent.mm.view.recyclerview.MaxHeightWxRecyclerView) s0Var.p(com.tencent.mm.R.id.tic);
        }
        return null;
    }

    public final void a7() {
        android.view.View p17;
        android.view.View p18;
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        if (s0Var != null && (p18 = s0Var.p(com.tencent.mm.R.id.hyr)) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(p18, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        bg2.o5 o5Var = (bg2.o5) N6(bg2.o5.class);
        if (o5Var != null) {
            o5Var.f20368n = 8;
        }
        in5.s0 s0Var2 = gVar.f417149i;
        if (s0Var2 == null || (p17 = s0Var2.p(com.tencent.mm.R.id.iho)) == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertCommentListController", "hideExpView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(p17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}

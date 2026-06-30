package bm2;

/* loaded from: classes3.dex */
public final class b6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.c6 f21798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.v2 f21799e;

    public b6(bm2.c6 c6Var, el2.v2 v2Var) {
        this.f21798d = c6Var;
        this.f21799e = v2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zl2.r4 r4Var;
        bw5.mb0 P0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLivePromoteSubListAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        bm2.c6 c6Var = this.f21798d;
        c6Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onItemClick] type:");
        el2.v2 v2Var = this.f21799e;
        sb6.append(v2Var.getType());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = c6Var.f21820g;
        com.tencent.mars.xlog.Log.i(str, sb7);
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            java.lang.Object data = v2Var.getData();
            jz5.f0 f0Var = null;
            f0Var = null;
            if (data instanceof r45.k92) {
                java.lang.Object data2 = v2Var.getData();
                r45.k92 k92Var = data2 instanceof r45.k92 ? (r45.k92) data2 : null;
                if (k92Var != null) {
                    com.tencent.mm.plugin.finder.live.plugin.r.f114059n.a(context, eVar, str, new cm2.h0(k92Var));
                }
            } else if (data instanceof r45.wd5) {
                java.lang.Object data3 = v2Var.getData();
                r45.wd5 wd5Var = data3 instanceof r45.wd5 ? (r45.wd5) data3 : null;
                if (wd5Var != null) {
                    java.lang.String string = wd5Var.getString(4);
                    com.tencent.mars.xlog.Log.i(str, "url: " + string);
                    android.content.Intent intent = new android.content.Intent();
                    if (string == null) {
                        string = "";
                    }
                    intent.putExtra("rawUrl", string);
                    intent.putExtra("convertActivityFromTranslucent", true);
                    j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, 1011);
                }
            } else if (data instanceof com.tencent.mm.protocal.protobuf.FinderJumpInfo) {
                java.lang.Object data4 = v2Var.getData();
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = data4 instanceof com.tencent.mm.protocal.protobuf.FinderJumpInfo ? (com.tencent.mm.protocal.protobuf.FinderJumpInfo) data4 : null;
                if (finderJumpInfo != null) {
                    com.tencent.mm.plugin.finder.live.plugin.c40.f112107m.a(context, new cm2.b0(finderJumpInfo, v2Var.getType()));
                }
            } else if (data instanceof r45.qy1) {
                java.lang.Object data5 = v2Var.getData();
                r45.qy1 qy1Var = data5 instanceof r45.qy1 ? (r45.qy1) data5 : null;
                if (qy1Var != null && (P0 = (r4Var = zl2.r4.f473950a).P0(qy1Var)) != null) {
                    r4Var.r2(context, P0, bw5.ar0.TingScene_Live_AnchorAddCategoryLiveHalfPage);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.i(str, "jump ting but play info is null!");
                }
                gk2.e eVar2 = dk2.ef.I;
                if (eVar2 != null) {
                    bf2.c.b(bf2.c.f19598a, eVar2, 8, 12, null, 0, 24, null);
                }
            } else if (data instanceof r45.do2) {
                java.lang.Object data6 = v2Var.getData();
                r45.do2 do2Var = data6 instanceof r45.do2 ? (r45.do2) data6 : null;
                if (do2Var != null) {
                    ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).dk(context, null, null, do2Var, true);
                    com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                    if (k0Var != null) {
                        qo0.c.a(k0Var, qo0.b.J2, null, 2, null);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "[onItemClick] invalid item");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLivePromoteSubListAdapter$onBindViewHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

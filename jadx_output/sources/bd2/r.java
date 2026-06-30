package bd2;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final bd2.r f19284a = new bd2.r();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f19285b = jz5.h.b(bd2.k.f19265d);

    public final void a(android.content.Context context, long j17, java.lang.String str, boolean z17, yz5.l lVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        r45.uw0 uw0Var = new r45.uw0();
        db2.t4 t4Var = db2.t4.f228171a;
        uw0Var.set(1, t4Var.a(11026));
        uw0Var.set(2, java.lang.Long.valueOf(j17));
        uw0Var.set(3, 0);
        uw0Var.set(6, java.lang.Integer.valueOf(z17 ? 2 : 0));
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        uw0Var.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, integer));
        com.tencent.mm.protobuf.g gVar = (com.tencent.mm.protobuf.g) ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).f125212h.get(pm0.v.u(j17));
        if (gVar != null) {
            uw0Var.set(8, gVar);
        }
        java.lang.String string = uw0Var.getString(4);
        if (string != null) {
            t4Var.j((r45.kv0) uw0Var.getCustom(1), j17, string);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchDislikeReasons refCommentScene=");
        sb6.append(integer);
        sb6.append(" session_buffer=");
        sb6.append(uw0Var.getString(4) != null);
        com.tencent.mars.xlog.Log.i("Finder.NoInterestedLogic", sb6.toString());
        pq5.g l17 = uw0Var.d().l();
        l17.K(new bd2.l(lVar, aVar));
        l17.f((com.tencent.mm.ui.MMActivity) context);
    }

    public final boolean b() {
        return ((java.lang.Boolean) ((jz5.n) f19285b).getValue()).booleanValue();
    }

    public final void c(android.content.Context context, long j17, java.lang.String str, java.lang.String objectNonceId, java.lang.Boolean bool, java.util.List list) {
        java.lang.String str2;
        ec2.d e27;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        com.tencent.mars.xlog.Log.i("Finder.NoInterestedLogic", "handleNoInterested with feedId:" + ((java.lang.Object) jz5.x.a(j17)) + ", subTypeItems:" + list);
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        dq.b bVar = ((cq.k) c17).f221226g;
        bVar.getClass();
        com.tencent.mm.sdk.platformtools.o4 o4Var = bVar.f242285b;
        int o17 = (o4Var != null ? o4Var.o("KEY_FINDER_EDU_TIPS_FEATURE_USE_COUNT_".concat("dislike_edu_tips"), 0) : 0) + 1;
        if (o4Var != null) {
            o4Var.A("KEY_FINDER_EDU_TIPS_FEATURE_USE_COUNT_".concat("dislike_edu_tips"), o17);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderMMKVManager", "markEduTipsFeatureUseOnce key=dislike_edu_tips, count=" + o17);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        new db2.j0(j17, str, objectNonceId, 1, 2, e17 != null ? e17.V6() : null, bool, list).l().H(new bd2.m(j17));
        jx3.f fVar = jx3.f.INSTANCE;
        fVar.idkeyStat(1278L, 9L, 1L, false);
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        java.lang.String simpleName = context.getClass().getSimpleName();
        o3Var.getClass();
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = o3Var.dk(j17);
        if (dk6 != null) {
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = dk6.getFeedObject();
            java.lang.String str3 = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri() + ',' + simpleName + ',' + o3Var.Ui(feedObject.getId()) + ',' + feedObject.getUsername() + ',' + dk6.getMediaType() + ',' + feedObject.getRecommendType() + ',' + feedObject.getLikeCount() + ',' + feedObject.getCommentCount() + ',' + feedObject.getFriendLikeCount() + ",0,0,0,2";
            com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "18946 " + str3);
            fVar.kvStat(18946, str3);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context);
        if (e18 != null && (e27 = zy2.ra.e2(e18, 0, 1, null)) != null) {
            e27.a(new ec2.a(12, j17, str));
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context);
        r45.qt2 V6 = e19 != null ? e19.V6() : null;
        if (V6 != null) {
            java.lang.String t17 = r26.i0.t(((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, str, V6.getInteger(5)), ",", ";", false);
            com.tencent.mm.plugin.finder.storage.FinderItem dk7 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).dk(j17);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[7];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(j17));
            lVarArr[1] = new jz5.l("finder_context_id", V6.getString(1));
            lVarArr[2] = new jz5.l("finder_tab_context_id", V6.getString(2));
            lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5)));
            lVarArr[4] = new jz5.l("session_buffer", t17);
            if (dk7 == null || (str2 = dk7.getUserName()) == null) {
                str2 = "";
            }
            lVarArr[5] = new jz5.l("finder_username", str2);
            lVarArr[6] = new jz5.l("extra_info", V6.getString(11));
            ((cy1.a) rVar).Bj("no_interest", "view_clk", kz5.c1.k(lVarArr), 1, false);
        }
    }

    public final void d(android.content.Context context, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.autogen.events.FinderFeedDislikeEvent finderFeedDislikeEvent = new com.tencent.mm.autogen.events.FinderFeedDislikeEvent();
        finderFeedDislikeEvent.f54274g.f6547a = j17;
        finderFeedDislikeEvent.e();
        if (z17) {
            r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
            boolean z18 = false;
            if (ls2Var != null && ls2Var.getInteger(0) == 1) {
                z18 = true;
            }
            java.lang.String string = z18 ? context.getResources().getString(com.tencent.mm.R.string.f1q) : context.getResources().getString(com.tencent.mm.R.string.f1p);
            kotlin.jvm.internal.o.d(string);
            db5.t7.i(context, string, com.tencent.mm.R.raw.icons_filled_done);
        }
    }

    public final void e(android.content.Context context, long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, in5.s0 s0Var) {
        android.view.ViewGroup viewGroup;
        boolean z18;
        boolean z19;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128005wb).getValue()).r()).intValue() == 1) {
            android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.e_k) : null;
            viewGroup = null;
            bd2.g gVar = new bd2.g(context, j17, str, objectNonceId, z17, p17 instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) p17 : null);
            gVar.a();
            android.content.Context context2 = gVar.f19249d;
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            c03.g gVar2 = (c03.g) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).e(c03.g.class);
            if (gVar2 == null) {
                com.tencent.mars.xlog.Log.e("FinderFlutterDislikePlugin", "open dislike panel with activityCls:" + context2.getClass());
                z19 = false;
            } else {
                bd2.e eVar = new bd2.e(gVar);
                com.tencent.pigeon.finder.FinderHalfScreenCancelMode finderHalfScreenCancelMode = com.tencent.pigeon.finder.FinderHalfScreenCancelMode.UNKNOWN;
                if (finderHalfScreenCancelMode != gVar2.f37659i) {
                    gVar2.f37659i = finderHalfScreenCancelMode;
                    java.util.Objects.toString(gVar2.f37656f);
                    com.tencent.pigeon.finder.FinderHalfScreenFlutterAPI finderHalfScreenFlutterAPI = gVar2.f37656f;
                    if (finderHalfScreenFlutterAPI != null) {
                        finderHalfScreenFlutterAPI.onHalfScreenCancelModelUpdate(finderHalfScreenCancelMode, new c03.a(gVar2));
                    }
                }
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(gVar2.getContext());
                frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                frameLayout.setId(com.tencent.mm.R.id.f484516eh4);
                new java.lang.ref.WeakReference(frameLayout);
                gx2.a aVar = new gx2.a();
                int k17 = i65.a.k(gVar2.getContext()) + com.tencent.mm.ui.bk.p(gVar2.getContext());
                float a17 = kx2.a.f313278a.a(gVar2.getContext());
                java.lang.Float valueOf = java.lang.Float.valueOf(0.5f);
                if (valueOf != null) {
                    a17 = valueOf.floatValue();
                }
                aVar.f277337c = a17 * k17;
                aVar.f277345k = gVar2.getContext().getResources().getColor(com.tencent.mm.R.color.f478494f, null);
                android.app.Activity context3 = gVar2.getContext();
                kotlin.jvm.internal.o.g(context3, "context");
                aVar.f277338d = new hx2.g(context3, com.tencent.mm.R.color.f478494f, 0, 0, false, false, 60, null);
                aVar.f277339e = new hx2.c(frameLayout);
                android.app.Activity context4 = gVar2.getContext();
                kotlin.jvm.internal.o.g(context4, "context");
                aVar.f277340f = new hx2.b(context4, false);
                aVar.a(new c03.f(gVar2));
                android.view.View findViewById = gVar2.findViewById(android.R.id.content);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                gx2.q b17 = aVar.b((android.view.ViewGroup) findViewById);
                b17.setOnInterceptTouch(new c03.b(gVar2, frameLayout));
                gVar2.f37654d = new java.lang.ref.WeakReference(b17);
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new c03.d(eVar, frameLayout, gVar2, b17, null), 3, null);
                z19 = true;
            }
            if (z19) {
                if (!b()) {
                    d(context, j17, false);
                    return;
                }
                com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent finderNoInterestFeedScrollEvent = new com.tencent.mm.autogen.events.FinderNoInterestFeedScrollEvent();
                am.tc tcVar = finderNoInterestFeedScrollEvent.f54314g;
                tcVar.f7998a = true;
                tcVar.f7999b = j17;
                finderNoInterestFeedScrollEvent.e();
                return;
            }
        } else {
            viewGroup = null;
        }
        jz5.g gVar3 = com.tencent.mm.plugin.finder.storage.t70.f127969ub;
        ((lb2.j) ((jz5.n) gVar3).getValue()).l();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue() != 0) {
            z18 = true;
            if (!z17) {
                com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(context);
                android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.dhr, viewGroup);
                kotlin.jvm.internal.o.f(inflate, "inflate(...)");
                y1Var.k(inflate);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487499qh0);
                kotlin.jvm.internal.o.d(textView);
                com.tencent.mm.ui.fk.a(textView);
                inflate.findViewById(com.tencent.mm.R.id.qgy).setOnClickListener(new bd2.n(y1Var));
                android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.m8m);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) findViewById2;
                bd2.i iVar = new bd2.i();
                iVar.f19264f = new bd2.o(context, j17, str, objectNonceId, z17, y1Var);
                recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context));
                recyclerView.setAdapter(iVar);
                a(context, j17, str, z17, new bd2.p(iVar, j17, y1Var), new bd2.q(context, j17, str, objectNonceId, z17));
                return;
            }
        } else {
            z18 = true;
        }
        d(context, j17, z18);
        c(context, j17, str, objectNonceId, java.lang.Boolean.valueOf(z17), null);
    }
}

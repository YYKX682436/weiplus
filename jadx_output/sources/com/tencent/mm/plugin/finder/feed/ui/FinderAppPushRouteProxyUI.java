package com.tencent.mm.plugin.finder.feed.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderAppPushRouteProxyUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderAppPushRouteProxyUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int E = 0;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f109212t = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.z0(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f109213u = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.m0(this));

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f109214v = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.i0(this));

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f109215w = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.l0(this));

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f109216x = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.j0(this));

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f109217y = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.t0(this));

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f109218z = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.y0(this));
    public final jz5.g A = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.s0(this));
    public final jz5.g B = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.v0(this));
    public final jz5.g C = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.w0(this));
    public final jz5.g D = jz5.h.b(new com.tencent.mm.plugin.finder.feed.ui.x0(this));

    public static final void c7(com.tencent.mm.plugin.finder.feed.ui.FinderAppPushRouteProxyUI finderAppPushRouteProxyUI) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        finderAppPushRouteProxyUI.getClass();
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(finderAppPushRouteProxyUI.f7(), 2, 65);
        long j17 = 0;
        if (c92.g.f39738a.b()) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("FinderLiveEntrance");
            if (L0 != null && (xs2Var2 = L0.N) != null) {
                j17 = xs2Var2.getLong(3);
            }
            com.tencent.mars.xlog.Log.i("Finder.AppPushRouteProxyUI", "[handleLiveEntranceRedDot] objId=" + pm0.v.u(j17) + " feedId=" + pm0.v.u(finderAppPushRouteProxyUI.g7()));
            if (finderAppPushRouteProxyUI.g7() == j17) {
                finderAppPushRouteProxyUI.l7(nk6, "FinderLiveEntrance", Gj);
                com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.b(Gj, 1, new zy2.na(null, 0, false, null, 0, null, null, 127, null));
                nk6.N("FinderLiveEntrance");
                finderAppPushRouteProxyUI.l7(nk6, "Discovery", Gj);
                zy2.ia.E0(nk6, "Discovery", com.tencent.mm.plugin.finder.feed.ui.q0.f110436d, true, null, 8, null);
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_FINDER_LIVE_SQUARE_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
            return;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L02 = nk6.L0("NearbyEntrance");
        if (L02 != null && (xs2Var = L02.N) != null) {
            j17 = xs2Var.getLong(3);
        }
        com.tencent.mars.xlog.Log.i("Finder.AppPushRouteProxyUI", "[handleLiveEntranceRedDot] objId=" + pm0.v.u(j17) + " feedId=" + pm0.v.u(finderAppPushRouteProxyUI.g7()));
        if (finderAppPushRouteProxyUI.g7() == j17) {
            finderAppPushRouteProxyUI.l7(nk6, "NearbyEntrance", Gj);
            com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.c(Gj, 1);
            nk6.N("NearbyEntrance");
            finderAppPushRouteProxyUI.l7(nk6, "Discovery", Gj);
            zy2.ia.E0(nk6, "Discovery", com.tencent.mm.plugin.finder.feed.ui.r0.f110472d, true, null, 8, null);
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_EXIT_NEARBY_LONG_SYNC, java.lang.Long.valueOf(c01.id.c()));
    }

    public final void d7(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        if ((e7() & 1) != 0) {
            com.tencent.mm.plugin.finder.feed.model.l0.f108124t = true;
        }
        if ((e7() & 4) != 0) {
            c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
            long g76 = g7();
            ((b92.d1) zbVar).getClass();
            com.tencent.mm.plugin.finder.feed.model.s3.f108312y = g76;
        }
        long j17 = c01.z1.j();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if ((34359738368L & j17) != 0) {
            long j18 = j17 & (-34359738369L);
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j18));
            com.tencent.mars.xlog.Log.i("Finder.AppPushRouteProxyUI", "openFinderEntrance extstatus:" + j18);
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 57;
            p53Var.f382762e = 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
            jSONObject.put("if_enforce_disc_finder_on", 1);
            jSONObject.put("client_trigger_scene", j7());
        } else {
            jSONObject.put("if_enforce_disc_finder_on", 0);
            jSONObject.put("client_trigger_scene", j7());
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.String k76 = k7();
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        g0Var.d(23498, k76, 1, valueOf, r26.i0.t(jSONObject2, ",", ";", false), java.lang.Integer.valueOf(h7()), java.lang.Integer.valueOf(i7()), (java.lang.String) ((jz5.n) this.D).getValue(), (java.lang.String) ((jz5.n) this.C).getValue());
        intent.putExtra("KEY_FROM_PATH", "appPush");
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ey2.t0 t0Var = (ey2.t0) a17;
        ey2.o0 N6 = t0Var.N6(4);
        N6.a(ey2.q0.f257472e);
        N6.f257448h = -1L;
        N6.f257452l = true;
        N6.f257453m = (((java.lang.Number) ((jz5.n) this.f109214v).getValue()).longValue() & 64) != 0;
        com.tencent.mars.xlog.Log.i("Finder.AppPushRouteProxyUI", "[enterFinderHome] tabStateVM=" + t0Var.hashCode() + " stateCache=" + N6.hashCode() + " reset isAtAppPush=true isOuterAppPush=" + N6.f257453m);
        bs2.n1 R6 = ((com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class)).R6(4);
        if (R6 != null) {
            R6.e(false, "FinderAppPush");
        }
        if ((e7() & 16) == 0) {
            N6.f257443c.clear();
            bu2.e0.f24498a.d(8, "", com.tencent.mm.plugin.finder.feed.ui.k0.f110207d, true);
        }
        ey2.h hVar = (ey2.h) uVar.e(c61.l7.class).a(ey2.h.class);
        hVar.getClass();
        com.tencent.mars.xlog.Log.i("Finder.AlternateRedDotVM", "[markNeed] scene=23");
        hVar.f257383f = 23;
        hVar.P6(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderEntrance"));
        java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(f7(), 2, 20, getIntent());
        com.tencent.mm.plugin.finder.report.x2.f125431c = Bj;
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        l7(nk6, "FinderEntrance", Bj);
        zy2.ia.E0(nk6, "FinderEntrance", com.tencent.mm.plugin.finder.feed.ui.n0.f110320d, true, null, 8, null);
        l7(nk6, "TLPersonalCenter", Bj);
        zy2.ia.E0(nk6, "TLPersonalCenter", com.tencent.mm.plugin.finder.feed.ui.o0.f110357d, true, null, 8, null);
        l7(nk6, "Discovery", Bj);
        zy2.ia.E0(nk6, "Discovery", com.tencent.mm.plugin.finder.feed.ui.p0.f110391d, true, null, 8, null);
        l7(nk6, "TLFollow", Bj);
        nk6.N("TLFollow");
        l7(nk6, "TLRecommendTab", Bj);
        nk6.N("TLRecommendTab");
        l7(nk6, "finder_tl_hot_tab", Bj);
        nk6.N("finder_tl_hot_tab");
        l7(nk6, "finder_tl_city_tab", Bj);
        nk6.N("finder_tl_city_tab");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        c61.ub.L7((c61.ub) c17, context, intent, 0, false, 12, null);
    }

    public final long e7() {
        return ((java.lang.Number) ((jz5.n) this.f109216x).getValue()).longValue();
    }

    public final int f7() {
        return (((java.lang.Number) ((jz5.n) this.f109214v).getValue()).longValue() & 64) != 0 ? 29 : 34;
    }

    public final long g7() {
        return ((java.lang.Number) ((jz5.n) this.f109213u).getValue()).longValue();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b_t;
    }

    public final int h7() {
        return ((java.lang.Number) ((jz5.n) this.A).getValue()).intValue();
    }

    public final int i7() {
        return ((java.lang.Number) ((jz5.n) this.B).getValue()).intValue();
    }

    public final java.lang.String j7() {
        return (java.lang.String) ((jz5.n) this.f109218z).getValue();
    }

    public final java.lang.String k7() {
        return (java.lang.String) ((jz5.n) this.f109212t).getValue();
    }

    public final void l7(zy2.fa faVar, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = faVar.L0(str);
        r45.f03 I0 = faVar.I0(str);
        if (L0 == null || I0 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.x2.f125429a.k(L0, I0, 1, str2, 1L);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        byte[] byteArrayExtra;
        super.onCreate(bundle);
        zy2.w.f477596b = java.lang.System.currentTimeMillis();
        java.lang.String k76 = k7();
        kotlin.jvm.internal.o.d(k76);
        zy2.w.f477595a = k76;
        kotlin.jvm.internal.o.d(k7());
        if (getIntent().getIntExtra("KEY_ROUTE_TYPE", -1) == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23669, k7(), "route_create", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", 1, 1);
            d7(getIntent());
        } else if (getIntent().getIntExtra("KEY_ROUTE_TYPE", -1) == 1) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23669, k7(), "route_create", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", 1, 2);
            java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(f7(), 2, 65);
            long g76 = g7();
            java.lang.String str = (java.lang.String) ((jz5.n) this.f109217y).getValue();
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(1, Gj);
            db2.g4 g4Var = new db2.g4(g76, str, 65, 2, "", true, null, null, 0L, null, false, false, null, qt2Var, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
            com.tencent.mm.modelbase.o oVar = g4Var.f70646f;
            kotlin.jvm.internal.o.f(oVar, "getReqResp(...)");
            oVar.setIsUserCmd(true);
            g4Var.l().h(new com.tencent.mm.plugin.finder.feed.ui.u0(this, Gj));
        } else {
            int intExtra = getIntent().getIntExtra("KEY_ROUTE_TYPE", -1);
            jz5.g gVar = this.C;
            jz5.g gVar2 = this.D;
            if (intExtra == 2) {
                if (getIntent().getByteArrayExtra("KEY_JUMP_INFO") != null) {
                    getIntent().putExtra("KEY_ROUTE_TO_TOPIC", true);
                    d7(getIntent());
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("client_trigger_scene", j7());
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    java.lang.String k77 = k7();
                    java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                    g0Var.d(23498, k77, 1, valueOf, r26.i0.t(jSONObject2, ",", ";", false), java.lang.Integer.valueOf(h7()), java.lang.Integer.valueOf(i7()), (java.lang.String) ((jz5.n) gVar2).getValue(), (java.lang.String) ((jz5.n) gVar).getValue());
                }
            } else if (getIntent().getIntExtra("KEY_ROUTE_TYPE", -1) == 3 && (byteArrayExtra = getIntent().getByteArrayExtra("KEY_JUMP_INFO")) != null) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                finderJumpInfo.parseFrom(byteArrayExtra);
                xc2.y2 y2Var = xc2.y2.f453343a;
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                xc2.y2.i(y2Var, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("client_trigger_scene", j7());
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String k78 = k7();
                java.lang.Long valueOf2 = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
                java.lang.String jSONObject4 = jSONObject3.toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                g0Var2.d(23498, k78, 1, valueOf2, r26.i0.t(jSONObject4, ",", ";", false), java.lang.Integer.valueOf(h7()), java.lang.Integer.valueOf(i7()), (java.lang.String) ((jz5.n) gVar2).getValue(), (java.lang.String) ((jz5.n) gVar).getValue());
            }
        }
        finish();
    }
}

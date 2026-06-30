package com.tencent.mm.feature.finderbox.flutter.model;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/finderbox/flutter/model/BoxFlutterBizPlugin;", "Lcom/tencent/pigeon/biz_base/BizBaseApi;", "Lcom/tencent/pigeon/biz/BizApi;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Ll75/z0;", "Landroidx/lifecycle/v;", "Lcom/tencent/mm/sdk/platformtools/f7;", "<init>", "()V", "plugin-finder-box-spi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BoxFlutterBizPlugin implements com.tencent.pigeon.biz_base.BizBaseApi, com.tencent.pigeon.biz.BizApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, l75.z0, androidx.lifecycle.v, com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.biz_base.BizBaseCallbackApi f67062e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.biz.BizCallbackApi f67063f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi f67064g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.pigeon.biz_base.BizPerformanceReportEvent f67065h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Activity f67066i;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67070p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67071q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67072r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.storage.z1 f67073s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f67074t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f67075u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f67076v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67077w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f67078x;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f67061d = "Finder.BoxFlutterBizPlugin";

    /* renamed from: m, reason: collision with root package name */
    public final int f67067m = hashCode();

    /* renamed from: n, reason: collision with root package name */
    public final int f67068n = 2;

    /* renamed from: o, reason: collision with root package name */
    public final int f67069o = 3;

    public BoxFlutterBizPlugin() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f67070p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveSwitchEvent>(a0Var) { // from class: com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin$finderLiveSwitchEventListener$1
            {
                this.__eventId = -1537763836;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveSwitchEvent finderLiveSwitchEvent) {
                com.tencent.mm.autogen.events.FinderLiveSwitchEvent event = finderLiveSwitchEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.dc dcVar = event.f54299g;
                if (dcVar.f6441a != 4) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this.f67061d, "on FinderLiveSwitchEvent %s", dcVar.f6442b);
                ((ku5.t0) ku5.t0.f312615d).B(new b50.t(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this, event));
                return false;
            }
        };
        this.f67071q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent>(a0Var) { // from class: com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin$appMsgRelatedInfoUpdateEventListener$1
            {
                this.__eventId = -1315546616;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent appMsgRelatedInfoUpdateEvent) {
                com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent event = appMsgRelatedInfoUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (a50.v0.f1544a.a("notifyRelatedInfo") || a50.v0.f1546c) {
                    return false;
                }
                com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin = com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this;
                com.tencent.mars.xlog.Log.i(boxFlutterBizPlugin.f67061d, "AppMsgRelatedInfoUpdateEvent scene %d", java.lang.Integer.valueOf(event.f53989g.f6297a));
                pm0.v.X(new b50.c(boxFlutterBizPlugin));
                return false;
            }
        };
        this.f67072r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(a0Var) { // from class: com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin$finderFollowUserEventIListener$1
            {
                this.__eventId = 398763182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (a50.v0.f1544a.a("notifyFinderInfo") || a50.v0.f1546c) {
                    return false;
                }
                com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin boxFlutterBizPlugin = com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this;
                com.tencent.mars.xlog.Log.i(boxFlutterBizPlugin.f67061d, "FollowUserEvent scene %d", java.lang.Integer.valueOf(event.f54346g.f8552b));
                pm0.v.X(new b50.r(boxFlutterBizPlugin));
                return false;
            }
        };
        this.f67073s = new b50.q0(this);
        this.f67074t = jz5.h.b(new b50.h0(this));
        this.f67075u = jz5.h.b(new b50.i0(this));
        this.f67077w = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizRecommandMockCardEvent>(a0Var) { // from class: com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin$mockRecCanvasEventListener$1
            {
                this.__eventId = 1574198507;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BizRecommandMockCardEvent bizRecommandMockCardEvent) {
                com.tencent.mm.autogen.events.BizRecommandMockCardEvent event = bizRecommandMockCardEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String frameSetName = event.f54009g.f8498a;
                kotlin.jvm.internal.o.f(frameSetName, "frameSetName");
                if (frameSetName.length() > 0) {
                    java.lang.String frameSetData = event.f54009g.f8499b;
                    kotlin.jvm.internal.o.f(frameSetData, "frameSetData");
                    if (frameSetData.length() > 0) {
                        java.lang.String str = com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this.f67061d;
                        java.lang.String str2 = event.f54009g.f8498a;
                        ((ku5.t0) ku5.t0.f312615d).B(new b50.l0(event, com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this));
                    }
                }
                return false;
            }
        };
        this.f67078x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizRecommandDeleteCardEvent>(a0Var) { // from class: com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin$deleteRecBrandCardListener$1
            {
                this.__eventId = 2147178282;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BizRecommandDeleteCardEvent bizRecommandDeleteCardEvent) {
                com.tencent.mm.autogen.events.BizRecommandDeleteCardEvent event = bizRecommandDeleteCardEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54008g.f8413a;
                kotlin.jvm.internal.o.d(str);
                if (str.length() > 0) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this.f67061d, "deleteRecBrandCard,cardId:".concat(str));
                    ((ku5.t0) ku5.t0.f312615d).B(new b50.f(com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.this, str));
                }
                return true;
            }
        };
    }

    public final com.tencent.pigeon.biz_base.BizFinderLiveInfo a(r45.lk lkVar) {
        java.lang.String str = lkVar.f379533d;
        java.lang.String str2 = lkVar.f379534e;
        java.lang.Long valueOf = java.lang.Long.valueOf(lkVar.f379535f);
        java.lang.String str3 = lkVar.f379536g;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(lkVar.f379537h);
        java.lang.String str4 = lkVar.f379538i;
        java.lang.Boolean valueOf3 = java.lang.Boolean.valueOf(lkVar.f379539m);
        r45.g77 g77Var = lkVar.f379540n;
        return new com.tencent.pigeon.biz_base.BizFinderLiveInfo(str, str2, valueOf, str3, valueOf2, str4, valueOf3, null, null, g77Var != null ? new com.tencent.pigeon.biz_base.WeApp_Data(g77Var.f374971d, java.lang.Long.valueOf(g77Var.f374972e), g77Var.f374973f.g(), g77Var.f374974g) : null, null, null, null, null, null, 32128, null);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void addArticleToListenLater(com.tencent.pigeon.biz.BizArticleListenContextInfo articleInfo) {
        kotlin.jvm.internal.o.g(articleInfo, "articleInfo");
        android.app.Activity activity = this.f67066i;
        java.lang.String str = this.f67061d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i(str, "addArticleToListenLater need activity");
            return;
        }
        if (articleInfo.getAudioId() == null || articleInfo.getArticleUrl() == null) {
            com.tencent.mars.xlog.Log.i(str, "addArticleToListenLater need audioId");
            return;
        }
        bw5.v70 v70Var = new bw5.v70();
        v70Var.y(3);
        bw5.j40 j40Var = new bw5.j40();
        j40Var.i(articleInfo.getArticleUrl());
        j40Var.g(articleInfo.getAudioId());
        v70Var.o(j40Var);
        bw5.lp0 lp0Var = new bw5.lp0();
        lp0Var.j(v70Var);
        com.tencent.wechat.iam.finder_box.e eVar = com.tencent.wechat.iam.finder_box.e.f217831b;
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        eVar.a(lp0Var, 1210, b50.a.f17918a);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void addContact(java.lang.String username, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void addToGeneralPreload(java.lang.String url, long j17, long j18, long j19) {
        kotlin.jvm.internal.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).b(url, (int) j17, (int) j18, (int) j19, new java.lang.Object[0]);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void addToPreload(java.lang.String url, long j17, long j18, java.lang.String str) {
        kotlin.jvm.internal.o.g(url, "url");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(url, (int) j17, (int) j18, str, new java.lang.Object[0]);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void createMagicAdBrandService(long j17) {
        ((cx.j1) ((bx.v) i95.n0.c(bx.v.class))).Di((int) j17);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void createMagicBrandService(long j17) {
        ((cx.j1) ((bx.r) i95.n0.c(bx.r.class))).Di((int) j17);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean deleteByMsgId(long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new b50.d(this, j17), "FlutterBizThread");
        return true;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean deleteByTalker(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        qk.o b17 = r01.q3.cj().b1(userName);
        com.tencent.mars.xlog.Log.i(this.f67061d, "deleteByTalker, username = ".concat(userName));
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = this.f67066i;
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.a(b17, activity, n17, false, 0);
        return true;
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void didSelectPersonalTab(long j17, long j18) {
        ur1.e eVar = ur1.e.f430346d;
        ur1.e eVar2 = ur1.e.f430346d;
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        eVar2.d(context, (int) j17, (int) j18, this.f67063f);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void doSearch() {
        yw.h1.f466332a.a();
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean draftExist(long j17) {
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        return ((ur1.s) b0Var).Bi((int) j17, "", 1, com.tencent.wechat.mm.biz.h2.PUBLISH_SCENE_PERSONAL_CENTER);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void fetchContactsCreateTimeIfNeed(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.K(null, b50.p.f17977d);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void followBizContact(com.tencent.pigeon.biz_base.BizRecFollowActionInfo info, yz5.l callback) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        yw.h1.f466332a.f(info, new b50.u(callback));
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.tencent.mars.xlog.Log.i(this.f67061d, "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
        } else {
            if (a50.v0.f1544a.a("notifyInfo") || a50.v0.f1546c) {
                return;
            }
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = obj;
            pm0.v.X(new b50.s0(this, h0Var));
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public com.tencent.pigeon.biz_base.BizEnterStatusInfo getBizEnterStatusInfo() {
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = yw.y1.f466512b;
        yw.y1.f466512b = null;
        yw.y1.f466513c = false;
        return bizEnterStatusInfo;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getBizFinderLivesInfo(boolean z17, yz5.l result) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new b50.o(this, this.f67068n, z17, null, new java.util.ArrayList(), null), 2, null);
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        r45.qk f17 = b0Var.f();
        if (f17 == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new java.util.ArrayList())));
            return;
        }
        long q17 = b0Var.h().q("live_bar_list_last_refresh_time", 0L);
        int o17 = b0Var.h().o("bar_list_keep_data_interval-2", 0);
        if (o17 < 60) {
            o17 = 60;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - q17;
        long j17 = o17 * 1000;
        java.lang.String str = this.f67061d;
        if (currentTimeMillis >= j17) {
            com.tencent.mars.xlog.Log.i(str, "getBizFinderLivesInfo cache expire");
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new java.util.ArrayList())));
            return;
        }
        b0Var.v(75L);
        java.util.LinkedList live_info = f17.f384063d;
        kotlin.jvm.internal.o.f(live_info, "live_info");
        java.util.List k17 = b0Var.k(live_info, z17);
        com.tencent.mars.xlog.Log.i(str, "getBizFinderLivesInfo use cache  size=" + k17.size());
        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(k17, 10));
        java.util.Iterator it = k17.iterator();
        while (it.hasNext()) {
            arrayList.add(a((r45.lk) it.next()));
        }
        result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.n0.V0(arrayList))));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public java.lang.String getBizImgCacheDirectory() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f67074t).getValue();
        kotlin.jvm.internal.o.f(str, "<get-imgCacheDirectory>(...)");
        return str;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public java.lang.String getBizImgPreviewDirectory() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f67075u).getValue();
        kotlin.jvm.internal.o.f(str, "<get-imgPreviewCacheDirectory>(...)");
        return str;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public java.lang.String getCdnUrlList() {
        java.lang.String a17 = qk.c.a();
        kotlin.jvm.internal.o.f(a17, "getCdnUrlList(...)");
        return a17;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getContactInfo(java.lang.String userName, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(yw.h1.f466332a.h(userName))));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getContactInfoBatch(java.util.List userNames, yz5.l callback) {
        kotlin.jvm.internal.o.g(userNames, "userNames");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new b50.v(callback, userNames));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getContactInfoOrSync(java.lang.String username, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        yw.h1.f466332a.i(username, new b50.w(callback));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public java.lang.String getCurrentClientVersion() {
        java.lang.String CLIENT_VERSION = com.tencent.mm.sdk.platformtools.z.f193111g;
        kotlin.jvm.internal.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        return CLIENT_VERSION;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getMassSendData(long j17, boolean z17, boolean z18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new b50.x(callback, j17, z17, z18));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public com.tencent.pigeon.biz_base.NativeBizCreationInfo getNativeBizCreationInfo() {
        return new com.tencent.pigeon.biz_base.NativeBizCreationInfo(null, null, 3, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getNetWorkInfo(yz5.l result) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(Bi == 3 || Bi == 4 || Bi == 5);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.biz_base.NetworkInfo(formatedNetType, valueOf, (java.lang.Boolean) m17))));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public com.tencent.pigeon.biz_base.BizNotifyTipsInfo getNotifyTipsInfo() {
        return yw.h1.f466332a.g();
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getOftenReadAccountInfo(java.lang.String userName, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new b50.y(callback, userName));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getOftenReadAccountInfoBatch(java.util.List userNames, yz5.l callback) {
        kotlin.jvm.internal.o.g(userNames, "userNames");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new b50.z(callback, userNames));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public com.tencent.pigeon.biz.PersonalCenterTabInfo getPersonalCenterCellList() {
        ur1.e eVar = ur1.e.f430346d;
        ur1.e eVar2 = ur1.e.f430346d;
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        return eVar2.b(context);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void getPlayStatusReportInfo(java.lang.String tid, java.lang.String streamUrl, yz5.l callback) {
        kotlin.jvm.internal.o.g(tid, "tid");
        kotlin.jvm.internal.o.g(streamUrl, "streamUrl");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(lx.x.f322000a.a(tid, streamUrl))));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getRecycleCardList(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.xl5> a17 = zr1.b.a(j17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(a17, 10));
        for (r45.xl5 xl5Var : a17) {
            arrayList2.add(new com.tencent.pigeon.biz_base.RecycleCardPigeon(xl5Var.f390215d, java.lang.Long.valueOf(xl5Var.f390216e), java.lang.Long.valueOf(xl5Var.f390217f), xl5Var.f390218g, xl5Var.f390219h));
        }
        arrayList.addAll(arrayList2);
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void getSessionJumpPaths(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (yw.h1.f466343l <= 0) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
            return;
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        int i17 = (int) j17;
        b50.a0 a0Var = new b50.a0(this, callback);
        cy1.a aVar = (cy1.a) rVar;
        if (aVar.oj()) {
            com.tencent.mars.xlog.Log.i("Amoeba.DataReportService", "[obtainPagePaths]");
            sz1.i.b(new cy1.a$$h(aVar, i17, a0Var));
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public long getUnReadCount() {
        long j17;
        com.tencent.mm.storage.b2 nj6 = r01.q3.nj();
        synchronized (nj6) {
            j17 = nj6.f193767h;
        }
        return r01.q3.nj().k1(j17 << 32);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void gotoBizAudioPage(byte[] recommendListBuffer, yz5.l callback) {
        kotlin.jvm.internal.o.g(recommendListBuffer, "recommendListBuffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void gotoBizAudioPlayerWithUrls(java.util.List urls, long j17, long j18, yz5.l callback) {
        kotlin.jvm.internal.o.g(urls, "urls");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = urls.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            bw5.j40 j40Var = new bw5.j40();
            j40Var.i(str);
            bw5.v70 v70Var = new bw5.v70();
            v70Var.y(2);
            v70Var.o(j40Var);
            arrayList.add(v70Var);
        }
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 1210, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554425, null);
        eVar.f292122s.f292130b = true;
        ((mm1.b0) ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi()).e(eVar, arrayList);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void gotoBizMeTabPage(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).cj(this.f67066i, new rv.l3(false, 0L, null, null, false, 0L, 63, null));
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void gotoBizPublishPage(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.wechat.mm.biz.b2 b2Var = new com.tencent.wechat.mm.biz.b2();
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).hj(this.f67066i, b2Var, b50.b0.f17924a);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoBizTestUI() {
        android.app.Activity activity;
        if (!eq1.n0.f255837a.a() || (activity = this.f67066i) == null) {
            return;
        }
        j45.l.h(activity, "brandservice", ".ui.timeline.BizTestUI");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoChattingUI(com.tencent.pigeon.biz_base.BizChattingJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        boolean z17 = jumpInfo.getUserName().length() == 0;
        java.lang.String str = this.f67061d;
        if (z17) {
            com.tencent.mars.xlog.Log.e(str, "userName should not be null");
            return;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(jumpInfo.getUserName());
        if (p17 == null) {
            com.tencent.mars.xlog.Log.e(str, "conversation is null. username: %s", jumpInfo.getUserName());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", jumpInfo.getUserName());
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", p17 != null ? p17.d1() : 0);
        java.lang.Long clickPos = jumpInfo.getClickPos();
        intent.putExtra("biz_click_item_position", (clickPos != null ? clickPos.longValue() : 0L) + 1);
        intent.putExtra("KOpenArticleSceneFromScene", jumpInfo.getChattingSubScene());
        java.lang.Long openChattingFromScene = jumpInfo.getOpenChattingFromScene();
        intent.putExtra("specific_chat_from_scene", openChattingFromScene != null ? (int) openChattingFromScene.longValue() : 0);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if ((r9 == null || r26.n0.N(r9)) == false) goto L36;
     */
    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gotoFinder(com.tencent.pigeon.biz_base.BizFinderJumpInfo r22) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finderbox.flutter.model.BoxFlutterBizPlugin.gotoFinder(com.tencent.pigeon.biz_base.BizFinderJumpInfo):void");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoFinderPaywall(com.tencent.pigeon.biz_base.FinderPageJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_inlet_source", 18);
        if (jumpInfo.getFinderUsername() != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String finderUsername = jumpInfo.getFinderUsername();
            kotlin.jvm.internal.o.d(finderUsername);
            ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nk(context, intent, finderUsername, 26, 2);
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoFinderProfile(com.tencent.pigeon.biz_base.FinderPageJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        if (jumpInfo.getFinderUsername() == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String finderUsername = jumpInfo.getFinderUsername();
        kotlin.jvm.internal.o.d(finderUsername);
        intent.putExtra("finder_username", finderUsername);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoOldList(long j17, long j18) {
        new java.lang.AssertionError("can not go to old list");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoProfile(com.tencent.pigeon.biz_base.BizProfileJumpInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.content.Intent intent = new android.content.Intent();
        java.lang.Long enterTarget = info.getEnterTarget();
        boolean z17 = true;
        if ((enterTarget != null ? enterTarget.longValue() : 0L) == 1) {
            intent.putExtra("biz_profile_tab_type", 1);
        }
        intent.putExtra("Contact_User", info.getUserName());
        java.lang.Long addContactScene = info.getAddContactScene();
        intent.putExtra("Contact_Scene", addContactScene != null ? (int) addContactScene.longValue() : 0);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("key_extra_info", info.getBizFinderExtraData());
        java.lang.Long openArticleFromScene = info.getOpenArticleFromScene();
        intent.putExtra("KOpenArticleSceneFromScene", openArticleFromScene != null ? (int) openArticleFromScene.longValue() : 0);
        intent.putExtra("url", info.getArticleUrl());
        intent.putExtra("biz_from_scene", info.getBizFromScene());
        java.lang.String userName = info.getUserName();
        if (userName != null && !r26.n0.N(userName)) {
            z17 = false;
        }
        if (!z17) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(info.getUserName());
        }
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void gotoSettingUI() {
        com.tencent.mars.xlog.Log.i(this.f67061d, "gotoSettingUI");
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI.class);
        android.app.Activity activity = this.f67066i;
        if (activity != null && (activity instanceof com.tencent.mm.ui.MMActivity)) {
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.tencent.mm.ui.MMActivity) activity, "com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI", intent, this.f67067m, new b50.g0(this));
        } else if (context != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/finderbox/flutter/model/BoxFlutterBizPlugin", "gotoSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/finderbox/flutter/model/BoxFlutterBizPlugin", "gotoSettingUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoTingWithUrls(java.util.List urls, long j17, long j18) {
        kotlin.jvm.internal.o.g(urls, "urls");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = urls.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            bw5.j40 j40Var = new bw5.j40();
            j40Var.i(str);
            bw5.v70 v70Var = new bw5.v70();
            v70Var.y(2);
            v70Var.o(j40Var);
            arrayList.add(v70Var);
        }
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        il4.e eVar = new il4.e(null, 0, 1210, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554425, null);
        eVar.f292122s.f292130b = true;
        ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).H(eVar, arrayList);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean hasMinimizeArticle(java.lang.String url) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(url, "url");
        if (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            return false;
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        eq1.o0 a17 = eq1.a.f255785a.a(url);
        if (a17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(a17.f255848c);
            sb6.append(a17.f255846a);
            sb6.append(a17.f255847b);
            str = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
            kotlin.jvm.internal.o.f(str, "getMD5String(...)");
        } else {
            str = "";
        }
        multiTaskInfo.field_id = str;
        multiTaskInfo.field_type = 26;
        return ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean hasMinimizeFinder(java.lang.String finderObjectId) {
        kotlin.jvm.internal.o.g(finderObjectId, "finderObjectId");
        if (!((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            return false;
        }
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
        multiTaskInfo.field_id = finderObjectId;
        multiTaskInfo.field_type = 22;
        return ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean isFinderContactFollow(java.lang.String finderUsername) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        return !((q92.h) ((m40.g0) i95.n0.c(m40.g0.class))).Ai(finderUsername);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean isLiveBarItemExposured(java.lang.String userName, java.lang.String finderId) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(finderId, "finderId");
        return com.tencent.mm.pluginsdk.model.b0.f189197a.n(userName, finderId);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean isPaid(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return lr1.f.f320657a.b(url);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void launchBizFinderFeed(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        long j17;
        int i17;
        kotlin.jvm.internal.o.g(info, "info");
        android.content.Intent intent = new android.content.Intent();
        java.lang.String objectId = info.getObjectId();
        if (objectId == null || objectId.length() == 0) {
            j17 = 0;
        } else {
            j17 = pm0.v.Z(info.getObjectId());
            intent.putExtra("feed_object_id", j17);
        }
        if (j17 == 0) {
            intent.putExtra("feedID", info.getExportId());
        }
        intent.putExtra("nonceID", info.getNonceId());
        intent.putExtra("key_session_id", info.getFromSessionIdInfo());
        intent.putExtra("from_user", info.getEncryptUsername());
        intent.putExtra("allow_pull_top", true);
        intent.putExtra("key_extra_info", info.getReportInfo());
        java.lang.Long currentPlayMs = info.getCurrentPlayMs();
        if ((currentPlayMs != null ? currentPlayMs.longValue() : -1L) >= 0) {
            intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", info.getCurrentPlayMs());
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        if (vd2.t3.f435921a.e()) {
            intent.putExtra("key_enable_mixed_timeline_with_liveroom", true);
        }
        java.lang.Long bizFromScene = info.getBizFromScene();
        if (bizFromScene != null && ((int) bizFromScene.longValue()) == 1) {
            intent.putExtra("key_reuqest_scene", 55);
            i17 = 40;
        } else {
            java.lang.Long bizFromScene2 = info.getBizFromScene();
            if (bizFromScene2 != null && ((int) bizFromScene2.longValue()) == 2) {
                intent.putExtra("key_reuqest_scene", 37);
            } else {
                intent.putExtra("key_reuqest_scene", 27);
            }
            i17 = 2;
        }
        if (((zy2.b6) i95.n0.c(zy2.b6.class)) != null) {
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context = this.f67066i;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            java.lang.Boolean isLandscapeVideo = info.isLandscapeVideo();
            e1Var.O(26, i17, 25, context, intent, null, isLandscapeVideo != null ? isLandscapeVideo.booleanValue() : false);
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void launchMiniProgram(com.tencent.pigeon.biz_base.MiniProgramLaunchBundle bundle) {
        kotlin.jvm.internal.o.g(bundle, "bundle");
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = bundle.getAppid();
        b1Var.f317012a = bundle.getUsername();
        b1Var.f317022f = bundle.getPath();
        java.lang.Long scene = bundle.getScene();
        kotlin.jvm.internal.o.d(scene);
        b1Var.f317032k = (int) scene.longValue();
        b1Var.f317034l = bundle.getScene_note();
        b1Var.f317028i = new b50.j0(bundle);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77323e = bundle.getAppid();
        b1Var.f317041s.f77324f = bundle.getReferrer_info_extra_data();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f67066i, b1Var);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void loadLocalOftenReadInfo(yz5.l callback) {
        byte[] initialProtobufBytes;
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            r45.fm6 a17 = bs1.a.a();
            if (a17 != null) {
                initialProtobufBytes = a17.initialProtobufBytes();
                if (initialProtobufBytes == null) {
                }
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(initialProtobufBytes)));
            }
            initialProtobufBytes = new byte[0];
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(initialProtobufBytes)));
        } catch (java.lang.Exception unused) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new byte[0])));
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void markLiveBarItemExposured(java.lang.String userName, java.lang.String finderId) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(finderId, "finderId");
        if (com.tencent.mm.pluginsdk.model.b0.f189197a.h().i("showLiveBarWhenExpose", false)) {
            return;
        }
        com.tencent.mm.pluginsdk.model.b0.f189203g.put(userName, finderId);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void markOftenReadAccountExpiredIfNeed(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(username);
        if (p17 != null) {
            p17.Y1(0);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, username);
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void notifyRecycleCardResult(byte[] retBuffer, yz5.l callback) {
        kotlin.jvm.internal.o.g(retBuffer, "retBuffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (retBuffer.length == 0) {
            return;
        }
        try {
            r45.jk jkVar = new r45.jk();
            jkVar.parseFrom(retBuffer);
            zr1.b.b(jkVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w(this.f67061d, "updateRecycleCardResult fail e:%s", e17.getMessage());
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f67061d, "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        this.f67066i = activity;
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.a(this);
        }
        yw.h1.f466332a.u();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion companion = com.tencent.pigeon.biz_base.BizBaseApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        com.tencent.pigeon.biz.BizApi.Companion companion2 = com.tencent.pigeon.biz.BizApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizApi.Companion.setUp$default(companion2, binaryMessenger2, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        this.f67062e = new com.tencent.pigeon.biz_base.BizBaseCallbackApi(binaryMessenger3, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger4 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger4, "getBinaryMessenger(...)");
        this.f67063f = new com.tencent.pigeon.biz.BizCallbackApi(binaryMessenger4, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger5 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger5, "getBinaryMessenger(...)");
        this.f67064g = new com.tencent.pigeon.biz.BizPersonalCenterNativeToFlutterApi(binaryMessenger5, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger6 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger6, "getBinaryMessenger(...)");
        this.f67065h = new com.tencent.pigeon.biz_base.BizPerformanceReportEvent(binaryMessenger6, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger7 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger7, "getBinaryMessenger(...)");
        new com.tencent.pigeon.biz.BizInteractiveCallbackApi(binaryMessenger7, null, 2, null);
        r01.q3.oj().j0(this.f67073s, android.os.Looper.getMainLooper());
        this.f67071q.alive();
        this.f67072r.alive();
        this.f67070p.alive();
        this.f67077w.alive();
        this.f67078x.alive();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94249a.b();
        com.tencent.mars.xlog.Log.i(this.f67061d, "onAttachedToEngine callback:" + this.f67062e);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onClickNotifyTips() {
        ((vw.m2) ((rv.k3) i95.n0.c(rv.k3.class))).fj(this.f67066i, 0, 0);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onClickSearchBar() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.wechat.mm.finder_box.c0 a17;
        java.lang.String str = this.f67061d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f67066i;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.app.Activity activity2 = this.f67066i;
        if (activity2 != null && activity2.isFinishing()) {
            yw.h1 h1Var = yw.h1.f466332a;
            h1Var.u();
            com.tencent.mm.pluginsdk.model.b0.f189197a.w();
            a50.v0 v0Var = a50.v0.f1544a;
            com.tencent.mm.storage.c2.f193805c = false;
            if (h1Var.n() && (a17 = a50.e1.f1471a.a()) != null) {
                a17.r(a50.s0.f1535a);
            }
            a50.v0.f1545b = true;
            a50.v0.f1547d = java.lang.System.currentTimeMillis();
            a50.v0.f1548e = false;
            long e17 = com.tencent.mm.storage.c2.e() * 1000;
            com.tencent.mars.xlog.Log.i("Finder.BoxBizFlutterInstantsHelper", "onUIDestroy startTimer delay=" + e17);
            long j17 = a50.v0.f1547d;
            ku5.u0 u0Var = ku5.t0.f312615d;
            a50.t0 t0Var = new a50.t0(j17);
            ku5.t0 t0Var2 = (ku5.t0) u0Var;
            t0Var2.getClass();
            t0Var2.w(t0Var, e17, null);
            com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback(a50.v0.f1551h);
            lr1.k kVar = lr1.k.f320682a;
        }
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.pluginsdk.model.s.f189432d);
        android.app.Activity activity3 = this.f67066i;
        com.tencent.mm.ui.MMActivity mMActivity = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this);
        }
        this.f67066i = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f67066i = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion companion = com.tencent.pigeon.biz_base.BizBaseApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        com.tencent.pigeon.biz.BizApi.Companion companion2 = com.tencent.pigeon.biz.BizApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz.BizApi.Companion.setUp$default(companion2, binaryMessenger2, null, null, 4, null);
        r01.q3.oj().P(this.f67073s);
        this.f67071q.dead();
        this.f67072r.dead();
        this.f67070p.dead();
        this.f67077w.dead();
        this.f67078x.dead();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        this.f67062e = null;
        this.f67063f = null;
        this.f67064g = null;
        this.f67065h = null;
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94249a.b();
        com.tencent.mars.xlog.Log.i(this.f67061d, "onDetachedFromEngine");
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void onExitPersonalCenter() {
        ur1.e eVar = ur1.e.f430346d;
        ur1.e.f430346d.f430347a = 0L;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean onExpand(long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new b50.m0(j17), "FlutterBizThread");
        return true;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onExposed(long j17, java.lang.String userName, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        ((ku5.t0) ku5.t0.f312615d).h(new b50.n0(z18, userName), "FlutterBizThread");
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void onInitPersonalCenter(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ur1.e eVar = ur1.e.f430346d;
        eVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        eVar.f430347a = currentTimeMillis;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Long.valueOf(currentTimeMillis))));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onMinimizeArticle(com.tencent.pigeon.biz_base.BizMinimizeInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i(this.f67061d, "onMinimizeArticle url = " + info.getUrl());
        if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            new mx.e(new mx.f(this.f67066i)).c0(info);
            return;
        }
        r45.lr4 lr4Var = new r45.lr4();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String userName = info.getUserName();
        ((sg3.a) v0Var).getClass();
        java.lang.String e17 = c01.a2.e(userName);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(info.getUserName());
        java.lang.String d17 = n07 != null ? n07.d() : null;
        lr4Var.set(0, e17);
        lr4Var.set(1, info.getTitle());
        lr4Var.set(2, d17);
        lr4Var.set(5, d17);
        lr4Var.set(7, java.lang.Boolean.FALSE);
        r45.k97 k97Var = new r45.k97();
        k97Var.set(2, info.getUrl());
        k97Var.set(1, info.getUrl());
        k97Var.set(13, 90);
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new b50.o0(lr4Var, info, this, k97Var, null), 3, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onMinimizeFinder(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i(this.f67061d, "doFinderMultiTask, objectId = " + info.getObjectId());
        boolean Ai = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai();
        android.graphics.Rect rect = null;
        if (!Ai || info.getAnimatedImage() == null) {
            bitmap = null;
        } else {
            try {
                bitmap2 = com.tencent.mm.sdk.platformtools.x.G(info.getAnimatedImage());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizMultiTaskHelper", e17, "onMinimizeFinder", new java.lang.Object[0]);
                bitmap2 = null;
            }
            bitmap = bitmap2;
        }
        if (Ai && info.getAnimatedImageRect() != null) {
            com.tencent.pigeon.biz_base.BizRect animatedImageRect = info.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect);
            java.lang.Double left = animatedImageRect.getLeft();
            int doubleValue = left != null ? (int) left.doubleValue() : 0;
            com.tencent.pigeon.biz_base.BizRect animatedImageRect2 = info.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect2);
            java.lang.Double top = animatedImageRect2.getTop();
            int doubleValue2 = top != null ? (int) top.doubleValue() : 0;
            com.tencent.pigeon.biz_base.BizRect animatedImageRect3 = info.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect3);
            java.lang.Double right = animatedImageRect3.getRight();
            int doubleValue3 = right != null ? (int) right.doubleValue() : 0;
            com.tencent.pigeon.biz_base.BizRect animatedImageRect4 = info.getAnimatedImageRect();
            kotlin.jvm.internal.o.d(animatedImageRect4);
            java.lang.Double bottom = animatedImageRect4.getBottom();
            rect = new android.graphics.Rect(doubleValue, doubleValue2, doubleValue3, bottom != null ? (int) bottom.doubleValue() : 0);
        }
        android.graphics.Rect rect2 = rect;
        if (Ai) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.b6 b6Var = (zy2.b6) c17;
            android.app.Activity activity = this.f67066i;
            long Z = pm0.v.Z(info.getObjectId());
            java.lang.String title = info.getTitle();
            java.lang.String str = title == null ? "" : title;
            java.lang.String coverImgUrl = info.getCoverImgUrl();
            java.lang.String str2 = coverImgUrl == null ? "" : coverImgUrl;
            java.lang.String nickName = info.getNickName();
            java.lang.String str3 = nickName == null ? "" : nickName;
            java.lang.String headImgUrl = info.getHeadImgUrl();
            java.lang.String str4 = headImgUrl == null ? "" : headImgUrl;
            java.lang.Long finderDuration = info.getFinderDuration();
            zy2.b6.F1(b6Var, activity, Z, str, str2, str3, str4, finderDuration != null ? finderDuration.longValue() : 0L, bitmap, rect2, 0, 0L, "", com.tencent.mm.plugin.appbrand.jsapi.mc.CTRL_INDEX, null);
            return;
        }
        i95.m c18 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.b6 b6Var2 = (zy2.b6) c18;
        android.app.Activity activity2 = this.f67066i;
        long Z2 = pm0.v.Z(info.getObjectId());
        java.lang.String title2 = info.getTitle();
        java.lang.String str5 = title2 == null ? "" : title2;
        java.lang.String coverImgUrl2 = info.getCoverImgUrl();
        java.lang.String str6 = coverImgUrl2 == null ? "" : coverImgUrl2;
        java.lang.String nickName2 = info.getNickName();
        java.lang.String str7 = nickName2 == null ? "" : nickName2;
        java.lang.String headImgUrl2 = info.getHeadImgUrl();
        java.lang.String str8 = headImgUrl2 == null ? "" : headImgUrl2;
        java.lang.Long finderDuration2 = info.getFinderDuration();
        zy2.b6.Yg(b6Var2, activity2, Z2, str5, str6, str7, str8, finderDuration2 != null ? finderDuration2.longValue() : 0L, 0, 0L, "", 384, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f67066i = binding.getActivity();
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i(this.f67061d, "onStateChanged() event = " + event);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openBanWebPage(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openBusinessProfilePage(java.lang.String userName, long j17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (userName.length() == 0) {
            com.tencent.mars.xlog.Log.i(this.f67061d, "openBusinessProfilePage: userName empty");
            return;
        }
        i95.m c17 = i95.n0.c(r01.l1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r01.l1 l1Var = (r01.l1) c17;
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        r01.l1.Zi(l1Var, context, userName, (int) j17, false, 8, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openFansMsg() {
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.h(context, "brandservice", ".conversation.ui.BizFansConversationListUI");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openFinderContact(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", info.getEncryptUsername());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 2, 32, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        e1Var.w(context, intent);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void openFriendLikeSettingPage() {
        mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((lf0.h0) g0Var).getClass();
        wm4.u.t(context, "heartLike");
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void openInteractiveUrl(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void openMpAppUrl(java.lang.String url, com.tencent.pigeon.biz.BizOpenMpAppUrlScene scene) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(scene, "scene");
        int ordinal = scene.ordinal();
        rv.q2 q2Var = (rv.q2) i95.n0.c(rv.q2.class);
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((qv.i) q2Var).Bi(context, url, ordinal);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openPersonalCenterMiniAppPage(com.tencent.pigeon.biz_base.PersonalCenterJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this.f67064g);
        java.lang.Boolean requestAcct = jumpInfo.getRequestAcct();
        boolean booleanValue = requestAcct != null ? requestAcct.booleanValue() : false;
        b50.z0 z0Var = new b50.z0(booleanValue, weakReference);
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        l1Var.aj(context, jumpInfo, z0Var, new b50.w0(this, booleanValue, weakReference));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void openRealNameAuthPage(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(url);
        sb6.append("&wechat_real_lang=" + com.tencent.mm.sdk.platformtools.m2.d());
        intent.putExtra("rawUrl", sb6.toString());
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openSubscribeAccountList(long j17) {
        rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((vw.m2) k3Var).bj(context, (int) j17);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openUrl(com.tencent.pigeon.biz_base.BizArticleInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        yw.h1 h1Var = yw.h1.f466332a;
        android.content.Context context = this.f67066i;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        h1Var.s(info, context);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void preloadEnvForPluginApp() {
        ((r01.l1) i95.n0.c(r01.l1.class)).bj();
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void preloadFinderDataItems(java.util.List finderExportIdList, yz5.l callback) {
        kotlin.jvm.internal.o.g(finderExportIdList, "finderExportIdList");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void preloadPic(java.util.List preloadPicList) {
        kotlin.jvm.internal.o.g(preloadPicList, "preloadPicList");
        if (preloadPicList.isEmpty()) {
            return;
        }
        java.util.Iterator it = preloadPicList.iterator();
        while (it.hasNext()) {
            try {
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.h.f94249a.d(((com.tencent.pigeon.biz_base.PreloadPicInfo) it.next()).getPreloadPicUrls(), 1);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e(this.f67061d, "preloadPic failed: " + e17.getMessage());
            }
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void removeMinimizeArticle(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            mx.a aVar = mx.e.f331813x;
            multiTaskInfo.field_id = aVar.a(url);
            multiTaskInfo.field_type = 26;
            if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo)) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.multitask.j0.We((com.tencent.mm.plugin.multitask.j0) c17, aVar.a(url), 26, false, 4, null);
                android.app.Activity activity = this.f67066i;
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                e4Var.d(com.tencent.mm.R.string.n5w);
                e4Var.c();
            }
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void removeMinimizeFinder(java.lang.String finderObjectId) {
        kotlin.jvm.internal.o.g(finderObjectId, "finderObjectId");
        if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai()) {
            com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
            multiTaskInfo.field_id = finderObjectId;
            multiTaskInfo.field_type = 22;
            if (((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ri(multiTaskInfo)) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.multitask.j0.We((com.tencent.mm.plugin.multitask.j0) c17, finderObjectId, 22, false, 4, null);
                android.app.Activity activity = this.f67066i;
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
                e4Var.d(com.tencent.mm.R.string.n5w);
                e4Var.c();
            }
        }
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void reportPersonalCenter(long j17, long j18, long j19, java.lang.String biz, boolean z17, java.lang.String wording) {
        kotlin.jvm.internal.o.g(biz, "biz");
        kotlin.jvm.internal.o.g(wording, "wording");
        ur1.e.f430346d.c(j17, j18, j19, biz, z17, wording, 0L);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void requestFinderLiveStats(java.lang.String finder_export_id, long j17, yz5.l result) {
        kotlin.jvm.internal.o.g(finder_export_id, "finder_export_id");
        kotlin.jvm.internal.o.g(result, "result");
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.U9((s40.w0) c17, 0L, "", 65, 2, "", true, null, 0L, null, false, false, finder_export_id, null, (int) j17, com.tencent.mm.compatible.util.Exif.PARSE_EXIF_ERROR_UNKNOWN_BYTEALIGN, null).l().K(new b50.a1(result, this));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void requestWCPayIsReg() {
        gm0.j1.d().a(385, new b50.c1(this, new java.lang.ref.WeakReference(this.f67064g)));
        ((li3.g) ((h45.s) i95.n0.c(h45.s.class))).Ui(0);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void resetRedDot() {
        yw.h1.f466332a.u();
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void saveFinderLivesInfoBatch(java.util.List infos, yz5.l callback) {
        r45.g77 g77Var;
        kotlin.jvm.internal.o.g(infos, "infos");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f67061d, "saveFinderLivesInfoBatch infos size=" + infos.size());
        java.util.Iterator it = infos.iterator();
        while (it.hasNext()) {
            com.tencent.pigeon.biz_base.BizFinderLiveInfo bizFinderLiveInfo = (com.tencent.pigeon.biz_base.BizFinderLiveInfo) it.next();
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            r45.lk lkVar = new r45.lk();
            lkVar.f379533d = bizFinderLiveInfo.getBizusername();
            lkVar.f379534e = bizFinderLiveInfo.getFinder_feed_export_id();
            java.lang.Long refresh_interval = bizFinderLiveInfo.getRefresh_interval();
            lkVar.f379535f = refresh_interval != null ? (int) refresh_interval.longValue() : 0;
            lkVar.f379536g = bizFinderLiveInfo.getTitle();
            java.lang.Long live_scene = bizFinderLiveInfo.getLive_scene();
            lkVar.f379537h = live_scene != null ? (int) live_scene.longValue() : 0;
            lkVar.f379538i = bizFinderLiveInfo.getCover();
            java.lang.Boolean use_weapp = bizFinderLiveInfo.getUse_weapp();
            lkVar.f379539m = use_weapp != null ? use_weapp.booleanValue() : false;
            com.tencent.pigeon.biz_base.WeApp_Data weapp_data = bizFinderLiveInfo.getWeapp_data();
            if (weapp_data != null) {
                g77Var = new r45.g77();
                g77Var.f374971d = weapp_data.getAppid();
                java.lang.Long version_type = weapp_data.getVersion_type();
                g77Var.f374972e = version_type != null ? (int) version_type.longValue() : 0;
                g77Var.f374973f = new com.tencent.mm.protobuf.g(weapp_data.getData_buffer());
                g77Var.f374974g = weapp_data.getPath();
            } else {
                g77Var = null;
            }
            lkVar.f379540n = g77Var;
            b0Var.x(lkVar);
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void saveLocalOftenReadInfo(byte[] infoBuffer, yz5.l callback) {
        kotlin.jvm.internal.o.g(infoBuffer, "infoBuffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            r45.fm6 fm6Var = new r45.fm6();
            fm6Var.parseFrom(infoBuffer);
            bs1.a.b(fm6Var);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void setPayStatus(java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(url, "url");
        lr1.f.f320657a.e(url, z17);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void startPreRenderPluginApp(com.tencent.pigeon.biz_base.PersonalCenterJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        l1Var.getClass();
        l1Var.Ui(new r01.j1(jumpInfo));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void triggerPreDownloadForPath(java.lang.String appId, java.lang.String path, long j17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(path, "path");
        ((r01.l1) i95.n0.c(r01.l1.class)).fj(appId, path, (int) j17);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void tryPreloadFinderVideo(java.lang.String exportId, java.lang.String nonceId, java.lang.String objectId, yz5.l callback) {
        kotlin.jvm.internal.o.g(exportId, "exportId");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(objectId, "objectId");
        kotlin.jvm.internal.o.g(callback, "callback");
        i95.m c17 = i95.n0.c(zy2.a7.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.a7.Ea((zy2.a7) c17, exportId, nonceId, 162, 1, 0, 16, null);
        com.tencent.mars.xlog.Log.i(this.f67061d, "tryPreloadFinderVideo exportId=" + exportId + " nonceId=" + nonceId + " objectId=" + objectId);
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void tryPreloadFinderVideoArray(java.util.List infoList, yz5.l callback) {
        kotlin.jvm.internal.o.g(infoList, "infoList");
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean isEmpty = infoList.isEmpty();
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.String str = this.f67061d;
        if (isEmpty) {
            com.tencent.mars.xlog.Log.i(str, "batch preload finder video, info list is empty");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(f0Var)));
            return;
        }
        java.util.ArrayList<com.tencent.pigeon.biz.BizFinderPreloadPigeonInfo> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : infoList) {
            java.lang.String exportId = ((com.tencent.pigeon.biz.BizFinderPreloadPigeonInfo) obj).getExportId();
            if (!(exportId == null || exportId.length() == 0)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (com.tencent.pigeon.biz.BizFinderPreloadPigeonInfo bizFinderPreloadPigeonInfo : arrayList) {
            java.lang.String exportId2 = bizFinderPreloadPigeonInfo.getExportId();
            if (exportId2 == null) {
                exportId2 = "";
            }
            arrayList2.add(new jz5.l(exportId2, bizFinderPreloadPigeonInfo.getNonceId()));
        }
        java.util.List<jz5.l> S0 = kz5.n0.S0(arrayList2);
        for (jz5.l lVar : S0) {
            com.tencent.mars.xlog.Log.i(str, "batch preload finder video exportId=" + ((java.lang.String) lVar.f302833d) + ", nonceId=" + ((java.lang.String) lVar.f302834e));
        }
        ((com.tencent.mm.plugin.finder.service.l2) ((zy2.a7) i95.n0.c(zy2.a7.class))).Ai(S0, 162, 3, true, true);
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(f0Var)));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void unfollowFinderContact(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String objectId = info.getObjectId();
        long Z = !(objectId == null || objectId.length() == 0) ? pm0.v.Z(info.getObjectId()) : 0L;
        java.lang.String encryptUsername = info.getEncryptUsername();
        if (com.tencent.mm.sdk.platformtools.t8.K0(encryptUsername)) {
            com.tencent.mars.xlog.Log.w(this.f67061d, "unfollow finder contact fail, encryptUsername is empty!");
            return;
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.d(encryptUsername);
        ((c61.l7) b6Var).ql(encryptUsername, Z);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void updateBizFinderLivesInfo(java.util.List usernameList, yz5.l callback) {
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : usernameList) {
            if (com.tencent.mm.pluginsdk.model.b0.f189197a.C((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.List V0 = kz5.n0.V0(arrayList);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new b50.o(this, this.f67069o, false, callback, V0, null), 2, null);
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        pm0.v.X(new b50.u0(this));
    }

    @Override // com.tencent.pigeon.biz.BizApi
    public void tryPreloadFinderVideo(com.tencent.pigeon.biz.BizFinderPreloadPigeonInfo info, yz5.l callback) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        i95.m c17 = i95.n0.c(zy2.a7.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.a7 a7Var = (zy2.a7) c17;
        java.lang.String exportId = info.getExportId();
        java.lang.String str = exportId == null ? "" : exportId;
        java.lang.String nonceId = info.getNonceId();
        zy2.a7.Ea(a7Var, str, nonceId == null ? "" : nonceId, 162, 1, 0, 16, null);
        com.tencent.mars.xlog.Log.i(this.f67061d, "tryPreloadFinderVideo exportId=" + info.getExportId() + " nonceId=" + info.getNonceId() + " objectId=" + info.getObjectId());
    }
}

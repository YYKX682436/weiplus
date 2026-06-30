package com.tencent.mm.feature.brandecs;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/feature/brandecs/FlutterBrandEcsPlugin;", "Lcom/tencent/pigeon/brand_service/BrandServiceApi;", "Lcom/tencent/pigeon/biz_base/BizBaseApi;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "Ll75/z0;", "Landroidx/lifecycle/v;", "Lcom/tencent/mm/sdk/platformtools/f7;", "Lcom/tencent/pigeon/ecs/EcsNativeApi;", "<init>", "()V", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class FlutterBrandEcsPlugin implements com.tencent.pigeon.brand_service.BrandServiceApi, com.tencent.pigeon.biz_base.BizBaseApi, io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, l75.z0, androidx.lifecycle.v, com.tencent.mm.sdk.platformtools.f7, com.tencent.pigeon.ecs.EcsNativeApi {
    public static final /* synthetic */ f06.v[] B = {kotlin.jvm.internal.i0.d(new kotlin.jvm.internal.u(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.class, "isUserRejectPoiPopup", "isUserRejectPoiPopup()Z", 0))};
    public final com.tencent.mm.sdk.event.IListener A;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.biz_base.BizBaseCallbackApi f65190e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.brand_service.BrandServiceCallbackApi f65191f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f65192g;

    /* renamed from: h, reason: collision with root package name */
    public uw.y f65193h;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f65196n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f65197o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f65198p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f65199q;

    /* renamed from: r, reason: collision with root package name */
    public final l75.z0 f65200r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f65201s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f65202t;

    /* renamed from: u, reason: collision with root package name */
    public final e31.h f65203u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f65204v;

    /* renamed from: w, reason: collision with root package name */
    public final e31.i f65205w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f65206x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f65207y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f65208z;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f65189d = "MicroMsg.FlutterBrandServicePlugin";

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f65194i = jz5.h.b(zv.j4.f476007d);

    /* renamed from: m, reason: collision with root package name */
    public final b30.c f65195m = new b30.c(java.lang.Boolean.FALSE, "key_ecs_timeline_user_reject_poi_popup");

    public FlutterBrandEcsPlugin() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f65196n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveSwitchEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin$finderLiveSwitchEventListener$1
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
                com.tencent.mars.xlog.Log.i(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this.f65189d, "on FinderLiveSwitchEvent %s", dcVar.f6442b);
                ((ku5.t0) ku5.t0.f312615d).B(new zv.t2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this, event));
                return false;
            }
        };
        this.f65197o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin$appMsgRelatedInfoUpdateEventListener$1
            {
                this.__eventId = -1315546616;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent appMsgRelatedInfoUpdateEvent) {
                com.tencent.mm.autogen.events.AppMsgRelatedInfoUpdateEvent event = appMsgRelatedInfoUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (zv.e0.f475937a.a("notifyRelatedInfo") || zv.e0.f475939c) {
                    return false;
                }
                com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this;
                com.tencent.mars.xlog.Log.i(flutterBrandEcsPlugin.f65189d, "AppMsgRelatedInfoUpdateEvent scene %d", java.lang.Integer.valueOf(event.f53989g.f6297a));
                pm0.v.X(new zv.j2(flutterBrandEcsPlugin));
                return false;
            }
        };
        this.f65198p = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin$finderFollowUserEventIListener$1
            {
                this.__eventId = 398763182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (zv.e0.f475937a.a("notifyFinderInfo") || zv.e0.f475939c) {
                    return false;
                }
                com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this;
                com.tencent.mars.xlog.Log.i(flutterBrandEcsPlugin.f65189d, "FollowUserEvent scene %d", java.lang.Integer.valueOf(event.f54346g.f8552b));
                pm0.v.X(new zv.r2(flutterBrandEcsPlugin));
                return false;
            }
        };
        this.f65199q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin$brandEscTmplMsgChangeListener$1
            {
                this.__eventId = -1204934276;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent brandEcsTmplMsgChangeEvent) {
                com.tencent.mm.autogen.events.BrandEcsTmplMsgChangeEvent event = brandEcsTmplMsgChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this;
                java.lang.String str = flutterBrandEcsPlugin.f65189d;
                com.tencent.pigeon.biz_base.BizNotifyTipsInfo c17 = zv.q.f476079a.c();
                if (c17 == null) {
                    return false;
                }
                pm0.v.X(new zv.l2(flutterBrandEcsPlugin, c17));
                return false;
            }
        };
        this.f65200r = new zv.m3(this);
        this.f65201s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BrandEcsDeleteUserNotifyEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin$onDeleteUserListener$1
            {
                this.__eventId = 2094704829;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BrandEcsDeleteUserNotifyEvent brandEcsDeleteUserNotifyEvent) {
                com.tencent.mm.autogen.events.BrandEcsDeleteUserNotifyEvent event = brandEcsDeleteUserNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String str = event.f54011g.f6204a;
                boolean z17 = str == null || str.length() == 0;
                com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin flutterBrandEcsPlugin = com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this;
                if (z17) {
                    com.tencent.mars.xlog.Log.e(flutterBrandEcsPlugin.f65189d, "onDeleteUserListener, username is null");
                    return false;
                }
                com.tencent.pigeon.brand_service.BrandServiceCallbackApi brandServiceCallbackApi = flutterBrandEcsPlugin.f65191f;
                if (brandServiceCallbackApi != null) {
                    kotlin.jvm.internal.o.d(str);
                    brandServiceCallbackApi.onNotifyFlutterDelete(str, new zv.n3(flutterBrandEcsPlugin, str));
                }
                return true;
            }
        };
        this.f65202t = "MicroMsg.FlutterBrandServicePlugin_NotifySwitchInfo_" + hashCode();
        this.f65203u = new zv.u3(this);
        this.f65204v = "MicroMsg.FlutterBrandServicePlugin_SubscribeStatus_" + hashCode();
        this.f65205w = new zv.z3(this);
        this.f65206x = jz5.h.b(new zv.g3(this));
        this.f65207y = jz5.h.b(new zv.h3(this));
        this.f65208z = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.EcsTLMockRecCanvasCardEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin$mockRecCanvasEventListener$1
            {
                this.__eventId = -1761743767;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.EcsTLMockRecCanvasCardEvent ecsTLMockRecCanvasCardEvent) {
                com.tencent.mm.autogen.events.EcsTLMockRecCanvasCardEvent event = ecsTLMockRecCanvasCardEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.String frameSetName = event.f54099g.f7222a;
                kotlin.jvm.internal.o.f(frameSetName, "frameSetName");
                if (frameSetName.length() > 0) {
                    java.lang.String frameSetData = event.f54099g.f7223b;
                    kotlin.jvm.internal.o.f(frameSetData, "frameSetData");
                    if (frameSetData.length() > 0) {
                        java.lang.String str = com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this.f65189d;
                        java.lang.String str2 = event.f54099g.f7222a;
                        ((ku5.t0) ku5.t0.f312615d).B(new zv.k3(event, com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this));
                    }
                }
                return false;
            }
        };
        this.A = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizRecommandDeleteCardEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin$deleteRecBrandCardListener$1
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
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this.f65189d, "deleteRecBrandCard,cardId:".concat(str));
                    ((ku5.t0) ku5.t0.f312615d).B(new zv.o2(com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.this, str));
                }
                return true;
            }
        };
    }

    public final e31.k a() {
        return (e31.k) ((jz5.n) this.f65194i).getValue();
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void addNewAddress(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
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

    public final void b(java.lang.String str, long j17) {
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str);
        if (p17 == null) {
            com.tencent.mars.xlog.Log.e(this.f65189d, "Conversation is null. Username: " + str);
            d(j17);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        intent.putExtra("biz_click_item_unread_count", p17.d1());
        intent.putExtra("msg_local_id", j17);
        intent.putExtra("from_global_search", true);
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    public final void c(java.lang.String str, long j17) {
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(str, j17);
        java.lang.String j18 = n17.j();
        java.lang.String str2 = this.f65189d;
        if (j18 == null) {
            com.tencent.mars.xlog.Log.i(str2, "msgInfo.content is null");
            d(j17);
            return;
        }
        java.lang.String j19 = n17.j();
        kotlin.jvm.internal.o.f(j19, "getContent(...)");
        r01.b2 b2Var = new r01.b2(0, j19, n17.I0(), n17.getMsgId(), str, str);
        int wi6 = ((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a, b2Var);
        if (wi6 == 1) {
            com.tencent.mars.xlog.Log.i(str2, "Message handled successfully.");
            return;
        }
        if (wi6 == 2) {
            d(j17);
            com.tencent.mars.xlog.Log.i(str2, "No handle for the message");
        } else if (wi6 == 3) {
            com.tencent.mars.xlog.Log.i(str2, "No handle or action for the message. Proceeding to fallback method.");
            d(j17);
        }
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void callAppPay(com.tencent.pigeon.ecs.EcsAppPayInfo payInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(payInfo, "payInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void complainTemplateMsg(java.lang.String username, long j17) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.String str3 = this.f65189d;
        com.tencent.mars.xlog.Log.i(str3, "[BRS] complainTemplateMsg nativeLocalId=" + j17);
        if (j17 < 0) {
            com.tencent.mars.xlog.Log.e(str3, "[BRS] complainTemplateMsg: invalid nativeLocalId");
            return;
        }
        com.tencent.mm.storage.f9 k17 = pt0.f0.f358209b1.k(username, j17);
        if (k17 == null) {
            com.tencent.mars.xlog.Log.e(str3, "[BRS] complainTemplateMsg: message not found for nativeLocalId=" + j17);
            return;
        }
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        java.lang.String j18 = k17.j();
        if (j18 == null) {
            com.tencent.mars.xlog.Log.e(str3, "[BRS] complainTemplateMsg: message content is null");
            return;
        }
        try {
            str = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(j18, "msg", null).get(".msg.appmsg.template_id");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, "extractTemplateId", new java.lang.Object[0]);
            str = null;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e(str3, "[BRS] complainTemplateMsg: templateId is null or empty");
            return;
        }
        java.lang.String Q0 = k17.Q0();
        kotlin.jvm.internal.o.d(Q0);
        try {
            str2 = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9) + "/mp/infringement?from=8&username=" + Q0 + "&template_id=" + java.net.URLEncoder.encode(str, com.tencent.mapsdk.internal.rv.f51270c) + "&template_msg_id=&screenshot_localId=" + java.net.URLEncoder.encode("", com.tencent.mapsdk.internal.rv.f51270c) + "#wechat_redirect";
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e18, "buildInfringementUrl", new java.lang.Object[0]);
            str2 = null;
        }
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.e(str3, "[BRS] complainTemplateMsg: failed to build infringement url");
            return;
        }
        com.tencent.mars.xlog.Log.i(str3, "[BRS] complainTemplateMsg: go to complain page, url=" + str2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str2);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void createMagicAdBrandService(long j17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void createMagicBrandService(long j17) {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final void d(long j17) {
        if (this.f65192g != null) {
            boolean z17 = false;
            if (-10 <= j17 && j17 < 100000001) {
                z17 = true;
            }
            if (z17) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", "BrandEcsTemplateMsg@fakeuser");
                intent.putExtra("finish_direct", true);
                intent.putExtra("msg_local_id", j17);
                j45.l.u(this.f65192g, ".ui.chatting.ChattingUI", intent, null);
            }
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean deleteByMsgId(long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new zv.m2(this, j17), "FlutterBizThread");
        return true;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean deleteByTalker(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
        qk.o b17 = r01.q3.cj().b1(userName);
        com.tencent.mars.xlog.Log.i(this.f65189d, "deleteByTalker, username = ".concat(userName));
        qk.n6 n6Var = (qk.n6) i95.n0.c(qk.n6.class);
        android.app.Activity activity = this.f65192g;
        ((com.tencent.mm.app.o7) n6Var).getClass();
        com.tencent.mm.ui.tools.n1.a(b17, activity, n17, false, 0);
        return true;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void doSearch() {
        zv.q.f476079a.a();
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void doSearchWithQuery(java.lang.String query, long j17, java.lang.String parentSearchId, java.lang.String searchExtParams) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(parentSearchId, "parentSearchId");
        kotlin.jvm.internal.o.g(searchExtParams, "searchExtParams");
        su4.j2 j2Var = new su4.j2();
        j2Var.f412938a = com.tencent.mm.sdk.platformtools.x2.f193071a;
        j2Var.f412939b = (int) j17;
        j2Var.f412941d = query;
        j2Var.f412956s = parentSearchId;
        if (searchExtParams.length() > 0) {
            j2Var.f412961x = searchExtParams;
        }
        j2Var.f412943f = true;
        j2Var.f412945h = true;
        j2Var.A = false;
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean draftExist(long j17) {
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        return ((ur1.s) b0Var).Bi((int) j17, "", 2, com.tencent.wechat.mm.biz.h2.PUBLISH_SCENE_PHOTO_ACCOUNT_PERSONAL_CENTER);
    }

    public final void e(yz5.l lVar) {
        android.app.Activity activity = this.f65192g;
        java.lang.String str = this.f65189d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i(str, "activity is null");
            lVar.invoke(java.lang.Boolean.FALSE);
            return;
        }
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f227167r;
        if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
            lVar.invoke(java.lang.Boolean.TRUE);
            com.tencent.mars.xlog.Log.i(str, "already has business location permission");
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Bi(activity, g0Var, f0Var, new zv.d4(this, lVar))) {
            return;
        }
        lVar.invoke(java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void editAddress(com.tencent.pigeon.ecs.EcsAddressStruct address, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(address, "address");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void enableGiftPageSwipe() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void fetchContactsCreateTimeIfNeed(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        pm0.v.K(null, zv.p2.f476075d);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void fetchTemplateMsgScopeItem(java.lang.String username, java.lang.String scopeId, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(scopeId, "scopeId");
        com.tencent.mars.xlog.Log.i(this.f65189d, "[BRS] fetchTemplateMsgScopeItem username=" + username + ", scopeId=" + scopeId + ", businessType=" + j17);
        e31.k a17 = a();
        if (a17 != null) {
            ((g31.l) a17).q(username, scopeId, (int) j17);
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void followBizContact(com.tencent.pigeon.biz_base.BizRecFollowActionInfo info, yz5.l callback) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(callback, "callback");
        zv.q qVar = zv.q.f476079a;
        zv.u2 u2Var = new zv.u2(callback);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ns.k kVar = (ns.k) i95.n0.c(ns.k.class);
        zv.n nVar = new zv.n(u2Var);
        ((ms.a) kVar).getClass();
        r35.a aVar = new r35.a(context, nVar);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(261);
        r45.hy6 hy6Var = new r45.hy6();
        java.lang.String articleUrl = info.getArticleUrl();
        hy6Var.f376558e = articleUrl;
        if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(info.getArticleUrl())) {
            try {
                hy6Var.f376559f = com.tencent.mm.sdk.platformtools.t8.P(android.net.Uri.parse(articleUrl).getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 10000);
            } catch (java.lang.Exception unused) {
            }
        }
        aVar.F = hy6Var;
        aVar.b(info.getUsername(), linkedList, false, "");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10298, info.getUsername(), 261);
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        if (obj == null || !(obj instanceof java.lang.String)) {
            com.tencent.mars.xlog.Log.i(this.f65189d, "onNotifyChange obj not String event:%d stg:%s obj:%s", java.lang.Integer.valueOf(i17), a1Var, obj);
        } else {
            if (zv.e0.f475937a.a("notifyInfo") || zv.e0.f475939c) {
                return;
            }
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = obj;
            pm0.v.X(new zv.s3(this, h0Var));
        }
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void getAllAddress(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void getBSPOICacheInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!i95.n0.h(u60.g.class)) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            com.tencent.mars.xlog.Log.e(this.f65189d, "[BRS]getBSPOICacheInfo no register service");
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new zv.w2(this, callback));
        }
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void getBSPOIInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((sb0.f) jVar).getClass();
        boolean d17 = j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true);
        java.lang.String str = this.f65189d;
        if (!d17) {
            com.tencent.mars.xlog.Log.i(str, "getBSPOIInfo no system permission");
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227167r)) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new zv.x2(this, callback, null), 2, null);
        } else {
            com.tencent.mars.xlog.Log.i(str, "getBSPOIInfo no business permission");
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public com.tencent.pigeon.biz_base.BizEnterStatusInfo getBizEnterStatusInfo() {
        com.tencent.pigeon.biz_base.BizEnterStatusInfo bizEnterStatusInfo = zv.f0.f475963a;
        zv.f0.f475963a = null;
        zv.f0.f475964b = false;
        return bizEnterStatusInfo;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getBizFinderLivesInfo(boolean z17, yz5.l result) {
        kotlin.jvm.internal.o.g(result, "result");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public java.lang.String getBizImgCacheDirectory() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f65206x).getValue();
        kotlin.jvm.internal.o.f(str, "<get-imgCacheDirectory>(...)");
        return str;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public java.lang.String getBizImgPreviewDirectory() {
        java.lang.String str = (java.lang.String) ((jz5.n) this.f65207y).getValue();
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
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(zv.q.f476079a.d(userName))));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getContactInfoBatch(java.util.List userNames, yz5.l callback) {
        kotlin.jvm.internal.o.g(userNames, "userNames");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new zv.y2(callback, userNames));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getContactInfoOrSync(java.lang.String username, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new zv.z2(callback, username));
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public java.lang.String getEcsGiftImgCacheDirectory() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6 A[LOOP:0: B:11:0x0041->B:18:0x00c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cc A[EDGE_INSN: B:19:0x00cc->B:20:0x00cc BREAK  A[LOOP:0: B:11:0x0041->B:18:0x00c6], SYNTHETIC] */
    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void getFinderLiveInfo(java.util.List r22, boolean r23, yz5.l r24) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.getFinderLiveInfo(java.util.List, boolean, yz5.l):void");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getMassSendData(long j17, boolean z17, boolean z18, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new zv.a3(callback, j17, z17, z18));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public com.tencent.pigeon.biz_base.NativeBizCreationInfo getNativeBizCreationInfo() {
        return new com.tencent.pigeon.biz_base.NativeBizCreationInfo(null, null, 3, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getNetWorkInfo(yz5.l result) {
        kotlin.jvm.internal.o.g(result, "result");
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(Bi == 3 || Bi == 4 || Bi == 5);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        result.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(new com.tencent.pigeon.biz_base.NetworkInfo(formatedNetType, valueOf, (java.lang.Boolean) m17))));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public com.tencent.pigeon.biz_base.BizNotifyTipsInfo getNotifyTipsInfo() {
        return zv.q.f476079a.c();
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getOftenReadAccountInfo(java.lang.String userName, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new zv.b3(callback, userName));
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void getOftenReadAccountInfoBatch(java.util.List userNames, yz5.l callback) {
        kotlin.jvm.internal.o.g(userNames, "userNames");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new zv.c3(callback, userNames));
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void getPoiInfo(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void getRecentBrandServiceInfo(long j17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).q(new zv.d3(j17, callback));
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

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public java.lang.String getSearchtExtraSessionData() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
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

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoBizTestUI() {
        android.app.Activity activity;
        if (!eq1.n0.f255837a.a() || (activity = this.f65192g) == null) {
            return;
        }
        j45.l.h(activity, "brandecs", "com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoChattingUI(com.tencent.pigeon.biz_base.BizChattingJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        boolean z17 = jumpInfo.getUserName().length() == 0;
        java.lang.String str = this.f65189d;
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
        java.lang.Long chattingSubScene = jumpInfo.getChattingSubScene();
        intent.putExtra("KOpenArticleSceneFromScene", chattingSubScene != null ? (int) chattingSubScene.longValue() : 10000);
        java.lang.Long openChattingFromScene = jumpInfo.getOpenChattingFromScene();
        intent.putExtra("specific_chat_from_scene", openChattingFromScene != null ? (int) openChattingFromScene.longValue() : 0);
        java.lang.Long msgLocalId = jumpInfo.getMsgLocalId();
        if ((msgLocalId != null ? msgLocalId.longValue() : 0L) > 0) {
            intent.putExtra("msg_local_id", jumpInfo.getMsgLocalId());
            intent.putExtra("from_global_search", true);
        }
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void gotoChattingWithLocalId(java.lang.String userName, long j17, long j18, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(callback, "callback");
        try {
            if (((int) j18) == -1) {
                d(j17);
            } else if (z17) {
                b(userName, j17);
            } else {
                c(userName, j17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f65189d, e17, "gotoChattingWithLocalId", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
    
        if ((r7 == null || r26.n0.N(r7)) == false) goto L51;
     */
    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gotoFinder(com.tencent.pigeon.biz_base.BizFinderJumpInfo r19) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin.gotoFinder(com.tencent.pigeon.biz_base.BizFinderJumpInfo):void");
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

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void gotoMyFollowBrandServiceList(long j17) {
        com.tencent.mars.xlog.Log.i(this.f65189d, "gotoMyFollowBrandServiceList");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("intent_service_type", 1);
        intent.putExtra("intent_should_show_search", true);
        intent.putExtra("intent_should_show_menu", false);
        intent.putExtra("intent_is_from_brand_service", true);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "brandservice", ".ui.BrandServiceIndexUI", intent, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void gotoMyNotiList(long j17) {
        com.tencent.mars.xlog.Log.i(this.f65189d, "gotoMyNotiList");
        android.app.Activity activity = this.f65192g;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "BrandEcsTemplateMsg@fakeuser");
        intent.putExtra("finish_direct", true);
        intent.putExtra("key_is_jump_from_brs_box", true);
        j45.l.u(activity, ".ui.chatting.ChattingUI", intent, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void gotoMyNotifySetting(long j17) {
        java.lang.String str = this.f65189d;
        com.tencent.mars.xlog.Log.i(str, "[BRS] gotoMyNotifySetting source=" + j17);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        try {
            kotlin.jvm.internal.o.d(context);
            sw.a.a(context, new zv.e3(j17));
            com.tencent.mars.xlog.Log.i(str, "openBrandEcsNotifySettingUI success");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(str, "openBrandEcsNotifySettingUI failed: " + e17.getMessage());
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void gotoOldList(long j17, long j18) {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("biz_from_scene", 2);
        intent.putExtra("biz_time_line_line_session_id", (int) j17);
        intent.putExtra("biz_enter_source", (int) j18);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.u(context, ".ui.brandservice.BrandServiceNotifyUI", intent, null);
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
        java.lang.String userName = info.getUserName();
        if (userName != null && !r26.n0.N(userName)) {
            z17 = false;
        }
        if (!z17) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().b0(info.getUserName());
        }
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void gotoSingleChatting(java.lang.String username, long j17, long j18, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(username, "username");
        try {
            if (((int) j18) == -1) {
                d(j17);
            } else {
                b(username, j17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f65189d, e17, "gotoSingleChatting", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void gotoSystemLocationSettings(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS", android.net.Uri.parse("package:" + context.getPackageName()));
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        boolean I0 = com.tencent.mm.sdk.platformtools.t8.I0(context, intent, true, false);
        java.lang.String str = this.f65189d;
        if (I0) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandecs/FlutterBrandEcsPlugin", "gotoSystemLocationSettings", "(Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/feature/brandecs/FlutterBrandEcsPlugin", "gotoSystemLocationSettings", "(Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "gotoSystemLocationSettings startActivity failed", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.w(str, "gotoSystemLocationSettings intent not available");
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(jz5.f0.f302826a)));
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void gotoTemplateMsgAuthScopesSetting(java.lang.String username, long j17) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i(this.f65189d, "[BRS] gotoTemplateMsgAuthScopesSetting username=" + username + ", source=" + j17);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(username);
        e31.k a17 = a();
        if (a17 != null) {
            kotlin.jvm.internal.o.d(context);
            kotlin.jvm.internal.o.d(e17);
            a17.e(context, 4, username, e17);
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

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void handlePreloadLivesData(java.util.List data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            java.lang.String exportId = (java.lang.String) it.next();
            vw.r rVar = (vw.r) i95.n0.c(vw.r.class);
            rVar.getClass();
            kotlin.jvm.internal.o.g(exportId, "exportId");
            if (((com.tencent.mm.protocal.protobuf.FinderObject) rVar.f440723d.get(exportId)) == null) {
                i95.m c17 = i95.n0.c(s40.w0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                s40.w0.U9((s40.w0) c17, 0L, "", 65, 2, "", true, null, 0L, null, false, false, exportId, null, 0, 10176, null).l().K(new zv.f3(exportId));
            }
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean hasMinimizeArticle(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return false;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean hasMinimizeFinder(java.lang.String finderObjectId) {
        kotlin.jvm.internal.o.g(finderObjectId, "finderObjectId");
        return false;
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
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return false;
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public long isOpenSceneLocation() {
        return ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227167r) ? 1L : 0L;
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public long isOpenSystemLocation() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((sb0.f) jVar).getClass();
        return j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", true) ? 1L : 0L;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean isPaid(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return lr1.f.f320657a.b(url);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public boolean isWeAppClick(java.lang.String userName, long j17, long j18) {
        java.util.Map d17;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(userName, j17);
        return (n17.j() == null || (d17 = com.tencent.mm.sdk.platformtools.aa.d(n17.j(), "msg", null)) == null || com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.appmsg.mmreader.category.item.template_op_type"), -1) != 1) ? false : true;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void launchBizFinderFeed(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        long j17;
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
        java.lang.Long mediaType = info.getMediaType();
        intent.putExtra("key_need_related_list", (mediaType != null && mediaType.longValue() == 9) ? 1 : 0);
        intent.putExtra("from_user", info.getEncryptUsername());
        intent.putExtra("allow_pull_top", true);
        intent.putExtra("key_extra_info", info.getReportInfo());
        java.lang.Long currentPlayMs = info.getCurrentPlayMs();
        if ((currentPlayMs != null ? currentPlayMs.longValue() : -1L) >= 0) {
            intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", info.getCurrentPlayMs());
        }
        if (((zy2.b6) i95.n0.c(zy2.b6.class)) != null) {
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context = this.f65192g;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            java.lang.Boolean isLandscapeVideo = info.isLandscapeVideo();
            e1Var.O(26, 2, 25, context, intent, null, isLandscapeVideo != null ? isLandscapeVideo.booleanValue() : false);
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
        b1Var.f317028i = new zv.i3(bundle);
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        b1Var.f317041s = appBrandLaunchReferrer;
        appBrandLaunchReferrer.f77323e = bundle.getAppid();
        b1Var.f317041s.f77324f = bundle.getReferrer_info_extra_data();
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f65192g, b1Var);
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void launchSearch(java.lang.String extData, yz5.l callback) {
        kotlin.jvm.internal.o.g(extData, "extData");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
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

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void markBoxUnwrap(java.lang.String str, long j17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void markLiveBarItemExposured(java.lang.String userName, java.lang.String finderId) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(finderId, "finderId");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
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

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void nativeRouter(com.tencent.pigeon.ecs.EcsNativeRouterRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void notifyRecycleCardResult(byte[] retBuffer, yz5.l callback) {
        kotlin.jvm.internal.o.g(retBuffer, "retBuffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        androidx.lifecycle.o mo133getLifecycle;
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f65189d, "onAttachedToActivity");
        android.app.Activity activity = binding.getActivity();
        this.f65192g = activity;
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion companion = com.tencent.pigeon.biz_base.BizBaseApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        com.tencent.pigeon.brand_service.BrandServiceApi.Companion companion2 = com.tencent.pigeon.brand_service.BrandServiceApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.brand_service.BrandServiceApi.Companion.setUp$default(companion2, binaryMessenger2, this, null, 4, null);
        com.tencent.pigeon.ecs.EcsNativeApi.Companion companion3 = com.tencent.pigeon.ecs.EcsNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        com.tencent.pigeon.ecs.EcsNativeApi.Companion.setUp$default(companion3, binaryMessenger3, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger4 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger4, "getBinaryMessenger(...)");
        this.f65190e = new com.tencent.pigeon.biz_base.BizBaseCallbackApi(binaryMessenger4, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger5 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger5, "getBinaryMessenger(...)");
        this.f65191f = new com.tencent.pigeon.brand_service.BrandServiceCallbackApi(binaryMessenger5, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger6 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger6, "getBinaryMessenger(...)");
        new com.tencent.pigeon.biz_base.BizPerformanceReportEvent(binaryMessenger6, null, 2, null);
        this.f65193h = new uw.y();
        com.tencent.mm.sdk.event.IListener iListener = this.f65199q;
        if (iListener != null) {
            iListener.alive();
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().a(this.f65200r);
        this.f65197o.alive();
        this.f65198p.alive();
        this.f65196n.alive();
        this.f65208z.alive();
        this.A.alive();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f65201s;
        if (iListener2 != null) {
            iListener2.alive();
        }
        e31.k a17 = a();
        if (a17 != null) {
            ((g31.l) a17).u(this.f65204v, this.f65205w);
        }
        e31.k a18 = a();
        if (a18 != null) {
            ((g31.l) a18).t(this.f65202t, this.f65203u);
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this);
        com.tencent.mars.xlog.Log.i(this.f65189d, "onAttachedToEngine callback:" + this.f65190e + ", brandServiceCallback:" + this.f65191f);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onClickNotifyTips() {
        android.app.Activity activity = this.f65192g;
        if (activity == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_User", "BrandEcsTemplateMsg@fakeuser");
        intent.putExtra("finish_direct", true);
        j45.l.u(activity, ".ui.chatting.ChattingUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onClickSearchBar() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        androidx.lifecycle.o mo133getLifecycle;
        com.tencent.wechat.aff.brand_service.v b17;
        java.lang.String str = this.f65189d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDetachedFromActivity ");
        android.app.Activity activity = this.f65192g;
        sb6.append(activity != null ? java.lang.Boolean.valueOf(activity.isFinishing()) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        android.app.Activity activity2 = this.f65192g;
        if (activity2 != null && activity2.isFinishing()) {
            zv.e0 e0Var = zv.e0.f475937a;
            com.tencent.mm.storage.c2.f193806d = false;
            if (zv.q.f476079a.g() && (b17 = yw.a3.f466266a.b()) != null) {
                b17.m(zv.b0.f475911a);
            }
            zv.e0.f475938b = true;
            zv.e0.f475940d = java.lang.System.currentTimeMillis();
            zv.e0.f475941e = false;
            long e17 = com.tencent.mm.storage.c2.e() * 1000;
            if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsDestroyFlutterImmediately", 0) == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceFlutterInstantsHelper", "onUIDestroy kill Flutter engine due to isEnableDestroyFlutterImmediately=true");
                e17 = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceFlutterInstantsHelper", "onUIDestroy startTimer delay=" + e17);
            long j17 = zv.e0.f475940d;
            ku5.u0 u0Var = ku5.t0.f312615d;
            zv.c0 c0Var = new zv.c0(j17, "Timer");
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.w(c0Var, e17, null);
            com.tencent.matrix.lifecycle.owners.ProcessDeepBackgroundOwner.INSTANCE.addLifecycleCallback(zv.e0.f475945i);
            pw.b bVar = pw.b.f358625a;
            this.f65192g = null;
        }
        android.app.Activity activity3 = this.f65192g;
        com.tencent.mm.ui.MMActivity mMActivity = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
        if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.c(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.f65192g = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion companion = com.tencent.pigeon.biz_base.BizBaseApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.biz_base.BizBaseApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        com.tencent.pigeon.brand_service.BrandServiceApi.Companion companion2 = com.tencent.pigeon.brand_service.BrandServiceApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        com.tencent.pigeon.brand_service.BrandServiceApi.Companion.setUp$default(companion2, binaryMessenger2, null, null, 4, null);
        com.tencent.pigeon.ecs.EcsNativeApi.Companion companion3 = com.tencent.pigeon.ecs.EcsNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        com.tencent.pigeon.ecs.EcsNativeApi.Companion.setUp$default(companion3, binaryMessenger3, null, null, 4, null);
        com.tencent.mm.sdk.event.IListener iListener = this.f65199q;
        if (iListener != null) {
            iListener.dead();
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this.f65200r);
        this.f65197o.dead();
        this.f65198p.dead();
        this.f65196n.dead();
        this.f65208z.dead();
        this.A.dead();
        com.tencent.mm.sdk.event.IListener iListener2 = this.f65201s;
        if (iListener2 != null) {
            iListener2.dead();
        }
        e31.k a17 = a();
        if (a17 != null) {
            ((g31.l) a17).w(this.f65204v);
        }
        e31.k a18 = a();
        if (a18 != null) {
            ((g31.l) a18).v(this.f65202t);
        }
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().e(this);
        this.f65190e = null;
        this.f65191f = null;
        uw.y yVar = this.f65193h;
        if (yVar != null) {
            try {
                kotlinx.coroutines.r2 r2Var = yVar.f431522a;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                kotlinx.coroutines.z0.e(yVar.f431525d, null, 1, null);
                yVar.f431524c = null;
                yVar.f431523b = null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("FlutterBSGetPoiHelper", "release failed: " + e17.getMessage());
            }
        }
        this.f65193h = null;
        com.tencent.mars.xlog.Log.i(this.f65189d, "onDetachedFromEngine");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void onEcsGiftResendCompleted(com.tencent.pigeon.ecs.EcsNativeGiftResendResult result) {
        kotlin.jvm.internal.o.g(result, "result");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public boolean onExpand(long j17) {
        ((ku5.t0) ku5.t0.f312615d).h(new zv.o3(j17), "FlutterBizThread");
        return true;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onExposed(long j17, java.lang.String userName, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(userName, "userName");
        ((ku5.t0) ku5.t0.f312615d).h(new zv.p3(z18, userName), "FlutterBizThread");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onMinimizeArticle(com.tencent.pigeon.biz_base.BizMinimizeInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i(this.f65189d, "onMinimizeArticle url = " + info.getUrl());
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
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new zv.q3(lr4Var, info, this, k97Var, null), 3, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void onMinimizeFinder(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i(this.f65189d, "doFinderMultiTask, objectId = " + info.getObjectId());
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.b6 b6Var = (zy2.b6) c17;
        android.app.Activity activity = this.f65192g;
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
        zy2.b6.Yg(b6Var, activity, Z, str, str2, str3, str4, finderDuration != null ? finderDuration.longValue() : 0L, 0, 0L, "", 384, null);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        this.f65192g = binding.getActivity();
    }

    @Override // androidx.lifecycle.v
    public void onStateChanged(androidx.lifecycle.y source, androidx.lifecycle.m event) {
        android.content.Context context;
        android.content.Context context2;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(event, "event");
        java.lang.String str = this.f65189d;
        com.tencent.mars.xlog.Log.i(str, "onStateChanged() event = " + event);
        if (event == androidx.lifecycle.m.ON_RESUME && (context2 = com.tencent.mm.sdk.platformtools.x2.f193071a) != null) {
            try {
                ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).wi(context2, this);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w(str, "registerScreenShotCallback fail e:%s", e17.getMessage());
            }
        }
        if (event != androidx.lifecycle.m.ON_PAUSE || (context = com.tencent.mm.sdk.platformtools.x2.f193071a) == null) {
            return;
        }
        try {
            ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(context, this);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w(str, "unregisterScreenShotCallback fail e:%s", e18.getMessage());
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openBanWebPage(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openBusinessProfilePage(java.lang.String userName, long j17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (userName.length() == 0) {
            com.tencent.mars.xlog.Log.i(this.f65189d, "openBusinessProfilePage: userName empty");
            return;
        }
        i95.m c17 = i95.n0.c(r01.l1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r01.l1 l1Var = (r01.l1) c17;
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        r01.l1.Zi(l1Var, context, userName, (int) j17, false, 8, null);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void openCommonUrl(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", url);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openFansMsg() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("serviceType", 5);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        j45.l.j(context, "brandservice", ".conversation.ui.BizFansConversationListUI", intent, null);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openFinderContact(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", info.getEncryptUsername());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(26, 2, 32, intent);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        e1Var.w(context, intent);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openPersonalCenterMiniAppPage(com.tencent.pigeon.biz_base.PersonalCenterJumpInfo jumpInfo) {
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        java.lang.Boolean requestAcct = jumpInfo.getRequestAcct();
        boolean booleanValue = requestAcct != null ? requestAcct.booleanValue() : false;
        zv.b4 b4Var = new zv.b4(booleanValue, jumpInfo);
        r01.l1 l1Var = (r01.l1) i95.n0.c(r01.l1.class);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        l1Var.aj(context, jumpInfo, b4Var, new zv.a4(this, booleanValue, jumpInfo));
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void openPublishPage(byte[] jumpParams) {
        org.json.JSONObject jSONObject;
        kotlin.jvm.internal.o.g(jumpParams, "jumpParams");
        tk.q qVar = (tk.q) i95.n0.c(tk.q.class);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        zv.c4 c4Var = new zv.c4(this);
        ox.o oVar = (ox.o) qVar;
        oVar.getClass();
        try {
            jSONObject = new org.json.JSONObject(new java.lang.String(jumpParams, r26.c.f368865a));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MircoMsg.BizPublishImageExternalService", e17, "makeWeAppOpenBundle parse error", new java.lang.Object[0]);
            jSONObject = new org.json.JSONObject();
        }
        oVar.Ai(context, jSONObject, c4Var);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openSubscribeAccountList(long j17) {
        rv.k3 k3Var = (rv.k3) i95.n0.c(rv.k3.class);
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        ((vw.m2) k3Var).bj(context, (int) j17);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void openUrl(com.tencent.pigeon.biz_base.BizArticleInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        zv.q qVar = zv.q.f476079a;
        android.content.Context context = this.f65192g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterHelper", "onWebViewClick = %d", java.lang.Long.valueOf(currentTimeMillis));
        android.content.Intent intent = new android.content.Intent();
        java.lang.Long openScene = info.getOpenScene();
        kotlin.jvm.internal.o.d(openScene);
        int longValue = (int) openScene.longValue();
        java.lang.Long subScene = info.getSubScene();
        kotlin.jvm.internal.o.d(subScene);
        int longValue2 = (int) subScene.longValue();
        intent.putExtra("message_id", info.getMsgId());
        intent.putExtra("srcUsername", info.getUserName());
        intent.putExtra("srcDisplayname", info.getNickName());
        intent.putExtra("geta8key_username", info.getUserName());
        intent.putExtra("geta8key_scene", 56);
        intent.putExtra(com.tencent.mm.ui.w2.f211197j, info.getItemShowType());
        intent.putExtra("start_activity_time", currentTimeMillis);
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(info.getUserName(), true);
        bundle.putInt("snsWebSource", (n17 == null || !n17.k2()) ? 0 : 4);
        intent.putExtra("msg_id", info.getMsgId());
        intent.putExtra("msg_talker", info.getUserName());
        intent.putExtra("KPublisherId", "msg_" + info.getMsgId());
        intent.putExtra("pre_username", info.getUserName());
        intent.putExtra("prePublishId", "msg_" + info.getSvrId());
        intent.putExtra("preUsername", info.getUserName());
        intent.putExtra("preChatName", info.getUserName());
        intent.putExtra("preChatTYPE", 7);
        intent.putExtra("preMsgIndex", info.getPosInCard());
        java.lang.String userName = info.getUserName();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("share_report_pre_msg_url", info.getUrl());
        bundle2.putString("share_report_pre_msg_title", info.getTitle());
        bundle2.putString("share_report_pre_msg_icon_url", info.getCoverUrl());
        bundle2.putString("share_report_pre_msg_appid", "");
        bundle2.putInt("share_report_from_scene", 5);
        bundle2.putString("share_report_biz_username", userName);
        intent.putExtras(bundle2);
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("message_index", info.getPosInCard());
        intent.putExtra("from_scence", 1);
        intent.putExtra("mode", 1);
        java.lang.String rankSessionId = info.getRankSessionId();
        java.lang.String url = info.getUrl();
        kotlin.jvm.internal.o.d(url);
        int i17 = (int) (currentTimeMillis / 1000);
        java.lang.Long pos = info.getPos();
        int longValue3 = pos != null ? (int) pos.longValue() : -1;
        java.lang.Long bizFinderEnterId = info.getBizFinderEnterId();
        java.lang.String c17 = ot0.g0.c(url, longValue, longValue2, i17, null, "", longValue3, bizFinderEnterId != null ? (int) bizFinderEnterId.longValue() : -1, rankSessionId, "", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterHelper", "openUrl:%s", c17);
        intent.putExtra("rawUrl", c17);
        intent.putExtra("webpageTitle", info.getTitle());
        intent.putExtra("thumbUrl", info.getCoverUrl());
        intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        java.lang.Long itemShowType = info.getItemShowType();
        kotlin.jvm.internal.o.d(itemShowType);
        if (((yq1.z) a0Var).E(context, c17, (int) itemShowType.longValue(), true, longValue, longValue2, intent)) {
            return;
        }
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
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
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void publishEcsGiftOpenEvent(long j17, java.lang.String eventId, java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void publishEscGiftNotifyEvent(long j17, java.lang.String str) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void removeMinimizeArticle(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void removeMinimizeFinder(java.lang.String finderObjectId) {
        kotlin.jvm.internal.o.g(finderObjectId, "finderObjectId");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void requestFinderLiveStats(java.lang.String finder_export_id, long j17, yz5.l result) {
        kotlin.jvm.internal.o.g(finder_export_id, "finder_export_id");
        kotlin.jvm.internal.o.g(result, "result");
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0.U9((s40.w0) c17, 0L, "", 65, 2, "", true, null, 0L, null, false, false, finder_export_id, null, 0, 10176, null).l().K(new zv.e4(result, this));
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void requestLocationAuth(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        android.app.Activity activity = this.f65192g;
        java.lang.String str = this.f65189d;
        if (activity == null) {
            com.tencent.mars.xlog.Log.i(str, "[BRS]requestLocationAuth, activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity activity2 = this.f65192g;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(activity2, "android.permission.ACCESS_FINE_LOCATION", true)) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
            com.tencent.mars.xlog.Log.i(str, "[BRS]requestLocationAuth missing system location permission");
            return;
        }
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f227167r;
        if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
            com.tencent.mars.xlog.Log.i(str, "[BRS]requestLocationAuth already has business location permission");
            return;
        }
        if (!z17) {
            if (((java.lang.Boolean) this.f65195m.b(this, B[0])).booleanValue()) {
                com.tencent.mars.xlog.Log.i(str, "[BRS]requestLocationAuth user rejected poi popup");
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
                return;
            }
        }
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Bi(this.f65192g, g0Var, f0Var, new zv.f4(this, callback));
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void requestLocationWithSystemAuth(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        if (this.f65192g == null) {
            com.tencent.mars.xlog.Log.i(this.f65189d, "activity is null");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
        } else {
            zv.i4 i4Var = new zv.i4(callback, this);
            if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Bi(this.f65192g, "android.permission.ACCESS_FINE_LOCATION", 155, "", "", i4Var)) {
                e(new zv.g4(callback));
            }
        }
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void resetRedDot() {
        zv.q qVar = zv.q.f476079a;
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void saveFinderLivesInfoBatch(java.util.List infos, yz5.l callback) {
        kotlin.jvm.internal.o.g(infos, "infos");
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void saveLocalOftenReadInfo(byte[] infoBuffer, yz5.l callback) {
        kotlin.jvm.internal.o.g(infoBuffer, "infoBuffer");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void selectAddress(boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void selectContact(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void selectStandardAddress(java.lang.String str, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void sendLocalGiftMessage(java.lang.String str, java.lang.String str2, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
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
        com.tencent.mars.xlog.Log.i(this.f65189d, "tryPreloadFinderVideo exportId=" + exportId + " nonceId=" + nonceId + " objectId=" + objectId);
    }

    @Override // com.tencent.pigeon.biz_base.BizBaseApi
    public void unfollowFinderContact(com.tencent.pigeon.biz_base.BizFinderPigeonInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String objectId = info.getObjectId();
        long Z = !(objectId == null || objectId.length() == 0) ? pm0.v.Z(info.getObjectId()) : 0L;
        java.lang.String encryptUsername = info.getEncryptUsername();
        if (com.tencent.mm.sdk.platformtools.t8.K0(encryptUsername)) {
            com.tencent.mars.xlog.Log.w(this.f65189d, "unfollow finder contact fail, encryptUsername is empty!");
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
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void updateEcsGiftMsgStatus(java.lang.String giftMsgId, com.tencent.pigeon.ecs.EcsGiftStatusInfoForUpdate statusInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(giftMsgId, "giftMsgId");
        kotlin.jvm.internal.o.g(statusInfo, "statusInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void updateNotifyMsgDigest(long j17, java.lang.String latestNotifyMsgId) {
        kotlin.jvm.internal.o.g(latestNotifyMsgId, "latestNotifyMsgId");
        ow.x xVar = ow.x.f349273a;
        ((ku5.t0) ku5.t0.f312615d).A("BrandEcsNotifyTimerMgr");
        ((ku5.t0) ku5.t0.f312615d).h(new ow.w(j17, latestNotifyMsgId), "BrandEcsNotifyTimerMgr");
        xVar.a(j17, latestNotifyMsgId);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void updateTemplateMsgScopeItemAcceptWithNotify(java.lang.String username, java.lang.String scopeId, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(scopeId, "scopeId");
        java.lang.String str = this.f65189d;
        com.tencent.mars.xlog.Log.i(str, "[BRS] updateTemplateMsgScopeItemAcceptWithNotify username=" + username + ", scopeId=" + scopeId + ", isAcceptWithNotify=" + z17);
        e31.k a17 = a();
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem o17 = a17 != null ? ((g31.l) a17).o(username, scopeId) : null;
        if (o17 == null) {
            com.tencent.mars.xlog.Log.e(str, "[BRS] updateTemplateMsgScopeItemAcceptWithNotify: templateItem not found for scopeId=".concat(scopeId));
            return;
        }
        o17.C = z17;
        e31.k a18 = a();
        o17.f71808n = a18 != null ? ((g31.l) a18).n(username) : false;
        e31.k a19 = a();
        if (a19 != null) {
            a19.h(username, o17, null);
        }
        com.tencent.mars.xlog.Log.i(str, "[BRS] updateTemplateMsgScopeItemAcceptWithNotify: updated template " + o17.f71803f + " with isAcceptWithForceNotify=" + z17);
    }

    @Override // com.tencent.pigeon.brand_service.BrandServiceApi
    public void updateTemplateMsgScopeItemScopeRecv(java.lang.String username, java.lang.String scopeId, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(scopeId, "scopeId");
        java.lang.String str = this.f65189d;
        com.tencent.mars.xlog.Log.i(str, "[BRS] updateTemplateMsgScopeItemScopeRecv username=" + username + ", scopeId=" + scopeId + ", isScopeRecv=" + z17);
        e31.k a17 = a();
        com.tencent.mm.msgsubscription.SubscribeMsgTmpItem o17 = a17 != null ? ((g31.l) a17).o(username, scopeId) : null;
        if (o17 == null) {
            com.tencent.mars.xlog.Log.e(str, "[BRS] updateTemplateMsgScopeItemScopeRecv: templateItem not found for scopeId=".concat(scopeId));
            return;
        }
        o17.f71807m = z17 ? 1 : 0;
        e31.k a18 = a();
        o17.f71808n = a18 != null ? ((g31.l) a18).n(username) : false;
        if (!z17) {
            o17.f71815u = false;
            o17.f71818x = false;
            o17.C = false;
        }
        e31.k a19 = a();
        if (a19 != null) {
            a19.h(username, o17, new zv.k4(this, scopeId));
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        pm0.v.X(new zv.w3(this));
    }

    @Override // com.tencent.pigeon.ecs.EcsNativeApi
    public void openUrl(java.lang.String str) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/msgsubscription/JsApiRequestSubscribeMessage$SubscribeMsgTask", "Lcom/tencent/mm/msgsubscription/util/CompatProcessTask;", "Lf31/e;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class JsApiRequestSubscribeMessage$SubscribeMsgTask extends com.tencent.mm.msgsubscription.util.CompatProcessTask implements f31.e {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask> CREATOR = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.o();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f82303e;

    /* renamed from: f, reason: collision with root package name */
    public int f82304f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f82305g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.luggage.sdk.jsapi.component.service.y f82306h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f82307i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.s f82308m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor f82309n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor f82310o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f82311p;

    public JsApiRequestSubscribeMessage$SubscribeMsgTask(java.lang.String username, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f82303e = username;
        this.f82304f = i17;
        this.f82311p = true;
    }

    public static /* synthetic */ void f(com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask jsApiRequestSubscribeMessage$SubscribeMsgTask, java.lang.String str, java.util.Map map, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            map = null;
        }
        if ((i18 & 4) != 0) {
            i17 = -1;
        }
        jsApiRequestSubscribeMessage$SubscribeMsgTask.e(str, map, i17);
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.i("JsApiRequestSubscribeMessage", "onNetSceneEndCallback errType:" + i17 + " errCode:" + i18 + " errMsg:" + errMsg + " result" + subscribeMsgRequestResult);
        this.f82311p = i17 == 0 && i18 == 0;
        this.f82305g = subscribeMsgRequestResult;
        ku5.u0 u0Var = ku5.t0.f312615d;
        ((ku5.t0) u0Var).h(new o31.f(this), "CompatProcessTask_" + ((java.lang.String) ((jz5.n) this.f71889d).getValue()));
    }

    @Override // com.tencent.mm.msgsubscription.util.CompatProcessTask
    public void c() {
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult;
        if (!this.f82311p || (subscribeMsgRequestResult = this.f82305g) == null) {
            if (this.f82304f == 0) {
                f(this, "fail:Request list fail", null, 10002, 2, null);
                return;
            } else {
                f(this, "fail:Request subscribe fail", null, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, 2, null);
                return;
            }
        }
        if (this.f82304f == 0) {
            kotlin.jvm.internal.o.d(subscribeMsgRequestResult);
            if (subscribeMsgRequestResult.f71797w != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
                com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult2 = this.f82305g;
                kotlin.jvm.internal.o.d(subscribeMsgRequestResult2);
                sb6.append(subscribeMsgRequestResult2.f71798x);
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult3 = this.f82305g;
                kotlin.jvm.internal.o.d(subscribeMsgRequestResult3);
                f(this, sb7, null, subscribeMsgRequestResult3.f71797w, 2, null);
                return;
            }
        }
        int i17 = this.f82304f;
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f82306h;
        if (i17 == 0) {
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f82309n;
            if (getSubscribeMsgListExecutor != null) {
                kotlin.jvm.internal.o.d(yVar);
                android.content.Context context = yVar.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult4 = this.f82305g;
                kotlin.jvm.internal.o.d(subscribeMsgRequestResult4);
                getSubscribeMsgListExecutor.b(context, subscribeMsgRequestResult4);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor subscribeMsgExecutor = this.f82310o;
        if (subscribeMsgExecutor != null) {
            kotlin.jvm.internal.o.d(yVar);
            android.content.Context context2 = yVar.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult5 = this.f82305g;
            kotlin.jvm.internal.o.d(subscribeMsgRequestResult5);
            subscribeMsgExecutor.b(context2, subscribeMsgRequestResult5);
        }
    }

    @Override // com.tencent.mm.msgsubscription.util.CompatProcessTask
    public void d() {
        if (this.f82304f != 0) {
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor subscribeMsgExecutor = this.f82310o;
            if (subscribeMsgExecutor != null) {
                f31.c cVar = f31.d.f259271a;
                java.util.List templates = subscribeMsgExecutor.f82316h;
                byte[] bArr = subscribeMsgExecutor.f82315g;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData = subscribeMsgExecutor.f82313e;
                java.lang.String username = subscribeMsgExecutor.f82312d;
                kotlin.jvm.internal.o.g(username, "username");
                kotlin.jvm.internal.o.g(templates, "templates");
                cVar.b(username, "", templates, "", subscribeMsgExecutor, true, bArr, subscribeMsgRequestDialogUiData).a(subscribeMsgExecutor.f82317i);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = this.f82309n;
        if (getSubscribeMsgListExecutor != null) {
            java.lang.String username2 = getSubscribeMsgListExecutor.f82295d;
            kotlin.jvm.internal.o.g(username2, "username");
            java.util.List<java.lang.String> templateIds = getSubscribeMsgListExecutor.f82296e;
            kotlin.jvm.internal.o.g(templateIds, "templateIds");
            f31.f fVar = new f31.f(username2, 2);
            fVar.f259277f = getSubscribeMsgListExecutor;
            for (java.lang.String str : templateIds) {
                java.util.List list = fVar.f259275d;
                r45.th6 th6Var = new r45.th6();
                th6Var.f386442d = str;
                ((java.util.ArrayList) list).add(th6Var);
            }
            fVar.a(getSubscribeMsgListExecutor.f82299h);
        }
    }

    @Override // com.tencent.mm.msgsubscription.util.CompatProcessTask, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(java.lang.String status, java.util.Map map, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = this.f82306h;
        kotlin.jvm.internal.o.d(yVar);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.s sVar = this.f82308m;
        kotlin.jvm.internal.o.d(sVar);
        java.lang.Integer num = this.f82307i;
        kotlin.jvm.internal.o.d(num);
        int intValue = num.intValue();
        kotlin.jvm.internal.o.g(status, "status");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (i17 != -1 && i17 != 0) {
            linkedHashMap.put("errCode", java.lang.Integer.valueOf(i17));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        java.lang.String p17 = sVar.p(status, linkedHashMap);
        com.tencent.mars.xlog.Log.i("JsApiRequestSubscribeMessage", "[callbackJsApi] return json:" + p17);
        yVar.a(intValue, p17);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeString(this.f82303e);
        parcel.writeInt(this.f82304f);
        parcel.writeParcelable(this.f82305g, i17);
        parcel.writeParcelable(this.f82309n, i17);
        parcel.writeParcelable(this.f82310o, i17);
        parcel.writeInt(this.f82311p ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public JsApiRequestSubscribeMessage$SubscribeMsgTask(java.lang.String username, java.lang.String appid, int i17, java.util.List tmplIds, int i18, com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.s jsapi, com.tencent.luggage.sdk.jsapi.component.service.y service, int i19) {
        this(username, i18);
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appid, "appid");
        kotlin.jvm.internal.o.g(tmplIds, "tmplIds");
        kotlin.jvm.internal.o.g(jsapi, "jsapi");
        kotlin.jvm.internal.o.g(service, "service");
        this.f82308m = jsapi;
        this.f82306h = service;
        this.f82307i = java.lang.Integer.valueOf(i19);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c cVar = com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c.f82323a;
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.c.f82324b.put(username, appid);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q qVar = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q(this);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor getSubscribeMsgListExecutor = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor(username, tmplIds, appid, i17);
        getSubscribeMsgListExecutor.f82300i = qVar;
        getSubscribeMsgListExecutor.f82299h = cVar;
        this.f82309n = getSubscribeMsgListExecutor;
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r rVar = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r(this);
        com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor subscribeMsgExecutor = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor(username);
        subscribeMsgExecutor.f82314f = rVar;
        subscribeMsgExecutor.f82317i = cVar;
        this.f82310o = subscribeMsgExecutor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public JsApiRequestSubscribeMessage$SubscribeMsgTask(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.g(r3, r0)
            java.lang.String r0 = r3.readString()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            int r1 = r3.readInt()
            r2.<init>(r0, r1)
            java.lang.Class<com.tencent.mm.msgsubscription.SubscribeMsgRequestResult> r0 = com.tencent.mm.msgsubscription.SubscribeMsgRequestResult.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r0 = (com.tencent.mm.msgsubscription.SubscribeMsgRequestResult) r0
            r2.f82305g = r0
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor> r0 = com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor r0 = (com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor) r0
            r2.f82309n = r0
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor> r1 = com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r1)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor r3 = (com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor) r3
            r2.f82310o = r3
            kotlin.jvm.internal.o.d(r0)
            kotlin.jvm.internal.o.d(r0)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q r1 = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q
            r1.<init>(r2)
            r0.f82300i = r1
            kotlin.jvm.internal.o.d(r3)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r r0 = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r
            r0.<init>(r2)
            r3.f82314f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask.<init>(android.os.Parcel):void");
    }
}

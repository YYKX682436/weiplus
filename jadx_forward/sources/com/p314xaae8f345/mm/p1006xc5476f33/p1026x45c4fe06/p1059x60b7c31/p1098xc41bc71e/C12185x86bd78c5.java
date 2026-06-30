package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/msgsubscription/JsApiRequestSubscribeMessage$SubscribeMsgTask", "Lcom/tencent/mm/msgsubscription/util/CompatProcessTask;", "Lf31/e;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.JsApiRequestSubscribeMessage$SubscribeMsgTask */
/* loaded from: classes9.dex */
public final class C12185x86bd78c5 extends com.p314xaae8f345.mm.p965xc41bc71e.p968x36f002.AbstractC11169x49c8c792 implements f31.e {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5> f34537x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.o();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f163836e;

    /* renamed from: f, reason: collision with root package name */
    public int f163837f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 f163838g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y f163839h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Integer f163840i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.s f163841m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e f163842n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea f163843o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f163844p;

    public C12185x86bd78c5(java.lang.String username, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f163836e = username;
        this.f163837f = i17;
        this.f163844p = true;
    }

    public static /* synthetic */ void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5 c12185x86bd78c5, java.lang.String str, java.util.Map map, int i17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            map = null;
        }
        if ((i18 & 4) != 0) {
            i17 = -1;
        }
        c12185x86bd78c5.e(str, map, i17);
    }

    @Override // f31.e
    public void a(int i17, int i18, java.lang.String errMsg, com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestSubscribeMessage", "onNetSceneEndCallback errType:" + i17 + " errCode:" + i18 + " errMsg:" + errMsg + " result" + c11158xe7d16ed5);
        this.f163844p = i17 == 0 && i18 == 0;
        this.f163838g = c11158xe7d16ed5;
        ku5.u0 u0Var = ku5.t0.f394148d;
        ((ku5.t0) u0Var).h(new o31.f(this), "CompatProcessTask_" + ((java.lang.String) ((jz5.n) this.f153422d).mo141623x754a37bb()));
    }

    @Override // com.p314xaae8f345.mm.p965xc41bc71e.p968x36f002.AbstractC11169x49c8c792
    public void c() {
        com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed5;
        if (!this.f163844p || (c11158xe7d16ed5 = this.f163838g) == null) {
            if (this.f163837f == 0) {
                f(this, "fail:Request list fail", null, 10002, 2, null);
                return;
            } else {
                f(this, "fail:Request subscribe fail", null, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, 2, null);
                return;
            }
        }
        if (this.f163837f == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed5);
            if (c11158xe7d16ed5.f153330w != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fail:");
                com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed52 = this.f163838g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed52);
                sb6.append(c11158xe7d16ed52.f153331x);
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed53 = this.f163838g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed53);
                f(this, sb7, null, c11158xe7d16ed53.f153330w, 2, null);
                return;
            }
        }
        int i17 = this.f163837f;
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f163839h;
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e = this.f163842n;
            if (c12183x2c92285e != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
                android.content.Context mo50352x76847179 = yVar.mo50352x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x76847179, "getContext(...)");
                com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed54 = this.f163838g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed54);
                c12183x2c92285e.b(mo50352x76847179, c11158xe7d16ed54);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea c12186x79c39fea = this.f163843o;
        if (c12186x79c39fea != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
            android.content.Context mo50352x768471792 = yVar.mo50352x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50352x768471792, "getContext(...)");
            com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5 c11158xe7d16ed55 = this.f163838g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11158xe7d16ed55);
            c12186x79c39fea.b(mo50352x768471792, c11158xe7d16ed55);
        }
    }

    @Override // com.p314xaae8f345.mm.p965xc41bc71e.p968x36f002.AbstractC11169x49c8c792
    public void d() {
        if (this.f163837f != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea c12186x79c39fea = this.f163843o;
            if (c12186x79c39fea != null) {
                f31.c cVar = f31.d.f340804a;
                java.util.List templates = c12186x79c39fea.f163849h;
                byte[] bArr = c12186x79c39fea.f163848g;
                if (bArr == null) {
                    bArr = new byte[0];
                }
                com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e c11157x9b46987e = c12186x79c39fea.f163846e;
                java.lang.String username = c12186x79c39fea.f163845d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templates, "templates");
                cVar.b(username, "", templates, "", c12186x79c39fea, true, bArr, c11157x9b46987e).a(c12186x79c39fea.f163850i);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e = this.f163842n;
        if (c12183x2c92285e != null) {
            java.lang.String username2 = c12183x2c92285e.f163828d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username2, "username");
            java.util.List<java.lang.String> templateIds = c12183x2c92285e.f163829e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateIds, "templateIds");
            f31.f fVar = new f31.f(username2, 2);
            fVar.f340810f = c12183x2c92285e;
            for (java.lang.String str : templateIds) {
                java.util.List list = fVar.f340808d;
                r45.th6 th6Var = new r45.th6();
                th6Var.f467975d = str;
                ((java.util.ArrayList) list).add(th6Var);
            }
            fVar.a(c12183x2c92285e.f163832h);
        }
    }

    @Override // com.p314xaae8f345.mm.p965xc41bc71e.p968x36f002.AbstractC11169x49c8c792, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final void e(java.lang.String status, java.util.Map map, int i17) {
        com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y yVar = this.f163839h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.s sVar = this.f163841m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(sVar);
        java.lang.Integer num = this.f163840i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (i17 != -1 && i17 != 0) {
            linkedHashMap.put("errCode", java.lang.Integer.valueOf(i17));
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        java.lang.String p17 = sVar.p(status, linkedHashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiRequestSubscribeMessage", "[callbackJsApi] return json:" + p17);
        yVar.a(intValue, p17);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeString(this.f163836e);
        parcel.writeInt(this.f163837f);
        parcel.writeParcelable(this.f163838g, i17);
        parcel.writeParcelable(this.f163842n, i17);
        parcel.writeParcelable(this.f163843o, i17);
        parcel.writeInt(this.f163844p ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12185x86bd78c5(java.lang.String username, java.lang.String appid, int i17, java.util.List tmplIds, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.s jsapi, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p440x7643c6b5.y service, int i19) {
        this(username, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmplIds, "tmplIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f163841m = jsapi;
        this.f163839h = service;
        this.f163840i = java.lang.Integer.valueOf(i19);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.c cVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.c.f163856a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.c.f163857b.put(username, appid);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.q qVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.q(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e c12183x2c92285e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e(username, tmplIds, appid, i17);
        c12183x2c92285e.f163833i = qVar;
        c12183x2c92285e.f163832h = cVar;
        this.f163842n = c12183x2c92285e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.r(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea c12186x79c39fea = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea(username);
        c12186x79c39fea.f163847f = rVar;
        c12186x79c39fea.f163850i = cVar;
        this.f163843o = c12186x79c39fea;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12185x86bd78c5(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = r3.readString()
            if (r0 != 0) goto Ld
            java.lang.String r0 = ""
        Ld:
            int r1 = r3.readInt()
            r2.<init>(r0, r1)
            java.lang.Class<com.tencent.mm.msgsubscription.SubscribeMsgRequestResult> r0 = com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult r0 = (com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5) r0
            r2.f163838g = r0
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor> r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r3.readParcelable(r0)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.GetSubscribeMsgListExecutor r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12183x2c92285e) r0
            r2.f163842n = r0
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r3 = r3.readParcelable(r1)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.SubscribeMsgExecutor r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12186x79c39fea) r3
            r2.f163843o = r3
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q r1 = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.q
            r1.<init>(r2)
            r0.f163833i = r1
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)
            com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r r0 = new com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.r
            r0.<init>(r2)
            r3.f163847f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1098xc41bc71e.C12185x86bd78c5.<init>(android.os.Parcel):void");
    }
}

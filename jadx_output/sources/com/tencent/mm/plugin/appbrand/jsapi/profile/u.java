package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes9.dex */
public class u implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f82831g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f82832h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82833i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82834m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f82835n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f82836o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f82837p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f82838q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.profile.y f82839r;

    public u(com.tencent.mm.plugin.appbrand.jsapi.profile.y yVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, android.content.Context context, java.lang.String str4, android.os.Bundle bundle, int i18, java.lang.String str5, int i19) {
        this.f82839r = yVar;
        this.f82828d = str;
        this.f82829e = str2;
        this.f82830f = str3;
        this.f82831g = e9Var;
        this.f82832h = i17;
        this.f82833i = context;
        this.f82834m = str4;
        this.f82835n = bundle;
        this.f82836o = i18;
        this.f82837p = str5;
        this.f82838q = i19;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("eventID", 30);
            arrayList.add(hashMap2);
            hashMap.put("reportInfo", arrayList);
            hashMap.put("actionResult", 2);
            com.tencent.mm.plugin.appbrand.e9 e9Var = this.f82831g;
            int i19 = this.f82832h;
            com.tencent.mm.plugin.appbrand.jsapi.profile.y yVar = this.f82839r;
            yVar.getClass();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap.put("errno", 0);
            e9Var.a(i19, yVar.t("ok", hashMap));
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareSpecificWeapp", "action fail, eventID: %s", 30);
            return;
        }
        boolean z17 = intent != null && intent.getBooleanExtra("finish_by_forward_to_wework", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareSpecificWeapp", "mmOnActivityResult, finishByForwardToWeWork: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            java.lang.String sb6 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.a(this.f82828d, 0).toString();
            java.lang.String str2 = this.f82829e;
            java.lang.String str3 = this.f82830f;
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("actionResult", 1);
            java.util.HashMap i27 = kz5.c1.i(new jz5.l("shareId", sb6), new jz5.l("shareActionType", 0), new jz5.l("shareTitle", str2), new jz5.l("imageUrl", str3));
            i27.put("eventID", 33);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
            arrayList2.add(i27);
            hashMap3.put("reportInfo", arrayList2);
            com.tencent.mm.plugin.appbrand.e9 e9Var2 = this.f82831g;
            int i28 = this.f82832h;
            com.tencent.mm.plugin.appbrand.jsapi.profile.y yVar2 = this.f82839r;
            yVar2.getClass();
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap3.put("errno", 0);
            e9Var2.a(i28, yVar2.t("ok", hashMap3));
            db5.e1.T(this.f82833i, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490560yi));
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareSpecificWeapp", "action success");
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShareSpecificWeapp", "mmOnActivityResult fail, toUser is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareSpecificWeapp", "result success toUser : %s ", stringExtra);
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            c01.n2.d().c(c01.n2.a("wxapp_" + this.f82828d), true).i("prePublishId", "wxapp_" + this.f82828d);
            ot0.q qVar = new ot0.q();
            qVar.f348654f = this.f82829e;
            qVar.f348666i = 33;
            qVar.f348673j2 = this.f82834m;
            qVar.f348677k2 = this.f82828d;
            qVar.f348681l2 = 1;
            qVar.L1 = "wxapp_" + this.f82828d;
            qVar.f348734z = this.f82830f;
            qVar.f348674k = com.tencent.mm.plugin.appbrand.v9.b(this.f82828d);
            qVar.f348722w = this.f82834m;
            qVar.f348726x = this.f82829e;
            ot0.a aVar = new ot0.a();
            aVar.f348359o = this.f82835n.getInt("tradingGuaranteeFlag");
            aVar.f348360p = this.f82835n.getInt("showRelievedBuyFlag");
            aVar.f348363s = this.f82835n.getInt("showFinancialLicenseFlag");
            aVar.L = this.f82836o;
            aVar.M = this.f82837p;
            aVar.N = this.f82838q;
            qVar.f(aVar);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, qVar.n());
            bundle.putInt("type", qVar.f348666i);
            bundle.putString("appbrandUsername", qVar.f348673j2);
            bundle.putString("appbrandAppId", qVar.f348677k2);
            bundle.putInt("appbrandType", qVar.f348681l2);
            bundle.putString("publisherId", qVar.L1);
            bundle.putString("thumburl", qVar.f348734z);
            bundle.putString("url", qVar.f348674k);
            bundle.putString("srcUsername", qVar.f348722w);
            bundle.putString("srcDisplayname", qVar.f348726x);
            bundle.putInt("appbrandTradingGuaranteeFlag", aVar.f348359o);
            bundle.putInt("showRelievedBuyFlag", aVar.f348360p);
            bundle.putInt("showFinancialLicenseFlag", aVar.f348363s);
            bundle.putInt("wxaTradeCommentScore", aVar.L);
            bundle.putString("registerBody", aVar.M);
            bundle.putInt("certificationImageType", aVar.N);
            bundle.putString("editText", stringExtra2);
            java.util.ArrayList<java.lang.String> P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            bundle.putStringArrayList("toUserList", P1);
            java.util.HashMap hashMap4 = new java.util.HashMap();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            hashMap4.put("reportInfo", arrayList3);
            java.util.Iterator<java.lang.String> it = P1.iterator();
            int i29 = 0;
            while (it.hasNext()) {
                java.lang.String next = it.next();
                int i37 = i29 + 1;
                qVar.f348689n2 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.a(this.f82828d, i29).toString();
                arrayList3.add(new com.tencent.mm.plugin.appbrand.jsapi.profile.t(this, next.endsWith("@chatroom") ? 31 : 30, qVar));
                i29 = i37;
            }
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.appbrand.jsapi.profile.x.class, null);
            hashMap4.put("actionResult", 1);
            com.tencent.mm.plugin.appbrand.e9 e9Var3 = this.f82831g;
            int i38 = this.f82832h;
            com.tencent.mm.plugin.appbrand.jsapi.profile.y yVar3 = this.f82839r;
            yVar3.getClass();
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            hashMap4.put("errno", 0);
            e9Var3.a(i38, yVar3.t("ok", hashMap4));
            db5.e1.T(this.f82833i, com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f490560yi));
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareSpecificWeapp", "action success");
        }
    }
}

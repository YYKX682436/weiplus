package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes9.dex */
public class u implements com.p314xaae8f345.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164363f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f164364g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f164365h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f164366i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164367m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f164368n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f164369o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164370p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f164371q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y f164372r;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y yVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, android.content.Context context, java.lang.String str4, android.os.Bundle bundle, int i18, java.lang.String str5, int i19) {
        this.f164372r = yVar;
        this.f164361d = str;
        this.f164362e = str2;
        this.f164363f = str3;
        this.f164364g = e9Var;
        this.f164365h = i17;
        this.f164366i = context;
        this.f164367m = str4;
        this.f164368n = bundle;
        this.f164369o = i18;
        this.f164370p = str5;
        this.f164371q = i19;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("eventID", 30);
            arrayList.add(hashMap2);
            hashMap.put("reportInfo", arrayList);
            hashMap.put("actionResult", 2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f164364g;
            int i19 = this.f164365h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y yVar = this.f164372r;
            yVar.getClass();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap.put("errno", 0);
            e9Var.a(i19, yVar.t("ok", hashMap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSpecificWeapp", "action fail, eventID: %s", 30);
            return;
        }
        boolean z17 = intent != null && intent.getBooleanExtra("finish_by_forward_to_wework", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSpecificWeapp", "mmOnActivityResult, finishByForwardToWeWork: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            java.lang.String sb6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.a(this.f164361d, 0).toString();
            java.lang.String str2 = this.f164362e;
            java.lang.String str3 = this.f164363f;
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap3.put("actionResult", 1);
            java.util.HashMap i27 = kz5.c1.i(new jz5.l("shareId", sb6), new jz5.l("shareActionType", 0), new jz5.l("shareTitle", str2), new jz5.l("imageUrl", str3));
            i27.put("eventID", 33);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(1);
            arrayList2.add(i27);
            hashMap3.put("reportInfo", arrayList2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var2 = this.f164364g;
            int i28 = this.f164365h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y yVar2 = this.f164372r;
            yVar2.getClass();
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap3.put("errno", 0);
            e9Var2.a(i28, yVar2.t("ok", hashMap3));
            db5.e1.T(this.f164366i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSpecificWeapp", "action success");
            return;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSpecificWeapp", "mmOnActivityResult fail, toUser is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSpecificWeapp", "result success toUser : %s ", stringExtra);
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            c01.n2.d().c(c01.n2.a("wxapp_" + this.f164361d), true).i("prePublishId", "wxapp_" + this.f164361d);
            ot0.q qVar = new ot0.q();
            qVar.f430187f = this.f164362e;
            qVar.f430199i = 33;
            qVar.f430206j2 = this.f164367m;
            qVar.f430210k2 = this.f164361d;
            qVar.f430214l2 = 1;
            qVar.L1 = "wxapp_" + this.f164361d;
            qVar.f430267z = this.f164363f;
            qVar.f430207k = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v9.b(this.f164361d);
            qVar.f430255w = this.f164367m;
            qVar.f430259x = this.f164362e;
            ot0.a aVar = new ot0.a();
            aVar.f429892o = this.f164368n.getInt("tradingGuaranteeFlag");
            aVar.f429893p = this.f164368n.getInt("showRelievedBuyFlag");
            aVar.f429896s = this.f164368n.getInt("showFinancialLicenseFlag");
            aVar.L = this.f164369o;
            aVar.M = this.f164370p;
            aVar.N = this.f164371q;
            qVar.f(aVar);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, qVar.n());
            bundle.putInt("type", qVar.f430199i);
            bundle.putString("appbrandUsername", qVar.f430206j2);
            bundle.putString("appbrandAppId", qVar.f430210k2);
            bundle.putInt("appbrandType", qVar.f430214l2);
            bundle.putString("publisherId", qVar.L1);
            bundle.putString("thumburl", qVar.f430267z);
            bundle.putString("url", qVar.f430207k);
            bundle.putString("srcUsername", qVar.f430255w);
            bundle.putString("srcDisplayname", qVar.f430259x);
            bundle.putInt("appbrandTradingGuaranteeFlag", aVar.f429892o);
            bundle.putInt("showRelievedBuyFlag", aVar.f429893p);
            bundle.putInt("showFinancialLicenseFlag", aVar.f429896s);
            bundle.putInt("wxaTradeCommentScore", aVar.L);
            bundle.putString("registerBody", aVar.M);
            bundle.putInt("certificationImageType", aVar.N);
            bundle.putString("editText", stringExtra2);
            java.util.ArrayList<java.lang.String> P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra.split(","));
            bundle.putStringArrayList("toUserList", P1);
            java.util.HashMap hashMap4 = new java.util.HashMap();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            hashMap4.put("reportInfo", arrayList3);
            java.util.Iterator<java.lang.String> it = P1.iterator();
            int i29 = 0;
            while (it.hasNext()) {
                java.lang.String next = it.next();
                int i37 = i29 + 1;
                qVar.f430222n2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.a(this.f164361d, i29).toString();
                arrayList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.t(this, next.endsWith("@chatroom") ? 31 : 30, qVar));
                i29 = i37;
            }
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.x.class, null);
            hashMap4.put("actionResult", 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var3 = this.f164364g;
            int i38 = this.f164365h;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.y yVar3 = this.f164372r;
            yVar3.getClass();
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            hashMap4.put("errno", 0);
            e9Var3.a(i38, yVar3.t("ok", hashMap4));
            db5.e1.T(this.f164366i, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareSpecificWeapp", "action success");
        }
    }
}

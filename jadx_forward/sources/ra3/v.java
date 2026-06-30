package ra3;

/* loaded from: classes9.dex */
public final class v implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f475071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f475072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475073f;

    public v(org.json.JSONArray jSONArray, android.content.Context context, yz5.l lVar) {
        this.f475071d = jSONArray;
        this.f475072e = context;
        this.f475073f = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        java.lang.String stringExtra;
        if (i18 == -1 && i17 == 1001 && intent != null && (stringExtra = intent.getStringExtra("Select_Conv_User")) != null) {
            java.util.List f07 = r26.n0.f0(stringExtra, new java.lang.String[]{","}, false, 0, 6, null);
            org.json.JSONArray jSONArray = this.f475071d;
            android.content.Context context = this.f475072e;
            yz5.l lVar = this.f475073f;
            try {
                boolean has = jSONArray.getJSONObject(0).has("fileId");
                ra3.b0 b0Var = ra3.b0.f475022a;
                if (has) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(jSONArray.length());
                    int length = jSONArray.length();
                    for (int i19 = 0; i19 < length; i19++) {
                        java.lang.Object obj = jSONArray.get(i19);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                        arrayList.add(ra3.u.f475064g.a((org.json.JSONObject) obj));
                    }
                    ra3.b0.b(b0Var, f07, arrayList);
                }
                if (jSONArray.getJSONObject(0).has(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1)) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList(jSONArray.length());
                    int length2 = jSONArray.length();
                    for (int i27 = 0; i27 < length2; i27++) {
                        java.lang.Object obj2 = jSONArray.get(i27);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                        org.json.JSONObject jSONObject = (org.json.JSONObject) obj2;
                        java.lang.String string = jSONObject.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        java.lang.String string2 = jSONObject.getString("fileExt");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                        java.lang.String string3 = jSONObject.getString(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                        ra3.s sVar = new ra3.s(string, string2, string3);
                        java.lang.String str = (java.lang.String) lVar.mo146xb9724478(sVar.f475062a);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                        sVar.f475062a = str;
                        arrayList2.add(sVar);
                    }
                    ra3.b0.a(b0Var, f07, arrayList2);
                }
                int i28 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.fw6);
                e4Var.b(com.p314xaae8f345.mm.R.raw.f79676xdf4900bc);
                e4Var.c();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppSendFileMessageUtil", e17.getMessage() + ": " + jz5.a.b(e17));
            }
        }
    }
}

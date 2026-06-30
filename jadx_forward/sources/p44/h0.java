package p44;

/* loaded from: classes4.dex */
public final class h0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p44.r f433326d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p44.o0 f433327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f433328f;

    public h0(p44.r rVar, p44.o0 o0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f433326d = rVar;
        this.f433327e = o0Var;
        this.f433328f = c0Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str;
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        i64.p pVar = (i64.p) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe countTitle is ");
        org.json.JSONObject jSONObject = null;
        sb6.append(pVar != null ? pVar.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineRandomPickLayoutCtrl", sb6.toString());
        java.lang.String a18 = pVar != null ? pVar.a() : null;
        boolean z17 = a18 == null || a18.length() == 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f433328f;
        p44.o0 o0Var = this.f433327e;
        p44.r rVar = this.f433326d;
        if (z17) {
            boolean z18 = c0Var.f391645d;
            rVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            java.lang.String str2 = rVar.f433376i;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            p44.o0.a(o0Var, z18, str2, rVar.a());
        } else {
            try {
                jSONObject = new org.json.JSONObject(a18);
            } catch (org.json.JSONException unused) {
            }
            if (jSONObject == null || (str = jSONObject.optString("collectedCountInfo")) == null) {
                rVar.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
                str = rVar.f433376i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDoneDesc", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.RandomPickCardAdInfo");
            }
            if (jSONObject == null || (a17 = jSONObject.optString("involvedCountInfo")) == null) {
                a17 = rVar.a();
            }
            p44.o0.a(o0Var, c0Var.f391645d, str, a17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.helper.randompickcard.TimelineRandomPickLayoutCtrl$dynamicUpdateDescText$2$1");
        return f0Var;
    }
}

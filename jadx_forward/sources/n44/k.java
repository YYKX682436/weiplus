package n44;

/* loaded from: classes4.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n44.p f416489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f416490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f416491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f416492g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416494i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416495m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f416496n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s34.p1 f416497o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f416498p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n44.p pVar, android.content.Intent intent, int i17, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, s34.p1 p1Var, java.lang.String str4) {
        super(4);
        this.f416489d = pVar;
        this.f416490e = intent;
        this.f416491f = i17;
        this.f416492g = context;
        this.f416493h = str;
        this.f416494i = str2;
        this.f416495m = str3;
        this.f416496n = i18;
        this.f416497o = p1Var;
        this.f416498p = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) obj4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doHalfScreenWeComProfile, errType is ");
        sb6.append(intValue);
        sb6.append(", errCode is ");
        sb6.append(intValue2);
        sb6.append(", errMsg is ");
        sb6.append((java.lang.String) obj3);
        sb6.append(", scene type is ");
        sb6.append(m1Var != 0 ? java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", sb6.toString());
        n44.p.a(this.f416489d);
        android.content.Context context = this.f416492g;
        if (intValue == 0 && intValue2 == 0) {
            if (m1Var != 0 && m1Var.mo808xfb85f7b0() == 372) {
                ab0.v vVar = m1Var instanceof ab0.v ? (ab0.v) m1Var : null;
                r45.cx5 cx5Var = vVar != null ? ((l41.e0) vVar).f397336g : null;
                java.lang.String str = cx5Var != null ? cx5Var.f453433d : null;
                if (str == null) {
                    str = "";
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doHalfScreenWeComProfile username=");
                sb7.append(str);
                sb7.append(", nickname=");
                sb7.append(cx5Var != null ? cx5Var.f453434e : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdHalfScreenJumpHelper", sb7.toString());
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.icr, 0).show();
                } else {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                    android.content.Intent intent = this.f416490e;
                    qk.p.b(intent, cx5Var, 181);
                    if (n17 != null && !n17.r2()) {
                        intent.putExtra("Contact_IsLBSFriend", true);
                    }
                    intent.putExtra("Contact_IsHalfScreen", true);
                    intent.putExtra("scroll_to_top", 0);
                    intent.putExtra("click_action_type", this.f416491f);
                    intent.putExtra("is_half_screen_height_assigned", 1);
                    intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.ui.p2113x9d4bf30f.ActivityC17748xd9e17725.class);
                    android.content.Context context2 = this.f416492g;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1", "invoke", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context2, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1", "invoke", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).overridePendingTransition(0, 0);
                }
                i17 = 0;
                java.lang.String str2 = this.f416493h;
                java.lang.String str3 = this.f416494i;
                java.lang.String str4 = this.f416495m;
                l44.p3 p3Var = l44.p3.f397832a;
                int f17 = p3Var.f(this.f416496n);
                s34.p1 p1Var = this.f416497o;
                java.lang.String a17 = p1Var.a();
                java.lang.String a18 = p1Var.a();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
                p3Var.e(new l44.j3(str2, str3, str4, f17, 11, i17, a17, a18, p1Var.f484272a, 1, 0, this.f416498p));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
                jz5.f0 f0Var = jz5.f0.f384359a;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
                return f0Var;
            }
        }
        db5.t7.g(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574713ly4));
        i17 = 1;
        java.lang.String str22 = this.f416493h;
        java.lang.String str32 = this.f416494i;
        java.lang.String str42 = this.f416495m;
        l44.p3 p3Var2 = l44.p3.f397832a;
        int f172 = p3Var2.f(this.f416496n);
        s34.p1 p1Var2 = this.f416497o;
        java.lang.String a172 = p1Var2.a();
        java.lang.String a182 = p1Var2.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getQrExtInfo", "com.tencent.mm.plugin.sns.ad.adxml.QrClickActionInfo");
        p3Var2.e(new l44.j3(str22, str32, str42, f172, 11, i17, a172, a182, p1Var2.f484272a, 1, 0, this.f416498p));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenJumpHelper$doHalfScreenWeComProfile$3$1$1");
        return f0Var2;
    }
}

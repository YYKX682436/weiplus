package za4;

/* loaded from: classes4.dex */
public class u0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f552735e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f552736f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f552737g;

    public u0(java.lang.String str, android.content.Context context, android.content.Intent intent, int i17) {
        this.f552734d = str;
        this.f552735e = context;
        this.f552736f = intent;
        this.f552737g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        boolean z17;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        m54.y yVar = (m54.y) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        java.lang.String str3 = this.f552734d;
        if (yVar == null || android.text.TextUtils.isEmpty(yVar.b()) || !za4.z0.u(yVar.b())) {
            str = "";
            z17 = false;
        } else {
            str = a84.o0.h(yVar.b(), str3);
            if (android.text.TextUtils.isEmpty(str)) {
                str = str3;
            }
            z17 = za4.z0.u(str);
        }
        android.content.Context context = this.f552735e;
        if (z17) {
            android.content.Intent intent = this.f552736f;
            a54.g.b(context, intent, str);
            intent.putExtra("sns_landing_pages_xml", str);
            android.content.Context context2 = this.f552735e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            str2 = "invoke";
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$1", "invoke", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/dynamic/PageElement;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPagesParseHelper$1", "invoke", "(Lcom/tencent/mm/plugin/sns/ad/landingpage/dynamic/PageElement;)Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.m70116xa7fa8298(str) || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.m70113x4c9b2b77(str) || com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17903x3b438f4.m70115x2c576388(str)) {
                ((android.app.Activity) context).overridePendingTransition(0, 0);
            }
        } else {
            str2 = "invoke";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingPagesParseHelper", "jumpNative() use old xml");
            za4.z0.y(str3, dm.n.f67493x36901555, context, false, this.f552737g);
        }
        java.lang.String str4 = str2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str4, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesParseHelper$1");
        return f0Var;
    }
}

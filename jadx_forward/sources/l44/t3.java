package l44;

/* loaded from: classes7.dex */
public class t3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f397895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f397896b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f397897c;

    public t3(android.widget.ImageView imageView, boolean z17, boolean z18) {
        this.f397895a = imageView;
        this.f397896b = z17;
        this.f397897c = z18;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.e6
    public void a(k91.v5 v5Var) {
        int i17;
        int i18;
        int i19;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
        if (v5Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppHelper", "onGetWeAppInfo, info==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
            return;
        }
        k91.j5 u07 = v5Var.u0();
        if (u07 != null) {
            i18 = u07.f387175q;
            i19 = u07.f387176r;
            i17 = u07.f387177s;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdWeAppHelper", "onGetWeAppInfo, relievedBuyFlag=" + i18 + ", flagshipFlag=" + i19 + ", showFinancialLicenseFlag=" + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdWeAppHelper", "onGetWeAppInfo, wxaAppInfo==null");
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        if (i19 > 0) {
            int i27 = i19 & 1;
            int i28 = (i19 >> 8) & 1;
            if (i27 == 1 && i28 == 1) {
                z17 = true;
                ((ku5.t0) ku5.t0.f394148d).B(new l44.s3(this, z17, ne.s.b(i18, 10), v5Var, ne.s.a(i17, 10)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
            }
        }
        z17 = false;
        ((ku5.t0) ku5.t0.f394148d).B(new l44.s3(this, z17, ne.s.b(i18, 10), v5Var, ne.s.a(i17, 10)));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onGetWeAppInfo", "com.tencent.mm.plugin.sns.ad.helper.AdWeAppHelper$1");
    }
}

package k84;

/* loaded from: classes4.dex */
public final class q2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.d4 f386739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb4.r f386740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f386741f;

    public q2(k84.d4 d4Var, mb4.r rVar, android.content.Context context) {
        this.f386739d = d4Var;
        this.f386740e = rVar;
        this.f386741f = context;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        i64.p pVar = (i64.p) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        k84.d4 d4Var = this.f386739d;
        java.lang.String j17 = d4Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe CountTitle = ");
        java.lang.String str = null;
        sb6.append(pVar != null ? pVar.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        if (pVar == null || (a17 = pVar.a()) == null) {
            mb4.v i17 = this.f386740e.i();
            if (i17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
                str = i17.f407014b;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNumberDefaultTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkTagInfo");
            }
        } else {
            str = a17;
        }
        android.widget.TextView Y = d4Var.Y();
        if (Y != null) {
            if (str == null) {
                str = "";
            }
            Y.setText(str);
        }
        android.widget.TextView Y2 = d4Var.Y();
        android.content.Context context = this.f386741f;
        float b17 = i65.a.b(context, 14) * i65.a.q(context);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAdDisplayWidth", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        ca4.m0.b(context, Y2, b17, d4Var.f386535s);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent$bindInfo$5$1");
        return f0Var;
    }
}

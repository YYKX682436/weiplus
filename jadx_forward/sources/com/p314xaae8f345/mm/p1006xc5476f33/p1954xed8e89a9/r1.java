package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes7.dex */
public class r1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f235131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f235132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f235133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f235134g;

    public r1(int i17, r01.l1 l1Var, int i18, android.content.Context context) {
        this.f235131d = i17;
        this.f235132e = l1Var;
        this.f235133f = i18;
        this.f235134g = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        sr3.a aVar = sr3.a.f493362e;
        r01.l1 l1Var = this.f235132e;
        int i17 = this.f235131d;
        java.lang.String str = i17 == 1 ? l1Var.f449680i.f449686a : l1Var.f449681m.f449686a;
        java.lang.String str2 = "pages/setting/setting.html?biz=" + android.net.Uri.encode(str);
        l81.b1 b1Var = new l81.b1();
        b1Var.f398565k = this.f235133f;
        b1Var.f398549c = num.intValue();
        b1Var.f398567l = "1";
        b1Var.f398547b = "wx0b2ec076ec39c786";
        b1Var.f398555f = str2;
        b1Var.f398561i = l1Var.Bi(i17, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(this.f235134g, b1Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProfileUtils", "launchCreatorSetting: IWeAppLauncher service is null");
        }
        return jz5.f0.f384359a;
    }
}

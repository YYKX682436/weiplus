package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes8.dex */
public class i0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 f235022d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var) {
        this.f235022d = e0Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2;
        r45.du5 du5Var;
        android.net.Uri uri;
        m1Var.m48017xd0f4c159(true);
        er3.a aVar = (er3.a) m1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.e0 e0Var = this.f235022d;
        com.p314xaae8f345.mm.p944x882e457a.o oVar = aVar.f337552e;
        if (i17 == 0 && i18 == 0) {
            if (aVar.f337553f == null) {
                aVar.f337553f = (r45.kk3) oVar.f152244b.f152233a;
            }
            java.lang.String str3 = aVar.f337553f.f460312d;
            try {
                uri = android.net.Uri.parse(str3);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "goToWework() Exception:%s", e17.getMessage());
                uri = null;
            }
            e0Var.f234953d.startActivityForResult(new android.content.Intent("android.intent.action.VIEW", uri), 111);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "goToWework() success! openurl:%s", str3);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "goToWework() fail!");
        if (aVar.f337553f == null) {
            aVar.f337553f = (r45.kk3) oVar.f152244b.f152233a;
        }
        r45.ie ieVar = aVar.f337553f.f76492x92037252;
        if (ieVar == null || (du5Var = ieVar.f458493e) == null) {
            str2 = aVar.f337554g;
        } else {
            str2 = du5Var.f454289d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = e0Var.f234953d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hfg);
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = e0Var.f234953d;
        db5.e1.F(abstractActivityC21394xb3d2c0cf, str2, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz9), false);
    }
}

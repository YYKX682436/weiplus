package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* renamed from: com.tencent.mm.plugin.scanner.ui.ProductPurchaseAreaUI */
/* loaded from: classes15.dex */
public class ActivityC17299xdf1172f1 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f240836d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f240837e;

    /* renamed from: f, reason: collision with root package name */
    public int f240838f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f240839g;

    public final void V6(android.content.Context context, java.lang.String str, int i17) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("jsapi_args_appid", com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.a(i17));
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str);
        intent.putExtra("pay_channel", 3);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576445be;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.h0(this));
        this.f240836d = m79336x8b97809d();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo43517x10010bd5();
        e04.n3 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.k0.b(getIntent().getStringExtra("key_Product_xml"), getIntent().getIntExtra("key_Product_funcType", 0));
        if (b17 == null || b17.f327565a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProductPurchaseAreaUI", "Data product null");
            return;
        }
        this.f240839g = b17.f69639x5bec8545;
        this.f240838f = b17.f69632xff957a57;
        java.lang.String stringExtra = getIntent().getStringExtra("referkey");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProductPurchaseAreaUI", "referkey:" + stringExtra);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        for (int i17 = 0; i17 < b17.f327565a.size(); i17++) {
            if (stringExtra.equals(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b) b17.f327565a.get(i17)).f240347d)) {
                this.f240837e = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b) b17.f327565a.get(i17)).f240349f;
                mo54450xbf7c1df6(((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.b) b17.f327565a.get(i17)).f240345b);
                if (this.f240837e == null) {
                    return;
                }
                for (int i18 = 0; i18 < this.f240837e.size(); i18++) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a) this.f240837e.get(i18);
                    java.lang.String str = "" + i18;
                    if (aVar != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b(this);
                        bVar.C(str);
                        bVar.L(aVar.f240315b);
                        bVar.H(aVar.f240316c);
                        bVar.Q = aVar.f240320g;
                        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f240836d).d(bVar, -1);
                        if (i18 != this.f240837e.size() - 1) {
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f240836d).d(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.t(mo55332x76847179()), -1);
                        }
                    }
                }
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f240836d).notifyDataSetChanged();
                return;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a aVar;
        java.lang.String str;
        java.lang.String str2;
        if (this.f240837e == null) {
            return false;
        }
        try {
            int intValue = java.lang.Integer.valueOf(c21560x1fce98fb.f279313q).intValue();
            if (intValue < 0 || intValue >= ((java.util.LinkedList) this.f240837e).size() || (aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.a) ((java.util.LinkedList) this.f240837e).get(intValue)) == null) {
                return false;
            }
            int i17 = aVar.f240314a;
            if (i17 != 1) {
                str = null;
                if (i17 == 9) {
                    java.lang.String str3 = aVar.f240328o;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_product_id", aVar.f240328o);
                        intent.putExtra("key_product_scene", 12);
                        j45.l.j(this, "product", ".ui.MallProductUI", intent, null);
                    }
                    str2 = str3;
                    gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h0(this.f240839g, aVar.f240327n, aVar.f240314a, str2, ((java.util.LinkedList) this.f240837e).size(), 11294, aVar.f240321h, null));
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProductPurchaseAreaUI", "Default go url:" + aVar.f240317d);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f240317d)) {
                    V6(mo55332x76847179(), aVar.f240317d, this.f240838f);
                }
            } else {
                str = aVar.f240317d;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ProductPurchaseAreaUI", "action link empty");
                } else {
                    V6(mo55332x76847179(), aVar.f240317d, this.f240838f);
                }
            }
            str2 = str;
            gm0.j1.d().g(new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h0(this.f240839g, aVar.f240327n, aVar.f240314a, str2, ((java.util.LinkedList) this.f240837e).size(), 11294, aVar.f240321h, null));
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ProductPurchaseAreaUI", "onPreferenceTreeClick, [%s]", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProductPurchaseAreaUI", e17, "", new java.lang.Object[0]);
            return false;
        }
    }
}

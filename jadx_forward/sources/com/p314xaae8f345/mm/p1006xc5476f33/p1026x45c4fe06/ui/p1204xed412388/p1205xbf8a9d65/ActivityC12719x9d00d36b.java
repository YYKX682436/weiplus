package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/privacy/manage/LuggagePrivacyManageUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.LuggagePrivacyManageUI */
/* loaded from: classes4.dex */
public final class ActivityC12719x9d00d36b extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f171463d = 0;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        m78503xa10faa4c(true);
        super.onCreate(bundle);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.f572190a43);
        mo54448x9c8c0d33(new bk1.u(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        if (m79336x8b97809d != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb(this);
            c21560x1fce98fb.C("AppBrandPrivacyManage");
            c21560x1fce98fb.f279318v = false;
            c21560x1fce98fb.J(com.p314xaae8f345.mm.R.C30867xcad56011.f572192a45);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d;
            h0Var.d(c21560x1fce98fb, -1);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786 c21574x28121786 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21574x28121786(this, null);
            c21574x28121786.C("ThirdAppLuggageAuthManage");
            c21574x28121786.f279318v = false;
            c21574x28121786.J(com.p314xaae8f345.mm.R.C30867xcad56011.jxq);
            c21574x28121786.G(com.p314xaae8f345.mm.R.C30867xcad56011.jxp);
            h0Var.d(c21574x28121786, -1);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb == null) {
            return false;
        }
        java.lang.String str = c21560x1fce98fb.f279313q;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.LuggagePrivacyManageUI", "onPreferenceTreeClick, key: " + str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "AppBrandPrivacyManage")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6.f171461e.a(this, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.ActivityC12716x6631e9c4.class);
        } else {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "ThirdAppLuggageAuthManage")) {
                return false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
            if (h6Var != null) {
                l81.b1 b1Var = new l81.b1();
                b1Var.f398547b = "wxb6d22f922f37b35a";
                b1Var.f398551d = 0;
                b1Var.f398555f = "/packages/settings/pages/third-app-auth/index.html";
                b1Var.f398565k = 1251;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(this, b1Var);
            }
        }
        return true;
    }
}

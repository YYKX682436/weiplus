package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/profile/ui/OpenIMKefuProfileSettingUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.profile.ui.OpenIMKefuProfileSettingUI */
/* loaded from: classes4.dex */
public final class ActivityC16862xafeaf932 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f235272f = 0;

    /* renamed from: d, reason: collision with root package name */
    public cr3.d0 f235273d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f235274e = jz5.h.b(new hr3.vb(this));

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576442bb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).h("openim_kefu_setting_need_report");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = h17 instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17 : null;
        boolean z17 = false;
        if (c21541x1c1b08fe != null) {
            c21541x1c1b08fe.O(getIntent().getBooleanExtra("need_location_report", false));
            hr3.sb sbVar = hr3.sb.f365507d;
            c21541x1c1b08fe.T = sbVar;
            android.view.View view = c21541x1c1b08fe.S;
            if (view != null) {
                view.setOnClickListener(sbVar);
            }
        }
        jz5.g gVar = this.f235274e;
        java.lang.String str = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
        if (str != null) {
            k41.g0 c17 = k41.o0.c(str);
            if (c17 != null && java.lang.Boolean.valueOf(c17.f68598xec0735e1).booleanValue()) {
                z17 = true;
            }
            if (!z17) {
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("openim_kefu_setting_need_report", true);
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d()).m("openim_kefu_setting_small_category", true);
            }
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 l17 = c01.e2.l((java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
        if (l17 == null) {
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b.TAG, "ContactStorageLogic.getContactWithInit return null? username = %s", (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb());
            finish();
        }
        this.f235273d = new cr3.d0(this, l17);
        mo56583xbf7c1df6((java.lang.CharSequence) getString(com.p314xaae8f345.mm.R.C30867xcad56011.g0m));
        mo54448x9c8c0d33(new hr3.tb(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (c21560x1fce98fb == null) {
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21560x1fce98fb.f279313q, "openim_kefu_setting_need_report")) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21560x1fce98fb.f279313q, "openim_kefu_setting_recommend")) {
                return false;
            }
            cr3.d0 d0Var = this.f235273d;
            if (d0Var != null) {
                d0Var.c();
            }
            return true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), false, 3, null);
        java.lang.String str = (java.lang.String) ((jz5.n) this.f235274e).mo141623x754a37bb();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe c21541x1c1b08fe = c21560x1fce98fb instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) c21560x1fce98fb : null;
        if (str != null && c21541x1c1b08fe != null) {
            l41.y1 y1Var = l41.y1.f397503a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            y1Var.a(mo55332x76847179, str, c21541x1c1b08fe.N(), new hr3.ub(f17, c21541x1c1b08fe, this, str));
        }
        return true;
    }
}

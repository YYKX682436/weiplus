package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ringtone/ui/RingtonePrivacyUI;", "Lcom/tencent/mm/ui/base/preference/MMPreference;", "<init>", "()V", "plugin-ringtone_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ringtone.ui.RingtonePrivacyUI */
/* loaded from: classes8.dex */
public final class ActivityC17233xb55d867a extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f239866d;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: getResourceId */
    public int mo43516x9e0bb9bf() {
        return com.p314xaae8f345.mm.R.xml.f576448bh;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2.class));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6(i65.a.r(this, com.p314xaae8f345.mm.R.C30867xcad56011.i2x));
        mo54448x9c8c0d33(new ay3.h(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r m79336x8b97809d = m79336x8b97809d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m79336x8b97809d, "getPreferenceScreen(...)");
        this.f239866d = m79336x8b97809d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) m79336x8b97809d).h("recommend_switch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17).O((((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2.class)).f239872d & 2048) == 0);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2.class)).O6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b
    /* renamed from: onPreferenceTreeClick */
    public boolean mo26755x5cc6f590(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c21560x1fce98fb != null ? c21560x1fce98fb.f279313q : null, "recommend_switch")) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtonePrivacyUI", "onRecommendSwitch");
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar2 = this.f239866d;
        if (rVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("screen");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb h17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar2).h("recommend_switch");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(h17, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.CheckBoxPreference");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.a2.class)).P6(((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) h17).N(), 2048L, 80);
        return true;
    }
}

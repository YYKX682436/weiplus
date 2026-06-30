package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderNewSettingPrivacyPreference;", "Lcom/tencent/mm/ui/base/preference/MMPreferenceFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderNewSettingPrivacyPreference */
/* loaded from: classes8.dex */
public final class C15051x458683ad extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b {

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 f210176m;

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b
    public int m0() {
        return com.p314xaae8f345.mm.R.xml.f576413dd;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b
    public boolean n0(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.n0 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210176m;
        if (m2Var == null) {
            return true;
        }
        m2Var.e(rVar, c21560x1fce98fb);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var;
        super.mo7495x78cb4fa(bundle);
        ul5.k m78645x9f88d943 = m78645x9f88d943();
        if (m78645x9f88d943 != null) {
            m78645x9f88d943.mo82163x4e0f6657(false);
        }
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        if (mo7430x19263085 != null) {
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0 h0Var = this.f279297d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h0Var, "getPreferenceScreen(...)");
            m2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2(mo7430x19263085, h0Var);
        } else {
            m2Var = null;
        }
        this.f210176m = m2Var;
        if (m2Var != null) {
            m2Var.c();
        }
        mo78694xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.mat);
        mo78682x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.pb(this));
        android.view.View mo26077x4ff8c0f0 = mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.imk);
        if (mo26077x4ff8c0f0 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo26077x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderNewSettingPrivacyPreference", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo26077x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo26077x4ff8c0f0, "com/tencent/mm/plugin/finder/ui/FinderNewSettingPrivacyPreference", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityResult */
    public void mo7496x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo7496x9d4787cb(i17, i18, intent);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210176m;
        if (m2Var != null) {
            m2Var.d(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        az2.f fVar;
        super.mo7504xac79a11b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210176m;
        if (m2Var == null || (fVar = m2Var.f211031e) == null) {
            return;
        }
        fVar.b();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.m2 m2Var = this.f210176m;
        if (m2Var != null) {
            m2Var.h();
        }
    }
}

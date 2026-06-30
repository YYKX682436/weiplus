package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.AbstractTabChildPreference */
/* loaded from: classes11.dex */
public abstract class AbstractC21336x64915aa4 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b implements com.p314xaae8f345.mm.ui.y7 {

    /* renamed from: m, reason: collision with root package name */
    public boolean f278074m;

    /* renamed from: n, reason: collision with root package name */
    public android.os.Bundle f278075n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f278076o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f278077p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f278078q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f278079r;

    @Override // com.p314xaae8f345.mm.ui.y7
    public void E() {
        e0();
        this.f278076o = true;
    }

    @Override // com.p314xaae8f345.mm.ui.y7
    public void U() {
        this.f278078q = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        this.f278075n = bundle;
        this.f278074m = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        q0();
        super.mo7504xac79a11b();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onKeyDown */
    public boolean mo78345x1f03f0c2(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getAction() == 0) {
            return false;
        }
        return super.mo78345x1f03f0c2(i17, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        if (this.f278079r) {
            java.lang.System.currentTimeMillis();
            r0();
            mo7591x9616526c();
            java.lang.System.currentTimeMillis();
            this.f278079r = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        T();
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
        if (m78443x9cf0d20b == null || !m78443x9cf0d20b.f278366p) {
            return;
        }
        this.f278077p = true;
        if (this.f278078q) {
            v();
            this.f278078q = false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
        if (m78443x9cf0d20b == null || !m78443x9cf0d20b.f278366p) {
            return;
        }
        t0();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractC21556x9c39960b, com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        u0();
    }

    public abstract void p0(android.os.Bundle bundle);

    public abstract void q0();

    public abstract void r0();

    public abstract void s0();

    public abstract void t0();

    public abstract void u0();

    @Override // com.p314xaae8f345.mm.ui.y7
    public void v() {
        int m07;
        if (this.f278077p) {
            if (this.f278074m) {
                p0(this.f278075n);
                this.f278074m = false;
            }
            java.lang.System.currentTimeMillis();
            if (this.f278076o) {
                V();
                this.f278076o = false;
            }
            if (!this.f279301h && (m07 = m0()) != -1) {
                this.f279297d.g(m07);
                this.f279301h = true;
            }
            s0();
            mo7591x9616526c();
            java.lang.System.currentTimeMillis();
            this.f278079r = true;
            this.f278077p = false;
        }
    }
}

package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.AbstractTabChildActivity */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC21335xebcf6f18 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: com.tencent.mm.ui.AbstractTabChildActivity$AbStractTabFragment */
    /* loaded from: classes11.dex */
    public static abstract class AbStractTabFragment extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements com.p314xaae8f345.mm.ui.y7 {

        /* renamed from: d, reason: collision with root package name */
        public boolean f278067d;

        /* renamed from: e, reason: collision with root package name */
        public android.os.Bundle f278068e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f278069f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f278070g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f278071h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f278072i = false;

        /* renamed from: m, reason: collision with root package name */
        public boolean f278073m = false;

        @Override // com.p314xaae8f345.mm.ui.y7
        public void E() {
            e0();
            this.f278069f = true;
        }

        @Override // com.p314xaae8f345.mm.ui.y7
        public void T() {
        }

        @Override // com.p314xaae8f345.mm.ui.y7
        public void U() {
            this.f278072i = true;
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: getLayoutId */
        public int getF153758d() {
            return 0;
        }

        public abstract void l0(android.os.Bundle bundle);

        public abstract void m0();

        public abstract void n0();

        public abstract void o0();

        @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onActivityCreated */
        public void mo7495x78cb4fa(android.os.Bundle bundle) {
            super.mo7495x78cb4fa(bundle);
            this.f278067d = true;
            this.f278068e = bundle;
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onDestroy */
        public void mo7504xac79a11b() {
            if (this.f278073m) {
                m0();
            }
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INIT", "onPause");
            if (this.f278070g) {
                java.lang.System.currentTimeMillis();
                n0();
                mo7591x9616526c();
                java.lang.System.currentTimeMillis();
                this.f278070g = false;
            }
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onResume */
        public void mo7517x57429eec() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INIT", "onResume");
            super.mo7517x57429eec();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INIT", "resumeWithVerify %s", java.lang.Boolean.valueOf(this.f278071h));
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
            if (m78443x9cf0d20b == null || !m78443x9cf0d20b.f278366p) {
                return;
            }
            this.f278071h = true;
            if (this.f278072i) {
                v();
                this.f278072i = false;
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
            p0();
        }

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
        /* renamed from: onStop */
        public void mo7406xc39f8281() {
            super.mo7406xc39f8281();
            q0();
        }

        public abstract void p0();

        public abstract void q0();

        public abstract void r0();

        @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
        /* renamed from: supportNavigationSwipeBack */
        public boolean mo25471x430f73e() {
            return false;
        }

        @Override // com.p314xaae8f345.mm.ui.y7
        public void v() {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INIT", "deliverOnTabResume %s", java.lang.Boolean.valueOf(this.f278071h));
            if (this.f278071h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.INIT", "checkNeedRecreate");
                if (this.f278067d) {
                    l0(this.f278068e);
                    this.f278067d = false;
                }
                this.f278073m = true;
                java.lang.System.currentTimeMillis();
                if (this.f278069f) {
                    this.f278069f = false;
                    V();
                }
                o0();
                mo7591x9616526c();
                java.lang.System.currentTimeMillis();
                this.f278070g = true;
                this.f278071h = false;
            }
        }
    }
}

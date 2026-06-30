package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.kinda.framework.widget.base.LifecycleFragment */
/* loaded from: classes9.dex */
public abstract class AbstractC3327x4bb63ba extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.InterfaceC3287x159ffeda {
    private static final java.lang.String TAG = "MicroMsg.LifecycleFragment";

    /* renamed from: mState */
    protected com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State f12962xbec81024 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.INITIAL;

    /* renamed from: com.tencent.kinda.framework.widget.base.LifecycleFragment$State */
    /* loaded from: classes9.dex */
    public enum State {
        INITIAL(0),
        CREATED(1),
        STARTED(2),
        RESUMED(3),
        PAUSED(4),
        STOPPED(5),
        DESTROYED(6);


        /* renamed from: value */
        private int f12971x6ac9171;

        State(int i17) {
            this.f12971x6ac9171 = i17;
        }
    }

    /* renamed from: _callFragmentOnCreate */
    private void m26756xce19cb88() {
        if (this.f12962xbec81024 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.INITIAL) {
            this.f12962xbec81024 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.CREATED;
            mo26092x8f3b222a();
        }
    }

    /* renamed from: _callFragmentOnDestroy */
    private void m26757x14a4c6ee() {
        if (this.f12962xbec81024 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.STOPPED) {
            this.f12962xbec81024 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.DESTROYED;
            mo26093x77ae448c();
        }
    }

    /* renamed from: _callFragmentOnPause */
    private void m26758x6a6e79ea() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State state = this.f12962xbec81024;
        if (state == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.RESUMED || state == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.STARTED) {
            this.f12962xbec81024 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.PAUSED;
            mo25464x2656c708();
        }
    }

    /* renamed from: _callFragmentOnResume */
    private void m26759xe701f2b9() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State state = this.f12962xbec81024;
        if (state == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.STARTED || state == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.PAUSED) {
            this.f12962xbec81024 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.RESUMED;
            mo25465xa823495b();
        }
    }

    /* renamed from: _callFragmentOnStart */
    private void m26760x6aa11856() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State state = this.f12962xbec81024;
        if (state == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.CREATED || state == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.STOPPED) {
            this.f12962xbec81024 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.STARTED;
            mo26094x26896574();
        }
    }

    /* renamed from: _callFragmentOnStop */
    private void m26761x6ecb658e() {
        if (this.f12962xbec81024 == com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.PAUSED) {
            this.f12962xbec81024 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba.State.STOPPED;
            mo26095xe035fcb0();
        }
    }

    /* renamed from: _fixCallOnResumeOrOnPause */
    private void m26762xf15c6df4() {
        if (mo7430x19263085() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "null activity when call");
            return;
        }
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7430x19263085().mo7595x9cdc264().m7675x1626d96d();
        if (m7675x1626d96d.size() < 1 || m7675x1626d96d.get(m7675x1626d96d.size() - 1) != this) {
            m26758x6a6e79ea();
        } else {
            m26759xe701f2b9();
        }
    }

    /* renamed from: _fixOnPauseNotCallingProblem */
    private void m26763xd9afe1cd() {
        if (mo7430x19263085() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "null activity when call");
            return;
        }
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7430x19263085().mo7595x9cdc264().m7675x1626d96d();
        if (m7675x1626d96d.size() >= 2) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = m7675x1626d96d.get(m7675x1626d96d.size() - 2);
            if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba) componentCallbacksC1101xa17d4670).m26758x6a6e79ea();
            }
        }
    }

    /* renamed from: _fixOnResumeNotCallingProblem */
    private void m26764xe07e6eac() {
        if (mo7430x19263085() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "null activity when call");
            return;
        }
        java.util.List<p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670> m7675x1626d96d = mo7430x19263085().mo7595x9cdc264().m7675x1626d96d();
        if (m7675x1626d96d.size() >= 1) {
            p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = m7675x1626d96d.get(m7675x1626d96d.size() - 1);
            if (componentCallbacksC1101xa17d4670 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractC3327x4bb63ba) componentCallbacksC1101xa17d4670).m26759xe701f2b9();
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onActivityCreated */
    public void mo7495x78cb4fa(android.os.Bundle bundle) {
        super.mo7495x78cb4fa(bundle);
        m26756xce19cb88();
        m26763xd9afe1cd();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroy */
    public void mo7504xac79a11b() {
        super.mo7504xac79a11b();
        m26757x14a4c6ee();
        m26764xe07e6eac();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        super.mo7399xa6664a60();
        m26757x14a4c6ee();
        m26764xe07e6eac();
    }

    /* renamed from: onFragmentOnCreate */
    public void mo26092x8f3b222a() {
        mo7591x9616526c();
    }

    /* renamed from: onFragmentOnDestroy */
    public void mo26093x77ae448c() {
        mo7591x9616526c();
    }

    /* renamed from: onFragmentOnPause */
    public void mo25464x2656c708() {
        mo7591x9616526c();
    }

    /* renamed from: onFragmentOnResume */
    public void mo25465xa823495b() {
        mo7591x9616526c();
    }

    /* renamed from: onFragmentOnStart */
    public void mo26094x26896574() {
        mo7591x9616526c();
    }

    /* renamed from: onFragmentOnStop */
    public void mo26095xe035fcb0() {
        mo7591x9616526c();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onPause */
    public void mo7512xb01dfb57() {
        super.mo7512xb01dfb57();
        m26758x6a6e79ea();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        m26762xf15c6df4();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStart */
    public void mo7405xb05099c3() {
        super.mo7405xb05099c3();
        m26760x6aa11856();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onStop */
    public void mo7406xc39f8281() {
        super.mo7406xc39f8281();
        m26761x6ecb658e();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        super.mo7518x594b1124(view, bundle);
        m26756xce19cb88();
        m26763xd9afe1cd();
    }
}

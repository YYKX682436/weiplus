package com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/open_voice_control/card/BaseCard;", "Lcom/tencent/mm/ui/MMFragment;", "r/b", "open-voice-control-impl_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.open_voice_control.card.BaseCard */
/* loaded from: classes5.dex */
public abstract class AbstractC11199x9d3689a1 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {
    public static final r.b T1 = new r.b(null);
    public boolean S1;

    /* renamed from: d, reason: collision with root package name */
    public final int f153758d;

    public AbstractC11199x9d3689a1(int i17) {
        this.f153758d = i17;
    }

    public static final void a(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, boolean z17) {
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.BaseCard", "dismiss activity");
            if (activityC1102x9ee2d9f != null) {
                try {
                    activityC1102x9ee2d9f.finish();
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OVC.BaseCard", th6, "dismiss: finish activity failed", new java.lang.Object[0]);
                    return;
                }
            }
            if (activityC1102x9ee2d9f != null) {
                activityC1102x9ee2d9f.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559255j);
            }
        }
    }

    public static final boolean b(p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.AbstractC11199x9d3689a1 abstractC11199x9d3689a1) {
        try {
            if (abstractC1104xc1ad431d.m7675x1626d96d().size() == 1) {
                return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(abstractC1104xc1ad431d.m7675x1626d96d().get(0), abstractC11199x9d3689a1);
            }
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OVC.BaseCard", th6, "dismiss: check last fragment failed", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: dismiss */
    public final void m48373x63a3b28a() {
        android.view.Window window;
        android.view.View decorView;
        if (this.S1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVC.BaseCard", "dismiss: already requested");
            return;
        }
        if (!m7481x7a6e8df6() || m7482xefa32bc() || m7489xb226ab8b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVC.BaseCard", "dismiss: fragment not valid, isAdded=" + m7481x7a6e8df6() + ", isDetached=" + m7482xefa32bc() + ", isRemoving=" + m7489xb226ab8b());
            return;
        }
        this.S1 = true;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = mo7430x19263085();
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d m7454x171a637d = m7454x171a637d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m7454x171a637d, "getParentFragmentManager(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        try {
            c0Var.f391645d = b(m7454x171a637d, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OVC.BaseCard", "dismiss lastFragment=" + c0Var.f391645d);
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = m7454x171a637d.m7630xb2c12e75();
            m7630xb2c12e75.j(this);
            m7630xb2c12e75.g();
            a(mo7430x19263085, c0Var.f391645d);
        } catch (java.lang.IllegalStateException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OVC.BaseCard", e17, "dismiss: commitNow failed, fallback to async commit", new java.lang.Object[0]);
            r.c cVar = new r.c(this, c0Var, m7454x171a637d, mo7430x19263085);
            android.view.View m7474xfb86a31b = m7474xfb86a31b();
            if (m7474xfb86a31b != null && m7474xfb86a31b.post(cVar)) {
                return;
            }
            if ((mo7430x19263085 == null || (window = mo7430x19263085.getWindow()) == null || (decorView = window.getDecorView()) == null || !decorView.post(cVar)) ? false : true) {
                return;
            }
            cVar.run();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OVC.BaseCard", th6, "dismiss failed", new java.lang.Object[0]);
            a(mo7430x19263085, b(m7454x171a637d, this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId, reason: from getter */
    public int getF153758d() {
        return this.f153758d;
    }

    public abstract void l0();

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: noActionBar */
    public boolean mo48374x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.ui.AbstractC21367x9cbb2930, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        m78687x4e0f6657(false);
        super.mo7398x3e5a77bb(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onViewCreated */
    public void mo7518x594b1124(android.view.View view, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.mo7518x594b1124(view, bundle);
        T1.a(view);
        l0();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo25471x430f73e() {
        return false;
    }
}

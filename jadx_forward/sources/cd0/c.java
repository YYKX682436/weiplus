package cd0;

/* loaded from: classes5.dex */
public final class c extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f122060a;

    public c(java.lang.ref.WeakReference weakUIC) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakUIC, "weakUIC");
        this.f122060a = weakUIC;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755 = (com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755) this.f122060a.get();
        if (c10677xd5472755 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MRevokeChat.LandingPageUIC", "onEnterForeground() called isNeedGoHome:" + c10677xd5472755 + ".isNeedGoHomeAfterEnter [" + c10677xd5472755 + ']');
        if (c10677xd5472755.f149331n) {
            c10677xd5472755.V6(null);
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755 c10677xd5472755 = (com.p314xaae8f345.mm.p689xc5a27af6.p761xc84f0e86.C10677xd5472755) this.f122060a.get();
        if (c10677xd5472755 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MRevokeChat.LandingPageUIC", "onExitForeground() called [" + c10677xd5472755 + ']');
    }
}

package cd0;

/* loaded from: classes5.dex */
public final class c extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f40527a;

    public c(java.lang.ref.WeakReference weakUIC) {
        kotlin.jvm.internal.o.g(weakUIC, "weakUIC");
        this.f40527a = weakUIC;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = (com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC) this.f40527a.get();
        if (revokeChattingLandingPageUIC == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MRevokeChat.LandingPageUIC", "onEnterForeground() called isNeedGoHome:" + revokeChattingLandingPageUIC + ".isNeedGoHomeAfterEnter [" + revokeChattingLandingPageUIC + ']');
        if (revokeChattingLandingPageUIC.f67798n) {
            revokeChattingLandingPageUIC.V6(null);
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC revokeChattingLandingPageUIC = (com.tencent.mm.feature.revoke.RevokeChattingLandingPageUIC) this.f40527a.get();
        if (revokeChattingLandingPageUIC == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MRevokeChat.LandingPageUIC", "onExitForeground() called [" + revokeChattingLandingPageUIC + ']');
    }
}

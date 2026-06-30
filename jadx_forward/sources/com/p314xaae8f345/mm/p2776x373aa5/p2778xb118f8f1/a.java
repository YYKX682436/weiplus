package com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1;

/* loaded from: classes10.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 f295113d;

    public a(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 c22822xceb63781) {
        this.f295113d = c22822xceb63781;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 c22822xceb63781 = this.f295113d;
        c22822xceb63781.setVisibility(8);
        c22822xceb63781.m82823xe4e4e5f3(false);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a onOpenDrawerListener = c22822xceb63781.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(false, false, 0);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 keyboardHeightProvider = c22822xceb63781.getKeyboardHeightProvider();
        if (keyboardHeightProvider != null) {
            keyboardHeightProvider.d();
        }
        c22822xceb63781.f295082s = false;
        com.p314xaae8f345.mm.ui.p2740x696c9db.c5 keyboardHeightObserver = c22822xceb63781.getKeyboardHeightObserver();
        if (keyboardHeightObserver != null) {
            keyboardHeightObserver.w2(0, false);
        }
    }
}

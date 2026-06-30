package cn5;

/* loaded from: classes10.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 f125223d;

    public n(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2) {
        this.f125223d = c22824x40bb30c2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2 = this.f125223d;
        c22824x40bb30c2.setAlpha(1.0f);
        c22824x40bb30c2.setTranslationY(c22824x40bb30c2.getHeight());
        c22824x40bb30c2.setVisibility(8);
        c22824x40bb30c2.f295111s = false;
        c22824x40bb30c2.m82862xe4e4e5f3(false);
        cn5.k onOpenDrawerListener = c22824x40bb30c2.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(false, false, 0);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = c22824x40bb30c2.f295107o;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.c5 keyboardHeightObserver = c22824x40bb30c2.getKeyboardHeightObserver();
        if (keyboardHeightObserver != null) {
            keyboardHeightObserver.w2(0, false);
        }
    }
}

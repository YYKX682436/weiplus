package io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598;

/* renamed from: io.flutter.plugin.editing.ScribePlugin */
/* loaded from: classes15.dex */
public class C28698xdd848efd implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.ScribeMethodHandler {
    private static final java.lang.String TAG = "ScribePlugin";

    /* renamed from: mInputMethodManager */
    private final android.view.inputmethod.InputMethodManager f71686x5053f32f;

    /* renamed from: mScribeChannel */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 f71687x46e12f2c;

    /* renamed from: mView */
    private android.view.View f71688x628b0b2;

    public C28698xdd848efd(android.view.View view, android.view.inputmethod.InputMethodManager inputMethodManager, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679 c28668x1b725679) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f71688x628b0b2 = view;
        this.f71686x5053f32f = inputMethodManager;
        this.f71687x46e12f2c = c28668x1b725679;
        c28668x1b725679.m138314xe77ccc7d(this);
    }

    /* renamed from: destroy */
    public void m138508x5cd39ffa() {
        this.f71687x46e12f2c.m138314xe77ccc7d(null);
        m138509x76516a27(null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.ScribeMethodHandler
    /* renamed from: isFeatureAvailable */
    public boolean mo138315x24b5e1bd() {
        return android.os.Build.VERSION.SDK_INT >= 34 && mo138316xeb564678();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.ScribeMethodHandler
    /* renamed from: isStylusHandwritingAvailable */
    public boolean mo138316xeb564678() {
        return this.f71686x5053f32f.isStylusHandwritingAvailable();
    }

    /* renamed from: setView */
    public void m138509x76516a27(android.view.View view) {
        if (view == this.f71688x628b0b2) {
            return;
        }
        io.p3284xd2ae381c.Log.i(TAG, "setView from " + this.f71688x628b0b2 + " to: " + view);
        this.f71688x628b0b2 = view;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28668x1b725679.ScribeMethodHandler
    /* renamed from: startStylusHandwriting */
    public void mo138317x3edeaf19() {
        this.f71686x5053f32f.startStylusHandwriting(this.f71688x628b0b2);
    }
}

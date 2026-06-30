package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class v implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ va5.v f289699d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289700e;

    public v(va5.v vVar, int i17) {
        this.f289699d = vVar;
        this.f289700e = i17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
        }
        this.f289699d.m171397xf758d1ce(this.f289700e);
    }
}

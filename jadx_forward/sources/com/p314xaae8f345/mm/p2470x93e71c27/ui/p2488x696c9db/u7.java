package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes3.dex */
public class u7 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f273478d;

    public u7(android.view.View view) {
        this.f273478d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        int i39 = i27 - i18;
        int i47 = i38 - i29;
        if (i39 <= 0 || i47 == i39) {
            return;
        }
        view.post(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.t7(this, view));
    }
}

package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class n implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.o f292119a;

    public n(com.p314xaae8f345.mm.ui.p2740x696c9db.o oVar) {
        this.f292119a = oVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z17) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.o oVar = this.f292119a;
        if (z17) {
            oVar.f292143d.l();
        }
        oVar.f292143d.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}

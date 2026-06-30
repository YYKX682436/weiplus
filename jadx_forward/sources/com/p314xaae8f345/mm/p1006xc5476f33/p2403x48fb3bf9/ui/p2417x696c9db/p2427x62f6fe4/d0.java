package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c f267287d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c) {
        this.f267287d = viewOnClickListenerC19428xb021cc2c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ProgressBar progressBar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2427x62f6fe4.ViewOnClickListenerC19428xb021cc2c viewOnClickListenerC19428xb021cc2c = this.f267287d;
        android.widget.ProgressBar progressBar2 = viewOnClickListenerC19428xb021cc2c.B;
        if ((progressBar2 != null && progressBar2.getVisibility() == 0) || (progressBar = viewOnClickListenerC19428xb021cc2c.B) == null) {
            return;
        }
        progressBar.setVisibility(0);
    }
}

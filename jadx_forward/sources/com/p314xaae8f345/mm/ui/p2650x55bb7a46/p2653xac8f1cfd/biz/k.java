package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a0 f280323d;

    public k(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a0 a0Var) {
        this.f280323d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a0 a0Var = this.f280323d;
        android.widget.RelativeLayout relativeLayout = a0Var.f280300a.f280291w;
        if (relativeLayout != null && relativeLayout.getVisibility() != 8) {
            a0Var.f280300a.f280291w.setVisibility(8);
        }
        yb5.d dVar = a0Var.f280300a.f280113d;
        if (dVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingUI.BizComponent", "[onProcecssClick] mChattingContext is null!");
        } else {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) dVar.f542241c.a(sb5.z0.class))).C();
            a0Var.f280300a.f280113d.J();
        }
    }
}

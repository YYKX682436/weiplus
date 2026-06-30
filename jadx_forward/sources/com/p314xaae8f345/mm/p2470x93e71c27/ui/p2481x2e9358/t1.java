package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class t1 implements nl5.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u1 f272193a;

    public t1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.u1 u1Var) {
        this.f272193a = u1Var;
    }

    public void a(int i17, android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 B0;
        a31.m mVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.y4 y4Var = this.f272193a.f272206a.f271488a3;
        if (y4Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8 y8Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y8) ((sb5.i0) y4Var.a().f542241c.a(sb5.i0.class));
            y8Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
            com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32 B02 = y8Var.B0();
            int curV2TStatus = B02 != null ? B02.getCurV2TStatus() : 0;
            int action = event.getAction();
            if (action == 0) {
                if (curV2TStatus == 0 || (B0 = y8Var.B0()) == null) {
                    return;
                }
                B0.c(0);
                return;
            }
            if ((action == 1 || action == 3) && (mVar = y8Var.f281825m) != null && mVar.f82523x && (c22621x7603e017 = mVar.f82501b) != null) {
                java.lang.Runnable runnable = mVar.P;
                c22621x7603e017.removeCallbacks(runnable);
                c22621x7603e017.post(runnable);
            }
        }
    }
}

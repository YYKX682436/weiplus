package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes12.dex */
public class y3 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 f281813d;

    public y3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 x3Var) {
        this.f281813d = x3Var;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        java.lang.Object obj = w0Var.f398509d;
        if (obj instanceof java.lang.String) {
            java.lang.String str2 = (java.lang.String) obj;
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.x3 x3Var = this.f281813d;
            yb5.d dVar = x3Var.f280113d;
            java.lang.String x17 = dVar == null ? null : dVar.x();
            if (android.text.TextUtils.isEmpty(str2) || android.text.TextUtils.isEmpty(x17) || !str2.equals(x17) || !k41.h1.d(x17)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingFooterToolbarComponent", "kefuContactChangeListener onNotifyChange, username: " + x17 + ", rtryShowToolbarInCache");
            x3Var.r0();
        }
    }
}

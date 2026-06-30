package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class k5 implements hy4.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 f267138a;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var) {
        this.f267138a = b5Var;
    }

    @Override // hy4.r
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = this.f267138a;
        if (b5Var.q()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "onCaptureFinish:" + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265464x = currentTimeMillis;
        b5Var.f265475j.put(str, java.lang.Long.valueOf(currentTimeMillis));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = b5Var.f265480o.mo74477x143f1b92().f263449a;
        if (c22633x83752a59 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "onCaptureFinish webView is null");
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19335x16f3c825(str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265464x, b5Var.f265480o.c(), b5Var.f265480o.b(), c22633x83752a59.getMeasuredWidth(), c22633x83752a59.getMeasuredHeight()), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.z5.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.y5(new java.lang.ref.WeakReference(b5Var), str));
            b5Var.f265478m = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        }
    }
}

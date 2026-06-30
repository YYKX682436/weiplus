package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes10.dex */
public final class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 f240473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240474e;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 l2Var, java.lang.String str) {
        this.f240473d = l2Var;
        this.f240474e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.l2 l2Var = this.f240473d;
        l2Var.getClass();
        java.lang.String str = this.f240474e;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        int m43592x7a249f0b = com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str).m43592x7a249f0b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanTranslateHandler", "processImage degree %s", java.lang.Integer.valueOf(m43592x7a249f0b));
        android.graphics.Bitmap K = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K(str);
        if (K != null) {
            android.graphics.Bitmap w07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(K, m43592x7a249f0b);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w07);
            l2Var.e(str, 1, w07, 0L);
        }
    }
}

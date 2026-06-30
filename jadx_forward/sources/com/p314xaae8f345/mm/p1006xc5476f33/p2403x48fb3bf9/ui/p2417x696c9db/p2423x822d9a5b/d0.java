package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y f265726d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y yVar) {
        this.f265726d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y yVar = this.f265726d;
        intent.putExtra("rawUrl", yVar.f265772a);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yVar.f265774c)) {
            return;
        }
        intent.putExtra("float_ball_key", yVar.f265774c);
        if (yVar.f265773b == null) {
            return;
        }
        java.lang.String str = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(str, intent, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.c0.f265723d, null);
    }
}

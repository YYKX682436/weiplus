package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y f265722d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y yVar) {
        this.f265722d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.y yVar = this.f265722d;
        java.lang.String str = yVar.f265772a;
        boolean z17 = false;
        if ((str == null || r26.n0.N(str)) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(yVar.f265774c)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0 h0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265734a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.h0.f265737d.containsKey(yVar.f265774c)) {
            return;
        }
        java.lang.String str2 = yVar.f265772a;
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (a0Var != null && ((yq1.z) a0Var).o(str2)) {
            z17 = true;
        }
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", yVar.f265772a);
            intent.putExtra("float_ball_key", yVar.f265774c);
            java.lang.String str3 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g4.b() ? com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a : com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274588c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(str3, intent, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.z.f265776d, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.a0(yVar));
        }
    }
}

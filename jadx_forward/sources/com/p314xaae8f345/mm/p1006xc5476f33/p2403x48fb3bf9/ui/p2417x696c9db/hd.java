package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class hd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.id f266346d;

    public hd(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.id idVar) {
        this.f266346d = idVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.id idVar = this.f266346d;
        if (idVar.f266374d) {
            int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(idVar.f266375e);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = 2;
            objArr[1] = idVar.f266375e;
            objArr[2] = java.lang.Integer.valueOf(idVar.f266380m.f267200r);
            objArr[3] = java.lang.Integer.valueOf(idVar.f266376f);
            objArr[4] = idVar.f266377g;
            objArr[5] = java.lang.Integer.valueOf(j17);
            objArr[6] = java.lang.Integer.valueOf(idVar.f266378h ? 3 : 2);
            objArr[7] = idVar.f266380m.e(idVar.f266379i);
            g0Var.d(23044, objArr);
        }
        if (idVar.f266374d && !idVar.f266378h) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("userName", idVar.f266375e);
            bundle.putString("exportId", idVar.f266377g);
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.kd.class, null);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = idVar.f266380m.f267187e;
        if (viewOnCreateContextMenuListenerC19337x37f3384d != null) {
            viewOnCreateContextMenuListenerC19337x37f3384d.f265382q2.i0("Contact_Scene", 154);
            idVar.f266380m.f267187e.V8(idVar.f266375e);
            nw4.n nVar = idVar.f266380m.f267187e.f265377p0;
            if (nVar != null && nVar.f422428i) {
                nVar.f422420a.mo14660x738236e6("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("topbar:click", null, nVar.f422436q, nVar.f422437r) + ")", null);
            }
            idVar.f266380m.f267191i.mo50302x6b17ad39(null);
        }
    }
}

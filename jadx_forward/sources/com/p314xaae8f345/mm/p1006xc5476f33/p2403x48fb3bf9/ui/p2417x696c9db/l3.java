package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public final class l3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.a {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f267161b;

    /* renamed from: c, reason: collision with root package name */
    public int f267162c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f267163d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f267164e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f267165f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f267166g;

    public l3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        super(viewOnCreateContextMenuListenerC19337x37f3384d);
        this.f267161b = "MicroMsg.WalletWebViewHelper";
        this.f267163d = true;
    }

    public final void e(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 mmkv) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mmkv, "mmkv");
        mmkv.D("key_jsapi_pay_need_close", "");
        if (c().f265377p0 != null && (linkedList = c().f265377p0.f422424e) != null) {
            linkedList.clear();
        }
        c().finish();
    }

    public final boolean f(com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var) {
        if (o4Var == null) {
            o4Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o4Var, "getSingleDefault(...)");
        }
        java.lang.String u17 = o4Var.u("key_jsapi_pay_need_close", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "decodeString(...)");
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17, c().F7());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f267161b, "isSameUrl:" + z17 + ", pay need close url:%s rawUrl:%s", u17, c().F7());
        return z17;
    }

    public final void g(int i17) {
        ((pg0.t1) ((qg0.z) i95.n0.c(qg0.z.class))).wi("7", "1", java.lang.String.valueOf(i17), "");
    }
}

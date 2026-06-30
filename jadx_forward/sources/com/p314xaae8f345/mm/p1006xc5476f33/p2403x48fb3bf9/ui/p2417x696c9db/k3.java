package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public final class k3 implements o05.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l3 f267135a;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l3 l3Var) {
        this.f267135a = l3Var;
    }

    @Override // o05.j
    public void a(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l3 l3Var = this.f267135a;
        if (l3Var.c().f265377p0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(l3Var.f267161b, "WalletKeyboard onShowKeyboard error, jsapi is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("state", "height");
        hashMap.put("extData", "" + f17);
        l3Var.c().f265377p0.i0("wxpay:keyboard_event", hashMap, null);
    }

    @Override // o05.j
    public void b(int i17, java.lang.String text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.l3 l3Var = this.f267135a;
        if (l3Var.c().f265377p0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(l3Var.f267161b, "WalletKeyboard onTextChange error, jsapi is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        if (i17 == 66) {
            android.app.Dialog dialog = l3Var.f267166g;
            if (dialog != null) {
                dialog.show();
            } else {
                l3Var.f267166g = db5.e1.Q(l3Var.c(), "", l3Var.c().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ba7), false, false, null);
            }
            hashMap.put("state", "enter");
        } else if (text.equals("#outtime")) {
            hashMap.put("state", "outtime");
            android.app.Dialog dialog2 = l3Var.f267166g;
            if (dialog2 != null && dialog2.isShowing()) {
                android.app.Dialog dialog3 = l3Var.f267166g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog3);
                dialog3.dismiss();
            }
        } else {
            if (text.equals("#callpay")) {
                android.app.Dialog dialog4 = l3Var.f267166g;
                if (dialog4 == null || !dialog4.isShowing()) {
                    return;
                }
                android.app.Dialog dialog5 = l3Var.f267166g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog5);
                dialog5.dismiss();
                return;
            }
            hashMap.put("state", "input");
        }
        hashMap.put("extData", text);
        l3Var.c().f265377p0.i0("wxpay:keyboard_event", hashMap, null);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes7.dex */
public class n0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o0 f262036a;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o0 o0Var) {
        this.f262036a = o0Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShowWxPayAgreementsUI", "agree, marketingSwitchClosed = %s", str);
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6281x53bb9e6 c6281x53bb9e6 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6281x53bb9e6();
        am.y20 y20Var = c6281x53bb9e6.f136530g;
        y20Var.f89956a = true;
        y20Var.f89957b = parseBoolean;
        c6281x53bb9e6.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15236, 2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_marketing_switch_closed", parseBoolean);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.o0 o0Var = this.f262036a;
        o0Var.f262079d.setResult(-1, intent);
        o0Var.f262079d.finish();
    }
}

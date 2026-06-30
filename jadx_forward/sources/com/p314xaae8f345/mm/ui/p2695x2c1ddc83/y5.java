package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class y5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a6 f289795a;

    public y5(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a6 a6Var) {
        this.f289795a = a6Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InitHelper", "onDialogClick %s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b6 b6Var = this.f289795a.f288972d;
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q5 q5Var = b6Var.f289012e;
            int i17 = b6Var.f289011d.f462213s;
            q5Var.getClass();
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574955k42, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), java.lang.Integer.valueOf(i17), 1);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            intent.putExtra("showShare", false);
            intent.putExtra("show_bottom", false);
            j45.l.j(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1429L, 28L, 1L, false);
        }
    }
}

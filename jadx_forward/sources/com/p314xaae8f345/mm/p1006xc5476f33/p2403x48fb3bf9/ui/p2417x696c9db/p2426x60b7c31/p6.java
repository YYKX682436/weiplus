package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes12.dex */
public class p6 implements com.p314xaae8f345.mm.p944x882e457a.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q6 f266876d;

    public p6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q6 q6Var) {
        this.f266876d = q6Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.y0
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.q6 q6Var = this.f266876d;
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("playResult", "onVoicePlayEnd:fail");
            bundle.putString(dm.i4.f66867x2a5c95c7, q6Var.f266897e);
            q6Var.f266898f.f266531y.mo70207xf5bc2045(2002, bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "notify voice play end failed : %s", e17.getMessage());
        }
    }
}

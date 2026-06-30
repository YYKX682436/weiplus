package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes8.dex */
public class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5399xd243b6 f266766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l6 f266767e;

    public k6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l6 l6Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5399xd243b6 c5399xd243b6) {
        this.f266767e = l6Var;
        this.f266766d = c5399xd243b6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l6 l6Var = this.f266767e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "onVoiceRecordEnd, localId(%s).", l6Var.f266786d.f264269e);
        try {
            l6Var.f266788f.Y = null;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(dm.i4.f66867x2a5c95c7, l6Var.f266786d.f264269e);
            this.f266766d.f135742h.getClass();
            bundle.putString("recordResult", "onVoiceRecordEnd:".concat("ok"));
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = l6Var.f266788f.f266531y;
            if (z0Var != null) {
                z0Var.mo70207xf5bc2045(2008, bundle);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "callbacker is null");
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "callback stop record failed");
        }
    }
}

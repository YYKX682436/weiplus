package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes5.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 f266073f;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var, android.view.View view, android.view.View view2) {
        this.f266073f = v4Var;
        this.f266071d = view;
        this.f266072e = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var = this.f266073f;
        float[] fArr = v4Var.f266223p;
        android.view.View view = this.f266071d;
        fArr[0] = view.getY();
        v4Var.f266223p[1] = view.getY() - this.f266072e.getY();
        float[] fArr2 = v4Var.f266223p;
        v4Var.getClass();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < fArr2.length; i17++) {
            stringBuffer.append(java.lang.String.format("[%d]: %.2f,", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(fArr2[i17])));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosAnimatorBaseController", "printArray:" + stringBuffer.toString());
    }
}

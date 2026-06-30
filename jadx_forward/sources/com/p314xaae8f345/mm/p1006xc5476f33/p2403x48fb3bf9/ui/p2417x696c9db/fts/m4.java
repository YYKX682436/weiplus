package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes5.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f266059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 f266060e;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var, android.view.View view) {
        this.f266060e = v4Var;
        this.f266059d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.v4 v4Var = this.f266060e;
        float[] fArr = v4Var.f266222o[0];
        android.view.View view = this.f266059d;
        fArr[0] = view.getY();
        float[][] fArr2 = v4Var.f266222o;
        fArr2[0][1] = 0.0f;
        fArr2[1][0] = view.getX();
        float[][] fArr3 = v4Var.f266222o;
        fArr3[1][1] = 0.0f;
        fArr3[2][0] = view.getMeasuredWidth();
        v4Var.f266222o[2][1] = view.getMeasuredWidth() + (v4Var.f266208a * 2);
        float[][] fArr4 = v4Var.f266222o;
        v4Var.getClass();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < fArr4.length; i17++) {
            for (int i18 = 0; i18 < fArr4[i17].length; i18++) {
                stringBuffer.append(java.lang.String.format("[%d,%d]: %.2f,", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(fArr4[i17][i18])));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.SosAnimatorBaseController", "printArray:" + stringBuffer.toString());
    }
}

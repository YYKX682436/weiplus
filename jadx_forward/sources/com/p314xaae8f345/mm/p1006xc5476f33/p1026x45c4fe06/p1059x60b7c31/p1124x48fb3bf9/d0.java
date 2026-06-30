package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public class d0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.e0 {

    /* renamed from: CTRL_INDEX */
    public static final int f34984x366c91de = 1165;

    /* renamed from: NAME */
    public static final java.lang.String f34985x24728b = "updateGameHTMLWebView";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.e0, gb1.h
    public /* bridge */ /* synthetic */ boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        K((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) tVar, i17, view, jSONObject);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.e0
    /* renamed from: M */
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        super.K(n7Var, i17, view, jSONObject);
        java.lang.String optString = jSONObject.optString("evaluateJavascript", "");
        if (!android.text.TextUtils.isEmpty(optString)) {
            of1.v0 v0Var = (of1.v0) ((of1.w1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) view)).m151222x143f1b92();
            v0Var.getClass();
            if (!(optString == null || optString.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o oVar = v0Var.W1;
                if (oVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mView");
                    throw null;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 mo51534x86b9ebe3 = ((of1.w1) oVar).mo51534x86b9ebe3();
                if (mo51534x86b9ebe3 != null) {
                    mo51534x86b9ebe3.mo14660x738236e6(optString, new of1.e0(v0Var));
                }
            }
        }
        return true;
    }
}

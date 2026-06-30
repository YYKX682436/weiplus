package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9;

/* loaded from: classes7.dex */
public class e0 extends gb1.h {

    /* renamed from: CTRL_INDEX */
    public static final int f34986x366c91de = 300;

    /* renamed from: NAME */
    public static final java.lang.String f34987x24728b = "updateHTMLWebView";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("htmlId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gb1.h
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public boolean K(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (jSONObject.has("backgroundColor")) {
            try {
                view.setBackgroundColor(ik1.w.l(jSONObject.getString("backgroundColor")));
            } catch (java.lang.Exception unused) {
            }
        }
        if (jSONObject.has("adjustResizeOnKeyboardStateChanged")) {
            ((of1.w1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) view)).m151235xadcefbee(jSONObject.optBoolean("adjustResizeOnKeyboardStateChanged", true));
        }
        ((of1.w1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) view)).mo51537x77c16137(jSONObject.optBoolean("muted", false));
        java.lang.String optString = jSONObject.optString("src", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiUpdateHTMLWebView", "onUpdateView appId[%s] viewId[%d] viewHash[%d] src[%s]", n7Var.mo48798x74292566(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(view.hashCode()), optString);
        if (android.text.TextUtils.isEmpty(optString)) {
            return true;
        }
        of1.v0 v0Var = (of1.v0) ((of1.w1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1124x48fb3bf9.o) view)).m151222x143f1b92();
        v0Var.getClass();
        if (!(optString == null || optString.length() == 0)) {
            v0Var.f426561g2.b(optString);
        }
        return true;
    }
}

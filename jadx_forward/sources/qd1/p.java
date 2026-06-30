package qd1;

/* loaded from: classes7.dex */
public final class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f76461x366c91de = 104;

    /* renamed from: NAME */
    private static final java.lang.String f76462x24728b = "showModal";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [int] */
    /* JADX WARN: Type inference failed for: r17v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18, types: [int] */
    /* JADX WARN: Type inference failed for: r2v23, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 == null) {
            if (e9Var.t3() == null || e9Var.t3().L0() || e9Var.t3().J0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowModal", "invoke failed with appId[%s] callbackId[%d], current page view is null.", e9Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
                e9Var.a(i17, o("fail:page don't exist"));
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiShowModal", "invoke with appId[%s] callbackId[%d] runtime !initialized, retry", e9Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
                e9Var.t3().I1(new qd1.i(this, e9Var, i17, jSONObject));
                return;
            }
        }
        int optInt = jSONObject.optInt(dm.i4.f66865x76d1ec5a, -1);
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = jSONObject.optString("confirmText", e9Var.mo50352x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gpa));
        java.lang.String optString3 = jSONObject.optString("cancelText", e9Var.mo50352x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gp9));
        boolean optBoolean = jSONObject.optBoolean("showCancel", true);
        boolean optBoolean2 = jSONObject.optBoolean("editable", false);
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        nf.y yVar = nf.x.f418149b;
        java.lang.String str = "";
        try {
            if (yVar != null ? yVar.i(mo48798x74292566) : false) {
                java.lang.String optString4 = jSONObject.optString("confirmColorDark", "");
                ?? color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp);
                try {
                    color = ik1.w.l(optString4);
                } catch (java.lang.Exception unused) {
                }
                java.lang.String optString5 = jSONObject.optString("cancelColorDark", "");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5);
                str = ik1.w.l(optString5);
                yVar = color;
            } else {
                java.lang.String optString6 = jSONObject.optString("confirmColor", "");
                ?? color2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp);
                try {
                    color2 = ik1.w.l(optString6);
                } catch (java.lang.Exception unused2) {
                }
                java.lang.String optString7 = jSONObject.optString("cancelColor", "");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5);
                str = ik1.w.l(optString7);
                yVar = color2;
            }
        } catch (java.lang.Exception unused3) {
        }
        ?? r162 = yVar;
        java.lang.String optString8 = jSONObject.optString("content");
        boolean optBoolean3 = jSONObject.optBoolean("upper", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowModal", "showModal appId[%s] title[%s] content[%s] upper[%b]", e9Var.mo48798x74292566(), optString, optString8, java.lang.Boolean.valueOf(optBoolean3));
        e9Var.m(new qd1.j(this, e9Var, V0, optBoolean3, optString, optString8, optBoolean2, optString2, optInt, i17, optBoolean, optString3, r162, str, jSONObject));
    }
}

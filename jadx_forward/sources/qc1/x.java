package qc1;

/* loaded from: classes7.dex */
public class x extends qc1.a {

    /* renamed from: CTRL_INDEX */
    private static final int f76447x366c91de = 112;

    /* renamed from: NAME */
    private static final java.lang.String f76448x24728b = "updateInput";

    @Override // qc1.a
    public boolean C() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, org.json.JSONObject jSONObject, int i17) {
        pl1.i iVar = new pl1.i();
        if (G(iVar, jSONObject, v5Var, i17)) {
            try {
                int i18 = jSONObject.getInt("inputId");
                java.lang.Integer num = iVar.f438121b;
                if (num != null && num.intValue() < 0) {
                    iVar.f438121b = 0;
                }
                java.lang.Integer num2 = iVar.f438122c;
                if (num2 != null && num2.intValue() < 0) {
                    iVar.f438122c = 0;
                }
                java.lang.Object opt = jSONObject.opt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
                if (opt != null && org.json.JSONObject.NULL != opt) {
                    E(i18, opt.toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h6.c(jSONObject, iVar);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l4.c(jSONObject, iVar);
                ik1.h0.b(new qc1.w(this, v5Var, i18, iVar, i17));
            } catch (org.json.JSONException unused) {
                v5Var.a(i17, o("fail:invalid data"));
            }
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public final class q extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f34057x366c91de = 72;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f34058x24728b = "chooseContact";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null || jSONObject == null) {
            return;
        }
        android.app.Activity a17 = q75.a.a(lVar.mo50352x76847179());
        if (a17 == null) {
            lVar.a(i17, "fail:internal error invalid android context");
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 30) {
            C(lVar, a17, jSONObject, i17);
        } else if (b3.l.m9698x3fed0563(a17, "android.permission.READ_CONTACTS") == 0) {
            C(lVar, a17, jSONObject, i17);
        } else {
            nf.g.a(a17).c(lVar, "android.permission.READ_CONTACTS", new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.o(this, lVar, a17, jSONObject, i17));
        }
    }

    public final void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, android.app.Activity activity, org.json.JSONObject jSONObject, int i17) {
        nf.g a17 = nf.g.a(activity);
        android.content.Intent intent = new android.content.Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/phone_v2");
        a17.j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.p(lVar, i17, this));
    }
}

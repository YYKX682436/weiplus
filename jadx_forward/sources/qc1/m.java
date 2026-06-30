package qc1;

/* loaded from: classes7.dex */
public class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    private static final int f76439x366c91de = -2;

    /* renamed from: NAME */
    private static final java.lang.String f76440x24728b = "restoreWebviewFocus";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        new qc1.l(this, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar, jSONObject.optBoolean("focus", false)).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()));
        return o("ok");
    }
}

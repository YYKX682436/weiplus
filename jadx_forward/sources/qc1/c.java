package qc1;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    private static final int f76429x366c91de = 583;

    /* renamed from: NAME */
    private static final java.lang.String f76430x24728b = "getSelectedTextRange";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        int[] iArr = (int[]) new qc1.b(this, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5) lVar).a(new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()));
        if (iArr == null) {
            return o("fail:no focused input");
        }
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("start", java.lang.Integer.valueOf(iArr[0]));
        hashMap.put("end", java.lang.Integer.valueOf(iArr[1]));
        return p("ok", hashMap);
    }
}

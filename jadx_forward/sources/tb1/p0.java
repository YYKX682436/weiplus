package tb1;

/* loaded from: classes7.dex */
public class p0 extends gb1.i {

    /* renamed from: CTRL_INDEX */
    private static final int f76792x366c91de = 332;

    /* renamed from: NAME */
    public static final java.lang.String f76793x24728b = "operateCamera";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f498452g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            lVar.a(i17, o("fail:data is null or nil"));
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new tb1.q0(this, jSONObject, lVar, i17));
        }
    }
}

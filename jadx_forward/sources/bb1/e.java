package bb1;

/* loaded from: classes7.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f4185x366c91de = 1356;

    /* renamed from: NAME */
    public static final java.lang.String f4186x24728b = "getNpuLibsPath";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar != null) {
            java.util.Map e17 = kz5.b1.e(new jz5.l(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, com.p314xaae8f345.mm.p2818xd0d82df3.v.f295912a.c()));
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            if (!(e17 instanceof java.util.HashMap)) {
                e17 = new java.util.HashMap(e17);
            }
            e17.put("errno", 0);
            lVar.a(i17, t("ok", e17));
        }
    }
}

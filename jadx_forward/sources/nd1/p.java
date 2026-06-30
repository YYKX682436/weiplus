package nd1;

/* loaded from: classes7.dex */
public class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72963x366c91de = 15;

    /* renamed from: NAME */
    public static final java.lang.String f72964x24728b = "navigateBack";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        yVar.m(new nd1.o(this, yVar, jSONObject, jSONObject.optInt("skipIntermediate", 0) == 1, i17, jSONObject.optJSONObject("singlePageData"), jSONObject.optString("routeId")));
    }
}

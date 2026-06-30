package ck;

/* loaded from: classes5.dex */
public final class e extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getParameter */
    public java.util.ArrayList mo14972x73ec24f3() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String Vi = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi("MagicAdBrandService");
        java.lang.String Vi2 = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi("MagicAdPublicService");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(Vi);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
            vVar.d("adBrandServiceVersionNumber");
            vVar.c(jSONObject.optInt("numberVersion"));
            vVar.e(1);
            arrayList.add(vVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicAdOnnxFeatureService", "getParameter adBrandServiceVersionNumber: " + vVar + ".paramInt32");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(Vi2);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v vVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.v();
            vVar2.d("adPublicServiceVersionNumber");
            vVar2.c(jSONObject2.optInt("numberVersion"));
            vVar2.e(1);
            arrayList.add(vVar2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UDRMagicAdOnnxFeatureService", "getParameter adPublicServiceVersionNumber: " + vVar2 + ".paramInt32");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.UDRMagicAdOnnxFeatureService", e17, "", new java.lang.Object[0]);
        }
        return arrayList;
    }

    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_dd118769";
    }
}

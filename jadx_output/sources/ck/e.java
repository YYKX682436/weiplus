package ck;

/* loaded from: classes5.dex */
public final class e extends ea5.l {
    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String Vi = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi("MagicAdBrandService");
        java.lang.String Vi2 = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).Vi("MagicAdPublicService");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(Vi);
            com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
            vVar.d("adBrandServiceVersionNumber");
            vVar.c(jSONObject.optInt("numberVersion"));
            vVar.e(1);
            arrayList.add(vVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicAdOnnxFeatureService", "getParameter adBrandServiceVersionNumber: " + vVar + ".paramInt32");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(Vi2);
            com.tencent.wechat.aff.udr.v vVar2 = new com.tencent.wechat.aff.udr.v();
            vVar2.d("adPublicServiceVersionNumber");
            vVar2.c(jSONObject2.optInt("numberVersion"));
            vVar2.e(1);
            arrayList.add(vVar2);
            com.tencent.mars.xlog.Log.i("MicroMsg.UDRMagicAdOnnxFeatureService", "getParameter adPublicServiceVersionNumber: " + vVar2 + ".paramInt32");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UDRMagicAdOnnxFeatureService", e17, "", new java.lang.Object[0]);
        }
        return arrayList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_dd118769";
    }
}

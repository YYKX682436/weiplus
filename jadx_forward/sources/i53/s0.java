package i53;

/* loaded from: classes15.dex */
public class s0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i53.v0 f370242a;

    public s0(i53.v0 v0Var) {
        this.f370242a = v0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.m0
    public void a(boolean z17, int i17, int i18, java.lang.String str, java.lang.String str2) {
        i53.v0 v0Var = this.f370242a;
        if (!((java.util.HashSet) v0Var.f370283b).contains(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "onProgress, not in uploadingList, localId: %s", str);
            return;
        }
        int size = v0Var.f370282a.size();
        float f17 = size;
        float f18 = ((size - r0) / f17) + ((1.0f / f17) * (i18 / 100.0f));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameHaowanUploadTask", "onProgress, localId : %s, percent : %d, initSize : %d, uploadingSize : %d, uploadProgress : %f", str, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(((java.util.HashSet) v0Var.f370283b).size()), java.lang.Float.valueOf(f18));
        m33.o1 o1Var = v0Var.f370286e;
        if (o1Var != null) {
            u93.n nVar = ((u93.m) o1Var).f507360a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ParamKey.f15121xc2d3420e, nVar.f507361g);
                jSONObject.put("percent", f18);
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("LiteAppJsApiUploadGameMediaFile", e17, "", new java.lang.Object[0]);
            }
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = nVar.f224975e;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Uj(cVar.f380557a, cVar.f380559c, "game.mediaFileUploadProgress", jSONObject);
        }
    }
}

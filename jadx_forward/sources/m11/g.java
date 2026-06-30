package m11;

/* loaded from: classes12.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f404229a = new java.util.HashMap();

    public void a(java.lang.String str, boolean z17, k70.u uVar) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageService", "do load fail, url is empty");
            return;
        }
        android.graphics.Bitmap b17 = b(str);
        if (b17 != null && !b17.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdnImageService", "do load ok, url[%s], bitmap exists", str);
            if (uVar != null) {
                uVar.a(b17, null);
                return;
            }
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(b17 == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageService", "try to download: url[%s], src bitmap is null[%B]", objArr);
        java.util.HashMap hashMap = this.f404229a;
        if (hashMap.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdnImageService", "contains url[%s]", str);
        } else {
            hashMap.put(str, uVar);
            s75.d.b(new m11.f(str, hashMap, z17), "CdnImageService_download");
        }
    }

    public android.graphics.Bitmap b(java.lang.String str) {
        if (str != null && str.length() != 0) {
            return (android.graphics.Bitmap) um.n.a(um.n.b("local_cdn_img_cache"), str, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnImageService", "get fail, key is null");
        return null;
    }

    public void c(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CdnImageService", "push fail, key is null");
            return;
        }
        um.o b17 = um.n.b("local_cdn_img_cache");
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ICacheService.Factory", "null service");
        } else {
            ((jt0.i) ((m11.q0) b17).f404302d).j(str, bitmap);
        }
    }

    /* renamed from: finalize */
    public void m146621xd764dc1e() {
        super.finalize();
    }
}

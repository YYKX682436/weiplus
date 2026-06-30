package q93;

/* loaded from: classes8.dex */
public class c extends mu4.f {

    /* renamed from: g, reason: collision with root package name */
    public final long f442444g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f442445h;

    public c(q93.d dVar, nw4.n nVar, q93.d dVar2) {
        super(nVar);
        this.f442444g = 0L;
        this.f442444g = dVar2.f442447b;
        this.f442445h = new java.lang.ref.WeakReference(dVar2);
    }

    @Override // mu4.f, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public void b(android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("result_data", bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65269x10864c08(this.f442444g, intent);
    }

    @Override // mu4.f, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: callback */
    public boolean mo70207xf5bc2045(int i17, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference = this.f442445h;
        if (i17 != 121003) {
            if (i17 != 1000000 || weakReference.get() == null) {
                return true;
            }
            q93.d dVar = (q93.d) weakReference.get();
            dVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiBridgeWebViewHandler", "onDestroy WebStubService");
            dVar.f442446a = null;
            return true;
        }
        long j17 = ((q93.d) weakReference.get()).f442447b;
        long j18 = ((q93.d) weakReference.get()).f442448c;
        int i18 = bundle != null ? bundle.getInt("key_image_pos", -1) : -1;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(ya.b.f77479x42930b2, i18);
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiteAppJsApiBridgeWebViewHandler", "json exception: " + e17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65430x38afe828(j17, j18, "onImagePreviewChanged", jSONObject);
        return true;
    }

    @Override // mu4.f, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        return "liteapp://";
    }
}

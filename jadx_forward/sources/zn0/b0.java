package zn0;

/* loaded from: classes3.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f555857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zn0.a0 f555858f;

    public b0(zn0.a0 a0Var, java.lang.String str, android.view.TextureView textureView) {
        this.f555858f = a0Var;
        this.f555856d = str;
        this.f555857e = textureView;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        android.view.TextureView textureView = this.f555857e;
        java.util.HashMap hashMap = this.f555858f.f555840k;
        java.lang.String str2 = this.f555856d;
        hashMap.remove(str2);
        try {
            str = new org.json.JSONObject().put("timeout", true).put("userId", str2).put("textureView", textureView).put("visibility", textureView.getVisibility()).put("width", textureView.getWidth()).put("height", textureView.getHeight()).put("isAttachedToWindow", textureView.isAttachedToWindow()).put("isAvailable", textureView.isAvailable()).toString().replace(",", ";");
        } catch (java.lang.Exception unused) {
            str = "{\"timeout\":true}";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TRTCRemoteUserManager", str);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f c6516x7962e81f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6516x7962e81f();
        c6516x7962e81f.f138678e = 400;
        c6516x7962e81f.p(str);
        c6516x7962e81f.k();
    }
}

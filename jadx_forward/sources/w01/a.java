package w01;

/* loaded from: classes4.dex */
public class a implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f523404b;

    public a(java.lang.String str, java.lang.ref.WeakReference weakReference) {
        this.f523403a = str;
        this.f523404b = weakReference;
    }

    @Override // p11.d
    public void a(boolean z17, java.lang.Object... objArr) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f523403a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenSdkBridge", "doSendImage onImageDownload success? %s=%b", str, valueOf);
        if (z17) {
            android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
            android.app.Activity activity = (android.app.Activity) this.f523404b.get();
            if (J2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenSdkBridge", "doSendImage null bitmap");
            }
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OpenSdkBridge", "doSendImage null or finished context");
                return;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9(J2);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
            c11286x34a5504.f33122xe4128443 = c11283x90d63ed9;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
            req.f32866x7fa0d2de = "com.tencent.wework.img";
            req.f33049x38eb0007 = c11286x34a5504;
            req.f33050x683188c = 0;
            w01.b.b(activity, req);
        }
    }
}

package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public final class ue implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.u9 {

    /* renamed from: c, reason: collision with root package name */
    public static final l75.v0 f284277c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.re();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f284278a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f284279b = new java.util.HashMap();

    public ue(android.content.Context context) {
        this.f284278a = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.u9
    public void a(android.os.Bundle bundle) {
        android.net.Uri.parse(bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32807x6382c059)).getQueryParameter("appid");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11271x7b1482d5.Resp resp = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11271x7b1482d5.Resp(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WXAppMessageShower", "handleResp, errCode = " + resp.f32867xa7c470f2 + ", type = " + resp.mo48430xfb85f7b0());
        java.util.Map map = this.f284279b;
        if (((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11271x7b1482d5.Req) ((java.util.HashMap) map).get(resp.f32870x7fa0d2de)) != null) {
            ((java.util.HashMap) map).remove(resp.f32870x7fa0d2de);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXAppMessageShower", "invalid resp, check transaction failed, transaction=" + resp.f32870x7fa0d2de);
        }
    }
}

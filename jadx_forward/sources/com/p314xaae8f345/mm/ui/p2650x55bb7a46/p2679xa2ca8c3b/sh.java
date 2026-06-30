package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes3.dex */
public class sh implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cl0.g f287057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287058b;

    public sh(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, cl0.g gVar) {
        this.f287058b = c21908xb66fd105;
        this.f287057a = gVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplate", "OpenLiteApp fail");
        java.lang.String mo15083x48bce8a4 = this.f287057a.mo15083x48bce8a4("default_url", "");
        if (mo15083x48bce8a4.isEmpty()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", mo15083x48bce8a4);
        j45.l.j(this.f287058b.f284708s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "OpenLiteApp success");
    }
}

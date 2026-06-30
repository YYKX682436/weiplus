package aw4;

/* loaded from: classes8.dex */
public final class j implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw4.l f96421a;

    public j(aw4.l lVar) {
        this.f96421a = lVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "JsApiOpenLiteApp fail");
        this.f96421a.l(false);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "JsApiOpenLiteApp success");
        this.f96421a.l(true);
    }
}

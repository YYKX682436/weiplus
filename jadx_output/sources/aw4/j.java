package aw4;

/* loaded from: classes8.dex */
public final class j implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ aw4.l f14888a;

    public j(aw4.l lVar) {
        this.f14888a = lVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "JsApiOpenLiteApp fail");
        this.f14888a.l(false);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseWebSearchJSApi", "JsApiOpenLiteApp success");
        this.f14888a.l(true);
    }
}

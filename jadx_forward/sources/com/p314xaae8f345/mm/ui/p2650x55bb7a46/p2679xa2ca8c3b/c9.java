package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class c9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f285237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c53.a f285238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yb5.d f285239c;

    public c9(q80.d0 d0Var, c53.a aVar, yb5.d dVar) {
        this.f285237a = d0Var;
        this.f285238b = aVar;
        this.f285239c = dVar;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingItemAppMsgGameNameCard", "openLiteApp fail %s. fallback to H5", this.f285237a.f442182a);
        c53.a aVar = this.f285238b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f120181f)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", aVar.f120181f);
        j45.l.j(this.f285239c.g(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingItemAppMsgGameNameCard", "openLiteApp success %s.", this.f285237a.f442182a);
    }
}

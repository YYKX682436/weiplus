package com.tencent.mm.opensdk.diffdev.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class b implements com.tencent.mm.opensdk.diffdev.OAuthListener {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.tencent.mm.opensdk.diffdev.a.a f72332f;

    public b(com.tencent.mm.opensdk.diffdev.a.a aVar) {
        this.f72332f = aVar;
    }

    @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
    public final void onAuthFinish(com.tencent.mm.opensdk.diffdev.OAuthErrCode oAuthErrCode, java.lang.String str) {
        java.util.List list;
        com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.ListenerWrapper", java.lang.String.format("onAuthFinish, errCode = %s, authCode = %s", oAuthErrCode.toString(), str));
        com.tencent.mm.opensdk.diffdev.a.a.c(this.f72332f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        list = this.f72332f.f72329c;
        arrayList.addAll(list);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.opensdk.diffdev.OAuthListener) it.next()).onAuthFinish(oAuthErrCode, str);
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
    public final void onAuthGotQrcode(java.lang.String str, byte[] bArr) {
        java.util.List list;
        com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = ".concat(java.lang.String.valueOf(str)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        list = this.f72332f.f72329c;
        arrayList.addAll(list);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.opensdk.diffdev.OAuthListener) it.next()).onAuthGotQrcode(str, bArr);
        }
    }

    @Override // com.tencent.mm.opensdk.diffdev.OAuthListener
    public final void onQrcodeScanned() {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.tencent.mm.opensdk.utils.Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
        handler = this.f72332f.handler;
        if (handler != null) {
            handler2 = this.f72332f.handler;
            handler2.post(new com.tencent.mm.opensdk.diffdev.a.c(this));
        }
    }
}

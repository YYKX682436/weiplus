package com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public final class b implements com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.a f153865f;

    public b(com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.a aVar) {
        this.f153865f = aVar;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b
    /* renamed from: onAuthFinish */
    public final void mo48417x2736d79a(com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.EnumC11227x40edae5b enumC11227x40edae5b, java.lang.String str) {
        java.util.List list;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.ListenerWrapper", java.lang.String.format("onAuthFinish, errCode = %s, authCode = %s", enumC11227x40edae5b.toString(), str));
        com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.a.c(this.f153865f);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        list = this.f153865f.f153862c;
        arrayList.addAll(list);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b) it.next()).mo48417x2736d79a(enumC11227x40edae5b, str);
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b
    /* renamed from: onAuthGotQrcode */
    public final void mo48418x7ef9aad3(java.lang.String str, byte[] bArr) {
        java.util.List list;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.ListenerWrapper", "onAuthGotQrcode, qrcodeImgPath = ".concat(java.lang.String.valueOf(str)));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        list = this.f153865f.f153862c;
        arrayList.addAll(list);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b) it.next()).mo48418x7ef9aad3(str, bArr);
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.InterfaceC11228xdc3b346b
    /* renamed from: onQrcodeScanned */
    public final void mo48419x23fb32e3() {
        android.os.Handler handler;
        android.os.Handler handler2;
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.d("MicroMsg.SDK.ListenerWrapper", "onQrcodeScanned");
        handler = this.f153865f.f32860x294b574a;
        if (handler != null) {
            handler2 = this.f153865f.f32860x294b574a;
            handler2.post(new com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0.a.c(this));
        }
    }
}

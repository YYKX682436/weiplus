package com.p314xaae8f345.p3085x8ea91595.p3089x41473653;

/* renamed from: com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKMessageThread */
/* loaded from: classes13.dex */
public class C26660xf61b8104 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: mInstance */
    private static com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104 f56048x46143c22 = null;

    /* renamed from: mMessagehandlerThread */
    private static android.os.HandlerThread f56049x55ec715a = null;

    /* renamed from: postActionResult */
    private static final int f56050x911c2eb3 = 4;

    /* renamed from: postSDKServiceInvalidMessage */
    private static final int f56051x1b68c0cb = 3;

    /* renamed from: postTaskProgressChangedMessage */
    private static final int f56052x70faae5 = 2;

    /* renamed from: postTaskStateChangedMessage */
    private static final int f56053x17459f1f = 1;

    private C26660xf61b8104(xu5.b bVar) {
        super(bVar);
    }

    /* renamed from: getInstance */
    public static synchronized com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104 m104848x9cf0d20b() {
        com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104 c26660xf61b8104;
        synchronized (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104.class) {
            if (f56048x46143c22 == null) {
                f56048x46143c22 = new com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26660xf61b8104(xu5.b.a("TMAssistantDownloadSDKMessageThread"));
            }
            c26660xf61b8104 = f56048x46143c22;
        }
        return c26660xf61b8104;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7 c26778xebe700e7 = (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7) message.obj;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18 = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18) c26778xebe700e7.f56844xd1c07c0a;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5 = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5) c26778xebe700e7.f56845xb9039dcc;
            android.os.Bundle data = message.getData();
            java.lang.String string = data.getString("url");
            int i18 = data.getInt("state");
            int i19 = data.getInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993);
            java.lang.String string2 = data.getString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb);
            boolean z17 = data.getBoolean("hasChangeUrl");
            boolean z18 = data.getBoolean("autoRetry");
            if (interfaceC26654xdda48bb5 != null) {
                interfaceC26654xdda48bb5.mo104815xdbc24c3b(c26657x9422ab18, string, i18, i19, string2, z17, z18);
                return;
            }
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7 c26778xebe700e72 = (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7) message.obj;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab182 = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18) c26778xebe700e72.f56844xd1c07c0a;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb52 = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5) c26778xebe700e72.f56845xb9039dcc;
            android.os.Bundle data2 = message.getData();
            java.lang.String string3 = data2.getString("url");
            long j17 = data2.getLong("receiveDataLen");
            long j18 = data2.getLong("totalDataLen");
            if (interfaceC26654xdda48bb52 != null) {
                interfaceC26654xdda48bb52.mo104814x3a76d16f(c26657x9422ab182, string3, j17, j18);
                return;
            }
            return;
        }
        if (i17 == 3) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7 c26778xebe700e73 = (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7) message.obj;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab183 = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18) c26778xebe700e73.f56844xd1c07c0a;
            com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb53 = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5) c26778xebe700e73.f56845xb9039dcc;
            if (interfaceC26654xdda48bb53 != null) {
                interfaceC26654xdda48bb53.mo104816x50d9dc65(c26657x9422ab183);
                return;
            }
            return;
        }
        if (i17 != 4) {
            return;
        }
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7 c26778xebe700e74 = (com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7) message.obj;
        byte[] bArr = (byte[]) c26778xebe700e74.f56844xd1c07c0a;
        java.util.ArrayList arrayList = (java.util.ArrayList) c26778xebe700e74.f56845xb9039dcc;
        if (arrayList != null) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e interfaceC26653xae3d077e = (com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e) it.next();
                if (interfaceC26653xae3d077e != null) {
                    interfaceC26653xae3d077e.mo104812xcc9ebd72(bArr);
                }
            }
        }
    }

    /* renamed from: postActionResult */
    public void m104849x911c2eb3(byte[] bArr, java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26653xae3d077e> arrayList) {
        if (bArr == null || arrayList == null) {
            return;
        }
        android.os.Message mo50288x733c63a2 = m104848x9cf0d20b().mo50288x733c63a2();
        mo50288x733c63a2.what = 4;
        mo50288x733c63a2.obj = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7(bArr, arrayList);
        mo50288x733c63a2.sendToTarget();
    }

    /* renamed from: postSDKServiceInvalidMessage */
    public void m104850x1b68c0cb(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18, com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5) {
        if (interfaceC26654xdda48bb5 == null || c26657x9422ab18 == null) {
            return;
        }
        android.os.Message mo50288x733c63a2 = m104848x9cf0d20b().mo50288x733c63a2();
        mo50288x733c63a2.what = 3;
        mo50288x733c63a2.obj = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7(c26657x9422ab18, interfaceC26654xdda48bb5);
        mo50288x733c63a2.sendToTarget();
    }

    /* renamed from: postTaskProgressChangedMessage */
    public void m104851x70faae5(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18, com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5, java.lang.String str, long j17, long j18) {
        if (interfaceC26654xdda48bb5 == null || c26657x9422ab18 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i("TMAssistantDownloadSDKMessageThread", "listenr:" + interfaceC26654xdda48bb5 + " === sdkClient" + c26657x9422ab18);
            return;
        }
        android.os.Message mo50288x733c63a2 = m104848x9cf0d20b().mo50288x733c63a2();
        mo50288x733c63a2.what = 2;
        mo50288x733c63a2.obj = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7(c26657x9422ab18, interfaceC26654xdda48bb5);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str);
        bundle.putLong("receiveDataLen", j17);
        bundle.putLong("totalDataLen", j18);
        mo50288x733c63a2.setData(bundle);
        mo50288x733c63a2.sendToTarget();
    }

    /* renamed from: postTaskStateChangedMessage */
    public void m104852x17459f1f(com.p314xaae8f345.p3085x8ea91595.p3089x41473653.C26657x9422ab18 c26657x9422ab18, com.p314xaae8f345.p3085x8ea91595.p3089x41473653.InterfaceC26654xdda48bb5 interfaceC26654xdda48bb5, java.lang.String str, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        if (interfaceC26654xdda48bb5 == null || c26657x9422ab18 == null) {
            return;
        }
        android.os.Message mo50288x733c63a2 = m104848x9cf0d20b().mo50288x733c63a2();
        mo50288x733c63a2.what = 1;
        mo50288x733c63a2.obj = new com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26778xebe700e7(c26657x9422ab18, interfaceC26654xdda48bb5);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("url", str);
        bundle.putInt("state", i17);
        bundle.putInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993, i18);
        bundle.putString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56296xc5686afb, str2);
        bundle.putBoolean("hasChangeUrl", z17);
        bundle.putBoolean("autoRetry", z18);
        mo50288x733c63a2.setData(bundle);
        mo50288x733c63a2.sendToTarget();
    }
}

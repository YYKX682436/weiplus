package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public class i implements com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f129110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f129111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd f129112c;

    public i(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.C3932x19b83abd c3932x19b83abd, java.lang.ref.WeakReference weakReference, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        this.f129112c = c3932x19b83abd;
        this.f129110a = weakReference;
        this.f129111b = lVar;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: getFilePath */
    public java.lang.String mo32199x5000ed37(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "getFilePath src:%s", str);
        boolean equals = com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface.f29641xc9b6f710.equals(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f129111b;
        if (equals) {
            te.b bVar = (te.b) lVar.q(te.b.class);
            return bVar != null ? ((te.a) bVar).f499297d : "";
        }
        if (str.startsWith("file://")) {
            java.lang.String substring = str.substring(7);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "filePath:%s", substring);
            return substring;
        }
        if (str.contains("base64") && str.startsWith("data:audio")) {
            java.lang.String b17 = jh1.d.b(str.substring(str.indexOf("base64,") + 7).trim());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.WxAudioNativeInstallHelper", "base64 decode filePath:%s", b17);
            return b17;
        }
        if (!str.startsWith("wxblob://")) {
            return (str.startsWith("http://") || str.startsWith("https://")) ? str : jh1.d.a(lVar, str);
        }
        com.p314xaae8f345.mm.vfs.r6 mo49621x2f1a0d80 = lVar.mo50354x59eafec1().mo49621x2f1a0d80(str);
        if (mo49621x2f1a0d80 != null && mo49621x2f1a0d80.m()) {
            return mo49621x2f1a0d80.o();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.WxAudioNativeInstallHelper", "wxblob localFile is null");
        return str;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: onCallBack */
    public void mo32200x9ac7b764(long j17, java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) this.f129110a.get()).mo51545x3498a0(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.h(this, str, j17));
    }
}

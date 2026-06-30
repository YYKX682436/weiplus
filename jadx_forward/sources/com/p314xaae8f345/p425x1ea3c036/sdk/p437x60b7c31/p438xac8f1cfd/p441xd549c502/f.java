package com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface f129106a;

    public f(com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface nativeCallBackInterface, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.y lifecycleOwner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        this.f129106a = nativeCallBackInterface;
        lifecycleOwner.r(new com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.p441xd549c502.e(this));
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: getFilePath */
    public java.lang.String mo32199x5000ed37(java.lang.String str) {
        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface nativeCallBackInterface = this.f129106a;
        java.lang.String mo32199x5000ed37 = nativeCallBackInterface != null ? nativeCallBackInterface.mo32199x5000ed37(str) : null;
        return mo32199x5000ed37 == null ? str == null ? "" : str : mo32199x5000ed37;
    }

    @Override // com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface
    /* renamed from: onCallBack */
    public void mo32200x9ac7b764(long j17, java.lang.String str) {
        com.p314xaae8f345.mm.p818xc991f70.C10824x1e0081cc.NativeCallBackInterface nativeCallBackInterface = this.f129106a;
        if (nativeCallBackInterface != null) {
            nativeCallBackInterface.mo32200x9ac7b764(j17, str);
        }
    }
}

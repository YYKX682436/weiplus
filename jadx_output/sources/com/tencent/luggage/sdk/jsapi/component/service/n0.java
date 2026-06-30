package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class n0 implements com.tencent.mm.wemedia.WeMediaCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a0 f47500a;

    public n0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var) {
        this.f47500a = a0Var;
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public java.lang.String getAbTest(java.lang.String str) {
        return j62.e.g().a(str, "", true, true);
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public java.lang.String getAbsolutePath(java.lang.String str) {
        java.lang.String o17;
        if (!str.startsWith("wxfile://")) {
            return str;
        }
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.f47500a;
        return (((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F()).getFileSystem() == null || ((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F()).getFileSystem().getAbsoluteFile(str) == null || (o17 = ((com.tencent.luggage.sdk.jsapi.component.service.y) a0Var.F()).getFileSystem().getAbsoluteFile(str).o()) == null) ? "" : o17;
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public boolean getExternalConfig(java.lang.String str, boolean z17) {
        return j62.e.g().l(str, z17, true, true);
    }

    @Override // com.tencent.mm.wemedia.WeMediaCallback
    public void reportEvent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
    }
}

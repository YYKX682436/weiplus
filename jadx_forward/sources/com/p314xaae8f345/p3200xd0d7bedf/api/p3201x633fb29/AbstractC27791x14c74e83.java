package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaMessage */
/* loaded from: classes9.dex */
public abstract class AbstractC27791x14c74e83 extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27783xd16884f6 {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f301698c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f301699d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f301700e;

    /* renamed from: com.tencent.wework.api.model.WWMediaMessage$WWMediaObject */
    /* loaded from: classes9.dex */
    public static abstract class WWMediaObject extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83 {
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        byte[] bArr = this.f301700e;
        if (bArr != null && bArr.length > 327680) {
            return false;
        }
        java.lang.String str = this.f301698c;
        if (str != null && str.length() > 512) {
            return false;
        }
        java.lang.String str2 = this.f301699d;
        return str2 == null || str2.length() <= 1024;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwapi_basereq_transaction", java.lang.String.valueOf(android.os.SystemClock.uptimeMillis()));
        bundle.putString("_wwapi_basereq_openid", null);
        bundle.putString("_wwapi_basereq_agentid", null);
        bundle.putString("_schema", null);
        try {
            bundle.putString("_wwapi_basereq_appbundle", this.f301678a.getPackageName());
            android.content.Context context = this.f301678a;
            bundle.putString("_wwapi_basereq_appname", context.getString(context.getApplicationInfo().labelRes));
        } catch (java.lang.Throwable unused) {
        }
        bundle.putInt("_wwobject_sdkVer", jx5.a.f383982a.intValue());
        bundle.putString("_wwobject_sdkVername", "3.0.1.2");
        bundle.putBoolean("needUpdateSession", false);
        bundle.putString("_wwobject_title", this.f301698c);
        bundle.putString("_wwobject_description", this.f301699d);
        bundle.putByteArray("_wwobject_thumbdata", this.f301700e);
    }
}

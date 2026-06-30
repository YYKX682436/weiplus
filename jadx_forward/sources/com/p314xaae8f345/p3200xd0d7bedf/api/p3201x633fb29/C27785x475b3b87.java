package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaConversation */
/* loaded from: classes9.dex */
public class C27785x475b3b87 extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301681f;

    /* renamed from: g, reason: collision with root package name */
    public long f301682g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f301683h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject f301684i;

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void a(android.content.Intent intent, java.lang.String str) {
        try {
            this.f301684i.a(intent, str);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject wWMediaObject;
        if (!super.b()) {
            return false;
        }
        byte[] bArr = this.f301683h;
        return (bArr == null || bArr.length <= 10485760) && (wWMediaObject = this.f301684i) != null && wWMediaObject.b();
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void d(android.content.Context context) {
        this.f301678a = context;
        try {
            this.f301684i.d(context);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void e(java.lang.String str) {
        this.f301679b = str;
        try {
            this.f301684i.e(str);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        super.f(bundle);
        bundle.putString("_wwconvobject_name", this.f301681f);
        bundle.putLong("_wwconvobject_date", this.f301682g);
        bundle.putByteArray("_wwconvobject_avatarData", this.f301683h);
        bundle.putString("_wwconvobject_avatarPath", null);
        bundle.putBundle("_wwconvobject_message", com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6.c(this.f301684i));
    }
}

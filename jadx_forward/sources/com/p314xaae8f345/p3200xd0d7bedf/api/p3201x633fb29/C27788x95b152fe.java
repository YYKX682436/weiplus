package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaLink */
/* loaded from: classes9.dex */
public class C27788x95b152fe extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301689f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301690g;

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        java.lang.String str;
        return super.b() && (str = this.f301689f) != null && str.length() != 0 && this.f301689f.length() <= 10240;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwwebpageobject_thumbUrl", this.f301690g);
        bundle.putString("_wwwebpageobject_webpageUrl", this.f301689f);
        bundle.putBoolean("_withshareticket", false);
        bundle.putString("_state", null);
        super.f(bundle);
    }
}

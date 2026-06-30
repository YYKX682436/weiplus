package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaText */
/* loaded from: classes9.dex */
public class C27793x95b4e831 extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301709f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f301710g;

    public C27793x95b4e831() {
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        java.lang.String str;
        return super.b() && (str = this.f301709f) != null && str.length() != 0 && this.f301709f.length() <= 10240;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwtextobject_text", this.f301709f);
        bundle.putString("_ww_msg_info_id", this.f301710g);
        super.f(bundle);
    }

    public C27793x95b4e831(java.lang.String str) {
        this.f301709f = str;
    }
}

package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaLocation */
/* loaded from: classes9.dex */
public class C27789x10fd20b9 extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83.WWMediaObject {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f301691f;

    /* renamed from: g, reason: collision with root package name */
    public double f301692g;

    /* renamed from: h, reason: collision with root package name */
    public double f301693h;

    /* renamed from: i, reason: collision with root package name */
    public double f301694i;

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        java.lang.String str;
        return super.b() && (str = this.f301691f) != null && str.length() != 0 && this.f301691f.length() <= 10240;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        bundle.putString("_wwlocobject_address", this.f301691f);
        bundle.putDouble("_wwlocobject_longitude", this.f301692g);
        bundle.putDouble("_wwlocobject_latitude", this.f301693h);
        bundle.putDouble("_wwlocobject_zoom", this.f301694i);
        super.f(bundle);
    }
}

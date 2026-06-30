package com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29;

/* renamed from: com.tencent.wework.api.model.WWMediaBufferMessage */
/* loaded from: classes9.dex */
public class C27784x24933d23 extends com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83 {

    /* renamed from: f, reason: collision with root package name */
    public byte[] f301680f = null;

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public boolean b() {
        byte[] bArr;
        return (!super.b() || (bArr = this.f301680f) == null || bArr.length == 0) ? false : true;
    }

    @Override // com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27791x14c74e83, com.p314xaae8f345.p3200xd0d7bedf.api.p3201x633fb29.AbstractC27782x25821bd6
    public void f(android.os.Bundle bundle) {
        bundle.putByteArray("_wwmergedconvobject_buffer", this.f301680f);
        super.f(bundle);
    }
}

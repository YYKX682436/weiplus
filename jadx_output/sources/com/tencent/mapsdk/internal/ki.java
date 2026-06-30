package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class ki extends com.tencent.mapsdk.internal.jz {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f50086a;

    public ki() {
    }

    @Override // com.tencent.mapsdk.internal.jz
    public final int a() {
        return b().length;
    }

    @Override // com.tencent.mapsdk.internal.jz
    public final byte[] b() {
        java.lang.String str = this.f50086a;
        return str != null ? str.getBytes() : new byte[0];
    }

    public final java.lang.String toString() {
        return "StringData{strData='" + this.f50086a + "'}";
    }

    private ki(java.lang.String str) {
        this.f50086a = str;
    }

    @Override // com.tencent.mapsdk.internal.jz
    public final void a(byte[] bArr) {
        this.f50086a = new java.lang.String(bArr);
    }
}

package com.tencent.mapsdk.core.components.protocol.jce.rtt;

/* loaded from: classes13.dex */
public final class RttResponse extends com.qq.taf.jce.MapJceStruct implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static byte[] f48694a = null;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f48695b = true;
    public byte[] result;

    static {
        f48694a = r0;
        byte[] bArr = {0};
    }

    public RttResponse() {
        this.result = null;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "navsns.RttResponse";
    }

    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f48695b) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(java.lang.StringBuilder sb6, int i17) {
        new com.tencent.mapsdk.internal.k(sb6, i17).a(this.result, "result");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(java.lang.StringBuilder sb6, int i17) {
        new com.tencent.mapsdk.internal.k(sb6, i17).a(this.result, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        return com.tencent.mapsdk.internal.q.a((java.lang.Object) this.result, (java.lang.Object) ((com.tencent.mapsdk.core.components.protocol.jce.rtt.RttResponse) obj).result);
    }

    public final byte[] getResult() {
        return this.result;
    }

    public final int hashCode() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void readFrom(com.tencent.mapsdk.internal.m mVar) {
        this.result = mVar.c(0, true);
    }

    public final void setResult(byte[] bArr) {
        this.result = bArr;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.result, 0);
    }

    public RttResponse(byte[] bArr) {
        this.result = bArr;
    }
}

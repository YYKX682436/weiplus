package com.tencent.mapsdk.core.components.protocol.jce.sso;

/* loaded from: classes13.dex */
public final class Tag extends com.qq.taf.jce.MapJceStruct implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    static byte[] f48704a = null;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ boolean f48705b = true;
    public java.lang.String strId;
    public byte[] value;

    public Tag() {
        this.strId = "";
        this.value = null;
    }

    @Override // com.tencent.mapsdk.internal.p
    public final java.lang.String className() {
        return "sosomap.Tag";
    }

    public final java.lang.Object clone() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            if (f48705b) {
                return null;
            }
            throw new java.lang.AssertionError();
        }
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void display(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.strId, "strId");
        kVar.a(this.value, "value");
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void displaySimple(java.lang.StringBuilder sb6, int i17) {
        com.tencent.mapsdk.internal.k kVar = new com.tencent.mapsdk.internal.k(sb6, i17);
        kVar.a(this.strId, true);
        kVar.a(this.value, false);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.tencent.mapsdk.core.components.protocol.jce.sso.Tag tag = (com.tencent.mapsdk.core.components.protocol.jce.sso.Tag) obj;
        return com.tencent.mapsdk.internal.q.a((java.lang.Object) this.strId, (java.lang.Object) tag.strId) && com.tencent.mapsdk.internal.q.a((java.lang.Object) this.value, (java.lang.Object) tag.value);
    }

    public final byte[] getValue() {
        return this.value;
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
        this.strId = mVar.b(0, true);
        if (f48704a == null) {
            f48704a = r2;
            byte[] bArr = {0};
        }
        this.value = mVar.c(1, true);
    }

    @Override // com.tencent.mapsdk.internal.p
    public final void writeTo(com.tencent.mapsdk.internal.n nVar) {
        nVar.a(this.strId, 0);
        nVar.a(this.value, 1);
    }

    public Tag(java.lang.String str, byte[] bArr) {
        this.strId = str;
        this.value = bArr;
    }
}

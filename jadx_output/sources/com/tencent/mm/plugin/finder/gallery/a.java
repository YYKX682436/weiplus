package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f111342a;

    /* renamed from: b, reason: collision with root package name */
    public final int f111343b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f111344c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f111345d;

    /* renamed from: e, reason: collision with root package name */
    public long f111346e;

    /* renamed from: f, reason: collision with root package name */
    public long f111347f;

    public a(java.util.ArrayList tabList, int i17, byte[] bArr, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(tabList, "tabList");
        this.f111342a = tabList;
        this.f111343b = i17;
        this.f111344c = bArr;
        this.f111345d = finderObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.gallery.a)) {
            return false;
        }
        com.tencent.mm.plugin.finder.gallery.a aVar = (com.tencent.mm.plugin.finder.gallery.a) obj;
        return kotlin.jvm.internal.o.b(this.f111342a, aVar.f111342a) && this.f111343b == aVar.f111343b && kotlin.jvm.internal.o.b(this.f111344c, aVar.f111344c) && kotlin.jvm.internal.o.b(this.f111345d, aVar.f111345d);
    }

    public int hashCode() {
        int hashCode = ((this.f111342a.hashCode() * 31) + java.lang.Integer.hashCode(this.f111343b)) * 31;
        byte[] bArr = this.f111344c;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f111345d;
        return hashCode2 + (finderObject != null ? finderObject.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ConfigData(tabList=" + this.f111342a + ", bizScene=" + this.f111343b + ", extBuff=" + java.util.Arrays.toString(this.f111344c) + ", lastSelectedObject=" + this.f111345d + ')';
    }
}

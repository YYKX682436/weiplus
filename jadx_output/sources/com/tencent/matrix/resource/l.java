package com.tencent.matrix.resource;

/* loaded from: classes11.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f52958a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52959b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f52960c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52961d;

    public l(java.lang.String objectName, int i17, java.lang.String referenceName, int i18) {
        kotlin.jvm.internal.o.g(objectName, "objectName");
        kotlin.jvm.internal.o.g(referenceName, "referenceName");
        this.f52958a = objectName;
        this.f52959b = i17;
        this.f52960c = referenceName;
        this.f52961d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.matrix.resource.l)) {
            return false;
        }
        com.tencent.matrix.resource.l lVar = (com.tencent.matrix.resource.l) obj;
        return kotlin.jvm.internal.o.b(this.f52958a, lVar.f52958a) && this.f52959b == lVar.f52959b && kotlin.jvm.internal.o.b(this.f52960c, lVar.f52960c) && this.f52961d == lVar.f52961d;
    }

    public int hashCode() {
        java.lang.String str = this.f52958a;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f52959b) * 31;
        java.lang.String str2 = this.f52960c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f52961d;
    }

    public java.lang.String toString() {
        return "Node(objectName=" + this.f52958a + ", objectType=" + this.f52959b + ", referenceName=" + this.f52960c + ", referenceType=" + this.f52961d + ")";
    }
}

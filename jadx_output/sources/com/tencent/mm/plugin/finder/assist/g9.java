package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f102205a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f102206b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f102207c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f102208d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f102209e;

    public g9(java.lang.String description, byte[] bArr, java.lang.String str, boolean z17, boolean z18, int i17, kotlin.jvm.internal.i iVar) {
        bArr = (i17 & 2) != 0 ? null : bArr;
        str = (i17 & 4) != 0 ? null : str;
        z17 = (i17 & 8) != 0 ? true : z17;
        z18 = (i17 & 16) != 0 ? false : z18;
        kotlin.jvm.internal.o.g(description, "description");
        this.f102205a = description;
        this.f102206b = bArr;
        this.f102207c = str;
        this.f102208d = z17;
        this.f102209e = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.g9)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.g9 g9Var = (com.tencent.mm.plugin.finder.assist.g9) obj;
        return kotlin.jvm.internal.o.b(this.f102205a, g9Var.f102205a) && kotlin.jvm.internal.o.b(this.f102206b, g9Var.f102206b) && kotlin.jvm.internal.o.b(this.f102207c, g9Var.f102207c) && this.f102208d == g9Var.f102208d && this.f102209e == g9Var.f102209e;
    }

    public int hashCode() {
        int hashCode = this.f102205a.hashCode() * 31;
        byte[] bArr = this.f102206b;
        int hashCode2 = (hashCode + (bArr == null ? 0 : java.util.Arrays.hashCode(bArr))) * 31;
        java.lang.String str = this.f102207c;
        return ((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f102208d)) * 31) + java.lang.Boolean.hashCode(this.f102209e);
    }

    public java.lang.String toString() {
        return "PreCheckInfo(description=" + this.f102205a + ", mediaSdkInfo=" + java.util.Arrays.toString(this.f102206b) + ", shortTitle=" + this.f102207c + ", handleErr=" + this.f102208d + ", ignoreErr=" + this.f102209e + ')';
    }
}

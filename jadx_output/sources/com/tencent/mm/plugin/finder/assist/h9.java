package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class h9 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f102233a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f102234b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f102235c;

    public h9(boolean z17, boolean z18, com.tencent.mm.protobuf.g gVar) {
        this.f102233a = z17;
        this.f102234b = z18;
        this.f102235c = gVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.h9)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.h9 h9Var = (com.tencent.mm.plugin.finder.assist.h9) obj;
        return this.f102233a == h9Var.f102233a && this.f102234b == h9Var.f102234b && kotlin.jvm.internal.o.b(this.f102235c, h9Var.f102235c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f102233a) * 31) + java.lang.Boolean.hashCode(this.f102234b)) * 31;
        com.tencent.mm.protobuf.g gVar = this.f102235c;
        return hashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    public java.lang.String toString() {
        return "PreCheckResult(confirm=" + this.f102233a + ", fromDialog=" + this.f102234b + ", finderSecretData=" + this.f102235c + ')';
    }

    public /* synthetic */ h9(boolean z17, boolean z18, com.tencent.mm.protobuf.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? false : z17, (i17 & 2) != 0 ? false : z18, (i17 & 4) != 0 ? null : gVar);
    }
}

package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public r45.nw6 f102171a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f102172b;

    public f8(r45.nw6 nw6Var, java.lang.Integer num) {
        this.f102171a = nw6Var;
        this.f102172b = num;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.f8)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.f8 f8Var = (com.tencent.mm.plugin.finder.assist.f8) obj;
        return kotlin.jvm.internal.o.b(this.f102171a, f8Var.f102171a) && kotlin.jvm.internal.o.b(this.f102172b, f8Var.f102172b);
    }

    public int hashCode() {
        r45.nw6 nw6Var = this.f102171a;
        int hashCode = (nw6Var == null ? 0 : nw6Var.hashCode()) * 31;
        java.lang.Integer num = this.f102172b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "UserPreviewInfoWrapper(userPreviewInfo=" + this.f102171a + ", requestTime=" + this.f102172b + ')';
    }
}

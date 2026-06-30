package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes8.dex */
public final class ax {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.bx f102907a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f102908b;

    /* renamed from: c, reason: collision with root package name */
    public final int f102909c;

    /* renamed from: d, reason: collision with root package name */
    public final int f102910d;

    /* renamed from: e, reason: collision with root package name */
    public final int f102911e;

    /* renamed from: f, reason: collision with root package name */
    public final so2.n6 f102912f;

    public ax(com.tencent.mm.plugin.finder.convert.bx type, java.lang.String content, int i17, int i18, int i19, so2.n6 n6Var) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(content, "content");
        this.f102907a = type;
        this.f102908b = content;
        this.f102909c = i17;
        this.f102910d = i18;
        this.f102911e = i19;
        this.f102912f = n6Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.convert.ax)) {
            return false;
        }
        com.tencent.mm.plugin.finder.convert.ax axVar = (com.tencent.mm.plugin.finder.convert.ax) obj;
        return this.f102907a == axVar.f102907a && kotlin.jvm.internal.o.b(this.f102908b, axVar.f102908b) && this.f102909c == axVar.f102909c && this.f102910d == axVar.f102910d && this.f102911e == axVar.f102911e && kotlin.jvm.internal.o.b(this.f102912f, axVar.f102912f);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f102907a.hashCode() * 31) + this.f102908b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f102909c)) * 31) + java.lang.Integer.hashCode(this.f102910d)) * 31) + java.lang.Integer.hashCode(this.f102911e)) * 31;
        so2.n6 n6Var = this.f102912f;
        return hashCode + (n6Var == null ? 0 : n6Var.hashCode());
    }

    public java.lang.String toString() {
        return "ElementData(type=" + this.f102907a + ", content=" + this.f102908b + ", color=" + this.f102909c + ", width=" + this.f102910d + ", availableWidth=" + this.f102911e + ", modModel=" + this.f102912f + ')';
    }
}

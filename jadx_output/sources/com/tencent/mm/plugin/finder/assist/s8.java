package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f102539a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f102540b;

    public s8(int i17, java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f102539a = i17;
        this.f102540b = name;
    }

    public final java.lang.String a() {
        return this.f102540b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.s8)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.s8 s8Var = (com.tencent.mm.plugin.finder.assist.s8) obj;
        return this.f102539a == s8Var.f102539a && kotlin.jvm.internal.o.b(this.f102540b, s8Var.f102540b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f102539a) * 31) + this.f102540b.hashCode();
    }

    public java.lang.String toString() {
        return "LiveStage(id=" + this.f102539a + ", name=" + this.f102540b + ')';
    }
}

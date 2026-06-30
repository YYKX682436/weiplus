package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes11.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.feature.chatrecordstts.c2 f65340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f65341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f65342c;

    public a2(com.tencent.mm.feature.chatrecordstts.c2 definition, int i17, int i18) {
        kotlin.jvm.internal.o.g(definition, "definition");
        this.f65340a = definition;
        this.f65341b = i17;
        this.f65342c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.chatrecordstts.a2)) {
            return false;
        }
        com.tencent.mm.feature.chatrecordstts.a2 a2Var = (com.tencent.mm.feature.chatrecordstts.a2) obj;
        return kotlin.jvm.internal.o.b(this.f65340a, a2Var.f65340a) && this.f65341b == a2Var.f65341b && this.f65342c == a2Var.f65342c;
    }

    public int hashCode() {
        return (((this.f65340a.hashCode() * 31) + java.lang.Integer.hashCode(this.f65341b)) * 31) + java.lang.Integer.hashCode(this.f65342c);
    }

    public java.lang.String toString() {
        return "InternalTask(definition=" + this.f65340a + ", progressStart=" + this.f65341b + ", progressEnd=" + this.f65342c + ')';
    }
}

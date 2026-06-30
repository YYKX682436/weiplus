package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f101891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f101892b;

    public i1(java.lang.String title, int i17) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f101891a = title;
        this.f101892b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.activity.uic.i1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.activity.uic.i1 i1Var = (com.tencent.mm.plugin.finder.activity.uic.i1) obj;
        return kotlin.jvm.internal.o.b(this.f101891a, i1Var.f101891a) && this.f101892b == i1Var.f101892b;
    }

    public int hashCode() {
        return (this.f101891a.hashCode() * 31) + java.lang.Integer.hashCode(this.f101892b);
    }

    public java.lang.String toString() {
        return "MediaTabInfo(title=" + this.f101891a + ", mediaType=" + this.f101892b + ')';
    }
}

package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f105602a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f105603b;

    public j1(int i17, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f105602a = i17;
        this.f105603b = msg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.j1)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.j1 j1Var = (com.tencent.mm.plugin.finder.extension.reddot.j1) obj;
        return this.f105602a == j1Var.f105602a && kotlin.jvm.internal.o.b(this.f105603b, j1Var.f105603b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f105602a) * 31) + this.f105603b.hashCode();
    }

    public java.lang.String toString() {
        return "{code=" + this.f105602a + " msg=" + this.f105603b + '}';
    }
}

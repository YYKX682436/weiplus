package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f105547a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.i2 f105548b;

    public h2(java.lang.String url, com.tencent.mm.plugin.finder.extension.reddot.i2 type) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(type, "type");
        this.f105547a = url;
        this.f105548b = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.extension.reddot.h2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.extension.reddot.h2 h2Var = (com.tencent.mm.plugin.finder.extension.reddot.h2) obj;
        return kotlin.jvm.internal.o.b(this.f105547a, h2Var.f105547a) && this.f105548b == h2Var.f105548b;
    }

    public int hashCode() {
        return (this.f105547a.hashCode() * 31) + this.f105548b.hashCode();
    }

    public java.lang.String toString() {
        return "Avatar(url=" + this.f105547a + ", type=" + this.f105548b + ')';
    }
}

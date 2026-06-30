package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class z extends com.tencent.mm.plugin.appbrand.jsapi.media.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f82160a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82161b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.util.List files, int i17) {
        super(null);
        kotlin.jvm.internal.o.g(files, "files");
        this.f82160a = files;
        this.f82161b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.media.z)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.z zVar = (com.tencent.mm.plugin.appbrand.jsapi.media.z) obj;
        return kotlin.jvm.internal.o.b(this.f82160a, zVar.f82160a) && this.f82161b == zVar.f82161b;
    }

    public int hashCode() {
        return (this.f82160a.hashCode() * 31) + java.lang.Integer.hashCode(this.f82161b);
    }

    public java.lang.String toString() {
        return "OK(files=" + this.f82160a + ", from=" + this.f82161b + ')';
    }
}

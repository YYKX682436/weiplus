package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.plugin.appbrand.jsapi.media.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f82145a;

    public y(java.lang.String str) {
        super(null);
        this.f82145a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.jsapi.media.y) && kotlin.jvm.internal.o.b(this.f82145a, ((com.tencent.mm.plugin.appbrand.jsapi.media.y) obj).f82145a);
    }

    public int hashCode() {
        java.lang.String str = this.f82145a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "FAILED(message=" + this.f82145a + ')';
    }
}

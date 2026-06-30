package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94329a;

    /* renamed from: b, reason: collision with root package name */
    public final int f94330b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f94331c;

    /* renamed from: d, reason: collision with root package name */
    public final nu4.a f94332d;

    public k(java.lang.String url, int i17, java.lang.String str, nu4.a manifest) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(manifest, "manifest");
        this.f94329a = url;
        this.f94330b = i17;
        this.f94331c = str;
        this.f94332d = manifest;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.k)) {
            return false;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.k kVar = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.k) obj;
        return kotlin.jvm.internal.o.b(this.f94329a, kVar.f94329a) && this.f94330b == kVar.f94330b && kotlin.jvm.internal.o.b(this.f94331c, kVar.f94331c) && kotlin.jvm.internal.o.b(this.f94332d, kVar.f94332d);
    }

    public int hashCode() {
        int hashCode = ((this.f94329a.hashCode() * 31) + java.lang.Integer.hashCode(this.f94330b)) * 31;
        java.lang.String str = this.f94331c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f94332d.hashCode();
    }

    public java.lang.String toString() {
        return "FetchData(url=" + this.f94329a + ", itemShowType=" + this.f94330b + ", extInfo=" + this.f94331c + ", manifest=" + this.f94332d + ')';
    }
}

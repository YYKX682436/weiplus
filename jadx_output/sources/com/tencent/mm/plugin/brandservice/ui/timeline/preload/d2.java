package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f94211a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f94212b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f94213c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f94214d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f94215e;

    /* renamed from: f, reason: collision with root package name */
    public final int f94216f;

    public d2(java.lang.String host, java.lang.String rawUrl, java.lang.String prefetchUrl, boolean z17, java.util.Map map, int i17, int i18, kotlin.jvm.internal.i iVar) {
        map = (i18 & 16) != 0 ? null : map;
        i17 = (i18 & 32) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(rawUrl, "rawUrl");
        kotlin.jvm.internal.o.g(prefetchUrl, "prefetchUrl");
        this.f94211a = host;
        this.f94212b = rawUrl;
        this.f94213c = prefetchUrl;
        this.f94214d = z17;
        this.f94215e = map;
        this.f94216f = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.brandservice.ui.timeline.preload.d2)) {
            return false;
        }
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d2 d2Var = (com.tencent.mm.plugin.brandservice.ui.timeline.preload.d2) obj;
        return kotlin.jvm.internal.o.b(this.f94211a, d2Var.f94211a) && kotlin.jvm.internal.o.b(this.f94212b, d2Var.f94212b) && kotlin.jvm.internal.o.b(this.f94213c, d2Var.f94213c) && this.f94214d == d2Var.f94214d && kotlin.jvm.internal.o.b(this.f94215e, d2Var.f94215e) && this.f94216f == d2Var.f94216f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f94211a.hashCode() * 31) + this.f94212b.hashCode()) * 31) + this.f94213c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f94214d)) * 31;
        java.util.Map map = this.f94215e;
        return ((hashCode + (map == null ? 0 : map.hashCode())) * 31) + java.lang.Integer.hashCode(this.f94216f);
    }

    public java.lang.String toString() {
        return "PrefetchAction(host=" + this.f94211a + ", rawUrl=" + this.f94212b + ", prefetchUrl=" + this.f94213c + ", checkCacheOnly=" + this.f94214d + ", prefetchHeader=" + this.f94215e + ", bizScene=" + this.f94216f + ')';
    }
}

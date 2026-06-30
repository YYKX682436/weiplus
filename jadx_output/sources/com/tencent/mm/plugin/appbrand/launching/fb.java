package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class fb {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.eb f84612b = new com.tencent.mm.plugin.appbrand.launching.eb(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f84613a;

    public fb(java.util.List authItemList) {
        kotlin.jvm.internal.o.g(authItemList, "authItemList");
        this.f84613a = authItemList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.launching.fb) && kotlin.jvm.internal.o.b(this.f84613a, ((com.tencent.mm.plugin.appbrand.launching.fb) obj).f84613a);
    }

    public int hashCode() {
        return this.f84613a.hashCode();
    }

    public java.lang.String toString() {
        return "PrefetchGetSettingAuthInfoResponse(authItemList=" + this.f84613a + ')';
    }
}

package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    public final ne1.j f85336a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f85337b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85338c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f85339d;

    public wa(ne1.j state, java.lang.String pluginAppId, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(pluginAppId, "pluginAppId");
        this.f85336a = state;
        this.f85337b = pluginAppId;
        this.f85338c = i17;
        this.f85339d = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.wa)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.wa waVar = (com.tencent.mm.plugin.appbrand.launching.wa) obj;
        return this.f85336a == waVar.f85336a && kotlin.jvm.internal.o.b(this.f85337b, waVar.f85337b) && this.f85338c == waVar.f85338c && kotlin.jvm.internal.o.b(this.f85339d, waVar.f85339d);
    }

    public int hashCode() {
        int hashCode = ((((this.f85336a.hashCode() * 31) + this.f85337b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f85338c)) * 31;
        java.lang.String str = this.f85339d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "PendingPluginUpdateStatusChangeEvent(state=" + this.f85336a + ", pluginAppId=" + this.f85337b + ", pluginIntVersion=" + this.f85338c + ", pluginStringVersion=" + this.f85339d + ')';
    }
}

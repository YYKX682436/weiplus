package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f85237a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f85238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85239c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85240d;

    /* renamed from: e, reason: collision with root package name */
    public final long f85241e;

    /* renamed from: f, reason: collision with root package name */
    public final wu5.c f85242f;

    public v(java.lang.String instanceId, java.lang.String userName, int i17, int i18, long j17, wu5.c futureResult) {
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(futureResult, "futureResult");
        this.f85237a = instanceId;
        this.f85238b = userName;
        this.f85239c = i17;
        this.f85240d = i18;
        this.f85241e = j17;
        this.f85242f = futureResult;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.v)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.v vVar = (com.tencent.mm.plugin.appbrand.launching.v) obj;
        return kotlin.jvm.internal.o.b(this.f85237a, vVar.f85237a) && kotlin.jvm.internal.o.b(this.f85238b, vVar.f85238b) && this.f85239c == vVar.f85239c && this.f85240d == vVar.f85240d && this.f85241e == vVar.f85241e && kotlin.jvm.internal.o.b(this.f85242f, vVar.f85242f);
    }

    public int hashCode() {
        return (((((((((this.f85237a.hashCode() * 31) + this.f85238b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f85239c)) * 31) + java.lang.Integer.hashCode(this.f85240d)) * 31) + java.lang.Long.hashCode(this.f85241e)) * 31) + this.f85242f.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandCgiPrefetchTask(instanceId=" + this.f85237a + ", userName=" + this.f85238b + ", versionType=" + this.f85239c + ", prefetchType=" + this.f85240d + ", ts=" + this.f85241e + ", futureResult=" + this.f85242f + ')';
    }
}

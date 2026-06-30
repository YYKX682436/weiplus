package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes5.dex */
public final class d8 implements com.tencent.mm.plugin.appbrand.jsapi.media.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f81774a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81775b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.media.r1 f81776c;

    public d8(long j17, boolean z17, com.tencent.mm.plugin.appbrand.jsapi.media.r1 r1Var) {
        this.f81774a = j17;
        this.f81775b = z17;
        this.f81776c = r1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.s1
    public boolean a() {
        return this.f81775b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.jsapi.media.d8)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.jsapi.media.d8 d8Var = (com.tencent.mm.plugin.appbrand.jsapi.media.d8) obj;
        return this.f81774a == d8Var.f81774a && this.f81775b == d8Var.f81775b && kotlin.jvm.internal.o.b(this.f81776c, d8Var.f81776c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Long.hashCode(this.f81774a) * 31) + java.lang.Boolean.hashCode(this.f81775b)) * 31;
        com.tencent.mm.plugin.appbrand.jsapi.media.r1 r1Var = this.f81776c;
        return hashCode + (r1Var == null ? 0 : r1Var.hashCode());
    }

    public java.lang.String toString() {
        return "Session(sessionId=" + this.f81774a + ", gainFocus=" + this.f81775b + ", onAudioFocusChange=" + this.f81776c + ')';
    }
}

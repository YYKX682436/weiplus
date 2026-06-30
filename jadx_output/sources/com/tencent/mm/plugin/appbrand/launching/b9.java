package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class b9 extends com.tencent.mm.plugin.appbrand.launching.c9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(java.lang.String value) {
        super(null);
        kotlin.jvm.internal.o.g(value, "value");
        this.f84527a = value;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.appbrand.launching.b9.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.launching.LaunchTimeoutFallbackBackupWxaAttrUtils.KEY.USERNAME");
        return kotlin.jvm.internal.o.b(this.f84527a, ((com.tencent.mm.plugin.appbrand.launching.b9) obj).f84527a);
    }

    public int hashCode() {
        return this.f84527a.hashCode();
    }

    public java.lang.String toString() {
        return "USERNAME(value=" + this.f84527a + ')';
    }
}

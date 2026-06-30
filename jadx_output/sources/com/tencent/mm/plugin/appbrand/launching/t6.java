package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class t6 extends com.tencent.mm.plugin.appbrand.launching.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f85159a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(java.lang.String desc) {
        super(null);
        kotlin.jvm.internal.o.g(desc, "desc");
        this.f85159a = desc;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.w6
    public int a() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.launching.t6) && kotlin.jvm.internal.o.b(this.f85159a, ((com.tencent.mm.plugin.appbrand.launching.t6) obj).f85159a);
    }

    public int hashCode() {
        return this.f85159a.hashCode();
    }

    public java.lang.String toString() {
        return "DESC(" + this.f85159a + ')';
    }
}

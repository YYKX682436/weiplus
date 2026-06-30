package com.tencent.mm.plugin.appbrand.luggage.export.functionalpage;

/* loaded from: classes7.dex */
public final class y extends com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f85671a;

    public y(java.lang.String str) {
        super(null);
        this.f85671a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y) && kotlin.jvm.internal.o.b(this.f85671a, ((com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.y) obj).f85671a);
    }

    public int hashCode() {
        java.lang.String str = this.f85671a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "InvokeCallbackContext(transitiveData=" + this.f85671a + ')';
    }
}

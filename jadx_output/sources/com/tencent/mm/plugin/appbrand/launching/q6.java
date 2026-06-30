package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class q6 extends com.tencent.mm.plugin.appbrand.launching.s6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f85078a;

    public q6(int i17) {
        super(null);
        this.f85078a = i17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CACHED(");
        int i17 = this.f85078a;
        sb6.append(i17 != 0 ? i17 != 1 ? i17 != 2 ? "" : "SHARED_TEMPLATE" : "SHARED_MODULE" : "SELF");
        sb6.append(')');
        return sb6.toString();
    }
}

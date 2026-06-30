package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class u9 implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85233a;

    public u9(java.lang.String str) {
        this.f85233a = str;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.plugin.appbrand.launching.ea(this.f85233a);
    }
}

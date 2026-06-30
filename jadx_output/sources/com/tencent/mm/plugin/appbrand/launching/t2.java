package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes5.dex */
public final class t2 implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f85155a;

    public t2(yz5.a aVar) {
        this.f85155a = aVar;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return (java.util.concurrent.Future) this.f85155a.invoke();
    }
}

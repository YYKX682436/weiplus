package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public final class xe implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f87260a;

    public xe(yz5.a aVar) {
        this.f87260a = aVar;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return (com.tencent.mm.appbrand.commonjni.buffer.BufferUtilsJNI.BufferHolderJNI) this.f87260a.invoke();
    }
}

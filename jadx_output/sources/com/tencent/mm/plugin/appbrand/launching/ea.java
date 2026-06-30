package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class ea {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f84597d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f84598a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f84599b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime f84600c;

    public ea(java.lang.String transactionKey) {
        kotlin.jvm.internal.o.g(transactionKey, "transactionKey");
        this.f84598a = transactionKey;
        this.f84599b = new java.util.concurrent.ConcurrentLinkedQueue();
    }
}

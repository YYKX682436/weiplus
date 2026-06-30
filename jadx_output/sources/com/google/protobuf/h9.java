package com.google.protobuf;

/* loaded from: classes16.dex */
public final class h9 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.protobuf.h9 f45166c = new com.google.protobuf.h9();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f45168b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.google.protobuf.r9 f45167a = new com.google.protobuf.o7();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.protobuf.y8] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.protobuf.y8] */
    public com.google.protobuf.q9 a(java.lang.Class cls) {
        com.google.protobuf.x8 x17;
        com.google.protobuf.x8 x8Var;
        java.lang.Class cls2;
        java.nio.charset.Charset charset = com.google.protobuf.w6.f45648a;
        if (cls == null) {
            throw new java.lang.NullPointerException("messageType");
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f45168b;
        com.google.protobuf.q9 q9Var = (com.google.protobuf.q9) concurrentHashMap.get(cls);
        if (q9Var != null) {
            return q9Var;
        }
        com.google.protobuf.o7 o7Var = (com.google.protobuf.o7) this.f45167a;
        o7Var.getClass();
        java.lang.Class cls3 = com.google.protobuf.s9.f45498a;
        if (!com.google.protobuf.n5.class.isAssignableFrom(cls) && (cls2 = com.google.protobuf.s9.f45498a) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        com.google.protobuf.l8 a17 = o7Var.f45367a.a(cls);
        if (a17.a()) {
            if (com.google.protobuf.n5.class.isAssignableFrom(cls)) {
                x8Var = new com.google.protobuf.y8(com.google.protobuf.s9.f45501d, com.google.protobuf.x4.f45677a, a17.b());
            } else {
                com.google.protobuf.qa qaVar = com.google.protobuf.s9.f45499b;
                com.google.protobuf.u4 u4Var = com.google.protobuf.x4.f45678b;
                if (u4Var == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x8Var = new com.google.protobuf.y8(qaVar, u4Var, a17.b());
            }
            x17 = x8Var;
        } else {
            boolean isAssignableFrom = com.google.protobuf.n5.class.isAssignableFrom(cls);
            com.google.protobuf.g9 g9Var = com.google.protobuf.g9.PROTO2;
            if (isAssignableFrom) {
                x17 = a17.c() == g9Var ? com.google.protobuf.x8.x(cls, a17, com.google.protobuf.d9.f45031b, com.google.protobuf.k7.f45267b, com.google.protobuf.s9.f45501d, com.google.protobuf.x4.f45677a, com.google.protobuf.i8.f45197b) : com.google.protobuf.x8.x(cls, a17, com.google.protobuf.d9.f45031b, com.google.protobuf.k7.f45267b, com.google.protobuf.s9.f45501d, null, com.google.protobuf.i8.f45197b);
            } else {
                if (a17.c() == g9Var) {
                    com.google.protobuf.a9 a9Var = com.google.protobuf.d9.f45030a;
                    com.google.protobuf.k7 k7Var = com.google.protobuf.k7.f45266a;
                    com.google.protobuf.qa qaVar2 = com.google.protobuf.s9.f45499b;
                    com.google.protobuf.u4 u4Var2 = com.google.protobuf.x4.f45678b;
                    if (u4Var2 == null) {
                        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    x17 = com.google.protobuf.x8.x(cls, a17, a9Var, k7Var, qaVar2, u4Var2, com.google.protobuf.i8.f45196a);
                } else {
                    x17 = com.google.protobuf.x8.x(cls, a17, com.google.protobuf.d9.f45030a, com.google.protobuf.k7.f45266a, com.google.protobuf.s9.f45500c, null, com.google.protobuf.i8.f45196a);
                }
            }
        }
        com.google.protobuf.q9 q9Var2 = (com.google.protobuf.q9) concurrentHashMap.putIfAbsent(cls, x17);
        return q9Var2 != null ? q9Var2 : x17;
    }
}

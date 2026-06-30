package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class h9 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.h9 f126699c = new com.p176xb6135e39.p283xc50a8b8b.h9();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentMap f126701b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r9 f126700a = new com.p176xb6135e39.p283xc50a8b8b.o7();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.protobuf.y8] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.protobuf.y8] */
    public com.p176xb6135e39.p283xc50a8b8b.q9 a(java.lang.Class cls) {
        com.p176xb6135e39.p283xc50a8b8b.x8 x17;
        com.p176xb6135e39.p283xc50a8b8b.x8 x8Var;
        java.lang.Class cls2;
        java.nio.charset.Charset charset = com.p176xb6135e39.p283xc50a8b8b.w6.f127181a;
        if (cls == null) {
            throw new java.lang.NullPointerException("messageType");
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f126701b;
        com.p176xb6135e39.p283xc50a8b8b.q9 q9Var = (com.p176xb6135e39.p283xc50a8b8b.q9) concurrentHashMap.get(cls);
        if (q9Var != null) {
            return q9Var;
        }
        com.p176xb6135e39.p283xc50a8b8b.o7 o7Var = (com.p176xb6135e39.p283xc50a8b8b.o7) this.f126700a;
        o7Var.getClass();
        java.lang.Class cls3 = com.p176xb6135e39.p283xc50a8b8b.s9.f127031a;
        if (!com.p176xb6135e39.p283xc50a8b8b.n5.class.isAssignableFrom(cls) && (cls2 = com.p176xb6135e39.p283xc50a8b8b.s9.f127031a) != null && !cls2.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        com.p176xb6135e39.p283xc50a8b8b.l8 a17 = o7Var.f126900a.a(cls);
        if (a17.a()) {
            if (com.p176xb6135e39.p283xc50a8b8b.n5.class.isAssignableFrom(cls)) {
                x8Var = new com.p176xb6135e39.p283xc50a8b8b.y8(com.p176xb6135e39.p283xc50a8b8b.s9.f127034d, com.p176xb6135e39.p283xc50a8b8b.x4.f127210a, a17.b());
            } else {
                com.p176xb6135e39.p283xc50a8b8b.qa qaVar = com.p176xb6135e39.p283xc50a8b8b.s9.f127032b;
                com.p176xb6135e39.p283xc50a8b8b.u4 u4Var = com.p176xb6135e39.p283xc50a8b8b.x4.f127211b;
                if (u4Var == null) {
                    throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                x8Var = new com.p176xb6135e39.p283xc50a8b8b.y8(qaVar, u4Var, a17.b());
            }
            x17 = x8Var;
        } else {
            boolean isAssignableFrom = com.p176xb6135e39.p283xc50a8b8b.n5.class.isAssignableFrom(cls);
            com.p176xb6135e39.p283xc50a8b8b.g9 g9Var = com.p176xb6135e39.p283xc50a8b8b.g9.PROTO2;
            if (isAssignableFrom) {
                x17 = a17.c() == g9Var ? com.p176xb6135e39.p283xc50a8b8b.x8.x(cls, a17, com.p176xb6135e39.p283xc50a8b8b.d9.f126564b, com.p176xb6135e39.p283xc50a8b8b.k7.f126800b, com.p176xb6135e39.p283xc50a8b8b.s9.f127034d, com.p176xb6135e39.p283xc50a8b8b.x4.f127210a, com.p176xb6135e39.p283xc50a8b8b.i8.f126730b) : com.p176xb6135e39.p283xc50a8b8b.x8.x(cls, a17, com.p176xb6135e39.p283xc50a8b8b.d9.f126564b, com.p176xb6135e39.p283xc50a8b8b.k7.f126800b, com.p176xb6135e39.p283xc50a8b8b.s9.f127034d, null, com.p176xb6135e39.p283xc50a8b8b.i8.f126730b);
            } else {
                if (a17.c() == g9Var) {
                    com.p176xb6135e39.p283xc50a8b8b.a9 a9Var = com.p176xb6135e39.p283xc50a8b8b.d9.f126563a;
                    com.p176xb6135e39.p283xc50a8b8b.k7 k7Var = com.p176xb6135e39.p283xc50a8b8b.k7.f126799a;
                    com.p176xb6135e39.p283xc50a8b8b.qa qaVar2 = com.p176xb6135e39.p283xc50a8b8b.s9.f127032b;
                    com.p176xb6135e39.p283xc50a8b8b.u4 u4Var2 = com.p176xb6135e39.p283xc50a8b8b.x4.f127211b;
                    if (u4Var2 == null) {
                        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    x17 = com.p176xb6135e39.p283xc50a8b8b.x8.x(cls, a17, a9Var, k7Var, qaVar2, u4Var2, com.p176xb6135e39.p283xc50a8b8b.i8.f126729a);
                } else {
                    x17 = com.p176xb6135e39.p283xc50a8b8b.x8.x(cls, a17, com.p176xb6135e39.p283xc50a8b8b.d9.f126563a, com.p176xb6135e39.p283xc50a8b8b.k7.f126799a, com.p176xb6135e39.p283xc50a8b8b.s9.f127033c, null, com.p176xb6135e39.p283xc50a8b8b.i8.f126729a);
                }
            }
        }
        com.p176xb6135e39.p283xc50a8b8b.q9 q9Var2 = (com.p176xb6135e39.p283xc50a8b8b.q9) concurrentHashMap.putIfAbsent(cls, x17);
        return q9Var2 != null ? q9Var2 : x17;
    }
}

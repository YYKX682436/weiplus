package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes13.dex */
public class g5 implements com.p176xb6135e39.p283xc50a8b8b.m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.g5 f126667a = new com.p176xb6135e39.p283xc50a8b8b.g5();

    @Override // com.p176xb6135e39.p283xc50a8b8b.m8
    public com.p176xb6135e39.p283xc50a8b8b.l8 a(java.lang.Class cls) {
        if (!com.p176xb6135e39.p283xc50a8b8b.n5.class.isAssignableFrom(cls)) {
            java.lang.String name = cls.getName();
            throw new java.lang.IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.p176xb6135e39.p283xc50a8b8b.l8) com.p176xb6135e39.p283xc50a8b8b.n5.m20802x7c90cfc0(cls.asSubclass(com.p176xb6135e39.p283xc50a8b8b.n5.class)).m20831xdf1bae07();
        } catch (java.lang.Exception e17) {
            java.lang.String name2 = cls.getName();
            throw new java.lang.RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new java.lang.String("Unable to get message info for "), e17);
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.m8
    public boolean b(java.lang.Class cls) {
        return com.p176xb6135e39.p283xc50a8b8b.n5.class.isAssignableFrom(cls);
    }
}

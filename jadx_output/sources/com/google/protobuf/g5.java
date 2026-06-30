package com.google.protobuf;

/* loaded from: classes13.dex */
public class g5 implements com.google.protobuf.m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.protobuf.g5 f45134a = new com.google.protobuf.g5();

    @Override // com.google.protobuf.m8
    public com.google.protobuf.l8 a(java.lang.Class cls) {
        if (!com.google.protobuf.n5.class.isAssignableFrom(cls)) {
            java.lang.String name = cls.getName();
            throw new java.lang.IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new java.lang.String("Unsupported message type: "));
        }
        try {
            return (com.google.protobuf.l8) com.google.protobuf.n5.getDefaultInstance(cls.asSubclass(com.google.protobuf.n5.class)).buildMessageInfo();
        } catch (java.lang.Exception e17) {
            java.lang.String name2 = cls.getName();
            throw new java.lang.RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new java.lang.String("Unable to get message info for "), e17);
        }
    }

    @Override // com.google.protobuf.m8
    public boolean b(java.lang.Class cls) {
        return com.google.protobuf.n5.class.isAssignableFrom(cls);
    }
}

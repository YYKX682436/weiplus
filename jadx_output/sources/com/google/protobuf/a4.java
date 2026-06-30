package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF3' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public final class a4 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.protobuf.a4 f44853e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.protobuf.a4 f44854f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.a4 f44855g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.a4 f44856h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.a4 f44857i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ com.google.protobuf.a4[] f44858m;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.z3 f44859d;

    /* JADX INFO: Fake field, exist only in values array */
    com.google.protobuf.a4 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    com.google.protobuf.a4 EF2;

    /* JADX INFO: Fake field, exist only in values array */
    com.google.protobuf.a4 EF3;

    static {
        com.google.protobuf.a4 a4Var = new com.google.protobuf.a4("DOUBLE", 0, com.google.protobuf.z3.DOUBLE);
        com.google.protobuf.a4 a4Var2 = new com.google.protobuf.a4("FLOAT", 1, com.google.protobuf.z3.FLOAT);
        com.google.protobuf.z3 z3Var = com.google.protobuf.z3.LONG;
        com.google.protobuf.a4 a4Var3 = new com.google.protobuf.a4("INT64", 2, z3Var);
        com.google.protobuf.a4 a4Var4 = new com.google.protobuf.a4("UINT64", 3, z3Var);
        com.google.protobuf.z3 z3Var2 = com.google.protobuf.z3.INT;
        com.google.protobuf.a4 a4Var5 = new com.google.protobuf.a4("INT32", 4, z3Var2);
        com.google.protobuf.a4 a4Var6 = new com.google.protobuf.a4("FIXED64", 5, z3Var);
        com.google.protobuf.a4 a4Var7 = new com.google.protobuf.a4("FIXED32", 6, z3Var2);
        com.google.protobuf.a4 a4Var8 = new com.google.protobuf.a4("BOOL", 7, com.google.protobuf.z3.BOOLEAN);
        com.google.protobuf.a4 a4Var9 = new com.google.protobuf.a4("STRING", 8, com.google.protobuf.z3.STRING);
        f44853e = a4Var9;
        com.google.protobuf.z3 z3Var3 = com.google.protobuf.z3.MESSAGE;
        com.google.protobuf.a4 a4Var10 = new com.google.protobuf.a4("GROUP", 9, z3Var3);
        f44854f = a4Var10;
        com.google.protobuf.a4 a4Var11 = new com.google.protobuf.a4("MESSAGE", 10, z3Var3);
        f44855g = a4Var11;
        com.google.protobuf.a4 a4Var12 = new com.google.protobuf.a4("BYTES", 11, com.google.protobuf.z3.BYTE_STRING);
        f44856h = a4Var12;
        com.google.protobuf.a4 a4Var13 = new com.google.protobuf.a4("UINT32", 12, z3Var2);
        com.google.protobuf.a4 a4Var14 = new com.google.protobuf.a4("ENUM", 13, com.google.protobuf.z3.ENUM);
        f44857i = a4Var14;
        f44858m = new com.google.protobuf.a4[]{a4Var, a4Var2, a4Var3, a4Var4, a4Var5, a4Var6, a4Var7, a4Var8, a4Var9, a4Var10, a4Var11, a4Var12, a4Var13, a4Var14, new com.google.protobuf.a4("SFIXED32", 14, z3Var2), new com.google.protobuf.a4("SFIXED64", 15, z3Var), new com.google.protobuf.a4("SINT32", 16, z3Var2), new com.google.protobuf.a4("SINT64", 17, z3Var)};
    }

    public a4(java.lang.String str, int i17, com.google.protobuf.z3 z3Var) {
        this.f44859d = z3Var;
    }

    public static com.google.protobuf.a4 valueOf(java.lang.String str) {
        return (com.google.protobuf.a4) java.lang.Enum.valueOf(com.google.protobuf.a4.class, str);
    }

    public static com.google.protobuf.a4[] values() {
        return (com.google.protobuf.a4[]) f44858m.clone();
    }
}

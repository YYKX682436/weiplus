package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public abstract class zb {

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.protobuf.zb f45809d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.protobuf.zb f45810e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.google.protobuf.zb[] f45811f;

    static {
        final java.lang.String str = "LOOSE";
        final int i17 = 0;
        com.google.protobuf.zb zbVar = new com.google.protobuf.zb(str, i17) { // from class: com.google.protobuf.wb
            @Override // com.google.protobuf.zb
            public java.lang.Object a(com.google.protobuf.d0 d0Var) {
                return d0Var.D();
            }
        };
        f45809d = zbVar;
        final java.lang.String str2 = "STRICT";
        final int i18 = 1;
        com.google.protobuf.zb zbVar2 = new com.google.protobuf.zb(str2, i18) { // from class: com.google.protobuf.xb
            @Override // com.google.protobuf.zb
            public java.lang.Object a(com.google.protobuf.d0 d0Var) {
                return d0Var.E();
            }
        };
        f45810e = zbVar2;
        final java.lang.String str3 = "LAZY";
        final int i19 = 2;
        f45811f = new com.google.protobuf.zb[]{zbVar, zbVar2, new com.google.protobuf.zb(str3, i19) { // from class: com.google.protobuf.yb
            @Override // com.google.protobuf.zb
            public java.lang.Object a(com.google.protobuf.d0 d0Var) {
                return d0Var.m();
            }
        }};
    }

    public zb(java.lang.String str, int i17, com.google.protobuf.pb pbVar) {
    }

    public static com.google.protobuf.zb valueOf(java.lang.String str) {
        return (com.google.protobuf.zb) java.lang.Enum.valueOf(com.google.protobuf.zb.class, str);
    }

    public static com.google.protobuf.zb[] values() {
        return (com.google.protobuf.zb[]) f45811f.clone();
    }

    public abstract java.lang.Object a(com.google.protobuf.d0 d0Var);
}

package com.p176xb6135e39.p283xc50a8b8b;

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
    public static final com.p176xb6135e39.p283xc50a8b8b.zb f127342d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.zb f127343e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ com.p176xb6135e39.p283xc50a8b8b.zb[] f127344f;

    static {
        final java.lang.String str = "LOOSE";
        final int i17 = 0;
        com.p176xb6135e39.p283xc50a8b8b.zb zbVar = new com.p176xb6135e39.p283xc50a8b8b.zb(str, i17) { // from class: com.google.protobuf.wb
            @Override // com.p176xb6135e39.p283xc50a8b8b.zb
            public java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
                return d0Var.D();
            }
        };
        f127342d = zbVar;
        final java.lang.String str2 = "STRICT";
        final int i18 = 1;
        com.p176xb6135e39.p283xc50a8b8b.zb zbVar2 = new com.p176xb6135e39.p283xc50a8b8b.zb(str2, i18) { // from class: com.google.protobuf.xb
            @Override // com.p176xb6135e39.p283xc50a8b8b.zb
            public java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
                return d0Var.E();
            }
        };
        f127343e = zbVar2;
        final java.lang.String str3 = "LAZY";
        final int i19 = 2;
        f127344f = new com.p176xb6135e39.p283xc50a8b8b.zb[]{zbVar, zbVar2, new com.p176xb6135e39.p283xc50a8b8b.zb(str3, i19) { // from class: com.google.protobuf.yb
            @Override // com.p176xb6135e39.p283xc50a8b8b.zb
            public java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
                return d0Var.m();
            }
        }};
    }

    public zb(java.lang.String str, int i17, com.p176xb6135e39.p283xc50a8b8b.pb pbVar) {
    }

    /* renamed from: valueOf */
    public static com.p176xb6135e39.p283xc50a8b8b.zb m20982xdce0328(java.lang.String str) {
        return (com.p176xb6135e39.p283xc50a8b8b.zb) java.lang.Enum.valueOf(com.p176xb6135e39.p283xc50a8b8b.zb.class, str);
    }

    /* renamed from: values */
    public static com.p176xb6135e39.p283xc50a8b8b.zb[] m20983xcee59d22() {
        return (com.p176xb6135e39.p283xc50a8b8b.zb[]) f127344f.clone();
    }

    public abstract java.lang.Object a(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var);
}

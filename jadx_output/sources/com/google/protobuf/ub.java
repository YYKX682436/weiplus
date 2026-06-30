package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes16.dex */
public class ub {

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.protobuf.ub f45591f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.protobuf.ub f45592g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.protobuf.ub f45593h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.protobuf.ub f45594i;

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.protobuf.ub f45595m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ com.google.protobuf.ub[] f45596n;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.protobuf.vb f45597d;

    /* renamed from: e, reason: collision with root package name */
    public final int f45598e;

    /* JADX INFO: Fake field, exist only in values array */
    com.google.protobuf.ub EF0;

    /* JADX INFO: Fake field, exist only in values array */
    com.google.protobuf.ub EF1;

    /* JADX INFO: Fake field, exist only in values array */
    com.google.protobuf.ub EF2;

    static {
        com.google.protobuf.ub ubVar = new com.google.protobuf.ub("DOUBLE", 0, com.google.protobuf.vb.DOUBLE, 1);
        com.google.protobuf.ub ubVar2 = new com.google.protobuf.ub("FLOAT", 1, com.google.protobuf.vb.FLOAT, 5);
        com.google.protobuf.vb vbVar = com.google.protobuf.vb.LONG;
        com.google.protobuf.ub ubVar3 = new com.google.protobuf.ub("INT64", 2, vbVar, 0);
        final int i17 = 3;
        com.google.protobuf.ub ubVar4 = new com.google.protobuf.ub("UINT64", 3, vbVar, 0);
        com.google.protobuf.vb vbVar2 = com.google.protobuf.vb.INT;
        com.google.protobuf.ub ubVar5 = new com.google.protobuf.ub("INT32", 4, vbVar2, 0);
        com.google.protobuf.ub ubVar6 = new com.google.protobuf.ub("FIXED64", 5, vbVar, 1);
        com.google.protobuf.ub ubVar7 = new com.google.protobuf.ub("FIXED32", 6, vbVar2, 5);
        com.google.protobuf.ub ubVar8 = new com.google.protobuf.ub("BOOL", 7, com.google.protobuf.vb.BOOLEAN, 0);
        com.google.protobuf.qb qbVar = new com.google.protobuf.qb("STRING", 8, com.google.protobuf.vb.STRING, 2);
        f45591f = qbVar;
        final com.google.protobuf.vb vbVar3 = com.google.protobuf.vb.MESSAGE;
        final java.lang.String str = "GROUP";
        final int i18 = 9;
        com.google.protobuf.ub ubVar9 = new com.google.protobuf.ub(str, i18, vbVar3, i17) { // from class: com.google.protobuf.rb
            @Override // com.google.protobuf.ub
            public boolean h() {
                return false;
            }
        };
        f45592g = ubVar9;
        final java.lang.String str2 = "MESSAGE";
        final int i19 = 10;
        final int i27 = 2;
        com.google.protobuf.ub ubVar10 = new com.google.protobuf.ub(str2, i19, vbVar3, i27) { // from class: com.google.protobuf.sb
            @Override // com.google.protobuf.ub
            public boolean h() {
                return false;
            }
        };
        f45593h = ubVar10;
        final com.google.protobuf.vb vbVar4 = com.google.protobuf.vb.BYTE_STRING;
        final java.lang.String str3 = "BYTES";
        final int i28 = 11;
        com.google.protobuf.ub ubVar11 = new com.google.protobuf.ub(str3, i28, vbVar4, i27) { // from class: com.google.protobuf.tb
            @Override // com.google.protobuf.ub
            public boolean h() {
                return false;
            }
        };
        f45594i = ubVar11;
        com.google.protobuf.ub ubVar12 = new com.google.protobuf.ub("UINT32", 12, vbVar2, 0);
        com.google.protobuf.ub ubVar13 = new com.google.protobuf.ub("ENUM", 13, com.google.protobuf.vb.ENUM, 0);
        f45595m = ubVar13;
        f45596n = new com.google.protobuf.ub[]{ubVar, ubVar2, ubVar3, ubVar4, ubVar5, ubVar6, ubVar7, ubVar8, qbVar, ubVar9, ubVar10, ubVar11, ubVar12, ubVar13, new com.google.protobuf.ub("SFIXED32", 14, vbVar2, 5), new com.google.protobuf.ub("SFIXED64", 15, vbVar, 1), new com.google.protobuf.ub("SINT32", 16, vbVar2, 0), new com.google.protobuf.ub("SINT64", 17, vbVar, 0)};
    }

    public ub(java.lang.String str, int i17, com.google.protobuf.vb vbVar, int i18) {
        this.f45597d = vbVar;
        this.f45598e = i18;
    }

    public static com.google.protobuf.ub valueOf(java.lang.String str) {
        return (com.google.protobuf.ub) java.lang.Enum.valueOf(com.google.protobuf.ub.class, str);
    }

    public static com.google.protobuf.ub[] values() {
        return (com.google.protobuf.ub[]) f45596n.clone();
    }

    public boolean h() {
        return !(this instanceof com.google.protobuf.qb);
    }
}

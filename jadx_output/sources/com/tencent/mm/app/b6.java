package com.tencent.mm.app;

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
/* loaded from: classes12.dex */
public abstract class b6 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.app.b6 f53340d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.app.b6 f53341e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.app.b6 f53342f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.app.b6 f53343g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.app.b6[] f53344h;

    static {
        final java.lang.String str = "EXACT";
        final int i17 = 0;
        com.tencent.mm.app.b6 b6Var = new com.tencent.mm.app.b6(str, i17) { // from class: com.tencent.mm.app.x5
            @Override // com.tencent.mm.app.b6
            public boolean a(com.tencent.mm.app.v5 v5Var, java.lang.Object obj) {
                return v5Var == obj;
            }
        };
        f53340d = b6Var;
        final java.lang.String str2 = "PREFIX_STARTS_WITH";
        final int i18 = 1;
        com.tencent.mm.app.b6 b6Var2 = new com.tencent.mm.app.b6(str2, i18) { // from class: com.tencent.mm.app.y5
            @Override // com.tencent.mm.app.b6
            public boolean a(com.tencent.mm.app.v5 v5Var, java.lang.Object obj) {
                return v5Var.f53867d.startsWith((java.lang.String) obj);
            }
        };
        f53341e = b6Var2;
        final java.lang.String str3 = "NOT_PLAIN";
        final int i19 = 2;
        com.tencent.mm.app.b6 b6Var3 = new com.tencent.mm.app.b6(str3, i19) { // from class: com.tencent.mm.app.z5
            @Override // com.tencent.mm.app.b6
            public boolean a(com.tencent.mm.app.v5 v5Var, java.lang.Object obj) {
                return v5Var.f53870g == com.tencent.mm.app.u5.DEFAULT;
            }
        };
        f53342f = b6Var3;
        final java.lang.String str4 = "NOT_PLAIN_NOT_ISOLATED";
        final int i27 = 3;
        com.tencent.mm.app.b6 b6Var4 = new com.tencent.mm.app.b6(str4, i27) { // from class: com.tencent.mm.app.a6
            @Override // com.tencent.mm.app.b6
            public boolean a(com.tencent.mm.app.v5 v5Var, java.lang.Object obj) {
                com.tencent.mm.app.u5 u5Var = v5Var.f53870g;
                return (u5Var == com.tencent.mm.app.u5.DEFAULT) && u5Var != com.tencent.mm.app.u5.ISOLATED;
            }
        };
        f53343g = b6Var4;
        f53344h = new com.tencent.mm.app.b6[]{b6Var, b6Var2, b6Var3, b6Var4};
    }

    public b6(java.lang.String str, int i17, com.tencent.mm.app.w5 w5Var) {
    }

    public static com.tencent.mm.app.b6 valueOf(java.lang.String str) {
        return (com.tencent.mm.app.b6) java.lang.Enum.valueOf(com.tencent.mm.app.b6.class, str);
    }

    public static com.tencent.mm.app.b6[] values() {
        return (com.tencent.mm.app.b6[]) f53344h.clone();
    }

    public abstract boolean a(com.tencent.mm.app.v5 v5Var, java.lang.Object obj);
}

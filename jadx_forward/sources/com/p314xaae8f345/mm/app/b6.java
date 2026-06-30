package com.p314xaae8f345.mm.app;

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
    public static final com.p314xaae8f345.mm.app.b6 f134873d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.b6 f134874e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.b6 f134875f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.app.b6 f134876g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.app.b6[] f134877h;

    static {
        final java.lang.String str = "EXACT";
        final int i17 = 0;
        com.p314xaae8f345.mm.app.b6 b6Var = new com.p314xaae8f345.mm.app.b6(str, i17) { // from class: com.tencent.mm.app.x5
            @Override // com.p314xaae8f345.mm.app.b6
            public boolean a(com.p314xaae8f345.mm.app.v5 v5Var, java.lang.Object obj) {
                return v5Var == obj;
            }
        };
        f134873d = b6Var;
        final java.lang.String str2 = "PREFIX_STARTS_WITH";
        final int i18 = 1;
        com.p314xaae8f345.mm.app.b6 b6Var2 = new com.p314xaae8f345.mm.app.b6(str2, i18) { // from class: com.tencent.mm.app.y5
            @Override // com.p314xaae8f345.mm.app.b6
            public boolean a(com.p314xaae8f345.mm.app.v5 v5Var, java.lang.Object obj) {
                return v5Var.f135400d.startsWith((java.lang.String) obj);
            }
        };
        f134874e = b6Var2;
        final java.lang.String str3 = "NOT_PLAIN";
        final int i19 = 2;
        com.p314xaae8f345.mm.app.b6 b6Var3 = new com.p314xaae8f345.mm.app.b6(str3, i19) { // from class: com.tencent.mm.app.z5
            @Override // com.p314xaae8f345.mm.app.b6
            public boolean a(com.p314xaae8f345.mm.app.v5 v5Var, java.lang.Object obj) {
                return v5Var.f135403g == com.p314xaae8f345.mm.app.u5.DEFAULT;
            }
        };
        f134875f = b6Var3;
        final java.lang.String str4 = "NOT_PLAIN_NOT_ISOLATED";
        final int i27 = 3;
        com.p314xaae8f345.mm.app.b6 b6Var4 = new com.p314xaae8f345.mm.app.b6(str4, i27) { // from class: com.tencent.mm.app.a6
            @Override // com.p314xaae8f345.mm.app.b6
            public boolean a(com.p314xaae8f345.mm.app.v5 v5Var, java.lang.Object obj) {
                com.p314xaae8f345.mm.app.u5 u5Var = v5Var.f135403g;
                return (u5Var == com.p314xaae8f345.mm.app.u5.DEFAULT) && u5Var != com.p314xaae8f345.mm.app.u5.ISOLATED;
            }
        };
        f134876g = b6Var4;
        f134877h = new com.p314xaae8f345.mm.app.b6[]{b6Var, b6Var2, b6Var3, b6Var4};
    }

    public b6(java.lang.String str, int i17, com.p314xaae8f345.mm.app.w5 w5Var) {
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.mm.app.b6 m42994xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.mm.app.b6) java.lang.Enum.valueOf(com.p314xaae8f345.mm.app.b6.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.mm.app.b6[] m42995xcee59d22() {
        return (com.p314xaae8f345.mm.app.b6[]) f134877h.clone();
    }

    public abstract boolean a(com.p314xaae8f345.mm.app.v5 v5Var, java.lang.Object obj);
}

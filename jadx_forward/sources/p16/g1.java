package p16;

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
public class g1 {

    /* renamed from: f, reason: collision with root package name */
    public static final p16.g1 f432817f;

    /* renamed from: g, reason: collision with root package name */
    public static final p16.g1 f432818g;

    /* renamed from: h, reason: collision with root package name */
    public static final p16.g1 f432819h;

    /* renamed from: i, reason: collision with root package name */
    public static final p16.g1 f432820i;

    /* renamed from: m, reason: collision with root package name */
    public static final p16.g1 f432821m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p16.g1[] f432822n;

    /* renamed from: d, reason: collision with root package name */
    public final p16.h1 f432823d;

    /* renamed from: e, reason: collision with root package name */
    public final int f432824e;

    /* JADX INFO: Fake field, exist only in values array */
    p16.g1 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    p16.g1 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    p16.g1 EF2;

    static {
        p16.g1 g1Var = new p16.g1("DOUBLE", 0, p16.h1.DOUBLE, 1);
        p16.g1 g1Var2 = new p16.g1("FLOAT", 1, p16.h1.FLOAT, 5);
        p16.h1 h1Var = p16.h1.LONG;
        p16.g1 g1Var3 = new p16.g1("INT64", 2, h1Var, 0);
        final int i17 = 3;
        p16.g1 g1Var4 = new p16.g1("UINT64", 3, h1Var, 0);
        p16.h1 h1Var2 = p16.h1.INT;
        p16.g1 g1Var5 = new p16.g1("INT32", 4, h1Var2, 0);
        f432817f = g1Var5;
        p16.g1 g1Var6 = new p16.g1("FIXED64", 5, h1Var, 1);
        p16.g1 g1Var7 = new p16.g1("FIXED32", 6, h1Var2, 5);
        p16.g1 g1Var8 = new p16.g1("BOOL", 7, p16.h1.BOOLEAN, 0);
        f432818g = g1Var8;
        p16.c1 c1Var = new p16.c1("STRING", 8, p16.h1.STRING, 2);
        final p16.h1 h1Var3 = p16.h1.MESSAGE;
        final java.lang.String str = "GROUP";
        final int i18 = 9;
        p16.g1 g1Var9 = new p16.g1(str, i18, h1Var3, i17) { // from class: p16.d1
            @Override // p16.g1
            public boolean h() {
                return false;
            }
        };
        f432819h = g1Var9;
        final java.lang.String str2 = "MESSAGE";
        final int i19 = 10;
        final int i27 = 2;
        p16.g1 g1Var10 = new p16.g1(str2, i19, h1Var3, i27) { // from class: p16.e1
            @Override // p16.g1
            public boolean h() {
                return false;
            }
        };
        f432820i = g1Var10;
        final p16.h1 h1Var4 = p16.h1.BYTE_STRING;
        final java.lang.String str3 = "BYTES";
        final int i28 = 11;
        p16.g1 g1Var11 = new p16.g1(str3, i28, h1Var4, i27) { // from class: p16.f1
            @Override // p16.g1
            public boolean h() {
                return false;
            }
        };
        p16.g1 g1Var12 = new p16.g1("UINT32", 12, h1Var2, 0);
        p16.g1 g1Var13 = new p16.g1("ENUM", 13, p16.h1.ENUM, 0);
        f432821m = g1Var13;
        f432822n = new p16.g1[]{g1Var, g1Var2, g1Var3, g1Var4, g1Var5, g1Var6, g1Var7, g1Var8, c1Var, g1Var9, g1Var10, g1Var11, g1Var12, g1Var13, new p16.g1("SFIXED32", 14, h1Var2, 5), new p16.g1("SFIXED64", 15, h1Var, 1), new p16.g1("SINT32", 16, h1Var2, 0), new p16.g1("SINT64", 17, h1Var, 0)};
    }

    public g1(java.lang.String str, int i17, p16.h1 h1Var, int i18) {
        this.f432823d = h1Var;
        this.f432824e = i18;
    }

    /* renamed from: valueOf */
    public static p16.g1 m157711xdce0328(java.lang.String str) {
        return (p16.g1) java.lang.Enum.valueOf(p16.g1.class, str);
    }

    /* renamed from: values */
    public static p16.g1[] m157712xcee59d22() {
        return (p16.g1[]) f432822n.clone();
    }

    public boolean h() {
        return !(this instanceof p16.c1);
    }
}

package n05;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF11' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes9.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final n05.d f415462d;

    /* renamed from: e, reason: collision with root package name */
    public static final n05.d f415463e;

    /* renamed from: f, reason: collision with root package name */
    public static final n05.d f415464f;

    /* renamed from: g, reason: collision with root package name */
    public static final n05.d f415465g;

    /* renamed from: h, reason: collision with root package name */
    public static final n05.d f415466h;

    /* renamed from: i, reason: collision with root package name */
    public static final n05.d f415467i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ n05.d[] f415468m;

    /* JADX INFO: Fake field, exist only in values array */
    n05.d EF3;

    /* JADX INFO: Fake field, exist only in values array */
    n05.d EF5;

    /* JADX INFO: Fake field, exist only in values array */
    n05.d EF7;

    /* JADX INFO: Fake field, exist only in values array */
    n05.d EF9;

    /* JADX INFO: Fake field, exist only in values array */
    n05.d EF11;

    static {
        n05.d dVar = new n05.d("ViewId_WcPayKeyboard_Action_Btn", 0);
        f415462d = dVar;
        n05.d dVar2 = new n05.d("ViewId_WcPayKeyboard_Anim_Action_Btn", 1);
        f415463e = dVar2;
        n05.d dVar3 = new n05.d("ViewId_Do_Luckymoney_Btn", 2);
        n05.d dVar4 = new n05.d("ViewId_Luckymoney_Envelope_View", 3);
        n05.d dVar5 = new n05.d("ViewId_Remittance_Attach_View", 4);
        n05.d dVar6 = new n05.d("ViewId_Luckymoney_Attach_View", 5);
        final java.lang.String str = "ViewId_Wechat_Pay_View";
        final int i17 = 6;
        n05.d dVar7 = new n05.d(str, i17) { // from class: n05.c
            @Override // java.lang.Enum
            public java.lang.String toString() {
                return "settings_mm_wallet";
            }
        };
        n05.d dVar8 = new n05.d("ViewId_Balance_Save_Btn", 7);
        f415464f = dVar8;
        n05.d dVar9 = new n05.d("ViewId_Balance_Fetch_Btn", 8);
        f415465g = dVar9;
        n05.d dVar10 = new n05.d("ViewId_Lqt_Save_Btn", 9);
        f415466h = dVar10;
        n05.d dVar11 = new n05.d("ViewId_Lqt_Fetch_Btn", 10);
        f415467i = dVar11;
        f415468m = new n05.d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, new n05.d("ViewId_Bankcard_Option_Menu_View", 11), new n05.d("ViewId_OfflinePay_Plus_Item_view", 12)};
    }

    public d(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static n05.d m148816xdce0328(java.lang.String str) {
        return (n05.d) java.lang.Enum.valueOf(n05.d.class, str);
    }

    /* renamed from: values */
    public static n05.d[] m148817xcee59d22() {
        return (n05.d[]) f415468m.clone();
    }

    public d(java.lang.String str, int i17, n05.b bVar) {
    }
}

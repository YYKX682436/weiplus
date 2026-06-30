package p06;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes16.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final p06.e f432281e;

    /* renamed from: f, reason: collision with root package name */
    public static final p06.e f432282f;

    /* renamed from: g, reason: collision with root package name */
    public static final p06.e f432283g;

    /* renamed from: h, reason: collision with root package name */
    public static final p06.e f432284h;

    /* renamed from: i, reason: collision with root package name */
    public static final p06.e f432285i;

    /* renamed from: m, reason: collision with root package name */
    public static final p06.e f432286m;

    /* renamed from: n, reason: collision with root package name */
    public static final p06.e f432287n;

    /* renamed from: o, reason: collision with root package name */
    public static final p06.e f432288o;

    /* renamed from: p, reason: collision with root package name */
    public static final p06.e f432289p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ p06.e[] f432290q;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f432291d;

    static {
        p06.e eVar = new p06.e("FIELD", 0, null, 1, null);
        f432281e = eVar;
        p06.e eVar2 = new p06.e("FILE", 1, null, 1, null);
        f432282f = eVar2;
        p06.e eVar3 = new p06.e("PROPERTY", 2, null, 1, null);
        f432283g = eVar3;
        p06.e eVar4 = new p06.e("PROPERTY_GETTER", 3, "get");
        f432284h = eVar4;
        p06.e eVar5 = new p06.e("PROPERTY_SETTER", 4, "set");
        f432285i = eVar5;
        p06.e eVar6 = new p06.e("RECEIVER", 5, null, 1, null);
        f432286m = eVar6;
        p06.e eVar7 = new p06.e("CONSTRUCTOR_PARAMETER", 6, "param");
        f432287n = eVar7;
        p06.e eVar8 = new p06.e("SETTER_PARAMETER", 7, "setparam");
        f432288o = eVar8;
        p06.e eVar9 = new p06.e("PROPERTY_DELEGATE_FIELD", 8, "delegate");
        f432289p = eVar9;
        p06.e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9};
        f432290q = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, java.lang.String str2) {
        this.f432291d = str2 == null ? m26.a.c(name()) : str2;
    }

    /* renamed from: valueOf */
    public static p06.e m157634xdce0328(java.lang.String str) {
        return (p06.e) java.lang.Enum.valueOf(p06.e.class, str);
    }

    /* renamed from: values */
    public static p06.e[] m157635xcee59d22() {
        return (p06.e[]) f432290q.clone();
    }

    public /* synthetic */ e(java.lang.String str, int i17, java.lang.String str2, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i18 & 1) != 0 ? null : str2);
    }
}

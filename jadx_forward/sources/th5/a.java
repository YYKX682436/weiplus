package th5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final th5.a f500866e;

    /* renamed from: f, reason: collision with root package name */
    public static final th5.a f500867f;

    /* renamed from: g, reason: collision with root package name */
    public static final th5.a f500868g;

    /* renamed from: h, reason: collision with root package name */
    public static final th5.a f500869h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ th5.a[] f500870i;

    /* renamed from: d, reason: collision with root package name */
    public final int f500871d;

    static {
        th5.a aVar = new th5.a("Origin", 0, 1);
        f500866e = aVar;
        th5.a aVar2 = new th5.a("Live", 1, 2);
        f500867f = aVar2;
        th5.a aVar3 = new th5.a("Send", 2, 3);
        f500868g = aVar3;
        th5.a aVar4 = new th5.a("Save", 3, 4);
        f500869h = aVar4;
        th5.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        f500870i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f500871d = i18;
    }

    /* renamed from: valueOf */
    public static th5.a m166590xdce0328(java.lang.String str) {
        return (th5.a) java.lang.Enum.valueOf(th5.a.class, str);
    }

    /* renamed from: values */
    public static th5.a[] m166591xcee59d22() {
        return (th5.a[]) f500870i.clone();
    }
}

package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.b f303035e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.b f303036f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.b f303037g;

    /* renamed from: h, reason: collision with root package name */
    public static final cq5.b f303038h;

    /* renamed from: i, reason: collision with root package name */
    public static final cq5.b f303039i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ cq5.b[] f303040m;

    /* renamed from: d, reason: collision with root package name */
    public final int f303041d;

    static {
        cq5.b bVar = new cq5.b("SUCCESS", 0, 0);
        f303035e = bVar;
        cq5.b bVar2 = new cq5.b("NO_PERMISSION", 1, 1);
        f303036f = bVar2;
        cq5.b bVar3 = new cq5.b("NO_WIFI_SWITCH", 2, 2);
        f303037g = bVar3;
        cq5.b bVar4 = new cq5.b("USER_END", 3, 3);
        f303038h = bVar4;
        cq5.b bVar5 = new cq5.b("OTHER", 4, 4);
        f303039i = bVar5;
        cq5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f303040m = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f303041d = i18;
    }

    /* renamed from: valueOf */
    public static cq5.b m122467xdce0328(java.lang.String str) {
        return (cq5.b) java.lang.Enum.valueOf(cq5.b.class, str);
    }

    /* renamed from: values */
    public static cq5.b[] m122468xcee59d22() {
        return (cq5.b[]) f303040m.clone();
    }
}

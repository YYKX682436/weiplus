package l13;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final l13.b f396519d;

    /* renamed from: e, reason: collision with root package name */
    public static final l13.b f396520e;

    /* renamed from: f, reason: collision with root package name */
    public static final l13.b f396521f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l13.b[] f396522g;

    static {
        l13.b bVar = new l13.b("UP", 0);
        f396519d = bVar;
        l13.b bVar2 = new l13.b("DOWN", 1);
        f396520e = bVar2;
        l13.b bVar3 = new l13.b("NONE", 2);
        f396521f = bVar3;
        l13.b[] bVarArr = {bVar, bVar2, bVar3};
        f396522g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static l13.b m144861xdce0328(java.lang.String str) {
        return (l13.b) java.lang.Enum.valueOf(l13.b.class, str);
    }

    /* renamed from: values */
    public static l13.b[] m144862xcee59d22() {
        return (l13.b[]) f396522g.clone();
    }
}

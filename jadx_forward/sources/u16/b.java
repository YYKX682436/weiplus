package u16;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final u16.b f505337d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ u16.b[] f505338e;

    static {
        u16.b bVar = new u16.b("WARNING", 0);
        u16.b bVar2 = new u16.b("ERROR", 1);
        f505337d = bVar2;
        u16.b[] bVarArr = {bVar, bVar2, new u16.b("HIDDEN", 2)};
        f505338e = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static u16.b m167419xdce0328(java.lang.String str) {
        return (u16.b) java.lang.Enum.valueOf(u16.b.class, str);
    }

    /* renamed from: values */
    public static u16.b[] m167420xcee59d22() {
        return (u16.b[]) f505338e.clone();
    }
}

package xs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final xs5.b f537944d;

    /* renamed from: e, reason: collision with root package name */
    public static final xs5.b f537945e;

    /* renamed from: f, reason: collision with root package name */
    public static final xs5.b f537946f;

    /* renamed from: g, reason: collision with root package name */
    public static final xs5.b f537947g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xs5.b[] f537948h;

    static {
        xs5.b bVar = new xs5.b("FIND_NEARBY_INDEPENDENT_LIVE_ROOM", 0);
        f537944d = bVar;
        xs5.b bVar2 = new xs5.b("FIND_NEARBY_INDEPENDENT_LIVE_SQUARE", 1);
        f537945e = bVar2;
        xs5.b bVar3 = new xs5.b("FIND_NEARBY_LIVE_ROOM", 2);
        f537946f = bVar3;
        xs5.b bVar4 = new xs5.b("FIND_NEARBY_LIVE_SQUARE", 3);
        f537947g = bVar4;
        xs5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f537948h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static xs5.b m175892xdce0328(java.lang.String str) {
        return (xs5.b) java.lang.Enum.valueOf(xs5.b.class, str);
    }

    /* renamed from: values */
    public static xs5.b[] m175893xcee59d22() {
        return (xs5.b[]) f537948h.clone();
    }
}

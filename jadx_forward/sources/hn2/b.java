package hn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final hn2.b f364032d;

    /* renamed from: e, reason: collision with root package name */
    public static final hn2.b f364033e;

    /* renamed from: f, reason: collision with root package name */
    public static final hn2.b f364034f;

    /* renamed from: g, reason: collision with root package name */
    public static final hn2.b f364035g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ hn2.b[] f364036h;

    static {
        hn2.b bVar = new hn2.b("DISABLED", 0);
        f364032d = bVar;
        hn2.b bVar2 = new hn2.b("IDLE", 1);
        f364033e = bVar2;
        hn2.b bVar3 = new hn2.b("LOADING", 2);
        f364034f = bVar3;
        hn2.b bVar4 = new hn2.b("LISTENING", 3);
        f364035g = bVar4;
        hn2.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f364036h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static hn2.b m133812xdce0328(java.lang.String str) {
        return (hn2.b) java.lang.Enum.valueOf(hn2.b.class, str);
    }

    /* renamed from: values */
    public static hn2.b[] m133813xcee59d22() {
        return (hn2.b[]) f364036h.clone();
    }
}

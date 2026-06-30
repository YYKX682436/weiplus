package zq3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final zq3.b f556567d;

    /* renamed from: e, reason: collision with root package name */
    public static final zq3.b f556568e;

    /* renamed from: f, reason: collision with root package name */
    public static final zq3.b f556569f;

    /* renamed from: g, reason: collision with root package name */
    public static final zq3.b f556570g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zq3.b[] f556571h;

    static {
        zq3.b bVar = new zq3.b("ContactFirst", 0);
        f556567d = bVar;
        zq3.b bVar2 = new zq3.b("StrangerFirst", 1);
        f556568e = bVar2;
        zq3.b bVar3 = new zq3.b("ContactOnly", 2);
        f556569f = bVar3;
        zq3.b bVar4 = new zq3.b("StrangerOnly", 3);
        f556570g = bVar4;
        zq3.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f556571h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static zq3.b m179302xdce0328(java.lang.String str) {
        return (zq3.b) java.lang.Enum.valueOf(zq3.b.class, str);
    }

    /* renamed from: values */
    public static zq3.b[] m179303xcee59d22() {
        return (zq3.b[]) f556571h.clone();
    }
}

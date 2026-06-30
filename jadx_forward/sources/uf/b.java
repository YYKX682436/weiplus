package uf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final uf.b f508504d;

    /* renamed from: e, reason: collision with root package name */
    public static final uf.b f508505e;

    /* renamed from: f, reason: collision with root package name */
    public static final uf.b f508506f;

    /* renamed from: g, reason: collision with root package name */
    public static final uf.b f508507g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ uf.b[] f508508h;

    static {
        uf.b bVar = new uf.b("Idle", 0);
        f508504d = bVar;
        uf.b bVar2 = new uf.b("CastEnabled", 1);
        f508505e = bVar2;
        uf.b bVar3 = new uf.b("CastDeviceSelected", 2);
        f508506f = bVar3;
        uf.b bVar4 = new uf.b("CastStarted", 3);
        f508507g = bVar4;
        uf.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f508508h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static uf.b m167935xdce0328(java.lang.String str) {
        return (uf.b) java.lang.Enum.valueOf(uf.b.class, str);
    }

    /* renamed from: values */
    public static uf.b[] m167936xcee59d22() {
        return (uf.b[]) f508508h.clone();
    }
}

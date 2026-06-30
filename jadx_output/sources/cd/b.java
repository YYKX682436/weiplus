package cd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final cd.b f40495d;

    /* renamed from: e, reason: collision with root package name */
    public static final cd.b f40496e;

    /* renamed from: f, reason: collision with root package name */
    public static final cd.b f40497f;

    /* renamed from: g, reason: collision with root package name */
    public static final cd.b f40498g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cd.b[] f40499h;

    static {
        cd.b bVar = new cd.b("SUCCESS", 0);
        f40495d = bVar;
        cd.b bVar2 = new cd.b("FAILURE", 1);
        f40496e = bVar2;
        cd.b bVar3 = new cd.b("RETRY", 2);
        f40497f = bVar3;
        cd.b bVar4 = new cd.b("CANCELED", 3);
        f40498g = bVar4;
        cd.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f40499h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static cd.b valueOf(java.lang.String str) {
        return (cd.b) java.lang.Enum.valueOf(cd.b.class, str);
    }

    public static cd.b[] values() {
        return (cd.b[]) f40499h.clone();
    }
}

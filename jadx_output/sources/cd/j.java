package cd;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final cd.i f40513e;

    /* renamed from: f, reason: collision with root package name */
    public static final cd.j f40514f;

    /* renamed from: g, reason: collision with root package name */
    public static final cd.j f40515g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cd.j[] f40516h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f40517i;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f40518d;

    static {
        cd.j jVar = new cd.j("CN", 0, "cn");
        f40514f = jVar;
        cd.j jVar2 = new cd.j("HK", 1, "hk");
        f40515g = jVar2;
        cd.j[] jVarArr = {jVar, jVar2};
        f40516h = jVarArr;
        f40517i = rz5.b.a(jVarArr);
        f40513e = new cd.i(null);
    }

    public j(java.lang.String str, int i17, java.lang.String str2) {
        this.f40518d = str2;
    }

    public static cd.j valueOf(java.lang.String str) {
        return (cd.j) java.lang.Enum.valueOf(cd.j.class, str);
    }

    public static cd.j[] values() {
        return (cd.j[]) f40516h.clone();
    }
}

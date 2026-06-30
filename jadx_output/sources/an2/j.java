package an2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final an2.j f8861d;

    /* renamed from: e, reason: collision with root package name */
    public static final an2.j f8862e;

    /* renamed from: f, reason: collision with root package name */
    public static final an2.j f8863f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ an2.j[] f8864g;

    static {
        an2.j jVar = new an2.j("Beauty", 0);
        f8861d = jVar;
        an2.j jVar2 = new an2.j("Makeup", 1);
        f8862e = jVar2;
        an2.j jVar3 = new an2.j("Filter", 2);
        f8863f = jVar3;
        an2.j[] jVarArr = {jVar, jVar2, jVar3};
        f8864g = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static an2.j valueOf(java.lang.String str) {
        return (an2.j) java.lang.Enum.valueOf(an2.j.class, str);
    }

    public static an2.j[] values() {
        return (an2.j[]) f8864g.clone();
    }
}

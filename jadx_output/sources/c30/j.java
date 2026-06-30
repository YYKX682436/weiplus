package c30;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final c30.j f38134d;

    /* renamed from: e, reason: collision with root package name */
    public static final c30.j f38135e;

    /* renamed from: f, reason: collision with root package name */
    public static final c30.j f38136f;

    /* renamed from: g, reason: collision with root package name */
    public static final c30.j f38137g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ c30.j[] f38138h;

    static {
        c30.j jVar = new c30.j("Unknown", 0);
        f38134d = jVar;
        c30.j jVar2 = new c30.j("Running", 1);
        f38135e = jVar2;
        c30.j jVar3 = new c30.j("Failed", 2);
        f38136f = jVar3;
        c30.j jVar4 = new c30.j("Success", 3);
        f38137g = jVar4;
        c30.j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f38138h = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static c30.j valueOf(java.lang.String str) {
        return (c30.j) java.lang.Enum.valueOf(c30.j.class, str);
    }

    public static c30.j[] values() {
        return (c30.j[]) f38138h.clone();
    }
}

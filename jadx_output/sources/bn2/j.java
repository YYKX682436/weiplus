package bn2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final bn2.j f22868e;

    /* renamed from: f, reason: collision with root package name */
    public static final bn2.j f22869f;

    /* renamed from: g, reason: collision with root package name */
    public static final bn2.j f22870g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ bn2.j[] f22871h;

    /* renamed from: d, reason: collision with root package name */
    public final int f22872d;

    static {
        bn2.j jVar = new bn2.j("Open", 0, 1);
        f22868e = jVar;
        bn2.j jVar2 = new bn2.j("FineTuning", 1, 2);
        f22869f = jVar2;
        bn2.j jVar3 = new bn2.j("FineTuningChange", 2, 3);
        f22870g = jVar3;
        bn2.j[] jVarArr = {jVar, jVar2, jVar3};
        f22871h = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f22872d = i18;
    }

    public static bn2.j valueOf(java.lang.String str) {
        return (bn2.j) java.lang.Enum.valueOf(bn2.j.class, str);
    }

    public static bn2.j[] values() {
        return (bn2.j[]) f22871h.clone();
    }
}

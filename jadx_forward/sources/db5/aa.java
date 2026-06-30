package db5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class aa {

    /* renamed from: d, reason: collision with root package name */
    public static final db5.aa f309816d;

    /* renamed from: e, reason: collision with root package name */
    public static final db5.aa f309817e;

    /* renamed from: f, reason: collision with root package name */
    public static final db5.aa f309818f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ db5.aa[] f309819g;

    static {
        db5.aa aaVar = new db5.aa("MEDIUM", 0);
        f309816d = aaVar;
        db5.aa aaVar2 = new db5.aa("SMALL", 1);
        f309817e = aaVar2;
        db5.aa aaVar3 = new db5.aa("MINI", 2);
        f309818f = aaVar3;
        db5.aa[] aaVarArr = {aaVar, aaVar2, aaVar3};
        f309819g = aaVarArr;
        rz5.b.a(aaVarArr);
    }

    public aa(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static db5.aa m123860xdce0328(java.lang.String str) {
        return (db5.aa) java.lang.Enum.valueOf(db5.aa.class, str);
    }

    /* renamed from: values */
    public static db5.aa[] m123861xcee59d22() {
        return (db5.aa[]) f309819g.clone();
    }
}

package cs2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final cs2.o f303616d;

    /* renamed from: e, reason: collision with root package name */
    public static final cs2.o f303617e;

    /* renamed from: f, reason: collision with root package name */
    public static final cs2.o f303618f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cs2.o[] f303619g;

    static {
        cs2.o oVar = new cs2.o("LOADING", 0);
        f303616d = oVar;
        cs2.o oVar2 = new cs2.o("PENDING", 1);
        f303617e = oVar2;
        cs2.o oVar3 = new cs2.o("WAITING", 2);
        f303618f = oVar3;
        cs2.o[] oVarArr = {oVar, oVar2, oVar3};
        f303619g = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cs2.o m122613xdce0328(java.lang.String str) {
        return (cs2.o) java.lang.Enum.valueOf(cs2.o.class, str);
    }

    /* renamed from: values */
    public static cs2.o[] m122614xcee59d22() {
        return (cs2.o[]) f303619g.clone();
    }
}

package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.l f491992d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.l f491993e;

    /* renamed from: f, reason: collision with root package name */
    public static final so2.l f491994f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ so2.l[] f491995g;

    static {
        so2.l lVar = new so2.l("OK", 0);
        f491992d = lVar;
        so2.l lVar2 = new so2.l("EXCEED_LIMIT", 1);
        f491993e = lVar2;
        so2.l lVar3 = new so2.l("RANGE_OVERLAP", 2);
        f491994f = lVar3;
        so2.l[] lVarArr = {lVar, lVar2, lVar3};
        f491995g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static so2.l m164909xdce0328(java.lang.String str) {
        return (so2.l) java.lang.Enum.valueOf(so2.l.class, str);
    }

    /* renamed from: values */
    public static so2.l[] m164910xcee59d22() {
        return (so2.l[]) f491995g.clone();
    }
}

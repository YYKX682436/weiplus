package ug2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final ug2.d f509052d;

    /* renamed from: e, reason: collision with root package name */
    public static final ug2.d f509053e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ ug2.d[] f509054f;

    static {
        ug2.d dVar = new ug2.d("MORE_THAN_GIFT", 0);
        f509052d = dVar;
        ug2.d dVar2 = new ug2.d("LESS_THAN_GIFT", 1);
        ug2.d dVar3 = new ug2.d("EQUAL_GIFT", 2);
        f509053e = dVar3;
        ug2.d[] dVarArr = {dVar, dVar2, dVar3};
        f509054f = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static ug2.d m167988xdce0328(java.lang.String str) {
        return (ug2.d) java.lang.Enum.valueOf(ug2.d.class, str);
    }

    /* renamed from: values */
    public static ug2.d[] m167989xcee59d22() {
        return (ug2.d[]) f509054f.clone();
    }
}

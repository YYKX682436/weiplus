package bv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final bv0.d f106219d;

    /* renamed from: e, reason: collision with root package name */
    public static final bv0.d f106220e;

    /* renamed from: f, reason: collision with root package name */
    public static final bv0.d f106221f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bv0.d[] f106222g;

    static {
        bv0.d dVar = new bv0.d("BEGIN", 0);
        f106219d = dVar;
        bv0.d dVar2 = new bv0.d("IN_PROGRESS", 1);
        f106220e = dVar2;
        bv0.d dVar3 = new bv0.d("END", 2);
        f106221f = dVar3;
        bv0.d[] dVarArr = {dVar, dVar2, dVar3};
        f106222g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static bv0.d m11377xdce0328(java.lang.String str) {
        return (bv0.d) java.lang.Enum.valueOf(bv0.d.class, str);
    }

    /* renamed from: values */
    public static bv0.d[] m11378xcee59d22() {
        return (bv0.d[]) f106222g.clone();
    }
}

package bw3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final bw3.d f106440d;

    /* renamed from: e, reason: collision with root package name */
    public static final bw3.d f106441e;

    /* renamed from: f, reason: collision with root package name */
    public static final bw3.d f106442f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bw3.d[] f106443g;

    static {
        bw3.d dVar = new bw3.d("NONE", 0);
        f106440d = dVar;
        bw3.d dVar2 = new bw3.d("DRAG", 1);
        f106441e = dVar2;
        bw3.d dVar3 = new bw3.d("SCALE", 2);
        f106442f = dVar3;
        bw3.d[] dVarArr = {dVar, dVar2, dVar3};
        f106443g = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static bw3.d m11464xdce0328(java.lang.String str) {
        return (bw3.d) java.lang.Enum.valueOf(bw3.d.class, str);
    }

    /* renamed from: values */
    public static bw3.d[] m11465xcee59d22() {
        return (bw3.d[]) f106443g.clone();
    }
}

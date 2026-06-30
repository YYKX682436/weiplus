package ay2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final ay2.r f15266e;

    /* renamed from: f, reason: collision with root package name */
    public static final ay2.r f15267f;

    /* renamed from: g, reason: collision with root package name */
    public static final ay2.r f15268g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ ay2.r[] f15269h;

    /* renamed from: d, reason: collision with root package name */
    public final int f15270d;

    static {
        ay2.r rVar = new ay2.r("Cancel", 0, 0);
        f15266e = rVar;
        ay2.r rVar2 = new ay2.r("Confirm", 1, 1);
        f15267f = rVar2;
        ay2.r rVar3 = new ay2.r("Close", 2, 2);
        f15268g = rVar3;
        ay2.r[] rVarArr = {rVar, rVar2, rVar3};
        f15269h = rVarArr;
        rz5.b.a(rVarArr);
    }

    public r(java.lang.String str, int i17, int i18) {
        this.f15270d = i18;
    }

    public static ay2.r valueOf(java.lang.String str) {
        return (ay2.r) java.lang.Enum.valueOf(ay2.r.class, str);
    }

    public static ay2.r[] values() {
        return (ay2.r[]) f15269h.clone();
    }
}

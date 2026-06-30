package s26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final s26.d f483903e;

    /* renamed from: f, reason: collision with root package name */
    public static final s26.d f483904f;

    /* renamed from: g, reason: collision with root package name */
    public static final s26.d f483905g;

    /* renamed from: h, reason: collision with root package name */
    public static final s26.d f483906h;

    /* renamed from: i, reason: collision with root package name */
    public static final s26.d f483907i;

    /* renamed from: m, reason: collision with root package name */
    public static final s26.d f483908m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s26.d[] f483909n;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.TimeUnit f483910d;

    static {
        s26.d dVar = new s26.d("NANOSECONDS", 0, java.util.concurrent.TimeUnit.NANOSECONDS);
        f483903e = dVar;
        s26.d dVar2 = new s26.d("MICROSECONDS", 1, java.util.concurrent.TimeUnit.MICROSECONDS);
        s26.d dVar3 = new s26.d("MILLISECONDS", 2, java.util.concurrent.TimeUnit.MILLISECONDS);
        f483904f = dVar3;
        s26.d dVar4 = new s26.d("SECONDS", 3, java.util.concurrent.TimeUnit.SECONDS);
        f483905g = dVar4;
        s26.d dVar5 = new s26.d("MINUTES", 4, java.util.concurrent.TimeUnit.MINUTES);
        f483906h = dVar5;
        s26.d dVar6 = new s26.d("HOURS", 5, java.util.concurrent.TimeUnit.HOURS);
        f483907i = dVar6;
        s26.d dVar7 = new s26.d("DAYS", 6, java.util.concurrent.TimeUnit.DAYS);
        f483908m = dVar7;
        s26.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7};
        f483909n = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, java.util.concurrent.TimeUnit timeUnit) {
        this.f483910d = timeUnit;
    }

    /* renamed from: valueOf */
    public static s26.d m163692xdce0328(java.lang.String str) {
        return (s26.d) java.lang.Enum.valueOf(s26.d.class, str);
    }

    /* renamed from: values */
    public static s26.d[] m163693xcee59d22() {
        return (s26.d[]) f483909n.clone();
    }
}

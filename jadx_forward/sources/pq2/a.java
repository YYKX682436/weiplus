package pq2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final pq2.a f439103d;

    /* renamed from: e, reason: collision with root package name */
    public static final pq2.a f439104e;

    /* renamed from: f, reason: collision with root package name */
    public static final pq2.a f439105f;

    /* renamed from: g, reason: collision with root package name */
    public static final pq2.a f439106g;

    /* renamed from: h, reason: collision with root package name */
    public static final pq2.a f439107h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pq2.a[] f439108i;

    static {
        pq2.a aVar = new pq2.a("IDLE", 0);
        f439103d = aVar;
        pq2.a aVar2 = new pq2.a("LOADING", 1);
        f439104e = aVar2;
        pq2.a aVar3 = new pq2.a("DISABLE", 2);
        pq2.a aVar4 = new pq2.a("EXPIRED", 3);
        f439105f = aVar4;
        pq2.a aVar5 = new pq2.a("FAILED", 4);
        f439106g = aVar5;
        pq2.a aVar6 = new pq2.a("OK", 5);
        f439107h = aVar6;
        pq2.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
        f439108i = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static pq2.a m158858xdce0328(java.lang.String str) {
        return (pq2.a) java.lang.Enum.valueOf(pq2.a.class, str);
    }

    /* renamed from: values */
    public static pq2.a[] m158859xcee59d22() {
        return (pq2.a[]) f439108i.clone();
    }
}

package rq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final rq0.a f480248e;

    /* renamed from: f, reason: collision with root package name */
    public static final rq0.a f480249f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rq0.a[] f480250g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f480251h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f480252d;

    static {
        rq0.a aVar = new rq0.a("OneWeek", 0, "");
        f480248e = aVar;
        rq0.a aVar2 = new rq0.a("OneMonth", 1, "-OneMonth");
        f480249f = aVar2;
        rq0.a[] aVarArr = {aVar, aVar2};
        f480250g = aVarArr;
        f480251h = rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f480252d = str2;
    }

    /* renamed from: valueOf */
    public static rq0.a m162865xdce0328(java.lang.String str) {
        return (rq0.a) java.lang.Enum.valueOf(rq0.a.class, str);
    }

    /* renamed from: values */
    public static rq0.a[] m162866xcee59d22() {
        return (rq0.a[]) f480250g.clone();
    }
}

package f65;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: e, reason: collision with root package name */
    public static final f65.y f341547e;

    /* renamed from: f, reason: collision with root package name */
    public static final f65.y f341548f;

    /* renamed from: g, reason: collision with root package name */
    public static final f65.y f341549g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f65.y[] f341550h;

    /* renamed from: d, reason: collision with root package name */
    public final long f341551d;

    static {
        f65.y yVar = new f65.y("CDN", 0, 1L);
        f341547e = yVar;
        f65.y yVar2 = new f65.y("CGI_PARALLEL", 1, 2L);
        f341548f = yVar2;
        f65.y yVar3 = new f65.y("CGI_Serial", 2, 3L);
        f341549g = yVar3;
        f65.y[] yVarArr = {yVar, yVar2, yVar3};
        f341550h = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17, long j17) {
        this.f341551d = j17;
    }

    /* renamed from: valueOf */
    public static f65.y m129148xdce0328(java.lang.String str) {
        return (f65.y) java.lang.Enum.valueOf(f65.y.class, str);
    }

    /* renamed from: values */
    public static f65.y[] m129149xcee59d22() {
        return (f65.y[]) f341550h.clone();
    }
}

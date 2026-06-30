package xg3;

/* loaded from: classes9.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f535943a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f535944b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f535945c;

    /* renamed from: d, reason: collision with root package name */
    public int f535946d;

    /* renamed from: e, reason: collision with root package name */
    public int f535947e;

    /* renamed from: f, reason: collision with root package name */
    public final int f535948f;

    /* renamed from: g, reason: collision with root package name */
    public long f535949g;

    /* renamed from: h, reason: collision with root package name */
    public long f535950h;

    public l0(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f535945c = arrayList;
        this.f535947e = 0;
        this.f535948f = 0;
        this.f535949g = 0L;
        this.f535950h = -1L;
        this.f535943a = str;
        this.f535944b = str2;
        this.f535946d = i17;
        this.f535950h = f9Var != null ? f9Var.t0() : -1L;
        if (f9Var != null) {
            arrayList.add(f9Var);
        }
    }

    public l0(java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, int i18) {
        this(str, str2, f9Var, i17);
        this.f535948f = i18;
    }
}

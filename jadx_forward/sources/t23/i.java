package t23;

/* loaded from: classes10.dex */
public class i extends t23.g {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f496706d;

    /* renamed from: e, reason: collision with root package name */
    public final int f496707e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f496708f;

    /* renamed from: g, reason: collision with root package name */
    public final long f496709g;

    /* renamed from: h, reason: collision with root package name */
    public final t23.j2 f496710h;

    /* renamed from: i, reason: collision with root package name */
    public final int f496711i;

    /* renamed from: m, reason: collision with root package name */
    public final long f496712m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f496713n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f496714o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Bitmap f496715p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ t23.j f496716q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(t23.j jVar, java.lang.String str, int i17, java.lang.String str2, long j17, t23.j2 j2Var, int i18, long j18) {
        super(jVar);
        this.f496716q = jVar;
        this.f496706d = str;
        this.f496707e = i17;
        this.f496708f = str2;
        this.f496709g = j17;
        this.f496710h = j2Var;
        this.f496711i = i18;
        this.f496712m = j18;
        this.f496713n = j33.d0.d(str, j2Var, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b2  */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a() {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.i.a():boolean");
    }

    /* renamed from: equals */
    public boolean m165748xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t23.i)) {
            return false;
        }
        t23.i iVar = (t23.i) obj;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f496706d;
        if (str == null) {
            str = "";
        }
        return str.equals(iVar.f496706d);
    }

    /* renamed from: hashCode */
    public int m165749x8cdac1b() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f496706d;
        if (str == null) {
            str = "";
        }
        return str.hashCode();
    }
}

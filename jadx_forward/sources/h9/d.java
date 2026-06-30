package h9;

/* loaded from: classes15.dex */
public final class d extends h9.e {

    /* renamed from: c, reason: collision with root package name */
    public final int f361139c;

    /* renamed from: d, reason: collision with root package name */
    public final long f361140d;

    /* renamed from: e, reason: collision with root package name */
    public final long f361141e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f361142f;

    /* renamed from: g, reason: collision with root package name */
    public final int f361143g;

    /* renamed from: h, reason: collision with root package name */
    public final int f361144h;

    /* renamed from: i, reason: collision with root package name */
    public final int f361145i;

    /* renamed from: j, reason: collision with root package name */
    public final long f361146j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f361147k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f361148l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f361149m;

    /* renamed from: n, reason: collision with root package name */
    public final h9.c f361150n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f361151o;

    /* renamed from: p, reason: collision with root package name */
    public final long f361152p;

    public d(int i17, java.lang.String str, java.util.List list, long j17, long j18, boolean z17, int i18, int i19, int i27, long j19, boolean z18, boolean z19, boolean z27, h9.c cVar, java.util.List list2) {
        super(str, list);
        this.f361139c = i17;
        this.f361141e = j18;
        this.f361142f = z17;
        this.f361143g = i18;
        this.f361144h = i19;
        this.f361145i = i27;
        this.f361146j = j19;
        this.f361147k = z18;
        this.f361148l = z19;
        this.f361149m = z27;
        this.f361150n = cVar;
        this.f361151o = java.util.Collections.unmodifiableList(list2);
        if (list2.isEmpty()) {
            this.f361152p = 0L;
        } else {
            h9.c cVar2 = (h9.c) list2.get(list2.size() - 1);
            this.f361152p = cVar2.f361133g + cVar2.f361131e;
        }
        this.f361140d = j17 == -9223372036854775807L ? -9223372036854775807L : j17 >= 0 ? j17 : this.f361152p + j17;
    }
}

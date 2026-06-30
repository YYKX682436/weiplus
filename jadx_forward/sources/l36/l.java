package l36;

/* loaded from: classes16.dex */
public final class l {

    /* renamed from: n, reason: collision with root package name */
    public static final l36.l f397072n;

    /* renamed from: o, reason: collision with root package name */
    public static final l36.l f397073o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f397074a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f397075b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397076c;

    /* renamed from: d, reason: collision with root package name */
    public final int f397077d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f397078e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f397079f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f397080g;

    /* renamed from: h, reason: collision with root package name */
    public final int f397081h;

    /* renamed from: i, reason: collision with root package name */
    public final int f397082i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f397083j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f397084k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f397085l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f397086m;

    static {
        l36.k kVar = new l36.k();
        kVar.f397059a = true;
        f397072n = new l36.l(kVar);
        l36.k kVar2 = new l36.k();
        kVar2.f397062d = true;
        long seconds = java.util.concurrent.TimeUnit.SECONDS.toSeconds(Integer.MAX_VALUE);
        kVar2.f397061c = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        f397073o = new l36.l(kVar2);
    }

    public l(boolean z17, boolean z18, int i17, int i18, boolean z19, boolean z27, boolean z28, int i19, int i27, boolean z29, boolean z37, boolean z38, java.lang.String str) {
        this.f397074a = z17;
        this.f397075b = z18;
        this.f397076c = i17;
        this.f397077d = i18;
        this.f397078e = z19;
        this.f397079f = z27;
        this.f397080g = z28;
        this.f397081h = i19;
        this.f397082i = i27;
        this.f397083j = z29;
        this.f397084k = z37;
        this.f397085l = z38;
        this.f397086m = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l36.l a(l36.i0 r22) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l36.l.a(l36.i0):l36.l");
    }

    /* renamed from: toString */
    public java.lang.String m145032x9616526c() {
        java.lang.String str = this.f397086m;
        if (str == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            if (this.f397074a) {
                sb6.append("no-cache, ");
            }
            if (this.f397075b) {
                sb6.append("no-store, ");
            }
            int i17 = this.f397076c;
            if (i17 != -1) {
                sb6.append("max-age=");
                sb6.append(i17);
                sb6.append(", ");
            }
            int i18 = this.f397077d;
            if (i18 != -1) {
                sb6.append("s-maxage=");
                sb6.append(i18);
                sb6.append(", ");
            }
            if (this.f397078e) {
                sb6.append("private, ");
            }
            if (this.f397079f) {
                sb6.append("public, ");
            }
            if (this.f397080g) {
                sb6.append("must-revalidate, ");
            }
            int i19 = this.f397081h;
            if (i19 != -1) {
                sb6.append("max-stale=");
                sb6.append(i19);
                sb6.append(", ");
            }
            int i27 = this.f397082i;
            if (i27 != -1) {
                sb6.append("min-fresh=");
                sb6.append(i27);
                sb6.append(", ");
            }
            if (this.f397083j) {
                sb6.append("only-if-cached, ");
            }
            if (this.f397084k) {
                sb6.append("no-transform, ");
            }
            if (this.f397085l) {
                sb6.append("immutable, ");
            }
            if (sb6.length() == 0) {
                str = "";
            } else {
                sb6.delete(sb6.length() - 2, sb6.length());
                str = sb6.toString();
            }
            this.f397086m = str;
        }
        return str;
    }

    public l(l36.k kVar) {
        this.f397074a = kVar.f397059a;
        this.f397075b = kVar.f397060b;
        this.f397076c = -1;
        this.f397077d = -1;
        this.f397078e = false;
        this.f397079f = false;
        this.f397080g = false;
        this.f397081h = kVar.f397061c;
        this.f397082i = -1;
        this.f397083j = kVar.f397062d;
        this.f397084k = false;
        this.f397085l = false;
    }
}

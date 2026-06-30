package p9;

/* loaded from: classes15.dex */
public final class b extends i9.b {

    /* renamed from: o, reason: collision with root package name */
    public static final int f434338o = t9.d0.f("payl");

    /* renamed from: p, reason: collision with root package name */
    public static final int f434339p = t9.d0.f("sttg");

    /* renamed from: q, reason: collision with root package name */
    public static final int f434340q = t9.d0.f("vttc");

    /* renamed from: m, reason: collision with root package name */
    public final t9.p f434341m;

    /* renamed from: n, reason: collision with root package name */
    public final p9.f f434342n;

    public b() {
        super("Mp4WebvttDecoder");
        this.f434341m = new t9.p();
        this.f434342n = new p9.f();
    }

    @Override // i9.b
    public i9.d f(byte[] bArr, int i17, boolean z17) {
        t9.p pVar = this.f434341m;
        pVar.u(bArr, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            int i18 = pVar.f498075c - pVar.f498074b;
            if (i18 <= 0) {
                return new p9.c(arrayList);
            }
            if (i18 < 8) {
                throw new i9.f("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int c17 = pVar.c();
            if (pVar.c() == f434340q) {
                int i19 = c17 - 8;
                p9.f fVar = this.f434342n;
                fVar.b();
                while (i19 > 0) {
                    if (i19 < 8) {
                        throw new i9.f("Incomplete vtt cue box header found.");
                    }
                    int c18 = pVar.c();
                    int c19 = pVar.c();
                    int i27 = c18 - 8;
                    java.lang.String str = new java.lang.String(pVar.f498073a, pVar.f498074b, i27);
                    pVar.x(i27);
                    i19 = (i19 - 8) - i27;
                    if (c19 == f434339p) {
                        p9.j.c(str, fVar);
                    } else if (c19 == f434338o) {
                        p9.j.d(null, str.trim(), fVar, java.util.Collections.emptyList());
                    }
                }
                arrayList.add(fVar.a());
            } else {
                pVar.x(c17 - 8);
            }
        }
    }
}

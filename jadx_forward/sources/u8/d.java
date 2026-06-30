package u8;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f506774a;

    /* renamed from: b, reason: collision with root package name */
    public int f506775b;

    /* renamed from: c, reason: collision with root package name */
    public int f506776c;

    /* renamed from: d, reason: collision with root package name */
    public long f506777d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f506778e;

    /* renamed from: f, reason: collision with root package name */
    public final t9.p f506779f;

    /* renamed from: g, reason: collision with root package name */
    public final t9.p f506780g;

    /* renamed from: h, reason: collision with root package name */
    public int f506781h;

    /* renamed from: i, reason: collision with root package name */
    public int f506782i;

    public d(t9.p pVar, t9.p pVar2, boolean z17) {
        this.f506780g = pVar;
        this.f506779f = pVar2;
        this.f506778e = z17;
        pVar2.w(12);
        this.f506774a = pVar2.p();
        pVar.w(12);
        this.f506782i = pVar.p();
        t9.a.e(pVar.c() == 1, "first_chunk must be 1");
        this.f506775b = -1;
    }

    public boolean a() {
        int i17 = this.f506775b + 1;
        this.f506775b = i17;
        if (i17 == this.f506774a) {
            return false;
        }
        boolean z17 = this.f506778e;
        t9.p pVar = this.f506779f;
        this.f506777d = z17 ? pVar.q() : pVar.n();
        if (this.f506775b == this.f506781h) {
            t9.p pVar2 = this.f506780g;
            this.f506776c = pVar2.p();
            pVar2.x(4);
            int i18 = this.f506782i - 1;
            this.f506782i = i18;
            this.f506781h = i18 > 0 ? pVar2.p() - 1 : -1;
        }
        return true;
    }
}

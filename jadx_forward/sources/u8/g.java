package u8;

/* loaded from: classes15.dex */
public final class g implements u8.e {

    /* renamed from: a, reason: collision with root package name */
    public final t9.p f506786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f506787b;

    /* renamed from: c, reason: collision with root package name */
    public final int f506788c;

    /* renamed from: d, reason: collision with root package name */
    public int f506789d;

    /* renamed from: e, reason: collision with root package name */
    public int f506790e;

    public g(u8.b bVar) {
        t9.p pVar = bVar.P0;
        this.f506786a = pVar;
        pVar.w(12);
        this.f506788c = pVar.p() & 255;
        this.f506787b = pVar.p();
    }

    @Override // u8.e
    public int a() {
        t9.p pVar = this.f506786a;
        int i17 = this.f506788c;
        if (i17 == 8) {
            return pVar.m();
        }
        if (i17 == 16) {
            return pVar.r();
        }
        int i18 = this.f506789d;
        this.f506789d = i18 + 1;
        if (i18 % 2 != 0) {
            return this.f506790e & 15;
        }
        int m17 = pVar.m();
        this.f506790e = m17;
        return (m17 & 240) >> 4;
    }

    @Override // u8.e
    public int b() {
        return this.f506787b;
    }

    @Override // u8.e
    public boolean c() {
        return false;
    }
}

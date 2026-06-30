package u8;

/* loaded from: classes15.dex */
public final class f implements u8.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f506783a;

    /* renamed from: b, reason: collision with root package name */
    public final int f506784b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f506785c;

    public f(u8.b bVar) {
        t9.p pVar = bVar.P0;
        this.f506785c = pVar;
        pVar.w(12);
        this.f506783a = pVar.p();
        this.f506784b = pVar.p();
    }

    @Override // u8.e
    public int a() {
        int i17 = this.f506783a;
        return i17 == 0 ? this.f506785c.p() : i17;
    }

    @Override // u8.e
    public int b() {
        return this.f506784b;
    }

    @Override // u8.e
    public boolean c() {
        return this.f506783a != 0;
    }
}

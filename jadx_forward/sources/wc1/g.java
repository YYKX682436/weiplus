package wc1;

/* loaded from: classes7.dex */
public final class g implements ph1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wc1.b f526007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean[] f526008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f526009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f526010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526011e;

    public g(wc1.b bVar, boolean[] zArr, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, java.lang.String str) {
        this.f526007a = bVar;
        this.f526008b = zArr;
        this.f526009c = yVar;
        this.f526010d = i17;
        this.f526011e = str;
    }

    @Override // ph1.d
    public final void a(ph1.g gVar) {
        int i17 = gVar == null ? -1 : wc1.f.f526006a[gVar.ordinal()];
        java.lang.String str = this.f526011e;
        int i18 = this.f526010d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f526009c;
        wc1.b bVar = this.f526007a;
        if (i17 == 1) {
            bVar.execute(new wc1.c(yVar, i18, str));
            return;
        }
        if (i17 == 2 || i17 == 3) {
            this.f526008b[0] = true;
            bVar.execute(new wc1.d(yVar, i18, str));
        } else {
            if (i17 != 4) {
                return;
            }
            bVar.execute(new wc1.e(yVar, i18, str));
        }
    }
}

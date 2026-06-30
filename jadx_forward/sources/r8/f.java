package r8;

/* loaded from: classes15.dex */
public final class f extends r8.e {

    /* renamed from: b, reason: collision with root package name */
    public final t9.p f474815b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f474816c;

    /* renamed from: d, reason: collision with root package name */
    public int f474817d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f474818e;

    /* renamed from: f, reason: collision with root package name */
    public int f474819f;

    public f(q8.o oVar) {
        super(oVar);
        this.f474815b = new t9.p(t9.n.f498065a);
        this.f474816c = new t9.p(4);
    }

    public boolean a(t9.p pVar) {
        int m17 = pVar.m();
        int i17 = (m17 >> 4) & 15;
        int i18 = m17 & 15;
        if (i18 == 7) {
            this.f474819f = i17;
            return i17 != 5;
        }
        throw new r8.d("Video format not supported: " + i18);
    }

    public void b(t9.p pVar, long j17) {
        int m17 = pVar.m();
        long o17 = j17 + (pVar.o() * 1000);
        q8.o oVar = this.f474814a;
        if (m17 == 0 && !this.f474818e) {
            t9.p pVar2 = new t9.p(new byte[pVar.f498075c - pVar.f498074b]);
            pVar.b(pVar2.f498073a, 0, pVar.f498075c - pVar.f498074b);
            u9.a a17 = u9.a.a(pVar2);
            this.f474817d = a17.f507260b;
            oVar.c(com.p176xb6135e39.p177xcca8366f.p178xce44dfd5.C1601x7dc4e417.m(null, "video/avc", null, -1, -1, a17.f507261c, a17.f507262d, -1.0f, a17.f507259a, -1, a17.f507263e, null));
            this.f474818e = true;
            return;
        }
        if (m17 == 1 && this.f474818e) {
            t9.p pVar3 = this.f474816c;
            byte[] bArr = pVar3.f498073a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i17 = 4 - this.f474817d;
            int i18 = 0;
            while (pVar.f498075c - pVar.f498074b > 0) {
                pVar.b(pVar3.f498073a, i17, this.f474817d);
                pVar3.w(0);
                int p17 = pVar3.p();
                t9.p pVar4 = this.f474815b;
                pVar4.w(0);
                oVar.a(pVar4, 4);
                oVar.a(pVar, p17);
                i18 = i18 + 4 + p17;
            }
            this.f474814a.b(o17, this.f474819f == 1 ? 1 : 0, i18, 0, null);
        }
    }
}

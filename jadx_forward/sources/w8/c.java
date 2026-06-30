package w8;

/* loaded from: classes15.dex */
public final class c implements q8.e {

    /* renamed from: e, reason: collision with root package name */
    public static final int f525113e = t9.d0.f("ID3");

    /* renamed from: a, reason: collision with root package name */
    public final long f525114a;

    /* renamed from: b, reason: collision with root package name */
    public final w8.d f525115b;

    /* renamed from: c, reason: collision with root package name */
    public final t9.p f525116c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f525117d;

    public c() {
        this(0L);
    }

    @Override // q8.e
    public int a(q8.f fVar, q8.k kVar) {
        t9.p pVar = this.f525116c;
        int c17 = ((q8.b) fVar).c(pVar.f498073a, 0, 200);
        if (c17 == -1) {
            return -1;
        }
        pVar.w(0);
        pVar.v(c17);
        boolean z17 = this.f525117d;
        w8.d dVar = this.f525115b;
        if (!z17) {
            dVar.f525147o = this.f525114a;
            this.f525117d = true;
        }
        dVar.a(pVar);
        return 0;
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f525115b.e(gVar, new w8.g0(0, 1));
        gVar.j();
        gVar.b(new q8.l(-9223372036854775807L));
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        t9.p pVar = new t9.p(10);
        byte[] bArr = pVar.f498073a;
        t9.o oVar = new t9.o(bArr, bArr.length);
        int i17 = 0;
        while (true) {
            ((q8.b) fVar).b(pVar.f498073a, 0, 10, false);
            pVar.w(0);
            if (pVar.o() != f525113e) {
                break;
            }
            pVar.x(3);
            int l17 = pVar.l();
            i17 += l17 + 10;
            ((q8.b) fVar).a(l17, false);
        }
        q8.b bVar = (q8.b) fVar;
        bVar.f442153e = 0;
        bVar.a(i17, false);
        int i18 = 0;
        int i19 = 0;
        int i27 = i17;
        while (true) {
            bVar.b(pVar.f498073a, 0, 2, false);
            pVar.w(0);
            if ((pVar.r() & 65526) != 65520) {
                bVar.f442153e = 0;
                i27++;
                if (i27 - i17 >= 8192) {
                    return false;
                }
                bVar.a(i27, false);
                i18 = 0;
                i19 = 0;
            } else {
                i18++;
                if (i18 >= 4 && i19 > 188) {
                    return true;
                }
                bVar.b(pVar.f498073a, 0, 4, false);
                oVar.e(14);
                int d17 = oVar.d(13);
                if (d17 <= 6) {
                    return false;
                }
                bVar.a(d17 - 6, false);
                i19 += d17;
            }
        }
    }

    @Override // q8.e
    /* renamed from: release */
    public void mo131096x41012807() {
    }

    @Override // q8.e
    /* renamed from: seek */
    public void mo131097x35ce78(long j17, long j18) {
        this.f525117d = false;
        w8.d dVar = this.f525115b;
        dVar.f525140h = 0;
        dVar.f525141i = 0;
        dVar.f525142j = 256;
    }

    public c(long j17) {
        this.f525114a = j17;
        this.f525115b = new w8.d(true, null);
        this.f525116c = new t9.p(200);
    }
}

package v8;

/* loaded from: classes15.dex */
public class f implements q8.e {

    /* renamed from: a, reason: collision with root package name */
    public q8.g f515526a;

    /* renamed from: b, reason: collision with root package name */
    public v8.n f515527b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f515528c;

    /* JADX WARN: Removed duplicated region for block: B:65:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // q8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(q8.f r20, q8.k r21) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.f.a(q8.f, q8.k):int");
    }

    @Override // q8.e
    public void b(q8.g gVar) {
        this.f515526a = gVar;
    }

    public final boolean c(q8.f fVar) {
        boolean z17;
        boolean equals;
        v8.h hVar = new v8.h();
        if (hVar.a(fVar, true) && (hVar.f515535a & 2) == 2) {
            int min = java.lang.Math.min(hVar.f515539e, 8);
            t9.p pVar = new t9.p(min);
            ((q8.b) fVar).b(pVar.f498073a, 0, min, false);
            pVar.w(0);
            if (pVar.f498075c - pVar.f498074b >= 5 && pVar.m() == 127 && pVar.n() == 1179402563) {
                this.f515527b = new v8.e();
            } else {
                pVar.w(0);
                try {
                    z17 = v8.u.a(1, pVar, true);
                } catch (m8.x unused) {
                    z17 = false;
                }
                if (z17) {
                    this.f515527b = new v8.q();
                } else {
                    pVar.w(0);
                    int i17 = v8.j.f515542o;
                    int i18 = pVar.f498075c - pVar.f498074b;
                    byte[] bArr = v8.j.f515543p;
                    if (i18 < bArr.length) {
                        equals = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        pVar.b(bArr2, 0, bArr.length);
                        equals = java.util.Arrays.equals(bArr2, bArr);
                    }
                    if (equals) {
                        this.f515527b = new v8.j();
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // q8.e
    public boolean e(q8.f fVar) {
        try {
            return c(fVar);
        } catch (m8.x unused) {
            return false;
        }
    }

    @Override // q8.e
    /* renamed from: release */
    public void mo131096x41012807() {
    }

    @Override // q8.e
    /* renamed from: seek */
    public void mo131097x35ce78(long j17, long j18) {
        v8.n nVar = this.f515527b;
        if (nVar != null) {
            v8.g gVar = nVar.f515547a;
            v8.h hVar = gVar.f515529a;
            hVar.f515535a = 0;
            hVar.f515536b = 0L;
            hVar.f515537c = 0;
            hVar.f515538d = 0;
            hVar.f515539e = 0;
            gVar.f515530b.s();
            gVar.f515531c = -1;
            gVar.f515533e = false;
            if (j17 == 0) {
                nVar.d(!nVar.f515558l);
            } else if (nVar.f515554h != 0) {
                nVar.f515551e = nVar.f515550d.b(j18);
                nVar.f515554h = 2;
            }
        }
    }
}

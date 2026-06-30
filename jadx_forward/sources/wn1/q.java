package wn1;

/* loaded from: classes12.dex */
public class q extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f528986d;

    /* renamed from: e, reason: collision with root package name */
    public long f528987e;

    /* renamed from: f, reason: collision with root package name */
    public long f528988f;

    /* renamed from: g, reason: collision with root package name */
    public long f528989g;

    /* renamed from: h, reason: collision with root package name */
    public wn1.p f528990h;

    /* renamed from: i, reason: collision with root package name */
    public long f528991i;

    /* renamed from: m, reason: collision with root package name */
    public int f528992m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f528993n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof wn1.q)) {
            return false;
        }
        wn1.q qVar = (wn1.q) fVar;
        return n51.f.a(this.f528986d, qVar.f528986d) && n51.f.a(java.lang.Long.valueOf(this.f528987e), java.lang.Long.valueOf(qVar.f528987e)) && n51.f.a(java.lang.Long.valueOf(this.f528988f), java.lang.Long.valueOf(qVar.f528988f)) && n51.f.a(java.lang.Long.valueOf(this.f528989g), java.lang.Long.valueOf(qVar.f528989g)) && n51.f.a(this.f528990h, qVar.f528990h) && n51.f.a(java.lang.Long.valueOf(this.f528991i), java.lang.Long.valueOf(qVar.f528991i)) && n51.f.a(java.lang.Integer.valueOf(this.f528992m), java.lang.Integer.valueOf(qVar.f528992m)) && n51.f.a(this.f528993n, qVar.f528993n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f528986d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f528987e);
            fVar.h(3, this.f528988f);
            fVar.h(4, this.f528989g);
            wn1.p pVar = this.f528990h;
            if (pVar != null) {
                fVar.i(5, pVar.mo75928xcd1e8d8());
                this.f528990h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(6, this.f528991i);
            fVar.e(7, this.f528992m);
            java.lang.String str2 = this.f528993n;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f528986d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.h(2, this.f528987e) + b36.f.h(3, this.f528988f) + b36.f.h(4, this.f528989g);
            wn1.p pVar2 = this.f528990h;
            if (pVar2 != null) {
                j17 += b36.f.i(5, pVar2.mo75928xcd1e8d8());
            }
            int h17 = j17 + b36.f.h(6, this.f528991i) + b36.f.e(7, this.f528992m);
            java.lang.String str4 = this.f528993n;
            return str4 != null ? h17 + b36.f.j(8, str4) : h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wn1.q qVar = (wn1.q) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                qVar.f528986d = aVar2.k(intValue);
                return 0;
            case 2:
                qVar.f528987e = aVar2.i(intValue);
                return 0;
            case 3:
                qVar.f528988f = aVar2.i(intValue);
                return 0;
            case 4:
                qVar.f528989g = aVar2.i(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    wn1.p pVar3 = new wn1.p();
                    if (bArr != null && bArr.length > 0) {
                        pVar3.mo11468x92b714fd(bArr);
                    }
                    qVar.f528990h = pVar3;
                }
                return 0;
            case 6:
                qVar.f528991i = aVar2.i(intValue);
                return 0;
            case 7:
                qVar.f528992m = aVar2.g(intValue);
                return 0;
            case 8:
                qVar.f528993n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

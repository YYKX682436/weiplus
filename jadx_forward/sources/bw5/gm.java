package bw5;

/* loaded from: classes2.dex */
public class gm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109438d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109439e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f109440f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f109441g;

    /* renamed from: h, reason: collision with root package name */
    public int f109442h;

    /* renamed from: i, reason: collision with root package name */
    public int f109443i;

    /* renamed from: m, reason: collision with root package name */
    public int f109444m;

    /* renamed from: n, reason: collision with root package name */
    public long f109445n;

    /* renamed from: o, reason: collision with root package name */
    public long f109446o;

    /* renamed from: p, reason: collision with root package name */
    public long f109447p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.ao f109448q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f109449r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f109450s = new boolean[13];

    static {
        new bw5.gm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gm mo11468x92b714fd(byte[] bArr) {
        return (bw5.gm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gm)) {
            return false;
        }
        bw5.gm gmVar = (bw5.gm) fVar;
        return n51.f.a(this.f109438d, gmVar.f109438d) && n51.f.a(this.f109439e, gmVar.f109439e) && n51.f.a(this.f109440f, gmVar.f109440f) && n51.f.a(this.f109441g, gmVar.f109441g) && n51.f.a(java.lang.Integer.valueOf(this.f109442h), java.lang.Integer.valueOf(gmVar.f109442h)) && n51.f.a(java.lang.Integer.valueOf(this.f109443i), java.lang.Integer.valueOf(gmVar.f109443i)) && n51.f.a(java.lang.Integer.valueOf(this.f109444m), java.lang.Integer.valueOf(gmVar.f109444m)) && n51.f.a(java.lang.Long.valueOf(this.f109445n), java.lang.Long.valueOf(gmVar.f109445n)) && n51.f.a(java.lang.Long.valueOf(this.f109446o), java.lang.Long.valueOf(gmVar.f109446o)) && n51.f.a(java.lang.Long.valueOf(this.f109447p), java.lang.Long.valueOf(gmVar.f109447p)) && n51.f.a(this.f109448q, gmVar.f109448q) && n51.f.a(this.f109449r, gmVar.f109449r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.gm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109450s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109438d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109439e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f109440f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f109441g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109442h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109443i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109444m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f109445n);
            }
            if (zArr[9]) {
                fVar.h(9, this.f109446o);
            }
            if (zArr[10]) {
                fVar.h(10, this.f109447p);
            }
            bw5.ao aoVar = this.f109448q;
            if (aoVar != null && zArr[11]) {
                fVar.i(11, aoVar.mo75928xcd1e8d8());
                this.f109448q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f109449r;
            if (str4 == null || !zArr[12]) {
                return 0;
            }
            fVar.j(12, str4);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f109438d;
            int j17 = (str5 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str5);
            java.lang.String str6 = this.f109439e;
            if (str6 != null && zArr[2]) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f109440f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f109441g;
            if (gVar2 != null && zArr[4]) {
                j17 += b36.f.b(4, gVar2);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f109442h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f109443i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f109444m);
            }
            if (zArr[8]) {
                j17 += b36.f.h(8, this.f109445n);
            }
            if (zArr[9]) {
                j17 += b36.f.h(9, this.f109446o);
            }
            if (zArr[10]) {
                j17 += b36.f.h(10, this.f109447p);
            }
            bw5.ao aoVar2 = this.f109448q;
            if (aoVar2 != null && zArr[11]) {
                j17 += b36.f.i(11, aoVar2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f109449r;
            return (str8 == null || !zArr[12]) ? j17 : j17 + b36.f.j(12, str8);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f109438d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109439e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109440f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f109441g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109442h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109443i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109444m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f109445n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f109446o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f109447p = aVar2.i(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.ao aoVar3 = new bw5.ao();
                    if (bArr != null && bArr.length > 0) {
                        aoVar3.mo11468x92b714fd(bArr);
                    }
                    this.f109448q = aoVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f109449r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}

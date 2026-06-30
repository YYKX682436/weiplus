package bw5;

/* loaded from: classes2.dex */
public class ps extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f113349d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113350e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113351f;

    /* renamed from: g, reason: collision with root package name */
    public int f113352g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ef f113353h;

    /* renamed from: i, reason: collision with root package name */
    public long f113354i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f113355m;

    /* renamed from: n, reason: collision with root package name */
    public int f113356n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f113357o;

    /* renamed from: p, reason: collision with root package name */
    public int f113358p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f113359q = new boolean[12];

    static {
        new bw5.ps();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ps mo11468x92b714fd(byte[] bArr) {
        return (bw5.ps) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ps)) {
            return false;
        }
        bw5.ps psVar = (bw5.ps) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f113349d), java.lang.Long.valueOf(psVar.f113349d)) && n51.f.a(this.f113350e, psVar.f113350e) && n51.f.a(this.f113351f, psVar.f113351f) && n51.f.a(java.lang.Integer.valueOf(this.f113352g), java.lang.Integer.valueOf(psVar.f113352g)) && n51.f.a(this.f113353h, psVar.f113353h) && n51.f.a(java.lang.Long.valueOf(this.f113354i), java.lang.Long.valueOf(psVar.f113354i)) && n51.f.a(this.f113355m, psVar.f113355m) && n51.f.a(java.lang.Integer.valueOf(this.f113356n), java.lang.Integer.valueOf(psVar.f113356n)) && n51.f.a(this.f113357o, psVar.f113357o) && n51.f.a(java.lang.Integer.valueOf(this.f113358p), java.lang.Integer.valueOf(psVar.f113358p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ps();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f113359q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f113349d);
            }
            java.lang.String str = this.f113350e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f113351f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f113352g);
            }
            bw5.ef efVar = this.f113353h;
            if (efVar != null && zArr[5]) {
                fVar.i(5, efVar.mo75928xcd1e8d8());
                this.f113353h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f113354i);
            }
            java.lang.String str3 = this.f113355m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            if (zArr[8]) {
                fVar.e(8, this.f113356n);
            }
            java.lang.String str4 = this.f113357o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            if (zArr[11]) {
                fVar.e(11, this.f113358p);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f113349d) : 0;
            java.lang.String str5 = this.f113350e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f113351f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f113352g);
            }
            bw5.ef efVar2 = this.f113353h;
            if (efVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, efVar2.mo75928xcd1e8d8());
            }
            if (zArr[6]) {
                h17 += b36.f.h(6, this.f113354i);
            }
            java.lang.String str7 = this.f113355m;
            if (str7 != null && zArr[7]) {
                h17 += b36.f.j(7, str7);
            }
            if (zArr[8]) {
                h17 += b36.f.e(8, this.f113356n);
            }
            java.lang.String str8 = this.f113357o;
            if (str8 != null && zArr[9]) {
                h17 += b36.f.j(9, str8);
            }
            return zArr[11] ? h17 + b36.f.e(11, this.f113358p) : h17;
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
                this.f113349d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113350e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113351f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f113352g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ef efVar3 = new bw5.ef();
                    if (bArr != null && bArr.length > 0) {
                        efVar3.mo11468x92b714fd(bArr);
                    }
                    this.f113353h = efVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f113354i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f113355m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f113356n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f113357o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
            default:
                return -1;
            case 11:
                this.f113358p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}

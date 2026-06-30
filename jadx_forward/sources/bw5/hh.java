package bw5;

/* loaded from: classes2.dex */
public class hh extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109744d;

    /* renamed from: e, reason: collision with root package name */
    public int f109745e;

    /* renamed from: f, reason: collision with root package name */
    public int f109746f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.gh f109747g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f109748h;

    /* renamed from: i, reason: collision with root package name */
    public int f109749i;

    /* renamed from: m, reason: collision with root package name */
    public int f109750m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f109751n = new boolean[8];

    static {
        new bw5.hh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hh mo11468x92b714fd(byte[] bArr) {
        return (bw5.hh) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hh)) {
            return false;
        }
        bw5.hh hhVar = (bw5.hh) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109744d), java.lang.Integer.valueOf(hhVar.f109744d)) && n51.f.a(java.lang.Integer.valueOf(this.f109745e), java.lang.Integer.valueOf(hhVar.f109745e)) && n51.f.a(java.lang.Integer.valueOf(this.f109746f), java.lang.Integer.valueOf(hhVar.f109746f)) && n51.f.a(this.f109747g, hhVar.f109747g) && n51.f.a(this.f109748h, hhVar.f109748h) && n51.f.a(java.lang.Integer.valueOf(this.f109749i), java.lang.Integer.valueOf(hhVar.f109749i)) && n51.f.a(java.lang.Integer.valueOf(this.f109750m), java.lang.Integer.valueOf(hhVar.f109750m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hh();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109751n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109744d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f109745e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f109746f);
            }
            bw5.gh ghVar = this.f109747g;
            if (ghVar != null && zArr[4]) {
                fVar.i(4, ghVar.mo75928xcd1e8d8());
                this.f109747g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f109748h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            if (zArr[6]) {
                fVar.e(6, this.f109749i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f109750m);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109744d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f109745e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f109746f);
            }
            bw5.gh ghVar2 = this.f109747g;
            if (ghVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, ghVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f109748h;
            if (str2 != null && zArr[5]) {
                e17 += b36.f.j(5, str2);
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f109749i);
            }
            return zArr[7] ? e17 + b36.f.e(7, this.f109750m) : e17;
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
                this.f109744d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109745e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f109746f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.gh ghVar3 = new bw5.gh();
                    if (bArr != null && bArr.length > 0) {
                        ghVar3.mo11468x92b714fd(bArr);
                    }
                    this.f109747g = ghVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f109748h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109749i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f109750m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

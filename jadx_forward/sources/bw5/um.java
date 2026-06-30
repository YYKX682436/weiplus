package bw5;

/* loaded from: classes2.dex */
public class um extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ql f115506d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.tm f115507e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115508f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115509g;

    /* renamed from: h, reason: collision with root package name */
    public long f115510h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115511i;

    /* renamed from: m, reason: collision with root package name */
    public int f115512m;

    /* renamed from: n, reason: collision with root package name */
    public int f115513n;

    /* renamed from: o, reason: collision with root package name */
    public int f115514o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f115515p = new boolean[10];

    static {
        new bw5.um();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.um mo11468x92b714fd(byte[] bArr) {
        return (bw5.um) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.um)) {
            return false;
        }
        bw5.um umVar = (bw5.um) fVar;
        return n51.f.a(this.f115506d, umVar.f115506d) && n51.f.a(this.f115507e, umVar.f115507e) && n51.f.a(this.f115508f, umVar.f115508f) && n51.f.a(this.f115509g, umVar.f115509g) && n51.f.a(java.lang.Long.valueOf(this.f115510h), java.lang.Long.valueOf(umVar.f115510h)) && n51.f.a(this.f115511i, umVar.f115511i) && n51.f.a(java.lang.Integer.valueOf(this.f115512m), java.lang.Integer.valueOf(umVar.f115512m)) && n51.f.a(java.lang.Integer.valueOf(this.f115513n), java.lang.Integer.valueOf(umVar.f115513n)) && n51.f.a(java.lang.Integer.valueOf(this.f115514o), java.lang.Integer.valueOf(umVar.f115514o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.um();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f115515p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ql qlVar = this.f115506d;
            if (qlVar != null && zArr[1]) {
                fVar.i(1, qlVar.mo75928xcd1e8d8());
                this.f115506d.mo75956x3d5d1f78(fVar);
            }
            bw5.tm tmVar = this.f115507e;
            if (tmVar != null && zArr[2]) {
                fVar.e(2, tmVar.f115048d);
            }
            java.lang.String str = this.f115508f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f115509g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f115510h);
            }
            java.lang.String str3 = this.f115511i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115512m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115513n);
            }
            if (zArr[9]) {
                fVar.e(9, this.f115514o);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ql qlVar2 = this.f115506d;
            if (qlVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, qlVar2.mo75928xcd1e8d8());
            }
            bw5.tm tmVar2 = this.f115507e;
            if (tmVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, tmVar2.f115048d);
            }
            java.lang.String str4 = this.f115508f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f115509g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f115510h);
            }
            java.lang.String str6 = this.f115511i;
            if (str6 != null && zArr[6]) {
                i18 += b36.f.j(6, str6);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f115512m);
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f115513n);
            }
            return zArr[9] ? i18 + b36.f.e(9, this.f115514o) : i18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ql qlVar3 = new bw5.ql();
                    if (bArr != null && bArr.length > 0) {
                        qlVar3.mo11468x92b714fd(bArr);
                    }
                    this.f115506d = qlVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                int g17 = aVar2.g(intValue);
                this.f115507e = g17 != 1 ? g17 != 2 ? null : bw5.tm.Video : bw5.tm.Audio;
                zArr[2] = true;
                return 0;
            case 3:
                this.f115508f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115509g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115510h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115511i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115512m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115513n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f115514o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

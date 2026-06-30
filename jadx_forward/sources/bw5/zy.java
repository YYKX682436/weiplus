package bw5;

/* loaded from: classes2.dex */
public class zy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f117734d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117735e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f117736f;

    /* renamed from: g, reason: collision with root package name */
    public int f117737g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f117738h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f117739i;

    /* renamed from: m, reason: collision with root package name */
    public int f117740m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f117741n = new boolean[8];

    static {
        new bw5.zy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zy mo11468x92b714fd(byte[] bArr) {
        return (bw5.zy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zy)) {
            return false;
        }
        bw5.zy zyVar = (bw5.zy) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f117734d), java.lang.Long.valueOf(zyVar.f117734d)) && n51.f.a(this.f117735e, zyVar.f117735e) && n51.f.a(this.f117736f, zyVar.f117736f) && n51.f.a(java.lang.Integer.valueOf(this.f117737g), java.lang.Integer.valueOf(zyVar.f117737g)) && n51.f.a(this.f117738h, zyVar.f117738h) && n51.f.a(this.f117739i, zyVar.f117739i) && n51.f.a(java.lang.Integer.valueOf(this.f117740m), java.lang.Integer.valueOf(zyVar.f117740m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117741n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f117734d);
            }
            java.lang.String str = this.f117735e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f117736f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f117737g);
            }
            java.lang.String str3 = this.f117738h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f117739i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.e(7, this.f117740m);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f117734d) : 0;
            java.lang.String str5 = this.f117735e;
            if (str5 != null && zArr[2]) {
                h17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f117736f;
            if (str6 != null && zArr[3]) {
                h17 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                h17 += b36.f.e(4, this.f117737g);
            }
            java.lang.String str7 = this.f117738h;
            if (str7 != null && zArr[5]) {
                h17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f117739i;
            if (str8 != null && zArr[6]) {
                h17 += b36.f.j(6, str8);
            }
            return zArr[7] ? h17 + b36.f.e(7, this.f117740m) : h17;
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
                this.f117734d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f117735e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f117736f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117737g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117738h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117739i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117740m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}

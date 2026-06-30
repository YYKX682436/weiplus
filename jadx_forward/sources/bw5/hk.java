package bw5;

/* loaded from: classes2.dex */
public class hk extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109784d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f109785e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.ae f109786f;

    /* renamed from: g, reason: collision with root package name */
    public int f109787g;

    /* renamed from: h, reason: collision with root package name */
    public int f109788h;

    /* renamed from: i, reason: collision with root package name */
    public long f109789i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f109790m = new boolean[7];

    static {
        new bw5.hk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hk mo11468x92b714fd(byte[] bArr) {
        return (bw5.hk) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hk)) {
            return false;
        }
        bw5.hk hkVar = (bw5.hk) fVar;
        return n51.f.a(this.f109784d, hkVar.f109784d) && n51.f.a(this.f109785e, hkVar.f109785e) && n51.f.a(this.f109786f, hkVar.f109786f) && n51.f.a(java.lang.Integer.valueOf(this.f109787g), java.lang.Integer.valueOf(hkVar.f109787g)) && n51.f.a(java.lang.Integer.valueOf(this.f109788h), java.lang.Integer.valueOf(hkVar.f109788h)) && n51.f.a(java.lang.Long.valueOf(this.f109789i), java.lang.Long.valueOf(hkVar.f109789i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hk();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f109790m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109784d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f109785e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.ae aeVar = this.f109786f;
            if (aeVar != null && zArr[3]) {
                fVar.i(3, aeVar.mo75928xcd1e8d8());
                this.f109786f.mo75956x3d5d1f78(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f109787g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f109788h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f109789i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f109784d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f109785e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.ae aeVar2 = this.f109786f;
            if (aeVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, aeVar2.mo75928xcd1e8d8());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f109787g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f109788h);
            }
            return zArr[6] ? i18 + b36.f.h(6, this.f109789i) : i18;
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
                this.f109784d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f109785e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.mo11468x92b714fd(bArr);
                    }
                    this.f109786f = aeVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f109787g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f109788h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f109789i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}

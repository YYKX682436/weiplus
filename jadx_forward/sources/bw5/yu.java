package bw5;

/* loaded from: classes2.dex */
public class yu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.pj f117234d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117235e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f117236f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117237g;

    /* renamed from: h, reason: collision with root package name */
    public int f117238h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f117239i = new boolean[6];

    static {
        new bw5.yu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yu mo11468x92b714fd(byte[] bArr) {
        return (bw5.yu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yu)) {
            return false;
        }
        bw5.yu yuVar = (bw5.yu) fVar;
        return n51.f.a(this.f117234d, yuVar.f117234d) && n51.f.a(this.f117235e, yuVar.f117235e) && n51.f.a(java.lang.Boolean.valueOf(this.f117236f), java.lang.Boolean.valueOf(yuVar.f117236f)) && n51.f.a(this.f117237g, yuVar.f117237g) && n51.f.a(java.lang.Integer.valueOf(this.f117238h), java.lang.Integer.valueOf(yuVar.f117238h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117239i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.pj pjVar = this.f117234d;
            if (pjVar != null && zArr[1]) {
                fVar.i(1, pjVar.mo75928xcd1e8d8());
                this.f117234d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f117235e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.a(3, this.f117236f);
            }
            java.lang.String str2 = this.f117237g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117238h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.pj pjVar2 = this.f117234d;
            if (pjVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, pjVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f117235e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                i18 += b36.f.a(3, this.f117236f);
            }
            java.lang.String str4 = this.f117237g;
            if (str4 != null && zArr[4]) {
                i18 += b36.f.j(4, str4);
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f117238h) : i18;
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.pj pjVar3 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar3.mo11468x92b714fd(bArr);
                }
                this.f117234d = pjVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f117235e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f117236f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f117237g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f117238h = aVar2.g(intValue);
        zArr[5] = true;
        return 0;
    }
}

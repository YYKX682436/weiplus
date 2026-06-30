package bw5;

/* loaded from: classes2.dex */
public class kw extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111088d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111089e;

    /* renamed from: f, reason: collision with root package name */
    public int f111090f;

    /* renamed from: g, reason: collision with root package name */
    public long f111091g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.lw f111092h;

    /* renamed from: i, reason: collision with root package name */
    public int f111093i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111094m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.jw f111095n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f111096o = new boolean[10];

    static {
        new bw5.kw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kw mo11468x92b714fd(byte[] bArr) {
        return (bw5.kw) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kw)) {
            return false;
        }
        bw5.kw kwVar = (bw5.kw) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111088d), java.lang.Integer.valueOf(kwVar.f111088d)) && n51.f.a(this.f111089e, kwVar.f111089e) && n51.f.a(java.lang.Integer.valueOf(this.f111090f), java.lang.Integer.valueOf(kwVar.f111090f)) && n51.f.a(java.lang.Long.valueOf(this.f111091g), java.lang.Long.valueOf(kwVar.f111091g)) && n51.f.a(this.f111092h, kwVar.f111092h) && n51.f.a(java.lang.Integer.valueOf(this.f111093i), java.lang.Integer.valueOf(kwVar.f111093i)) && n51.f.a(this.f111094m, kwVar.f111094m) && n51.f.a(this.f111095n, kwVar.f111095n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.kw();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f111096o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111088d);
            }
            java.lang.String str = this.f111089e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f111090f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f111091g);
            }
            bw5.lw lwVar = this.f111092h;
            if (lwVar != null && zArr[5]) {
                fVar.i(5, lwVar.mo75928xcd1e8d8());
                this.f111092h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f111093i);
            }
            java.lang.String str2 = this.f111094m;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            bw5.jw jwVar = this.f111095n;
            if (jwVar != null && zArr[9]) {
                fVar.i(9, jwVar.mo75928xcd1e8d8());
                this.f111095n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111088d) : 0;
            java.lang.String str3 = this.f111089e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f111090f);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f111091g);
            }
            bw5.lw lwVar2 = this.f111092h;
            if (lwVar2 != null && zArr[5]) {
                e17 += b36.f.i(5, lwVar2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f111093i);
            }
            java.lang.String str4 = this.f111094m;
            if (str4 != null && zArr[8]) {
                e17 += b36.f.j(8, str4);
            }
            bw5.jw jwVar2 = this.f111095n;
            return (jwVar2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, jwVar2.mo75928xcd1e8d8());
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
                this.f111088d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f111089e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f111090f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f111091g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lw lwVar3 = new bw5.lw();
                    if (bArr != null && bArr.length > 0) {
                        lwVar3.mo11468x92b714fd(bArr);
                    }
                    this.f111092h = lwVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
            default:
                return -1;
            case 7:
                this.f111093i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111094m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.jw jwVar3 = new bw5.jw();
                    if (bArr2 != null && bArr2.length > 0) {
                        jwVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f111095n = jwVar3;
                }
                zArr[9] = true;
                return 0;
        }
    }
}

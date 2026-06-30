package bw5;

/* loaded from: classes2.dex */
public class cn extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ql f107701d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107702e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107703f;

    /* renamed from: g, reason: collision with root package name */
    public int f107704g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f107705h = new boolean[5];

    static {
        new bw5.cn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.cn mo11468x92b714fd(byte[] bArr) {
        return (bw5.cn) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.cn)) {
            return false;
        }
        bw5.cn cnVar = (bw5.cn) fVar;
        return n51.f.a(this.f107701d, cnVar.f107701d) && n51.f.a(this.f107702e, cnVar.f107702e) && n51.f.a(this.f107703f, cnVar.f107703f) && n51.f.a(java.lang.Integer.valueOf(this.f107704g), java.lang.Integer.valueOf(cnVar.f107704g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.cn();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f107705h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ql qlVar = this.f107701d;
            if (qlVar != null && zArr[1]) {
                fVar.i(1, qlVar.mo75928xcd1e8d8());
                this.f107701d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f107702e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f107703f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f107704g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ql qlVar2 = this.f107701d;
            if (qlVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, qlVar2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f107702e;
            if (str3 != null && zArr[2]) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f107703f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f107704g) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f107702e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue == 3) {
                this.f107703f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f107704g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ql qlVar3 = new bw5.ql();
            if (bArr != null && bArr.length > 0) {
                qlVar3.mo11468x92b714fd(bArr);
            }
            this.f107701d = qlVar3;
        }
        zArr[1] = true;
        return 0;
    }
}

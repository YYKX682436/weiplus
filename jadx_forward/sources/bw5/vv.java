package bw5;

/* loaded from: classes2.dex */
public class vv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116023d;

    /* renamed from: e, reason: collision with root package name */
    public int f116024e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116025f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f116026g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.rv f116027h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116028i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.dc f116029m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f116030n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.z30 f116031o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f116032p = new boolean[10];

    static {
        new bw5.vv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vv mo11468x92b714fd(byte[] bArr) {
        return (bw5.vv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vv)) {
            return false;
        }
        bw5.vv vvVar = (bw5.vv) fVar;
        return n51.f.a(this.f116023d, vvVar.f116023d) && n51.f.a(java.lang.Integer.valueOf(this.f116024e), java.lang.Integer.valueOf(vvVar.f116024e)) && n51.f.a(this.f116025f, vvVar.f116025f) && n51.f.a(this.f116026g, vvVar.f116026g) && n51.f.a(this.f116027h, vvVar.f116027h) && n51.f.a(this.f116028i, vvVar.f116028i) && n51.f.a(this.f116029m, vvVar.f116029m) && n51.f.a(this.f116030n, vvVar.f116030n) && n51.f.a(this.f116031o, vvVar.f116031o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f116032p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116023d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f116024e);
            }
            java.lang.String str2 = this.f116025f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f116026g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            bw5.rv rvVar = this.f116027h;
            if (rvVar != null && zArr[5]) {
                fVar.i(5, rvVar.mo75928xcd1e8d8());
                this.f116027h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f116028i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.dc dcVar = this.f116029m;
            if (dcVar != null && zArr[7]) {
                fVar.i(7, dcVar.mo75928xcd1e8d8());
                this.f116029m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f116030n;
            if (str5 != null && zArr[8]) {
                fVar.j(8, str5);
            }
            bw5.z30 z30Var = this.f116031o;
            if (z30Var != null && zArr[9]) {
                fVar.i(9, z30Var.mo75928xcd1e8d8());
                this.f116031o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f116023d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f116024e);
            }
            java.lang.String str7 = this.f116025f;
            if (str7 != null && zArr[3]) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f116026g;
            if (str8 != null && zArr[4]) {
                i18 += b36.f.j(4, str8);
            }
            bw5.rv rvVar2 = this.f116027h;
            if (rvVar2 != null && zArr[5]) {
                i18 += b36.f.i(5, rvVar2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f116028i;
            if (str9 != null && zArr[6]) {
                i18 += b36.f.j(6, str9);
            }
            bw5.dc dcVar2 = this.f116029m;
            if (dcVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, dcVar2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f116030n;
            if (str10 != null && zArr[8]) {
                i18 += b36.f.j(8, str10);
            }
            bw5.z30 z30Var2 = this.f116031o;
            return (z30Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, z30Var2.mo75928xcd1e8d8());
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
                this.f116023d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f116024e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f116025f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116026g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.rv rvVar3 = new bw5.rv();
                    if (bArr != null && bArr.length > 0) {
                        rvVar3.mo11468x92b714fd(bArr);
                    }
                    this.f116027h = rvVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f116028i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.dc dcVar3 = new bw5.dc();
                    if (bArr2 != null && bArr2.length > 0) {
                        dcVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f116029m = dcVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f116030n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.z30 z30Var3 = new bw5.z30();
                    if (bArr3 != null && bArr3.length > 0) {
                        z30Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f116031o = z30Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}

package bw5;

/* loaded from: classes2.dex */
public class nv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f112361d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112362e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112363f;

    /* renamed from: g, reason: collision with root package name */
    public int f112364g;

    /* renamed from: h, reason: collision with root package name */
    public int f112365h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f112366i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112367m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f112368n;

    /* renamed from: o, reason: collision with root package name */
    public int f112369o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.rg f112370p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.tw f112371q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.qg f112372r;

    /* renamed from: s, reason: collision with root package name */
    public int f112373s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f112374t = new boolean[14];

    static {
        new bw5.nv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nv mo11468x92b714fd(byte[] bArr) {
        return (bw5.nv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nv)) {
            return false;
        }
        bw5.nv nvVar = (bw5.nv) fVar;
        return n51.f.a(this.f112361d, nvVar.f112361d) && n51.f.a(this.f112362e, nvVar.f112362e) && n51.f.a(this.f112363f, nvVar.f112363f) && n51.f.a(java.lang.Integer.valueOf(this.f112364g), java.lang.Integer.valueOf(nvVar.f112364g)) && n51.f.a(java.lang.Integer.valueOf(this.f112365h), java.lang.Integer.valueOf(nvVar.f112365h)) && n51.f.a(this.f112366i, nvVar.f112366i) && n51.f.a(this.f112367m, nvVar.f112367m) && n51.f.a(this.f112368n, nvVar.f112368n) && n51.f.a(java.lang.Integer.valueOf(this.f112369o), java.lang.Integer.valueOf(nvVar.f112369o)) && n51.f.a(this.f112370p, nvVar.f112370p) && n51.f.a(this.f112371q, nvVar.f112371q) && n51.f.a(this.f112372r, nvVar.f112372r) && n51.f.a(java.lang.Integer.valueOf(this.f112373s), java.lang.Integer.valueOf(nvVar.f112373s));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.nv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112374t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f112361d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f112362e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f112363f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f112364g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f112365h);
            }
            java.lang.String str4 = this.f112366i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            java.lang.String str5 = this.f112367m;
            if (str5 != null && zArr[7]) {
                fVar.j(7, str5);
            }
            java.lang.String str6 = this.f112368n;
            if (str6 != null && zArr[8]) {
                fVar.j(8, str6);
            }
            if (zArr[9]) {
                fVar.e(9, this.f112369o);
            }
            bw5.rg rgVar = this.f112370p;
            if (rgVar != null && zArr[10]) {
                fVar.i(10, rgVar.mo75928xcd1e8d8());
                this.f112370p.mo75956x3d5d1f78(fVar);
            }
            bw5.tw twVar = this.f112371q;
            if (twVar != null && zArr[11]) {
                fVar.i(11, twVar.mo75928xcd1e8d8());
                this.f112371q.mo75956x3d5d1f78(fVar);
            }
            bw5.qg qgVar = this.f112372r;
            if (qgVar != null && zArr[12]) {
                fVar.i(12, qgVar.mo75928xcd1e8d8());
                this.f112372r.mo75956x3d5d1f78(fVar);
            }
            if (!zArr[13]) {
                return 0;
            }
            fVar.e(13, this.f112373s);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f112361d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f112362e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f112363f;
            if (str9 != null && zArr[3]) {
                j17 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f112364g);
            }
            if (zArr[5]) {
                j17 += b36.f.e(5, this.f112365h);
            }
            java.lang.String str10 = this.f112366i;
            if (str10 != null && zArr[6]) {
                j17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f112367m;
            if (str11 != null && zArr[7]) {
                j17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f112368n;
            if (str12 != null && zArr[8]) {
                j17 += b36.f.j(8, str12);
            }
            if (zArr[9]) {
                j17 += b36.f.e(9, this.f112369o);
            }
            bw5.rg rgVar2 = this.f112370p;
            if (rgVar2 != null && zArr[10]) {
                j17 += b36.f.i(10, rgVar2.mo75928xcd1e8d8());
            }
            bw5.tw twVar2 = this.f112371q;
            if (twVar2 != null && zArr[11]) {
                j17 += b36.f.i(11, twVar2.mo75928xcd1e8d8());
            }
            bw5.qg qgVar2 = this.f112372r;
            if (qgVar2 != null && zArr[12]) {
                j17 += b36.f.i(12, qgVar2.mo75928xcd1e8d8());
            }
            return zArr[13] ? j17 + b36.f.e(13, this.f112373s) : j17;
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
                this.f112361d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f112362e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f112363f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f112364g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112365h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112366i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112367m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112368n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112369o = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.rg rgVar3 = new bw5.rg();
                    if (bArr != null && bArr.length > 0) {
                        rgVar3.mo11468x92b714fd(bArr);
                    }
                    this.f112370p = rgVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.tw twVar3 = new bw5.tw();
                    if (bArr2 != null && bArr2.length > 0) {
                        twVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f112371q = twVar3;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    bw5.qg qgVar3 = new bw5.qg();
                    if (bArr3 != null && bArr3.length > 0) {
                        qgVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f112372r = qgVar3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f112373s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}

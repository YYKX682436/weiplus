package bw5;

/* loaded from: classes2.dex */
public class zq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.he f117647d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.sc f117648e;

    /* renamed from: f, reason: collision with root package name */
    public long f117649f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117650g;

    /* renamed from: h, reason: collision with root package name */
    public int f117651h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f117652i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f117653m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f117655o;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f117657q;

    /* renamed from: s, reason: collision with root package name */
    public int f117659s;

    /* renamed from: t, reason: collision with root package name */
    public int f117660t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.sp f117661u;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f117654n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f117656p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f117658r = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f117662v = new boolean[16];

    static {
        new bw5.zq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zq)) {
            return false;
        }
        bw5.zq zqVar = (bw5.zq) fVar;
        return n51.f.a(this.f117647d, zqVar.f117647d) && n51.f.a(this.f117648e, zqVar.f117648e) && n51.f.a(java.lang.Long.valueOf(this.f117649f), java.lang.Long.valueOf(zqVar.f117649f)) && n51.f.a(this.f117650g, zqVar.f117650g) && n51.f.a(java.lang.Integer.valueOf(this.f117651h), java.lang.Integer.valueOf(zqVar.f117651h)) && n51.f.a(this.f117652i, zqVar.f117652i) && n51.f.a(this.f117653m, zqVar.f117653m) && n51.f.a(this.f117654n, zqVar.f117654n) && n51.f.a(this.f117655o, zqVar.f117655o) && n51.f.a(this.f117656p, zqVar.f117656p) && n51.f.a(this.f117657q, zqVar.f117657q) && n51.f.a(this.f117658r, zqVar.f117658r) && n51.f.a(java.lang.Integer.valueOf(this.f117659s), java.lang.Integer.valueOf(zqVar.f117659s)) && n51.f.a(java.lang.Integer.valueOf(this.f117660t), java.lang.Integer.valueOf(zqVar.f117660t)) && n51.f.a(this.f117661u, zqVar.f117661u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.zq();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f117662v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f117647d;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f117647d.mo75956x3d5d1f78(fVar);
            }
            bw5.sc scVar = this.f117648e;
            if (scVar != null && zArr[2]) {
                fVar.i(2, scVar.mo75928xcd1e8d8());
                this.f117648e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f117649f);
            }
            java.lang.String str = this.f117650g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f117651h);
            }
            java.lang.String str2 = this.f117652i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f117653m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            fVar.g(8, 1, this.f117654n);
            java.lang.String str4 = this.f117655o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            fVar.g(10, 8, this.f117656p);
            java.lang.String str5 = this.f117657q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            fVar.g(12, 1, this.f117658r);
            if (zArr[13]) {
                fVar.e(13, this.f117659s);
            }
            if (zArr[14]) {
                fVar.e(14, this.f117660t);
            }
            bw5.sp spVar = this.f117661u;
            if (spVar != null && zArr[15]) {
                fVar.i(15, spVar.mo75928xcd1e8d8());
                this.f117661u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f117647d;
            if (heVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, heVar2.mo75928xcd1e8d8()) + 0;
            }
            bw5.sc scVar2 = this.f117648e;
            if (scVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, scVar2.mo75928xcd1e8d8());
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f117649f);
            }
            java.lang.String str6 = this.f117650g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f117651h);
            }
            java.lang.String str7 = this.f117652i;
            if (str7 != null && zArr[6]) {
                i18 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f117653m;
            if (str8 != null && zArr[7]) {
                i18 += b36.f.j(7, str8);
            }
            int g17 = i18 + b36.f.g(8, 1, this.f117654n);
            java.lang.String str9 = this.f117655o;
            if (str9 != null && zArr[9]) {
                g17 += b36.f.j(9, str9);
            }
            int g18 = g17 + b36.f.g(10, 8, this.f117656p);
            java.lang.String str10 = this.f117657q;
            if (str10 != null && zArr[11]) {
                g18 += b36.f.j(11, str10);
            }
            int g19 = g18 + b36.f.g(12, 1, this.f117658r);
            if (zArr[13]) {
                g19 += b36.f.e(13, this.f117659s);
            }
            if (zArr[14]) {
                g19 += b36.f.e(14, this.f117660t);
            }
            bw5.sp spVar2 = this.f117661u;
            return (spVar2 == null || !zArr[15]) ? g19 : g19 + b36.f.i(15, spVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f117654n.clear();
            this.f117656p.clear();
            this.f117658r.clear();
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
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    this.f117647d = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.sc scVar3 = new bw5.sc();
                    if (bArr2 != null && bArr2.length > 0) {
                        scVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f117648e = scVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f117649f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f117650g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f117651h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f117652i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f117653m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f117654n.add(aVar2.k(intValue));
                zArr[8] = true;
                return 0;
            case 9:
                this.f117655o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.aw awVar = new bw5.aw();
                    if (bArr3 != null && bArr3.length > 0) {
                        awVar.mo11468x92b714fd(bArr3);
                    }
                    this.f117656p.add(awVar);
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f117657q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f117658r.add(aVar2.k(intValue));
                zArr[12] = true;
                return 0;
            case 13:
                this.f117659s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f117660t = aVar2.g(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.sp spVar3 = new bw5.sp();
                    if (bArr4 != null && bArr4.length > 0) {
                        spVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f117661u = spVar3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.zq) super.mo11468x92b714fd(bArr);
    }
}

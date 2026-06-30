package bw5;

/* loaded from: classes9.dex */
public class n2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f111990d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f111992f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f111993g;

    /* renamed from: h, reason: collision with root package name */
    public int f111994h;

    /* renamed from: i, reason: collision with root package name */
    public long f111995i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f111996m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f111997n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f111998o;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f111991e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f111999p = new boolean[11];

    static {
        new bw5.n2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n2 mo11468x92b714fd(byte[] bArr) {
        return (bw5.n2) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n2)) {
            return false;
        }
        bw5.n2 n2Var = (bw5.n2) fVar;
        return n51.f.a(this.f76494x2de60e5e, n2Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f111990d), java.lang.Integer.valueOf(n2Var.f111990d)) && n51.f.a(this.f111991e, n2Var.f111991e) && n51.f.a(this.f111992f, n2Var.f111992f) && n51.f.a(this.f111993g, n2Var.f111993g) && n51.f.a(java.lang.Integer.valueOf(this.f111994h), java.lang.Integer.valueOf(n2Var.f111994h)) && n51.f.a(java.lang.Long.valueOf(this.f111995i), java.lang.Long.valueOf(n2Var.f111995i)) && n51.f.a(this.f111996m, n2Var.f111996m) && n51.f.a(this.f111997n, n2Var.f111997n) && n51.f.a(this.f111998o, n2Var.f111998o);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f111999p[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.n2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f111999p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111990d);
            }
            fVar.g(3, 8, this.f111991e);
            java.lang.String str = this.f111992f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f111993g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f111994h);
            }
            if (zArr[7]) {
                fVar.h(7, this.f111995i);
            }
            java.lang.String str3 = this.f111996m;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f111997n;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            r45.cu5 cu5Var = this.f111998o;
            if (cu5Var != null && zArr[10]) {
                fVar.i(10, cu5Var.mo75928xcd1e8d8());
                this.f111998o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f111990d);
            }
            int g17 = i18 + b36.f.g(3, 8, this.f111991e);
            java.lang.String str5 = this.f111992f;
            if (str5 != null && zArr[4]) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f111993g;
            if (str6 != null && zArr[5]) {
                g17 += b36.f.j(5, str6);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f111994h);
            }
            if (zArr[7]) {
                g17 += b36.f.h(7, this.f111995i);
            }
            java.lang.String str7 = this.f111996m;
            if (str7 != null && zArr[8]) {
                g17 += b36.f.j(8, str7);
            }
            java.lang.String str8 = this.f111997n;
            if (str8 != null && zArr[9]) {
                g17 += b36.f.j(9, str8);
            }
            r45.cu5 cu5Var2 = this.f111998o;
            return (cu5Var2 == null || !zArr[10]) ? g17 : g17 + b36.f.i(10, cu5Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f111991e.clear();
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
                    this.f76494x2de60e5e = heVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f111990d = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.f4 f4Var = new bw5.f4();
                    if (bArr2 != null && bArr2.length > 0) {
                        f4Var.mo11468x92b714fd(bArr2);
                    }
                    this.f111991e.add(f4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f111992f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f111993g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f111994h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f111995i = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f111996m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f111997n = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    this.f111998o = cu5Var3;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f111999p[1] = true;
        return this;
    }
}

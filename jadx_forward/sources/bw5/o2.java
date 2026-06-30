package bw5;

/* loaded from: classes9.dex */
public class o2 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f112431d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f112433f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f112434g;

    /* renamed from: h, reason: collision with root package name */
    public int f112435h;

    /* renamed from: i, reason: collision with root package name */
    public long f112436i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f112437m;

    /* renamed from: n, reason: collision with root package name */
    public int f112438n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f112439o;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f112432e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f112440p = new boolean[11];

    static {
        new bw5.o2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o2)) {
            return false;
        }
        bw5.o2 o2Var = (bw5.o2) fVar;
        return n51.f.a(this.f76494x2de60e5e, o2Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f112431d), java.lang.Integer.valueOf(o2Var.f112431d)) && n51.f.a(this.f112432e, o2Var.f112432e) && n51.f.a(this.f112433f, o2Var.f112433f) && n51.f.a(this.f112434g, o2Var.f112434g) && n51.f.a(java.lang.Integer.valueOf(this.f112435h), java.lang.Integer.valueOf(o2Var.f112435h)) && n51.f.a(java.lang.Long.valueOf(this.f112436i), java.lang.Long.valueOf(o2Var.f112436i)) && n51.f.a(this.f112437m, o2Var.f112437m) && n51.f.a(java.lang.Integer.valueOf(this.f112438n), java.lang.Integer.valueOf(o2Var.f112438n)) && n51.f.a(this.f112439o, o2Var.f112439o);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: getBaseRequest */
    public r45.he mo11508xa452ad48() {
        return this.f112440p[1] ? this.f76494x2de60e5e : new r45.he();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f112440p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null && zArr[1]) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f112431d);
            }
            fVar.g(3, 8, this.f112432e);
            java.lang.String str = this.f112433f;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f112434g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            if (zArr[6]) {
                fVar.e(6, this.f112435h);
            }
            if (zArr[7]) {
                fVar.h(7, this.f112436i);
            }
            java.lang.String str3 = this.f112437m;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[9]) {
                fVar.e(9, this.f112438n);
            }
            r45.cu5 cu5Var = this.f112439o;
            if (cu5Var != null && zArr[10]) {
                fVar.i(10, cu5Var.mo75928xcd1e8d8());
                this.f112439o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            if (heVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f112431d);
            }
            int g17 = i18 + b36.f.g(3, 8, this.f112432e);
            java.lang.String str4 = this.f112433f;
            if (str4 != null && zArr[4]) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f112434g;
            if (str5 != null && zArr[5]) {
                g17 += b36.f.j(5, str5);
            }
            if (zArr[6]) {
                g17 += b36.f.e(6, this.f112435h);
            }
            if (zArr[7]) {
                g17 += b36.f.h(7, this.f112436i);
            }
            java.lang.String str6 = this.f112437m;
            if (str6 != null && zArr[8]) {
                g17 += b36.f.j(8, str6);
            }
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f112438n);
            }
            r45.cu5 cu5Var2 = this.f112439o;
            return (cu5Var2 == null || !zArr[10]) ? g17 : g17 + b36.f.i(10, cu5Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f112432e.clear();
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
                this.f112431d = aVar2.g(intValue);
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
                    this.f112432e.add(f4Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f112433f = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f112434g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f112435h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f112436i = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f112437m = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f112438n = aVar2.g(intValue);
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
                    this.f112439o = cu5Var3;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.o2) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.mr5, r45.my3
    /* renamed from: setBaseRequest */
    public r45.my3 mo11509x3ab820bc(r45.he heVar) {
        this.f76494x2de60e5e = heVar;
        this.f112440p[1] = true;
        return this;
    }
}

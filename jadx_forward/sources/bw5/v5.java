package bw5;

/* loaded from: classes8.dex */
public class v5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.t5 f115679d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115681f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f115682g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115683h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f115684i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f115685m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.x7 f115686n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f115687o;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f115680e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f115688p = new boolean[11];

    static {
        new bw5.v5();
    }

    public bw5.t5 b() {
        return this.f115688p[1] ? this.f115679d : new bw5.t5();
    }

    public bw5.x7 c() {
        return this.f115688p[8] ? this.f115686n : new bw5.x7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v5)) {
            return false;
        }
        bw5.v5 v5Var = (bw5.v5) fVar;
        return n51.f.a(this.f115679d, v5Var.f115679d) && n51.f.a(this.f115680e, v5Var.f115680e) && n51.f.a(this.f115681f, v5Var.f115681f) && n51.f.a(this.f115682g, v5Var.f115682g) && n51.f.a(this.f115683h, v5Var.f115683h) && n51.f.a(this.f115684i, v5Var.f115684i) && n51.f.a(java.lang.Boolean.valueOf(this.f115685m), java.lang.Boolean.valueOf(v5Var.f115685m)) && n51.f.a(this.f115686n, v5Var.f115686n) && n51.f.a(java.lang.Boolean.valueOf(this.f115687o), java.lang.Boolean.valueOf(v5Var.f115687o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.v5 mo11468x92b714fd(byte[] bArr) {
        return (bw5.v5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115680e;
        int i18 = 0;
        boolean[] zArr = this.f115688p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.t5 t5Var = this.f115679d;
            if (t5Var != null && zArr[1]) {
                fVar.i(1, t5Var.mo75928xcd1e8d8());
                this.f115679d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f115681f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f115682g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f115683h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f115684i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            if (zArr[7]) {
                fVar.a(7, this.f115685m);
            }
            bw5.x7 x7Var = this.f115686n;
            if (x7Var != null && zArr[8]) {
                fVar.i(8, x7Var.mo75928xcd1e8d8());
                this.f115686n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f115687o);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.t5 t5Var2 = this.f115679d;
            if (t5Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, t5Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            java.lang.String str5 = this.f115681f;
            if (str5 != null && zArr[3]) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f115682g;
            if (str6 != null && zArr[4]) {
                g17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f115683h;
            if (str7 != null && zArr[5]) {
                g17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f115684i;
            if (str8 != null && zArr[6]) {
                g17 += b36.f.j(6, str8);
            }
            if (zArr[7]) {
                g17 += b36.f.a(7, this.f115685m);
            }
            bw5.x7 x7Var2 = this.f115686n;
            if (x7Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, x7Var2.mo75928xcd1e8d8());
            }
            return zArr[10] ? g17 + b36.f.a(10, this.f115687o) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                    bw5.t5 t5Var3 = new bw5.t5();
                    if (bArr != null && bArr.length > 0) {
                        t5Var3.mo11468x92b714fd(bArr);
                    }
                    this.f115679d = t5Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.u5 u5Var = new bw5.u5();
                    if (bArr2 != null && bArr2.length > 0) {
                        u5Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(u5Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f115681f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f115682g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115683h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115684i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115685m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr3 != null && bArr3.length > 0) {
                        x7Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f115686n = x7Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
            default:
                return -1;
            case 10:
                this.f115687o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
        }
    }
}

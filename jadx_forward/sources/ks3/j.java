package ks3;

/* loaded from: classes8.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f393223d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393224e;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f393229m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f393230n;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f393225f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f393226g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f393227h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f393228i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f393231o = 20;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.j)) {
            return false;
        }
        ks3.j jVar = (ks3.j) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f393223d), java.lang.Integer.valueOf(jVar.f393223d)) && n51.f.a(this.f393224e, jVar.f393224e) && n51.f.a(this.f393225f, jVar.f393225f) && n51.f.a(this.f393226g, jVar.f393226g) && n51.f.a(this.f393227h, jVar.f393227h) && n51.f.a(this.f393228i, jVar.f393228i) && n51.f.a(this.f393229m, jVar.f393229m) && n51.f.a(this.f393230n, jVar.f393230n) && n51.f.a(java.lang.Integer.valueOf(this.f393231o), java.lang.Integer.valueOf(jVar.f393231o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f393223d);
            java.lang.String str = this.f393224e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f393225f);
            fVar.g(4, 8, this.f393226g);
            fVar.g(5, 8, this.f393227h);
            fVar.g(6, 8, this.f393228i);
            java.lang.String str2 = this.f393229m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f393230n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            fVar.e(9, this.f393231o);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f393223d) + 0;
            java.lang.String str4 = this.f393224e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            int g17 = e17 + b36.f.g(3, 8, this.f393225f) + b36.f.g(4, 8, this.f393226g) + b36.f.g(5, 8, this.f393227h) + b36.f.g(6, 8, this.f393228i);
            java.lang.String str5 = this.f393229m;
            if (str5 != null) {
                g17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f393230n;
            if (str6 != null) {
                g17 += b36.f.j(8, str6);
            }
            return g17 + b36.f.e(9, this.f393231o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f393225f.clear();
            this.f393226g.clear();
            this.f393227h.clear();
            this.f393228i.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        ks3.j jVar = (ks3.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                jVar.f393223d = aVar2.g(intValue);
                return 0;
            case 2:
                jVar.f393224e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ks3.u uVar = new ks3.u();
                    if (bArr2 != null && bArr2.length > 0) {
                        uVar.mo11468x92b714fd(bArr2);
                    }
                    jVar.f393225f.add(uVar);
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    ks3.u uVar2 = new ks3.u();
                    if (bArr3 != null && bArr3.length > 0) {
                        uVar2.mo11468x92b714fd(bArr3);
                    }
                    jVar.f393226g.add(uVar2);
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    ks3.u uVar3 = new ks3.u();
                    if (bArr4 != null && bArr4.length > 0) {
                        uVar3.mo11468x92b714fd(bArr4);
                    }
                    jVar.f393227h.add(uVar3);
                }
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    ks3.v0 v0Var = new ks3.v0();
                    if (bArr5 != null && bArr5.length > 0) {
                        v0Var.mo11468x92b714fd(bArr5);
                    }
                    jVar.f393228i.add(v0Var);
                }
                return 0;
            case 7:
                jVar.f393229m = aVar2.k(intValue);
                return 0;
            case 8:
                jVar.f393230n = aVar2.k(intValue);
                return 0;
            case 9:
                jVar.f393231o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

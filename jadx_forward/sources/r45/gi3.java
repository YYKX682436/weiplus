package r45;

/* loaded from: classes8.dex */
public class gi3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f456811d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456812e;

    /* renamed from: f, reason: collision with root package name */
    public int f456813f;

    /* renamed from: h, reason: collision with root package name */
    public int f456815h;

    /* renamed from: m, reason: collision with root package name */
    public int f456817m;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f456814g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f456816i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gi3)) {
            return false;
        }
        r45.gi3 gi3Var = (r45.gi3) fVar;
        return n51.f.a(this.f76494x2de60e5e, gi3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f456811d), java.lang.Integer.valueOf(gi3Var.f456811d)) && n51.f.a(this.f456812e, gi3Var.f456812e) && n51.f.a(java.lang.Integer.valueOf(this.f456813f), java.lang.Integer.valueOf(gi3Var.f456813f)) && n51.f.a(this.f456814g, gi3Var.f456814g) && n51.f.a(java.lang.Integer.valueOf(this.f456815h), java.lang.Integer.valueOf(gi3Var.f456815h)) && n51.f.a(this.f456816i, gi3Var.f456816i) && n51.f.a(java.lang.Integer.valueOf(this.f456817m), java.lang.Integer.valueOf(gi3Var.f456817m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f456811d);
            java.lang.String str = this.f456812e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f456813f);
            fVar.g(5, 8, this.f456814g);
            fVar.e(6, this.f456815h);
            fVar.g(7, 8, this.f456816i);
            fVar.e(8, this.f456817m);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f456811d);
            java.lang.String str2 = this.f456812e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.e(4, this.f456813f) + b36.f.g(5, 8, this.f456814g) + b36.f.e(6, this.f456815h) + b36.f.g(7, 8, this.f456816i) + b36.f.e(8, this.f456817m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456814g.clear();
            this.f456816i.clear();
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
        r45.gi3 gi3Var = (r45.gi3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    gi3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                gi3Var.f456811d = aVar2.g(intValue);
                return 0;
            case 3:
                gi3Var.f456812e = aVar2.k(intValue);
                return 0;
            case 4:
                gi3Var.f456813f = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.en4 en4Var = new r45.en4();
                    if (bArr3 != null && bArr3.length > 0) {
                        en4Var.mo11468x92b714fd(bArr3);
                    }
                    gi3Var.f456814g.add(en4Var);
                }
                return 0;
            case 6:
                gi3Var.f456815h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ie4 ie4Var = new r45.ie4();
                    if (bArr4 != null && bArr4.length > 0) {
                        ie4Var.mo11468x92b714fd(bArr4);
                    }
                    gi3Var.f456816i.add(ie4Var);
                }
                return 0;
            case 8:
                gi3Var.f456817m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class sh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467247d;

    /* renamed from: e, reason: collision with root package name */
    public int f467248e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f467249f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d64 f467250g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467251h;

    /* renamed from: i, reason: collision with root package name */
    public int f467252i;

    /* renamed from: m, reason: collision with root package name */
    public int f467253m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f467254n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public int f467255o;

    /* renamed from: p, reason: collision with root package name */
    public int f467256p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sh3)) {
            return false;
        }
        r45.sh3 sh3Var = (r45.sh3) fVar;
        return n51.f.a(this.f76494x2de60e5e, sh3Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f467247d), java.lang.Integer.valueOf(sh3Var.f467247d)) && n51.f.a(java.lang.Integer.valueOf(this.f467248e), java.lang.Integer.valueOf(sh3Var.f467248e)) && n51.f.a(this.f467249f, sh3Var.f467249f) && n51.f.a(this.f467250g, sh3Var.f467250g) && n51.f.a(this.f467251h, sh3Var.f467251h) && n51.f.a(java.lang.Integer.valueOf(this.f467252i), java.lang.Integer.valueOf(sh3Var.f467252i)) && n51.f.a(java.lang.Integer.valueOf(this.f467253m), java.lang.Integer.valueOf(sh3Var.f467253m)) && n51.f.a(this.f467254n, sh3Var.f467254n) && n51.f.a(java.lang.Integer.valueOf(this.f467255o), java.lang.Integer.valueOf(sh3Var.f467255o)) && n51.f.a(java.lang.Integer.valueOf(this.f467256p), java.lang.Integer.valueOf(sh3Var.f467256p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467254n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467247d);
            fVar.e(3, this.f467248e);
            r45.cu5 cu5Var = this.f467249f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f467249f.mo75956x3d5d1f78(fVar);
            }
            r45.d64 d64Var = this.f467250g;
            if (d64Var != null) {
                fVar.i(5, d64Var.mo75928xcd1e8d8());
                this.f467250g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f467251h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f467252i);
            fVar.e(8, this.f467253m);
            fVar.g(11, 8, linkedList);
            fVar.e(12, this.f467255o);
            fVar.e(14, this.f467256p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467247d) + b36.f.e(3, this.f467248e);
            r45.cu5 cu5Var2 = this.f467249f;
            if (cu5Var2 != null) {
                i18 += b36.f.i(4, cu5Var2.mo75928xcd1e8d8());
            }
            r45.d64 d64Var2 = this.f467250g;
            if (d64Var2 != null) {
                i18 += b36.f.i(5, d64Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f467251h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.e(7, this.f467252i) + b36.f.e(8, this.f467253m) + b36.f.g(11, 8, linkedList) + b36.f.e(12, this.f467255o) + b36.f.e(14, this.f467256p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.sh3 sh3Var = (r45.sh3) objArr[1];
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
                    sh3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                sh3Var.f467247d = aVar2.g(intValue);
                return 0;
            case 3:
                sh3Var.f467248e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var3.b(bArr3);
                    }
                    sh3Var.f467249f = cu5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.d64 d64Var3 = new r45.d64();
                    if (bArr4 != null && bArr4.length > 0) {
                        d64Var3.mo11468x92b714fd(bArr4);
                    }
                    sh3Var.f467250g = d64Var3;
                }
                return 0;
            case 6:
                sh3Var.f467251h = aVar2.k(intValue);
                return 0;
            case 7:
                sh3Var.f467252i = aVar2.g(intValue);
                return 0;
            case 8:
                sh3Var.f467253m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            case 13:
            default:
                return -1;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.e85 e85Var = new r45.e85();
                    if (bArr5 != null && bArr5.length > 0) {
                        e85Var.mo11468x92b714fd(bArr5);
                    }
                    sh3Var.f467254n.add(e85Var);
                }
                return 0;
            case 12:
                sh3Var.f467255o = aVar2.g(intValue);
                return 0;
            case 14:
                sh3Var.f467256p = aVar2.g(intValue);
                return 0;
        }
    }
}

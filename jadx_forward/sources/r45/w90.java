package r45;

/* loaded from: classes4.dex */
public class w90 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.du5 f470511d;

    /* renamed from: e, reason: collision with root package name */
    public int f470512e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f470513f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f470514g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f470515h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470516i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470517m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w90)) {
            return false;
        }
        r45.w90 w90Var = (r45.w90) fVar;
        return n51.f.a(this.f76494x2de60e5e, w90Var.f76494x2de60e5e) && n51.f.a(this.f470511d, w90Var.f470511d) && n51.f.a(java.lang.Integer.valueOf(this.f470512e), java.lang.Integer.valueOf(w90Var.f470512e)) && n51.f.a(this.f470513f, w90Var.f470513f) && n51.f.a(java.lang.Integer.valueOf(this.f470514g), java.lang.Integer.valueOf(w90Var.f470514g)) && n51.f.a(this.f470515h, w90Var.f470515h) && n51.f.a(this.f470516i, w90Var.f470516i) && n51.f.a(this.f470517m, w90Var.f470517m);
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
            r45.du5 du5Var = this.f470511d;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f470511d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f470512e);
            fVar.g(4, 8, this.f470513f);
            fVar.e(5, this.f470514g);
            r45.cu5 cu5Var = this.f470515h;
            if (cu5Var != null) {
                fVar.i(6, cu5Var.mo75928xcd1e8d8());
                this.f470515h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470516i;
            if (str != null) {
                fVar.j(7, str);
            }
            java.lang.String str2 = this.f470517m;
            if (str2 != null) {
                fVar.j(8, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.du5 du5Var2 = this.f470511d;
            if (du5Var2 != null) {
                i18 += b36.f.i(2, du5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f470512e) + b36.f.g(4, 8, this.f470513f) + b36.f.e(5, this.f470514g);
            r45.cu5 cu5Var2 = this.f470515h;
            if (cu5Var2 != null) {
                e17 += b36.f.i(6, cu5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f470516i;
            if (str3 != null) {
                e17 += b36.f.j(7, str3);
            }
            java.lang.String str4 = this.f470517m;
            return str4 != null ? e17 + b36.f.j(8, str4) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470513f.clear();
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
        r45.w90 w90Var = (r45.w90) objArr[1];
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
                    w90Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    w90Var.f470511d = du5Var3;
                }
                return 0;
            case 3:
                w90Var.f470512e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.kk4 kk4Var = new r45.kk4();
                    if (bArr4 != null && bArr4.length > 0) {
                        kk4Var.mo11468x92b714fd(bArr4);
                    }
                    w90Var.f470513f.add(kk4Var);
                }
                return 0;
            case 5:
                w90Var.f470514g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var3.b(bArr5);
                    }
                    w90Var.f470515h = cu5Var3;
                }
                return 0;
            case 7:
                w90Var.f470516i = aVar2.k(intValue);
                return 0;
            case 8:
                w90Var.f470517m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

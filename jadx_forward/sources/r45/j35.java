package r45;

/* loaded from: classes11.dex */
public class j35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f459066d;

    /* renamed from: e, reason: collision with root package name */
    public int f459067e;

    /* renamed from: g, reason: collision with root package name */
    public int f459069g;

    /* renamed from: h, reason: collision with root package name */
    public int f459070h;

    /* renamed from: i, reason: collision with root package name */
    public r45.bs5 f459071i;

    /* renamed from: m, reason: collision with root package name */
    public int f459072m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f459074o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f459068f = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f459073n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f459075p = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j35)) {
            return false;
        }
        r45.j35 j35Var = (r45.j35) fVar;
        return n51.f.a(this.f459066d, j35Var.f459066d) && n51.f.a(java.lang.Integer.valueOf(this.f459067e), java.lang.Integer.valueOf(j35Var.f459067e)) && n51.f.a(this.f459068f, j35Var.f459068f) && n51.f.a(java.lang.Integer.valueOf(this.f459069g), java.lang.Integer.valueOf(j35Var.f459069g)) && n51.f.a(java.lang.Integer.valueOf(this.f459070h), java.lang.Integer.valueOf(j35Var.f459070h)) && n51.f.a(this.f459071i, j35Var.f459071i) && n51.f.a(java.lang.Integer.valueOf(this.f459072m), java.lang.Integer.valueOf(j35Var.f459072m)) && n51.f.a(this.f459073n, j35Var.f459073n) && n51.f.a(java.lang.Boolean.valueOf(this.f459074o), java.lang.Boolean.valueOf(j35Var.f459074o)) && n51.f.a(this.f459075p, j35Var.f459075p);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459075p;
        java.util.LinkedList linkedList2 = this.f459073n;
        java.util.LinkedList linkedList3 = this.f459068f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f459066d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f459067e);
            fVar.g(3, 8, linkedList3);
            fVar.e(4, this.f459069g);
            fVar.e(5, this.f459070h);
            r45.bs5 bs5Var = this.f459071i;
            if (bs5Var != null) {
                fVar.i(6, bs5Var.mo75928xcd1e8d8());
                this.f459071i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f459072m);
            fVar.g(8, 8, linkedList2);
            fVar.a(9, this.f459074o);
            fVar.g(10, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f459066d;
            int j17 = (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.e(2, this.f459067e) + b36.f.g(3, 8, linkedList3) + b36.f.e(4, this.f459069g) + b36.f.e(5, this.f459070h);
            r45.bs5 bs5Var2 = this.f459071i;
            if (bs5Var2 != null) {
                j17 += b36.f.i(6, bs5Var2.mo75928xcd1e8d8());
            }
            return j17 + b36.f.e(7, this.f459072m) + b36.f.g(8, 8, linkedList2) + b36.f.a(9, this.f459074o) + b36.f.g(10, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.j35 j35Var = (r45.j35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                j35Var.f459066d = aVar2.k(intValue);
                return 0;
            case 2:
                j35Var.f459067e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.i35 i35Var = new r45.i35();
                    if (bArr2 != null && bArr2.length > 0) {
                        i35Var.mo11468x92b714fd(bArr2);
                    }
                    j35Var.f459068f.add(i35Var);
                }
                return 0;
            case 4:
                j35Var.f459069g = aVar2.g(intValue);
                return 0;
            case 5:
                j35Var.f459070h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.bs5 bs5Var3 = new r45.bs5();
                    if (bArr3 != null && bArr3.length > 0) {
                        bs5Var3.mo11468x92b714fd(bArr3);
                    }
                    j35Var.f459071i = bs5Var3;
                }
                return 0;
            case 7:
                j35Var.f459072m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.h35 h35Var = new r45.h35();
                    if (bArr4 != null && bArr4.length > 0) {
                        h35Var.mo11468x92b714fd(bArr4);
                    }
                    j35Var.f459073n.add(h35Var);
                }
                return 0;
            case 9:
                j35Var.f459074o = aVar2.c(intValue);
                return 0;
            case 10:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j28.get(i28);
                    r45.bs5 bs5Var4 = new r45.bs5();
                    if (bArr5 != null && bArr5.length > 0) {
                        bs5Var4.mo11468x92b714fd(bArr5);
                    }
                    j35Var.f459075p.add(bs5Var4);
                }
                return 0;
            default:
                return -1;
        }
    }
}

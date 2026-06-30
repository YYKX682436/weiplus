package r45;

/* loaded from: classes15.dex */
public class lw3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f461409d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f461410e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f461411f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f461412g = -1;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f461413h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public int f461414i = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f461415m = -1;

    /* renamed from: n, reason: collision with root package name */
    public long f461416n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f461417o = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lw3)) {
            return false;
        }
        r45.lw3 lw3Var = (r45.lw3) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f461409d), java.lang.Long.valueOf(lw3Var.f461409d)) && n51.f.a(java.lang.Long.valueOf(this.f461410e), java.lang.Long.valueOf(lw3Var.f461410e)) && n51.f.a(this.f461411f, lw3Var.f461411f) && n51.f.a(java.lang.Integer.valueOf(this.f461412g), java.lang.Integer.valueOf(lw3Var.f461412g)) && n51.f.a(this.f461413h, lw3Var.f461413h) && n51.f.a(java.lang.Integer.valueOf(this.f461414i), java.lang.Integer.valueOf(lw3Var.f461414i)) && n51.f.a(java.lang.Integer.valueOf(this.f461415m), java.lang.Integer.valueOf(lw3Var.f461415m)) && n51.f.a(java.lang.Long.valueOf(this.f461416n), java.lang.Long.valueOf(lw3Var.f461416n)) && n51.f.a(java.lang.Boolean.valueOf(this.f461417o), java.lang.Boolean.valueOf(lw3Var.f461417o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461413h;
        java.util.LinkedList linkedList2 = this.f461411f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f461409d);
            fVar.h(2, this.f461410e);
            fVar.g(3, 8, linkedList2);
            fVar.e(4, this.f461412g);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f461414i);
            fVar.e(7, this.f461415m);
            fVar.h(8, this.f461416n);
            fVar.a(9, this.f461417o);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f461409d) + 0 + b36.f.h(2, this.f461410e) + b36.f.g(3, 8, linkedList2) + b36.f.e(4, this.f461412g) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f461414i) + b36.f.e(7, this.f461415m) + b36.f.h(8, this.f461416n) + b36.f.a(9, this.f461417o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.lw3 lw3Var = (r45.lw3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                lw3Var.f461409d = aVar2.i(intValue);
                return 0;
            case 2:
                lw3Var.f461410e = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.c45 c45Var = new r45.c45();
                    if (bArr2 != null && bArr2.length > 0) {
                        c45Var.mo11468x92b714fd(bArr2);
                    }
                    lw3Var.f461411f.add(c45Var);
                }
                return 0;
            case 4:
                lw3Var.f461412g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.w35 w35Var = new r45.w35();
                    if (bArr3 != null && bArr3.length > 0) {
                        w35Var.mo11468x92b714fd(bArr3);
                    }
                    lw3Var.f461413h.add(w35Var);
                }
                return 0;
            case 6:
                lw3Var.f461414i = aVar2.g(intValue);
                return 0;
            case 7:
                lw3Var.f461415m = aVar2.g(intValue);
                return 0;
            case 8:
                lw3Var.f461416n = aVar2.i(intValue);
                return 0;
            case 9:
                lw3Var.f461417o = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

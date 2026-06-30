package r45;

/* loaded from: classes12.dex */
public class j37 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f459078d;

    /* renamed from: e, reason: collision with root package name */
    public int f459079e;

    /* renamed from: g, reason: collision with root package name */
    public int f459081g;

    /* renamed from: i, reason: collision with root package name */
    public long f459083i;

    /* renamed from: m, reason: collision with root package name */
    public int f459084m;

    /* renamed from: n, reason: collision with root package name */
    public int f459085n;

    /* renamed from: p, reason: collision with root package name */
    public int f459087p;

    /* renamed from: q, reason: collision with root package name */
    public int f459088q;

    /* renamed from: r, reason: collision with root package name */
    public r45.d37 f459089r;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f459080f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f459082h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f459086o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.j37)) {
            return false;
        }
        r45.j37 j37Var = (r45.j37) fVar;
        return n51.f.a(this.f76492x92037252, j37Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f459078d), java.lang.Integer.valueOf(j37Var.f459078d)) && n51.f.a(java.lang.Integer.valueOf(this.f459079e), java.lang.Integer.valueOf(j37Var.f459079e)) && n51.f.a(this.f459080f, j37Var.f459080f) && n51.f.a(java.lang.Integer.valueOf(this.f459081g), java.lang.Integer.valueOf(j37Var.f459081g)) && n51.f.a(this.f459082h, j37Var.f459082h) && n51.f.a(java.lang.Long.valueOf(this.f459083i), java.lang.Long.valueOf(j37Var.f459083i)) && n51.f.a(java.lang.Integer.valueOf(this.f459084m), java.lang.Integer.valueOf(j37Var.f459084m)) && n51.f.a(java.lang.Integer.valueOf(this.f459085n), java.lang.Integer.valueOf(j37Var.f459085n)) && n51.f.a(this.f459086o, j37Var.f459086o) && n51.f.a(java.lang.Integer.valueOf(this.f459087p), java.lang.Integer.valueOf(j37Var.f459087p)) && n51.f.a(java.lang.Integer.valueOf(this.f459088q), java.lang.Integer.valueOf(j37Var.f459088q)) && n51.f.a(this.f459089r, j37Var.f459089r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f459086o;
        java.util.LinkedList linkedList2 = this.f459082h;
        java.util.LinkedList linkedList3 = this.f459080f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f459078d);
            fVar.e(3, this.f459079e);
            fVar.g(4, 8, linkedList3);
            fVar.e(5, this.f459081g);
            fVar.g(6, 8, linkedList2);
            fVar.h(7, this.f459083i);
            fVar.e(8, this.f459084m);
            fVar.e(9, this.f459085n);
            fVar.g(10, 8, linkedList);
            fVar.e(11, this.f459087p);
            fVar.e(12, this.f459088q);
            r45.d37 d37Var = this.f459089r;
            if (d37Var != null) {
                fVar.i(13, d37Var.mo75928xcd1e8d8());
                this.f459089r.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f459078d) + b36.f.e(3, this.f459079e) + b36.f.g(4, 8, linkedList3) + b36.f.e(5, this.f459081g) + b36.f.g(6, 8, linkedList2) + b36.f.h(7, this.f459083i) + b36.f.e(8, this.f459084m) + b36.f.e(9, this.f459085n) + b36.f.g(10, 8, linkedList) + b36.f.e(11, this.f459087p) + b36.f.e(12, this.f459088q);
            r45.d37 d37Var2 = this.f459089r;
            return d37Var2 != null ? i18 + b36.f.i(13, d37Var2.mo75928xcd1e8d8()) : i18;
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
        r45.j37 j37Var = (r45.j37) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    j37Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                j37Var.f459078d = aVar2.g(intValue);
                return 0;
            case 3:
                j37Var.f459079e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.b27 b27Var = new r45.b27();
                    if (bArr3 != null && bArr3.length > 0) {
                        b27Var.mo11468x92b714fd(bArr3);
                    }
                    j37Var.f459080f.add(b27Var);
                }
                return 0;
            case 5:
                j37Var.f459081g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.b27 b27Var2 = new r45.b27();
                    if (bArr4 != null && bArr4.length > 0) {
                        b27Var2.mo11468x92b714fd(bArr4);
                    }
                    j37Var.f459082h.add(b27Var2);
                }
                return 0;
            case 7:
                j37Var.f459083i = aVar2.i(intValue);
                return 0;
            case 8:
                j37Var.f459084m = aVar2.g(intValue);
                return 0;
            case 9:
                j37Var.f459085n = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.b27 b27Var3 = new r45.b27();
                    if (bArr5 != null && bArr5.length > 0) {
                        b27Var3.mo11468x92b714fd(bArr5);
                    }
                    j37Var.f459086o.add(b27Var3);
                }
                return 0;
            case 11:
                j37Var.f459087p = aVar2.g(intValue);
                return 0;
            case 12:
                j37Var.f459088q = aVar2.g(intValue);
                return 0;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.d37 d37Var3 = new r45.d37();
                    if (bArr6 != null && bArr6.length > 0) {
                        d37Var3.mo11468x92b714fd(bArr6);
                    }
                    j37Var.f459089r = d37Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

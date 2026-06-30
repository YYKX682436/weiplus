package r45;

/* loaded from: classes2.dex */
public class ye6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f472550d;

    /* renamed from: e, reason: collision with root package name */
    public int f472551e;

    /* renamed from: f, reason: collision with root package name */
    public long f472552f;

    /* renamed from: g, reason: collision with root package name */
    public int f472553g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472554h;

    /* renamed from: i, reason: collision with root package name */
    public int f472555i;

    /* renamed from: m, reason: collision with root package name */
    public int f472556m;

    /* renamed from: n, reason: collision with root package name */
    public r45.we6 f472557n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f472558o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f472559p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f472560q = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ye6)) {
            return false;
        }
        r45.ye6 ye6Var = (r45.ye6) fVar;
        return n51.f.a(this.f472550d, ye6Var.f472550d) && n51.f.a(java.lang.Integer.valueOf(this.f472551e), java.lang.Integer.valueOf(ye6Var.f472551e)) && n51.f.a(java.lang.Long.valueOf(this.f472552f), java.lang.Long.valueOf(ye6Var.f472552f)) && n51.f.a(java.lang.Integer.valueOf(this.f472553g), java.lang.Integer.valueOf(ye6Var.f472553g)) && n51.f.a(this.f472554h, ye6Var.f472554h) && n51.f.a(java.lang.Integer.valueOf(this.f472555i), java.lang.Integer.valueOf(ye6Var.f472555i)) && n51.f.a(java.lang.Integer.valueOf(this.f472556m), java.lang.Integer.valueOf(ye6Var.f472556m)) && n51.f.a(this.f472557n, ye6Var.f472557n) && n51.f.a(this.f472558o, ye6Var.f472558o) && n51.f.a(java.lang.Boolean.valueOf(this.f472559p), java.lang.Boolean.valueOf(ye6Var.f472559p)) && n51.f.a(this.f472560q, ye6Var.f472560q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472560q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f472550d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f472551e);
            fVar.h(3, this.f472552f);
            fVar.e(4, this.f472553g);
            java.lang.String str2 = this.f472554h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f472555i);
            fVar.e(7, this.f472556m);
            r45.we6 we6Var = this.f472557n;
            if (we6Var != null) {
                fVar.i(8, we6Var.mo75928xcd1e8d8());
                this.f472557n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f472558o;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            fVar.a(10, this.f472559p);
            fVar.g(11, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f472550d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f472551e) + b36.f.h(3, this.f472552f) + b36.f.e(4, this.f472553g);
            java.lang.String str5 = this.f472554h;
            if (str5 != null) {
                j17 += b36.f.j(5, str5);
            }
            int e17 = j17 + b36.f.e(6, this.f472555i) + b36.f.e(7, this.f472556m);
            r45.we6 we6Var2 = this.f472557n;
            if (we6Var2 != null) {
                e17 += b36.f.i(8, we6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f472558o;
            if (str6 != null) {
                e17 += b36.f.j(9, str6);
            }
            return e17 + b36.f.a(10, this.f472559p) + b36.f.g(11, 1, linkedList);
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
        r45.ye6 ye6Var = (r45.ye6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ye6Var.f472550d = aVar2.k(intValue);
                return 0;
            case 2:
                ye6Var.f472551e = aVar2.g(intValue);
                return 0;
            case 3:
                ye6Var.f472552f = aVar2.i(intValue);
                return 0;
            case 4:
                ye6Var.f472553g = aVar2.g(intValue);
                return 0;
            case 5:
                ye6Var.f472554h = aVar2.k(intValue);
                return 0;
            case 6:
                ye6Var.f472555i = aVar2.g(intValue);
                return 0;
            case 7:
                ye6Var.f472556m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.we6 we6Var3 = new r45.we6();
                    if (bArr2 != null && bArr2.length > 0) {
                        we6Var3.mo11468x92b714fd(bArr2);
                    }
                    ye6Var.f472557n = we6Var3;
                }
                return 0;
            case 9:
                ye6Var.f472558o = aVar2.k(intValue);
                return 0;
            case 10:
                ye6Var.f472559p = aVar2.c(intValue);
                return 0;
            case 11:
                ye6Var.f472560q.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes10.dex */
public class y03 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f472204d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472206f;

    /* renamed from: g, reason: collision with root package name */
    public long f472207g;

    /* renamed from: h, reason: collision with root package name */
    public long f472208h;

    /* renamed from: i, reason: collision with root package name */
    public long f472209i;

    /* renamed from: m, reason: collision with root package name */
    public long f472210m;

    /* renamed from: n, reason: collision with root package name */
    public int f472211n;

    /* renamed from: o, reason: collision with root package name */
    public int f472212o;

    /* renamed from: p, reason: collision with root package name */
    public int f472213p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f472214q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472215r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y03)) {
            return false;
        }
        r45.y03 y03Var = (r45.y03) fVar;
        return n51.f.a(this.f76494x2de60e5e, y03Var.f76494x2de60e5e) && n51.f.a(this.f472204d, y03Var.f472204d) && n51.f.a(this.f472205e, y03Var.f472205e) && n51.f.a(this.f472206f, y03Var.f472206f) && n51.f.a(java.lang.Long.valueOf(this.f472207g), java.lang.Long.valueOf(y03Var.f472207g)) && n51.f.a(java.lang.Long.valueOf(this.f472208h), java.lang.Long.valueOf(y03Var.f472208h)) && n51.f.a(java.lang.Long.valueOf(this.f472209i), java.lang.Long.valueOf(y03Var.f472209i)) && n51.f.a(java.lang.Long.valueOf(this.f472210m), java.lang.Long.valueOf(y03Var.f472210m)) && n51.f.a(java.lang.Integer.valueOf(this.f472211n), java.lang.Integer.valueOf(y03Var.f472211n)) && n51.f.a(java.lang.Integer.valueOf(this.f472212o), java.lang.Integer.valueOf(y03Var.f472212o)) && n51.f.a(java.lang.Integer.valueOf(this.f472213p), java.lang.Integer.valueOf(y03Var.f472213p)) && n51.f.a(this.f472214q, y03Var.f472214q) && n51.f.a(this.f472215r, y03Var.f472215r);
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
            r45.kv0 kv0Var = this.f472204d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f472204d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f472205e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f472206f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f472207g);
            fVar.h(6, this.f472208h);
            fVar.h(7, this.f472209i);
            fVar.h(8, this.f472210m);
            fVar.e(9, this.f472211n);
            fVar.e(10, this.f472212o);
            fVar.e(11, this.f472213p);
            java.lang.String str3 = this.f472214q;
            if (str3 != null) {
                fVar.j(12, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472215r;
            if (gVar == null) {
                return 0;
            }
            fVar.b(100, gVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f472204d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f472205e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f472206f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            int h17 = i18 + b36.f.h(5, this.f472207g) + b36.f.h(6, this.f472208h) + b36.f.h(7, this.f472209i) + b36.f.h(8, this.f472210m) + b36.f.e(9, this.f472211n) + b36.f.e(10, this.f472212o) + b36.f.e(11, this.f472213p);
            java.lang.String str6 = this.f472214q;
            if (str6 != null) {
                h17 += b36.f.j(12, str6);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472215r;
            return gVar2 != null ? h17 + b36.f.b(100, gVar2) : h17;
        }
        if (i17 == 2) {
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
        r45.y03 y03Var = (r45.y03) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            y03Var.f472215r = aVar2.d(intValue);
            return 0;
        }
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
                    y03Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    y03Var.f472204d = kv0Var3;
                }
                return 0;
            case 3:
                y03Var.f472205e = aVar2.k(intValue);
                return 0;
            case 4:
                y03Var.f472206f = aVar2.k(intValue);
                return 0;
            case 5:
                y03Var.f472207g = aVar2.i(intValue);
                return 0;
            case 6:
                y03Var.f472208h = aVar2.i(intValue);
                return 0;
            case 7:
                y03Var.f472209i = aVar2.i(intValue);
                return 0;
            case 8:
                y03Var.f472210m = aVar2.i(intValue);
                return 0;
            case 9:
                y03Var.f472211n = aVar2.g(intValue);
                return 0;
            case 10:
                y03Var.f472212o = aVar2.g(intValue);
                return 0;
            case 11:
                y03Var.f472213p = aVar2.g(intValue);
                return 0;
            case 12:
                y03Var.f472214q = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

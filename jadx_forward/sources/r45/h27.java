package r45;

/* loaded from: classes14.dex */
public class h27 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457326d;

    /* renamed from: e, reason: collision with root package name */
    public int f457327e;

    /* renamed from: f, reason: collision with root package name */
    public long f457328f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457329g;

    /* renamed from: h, reason: collision with root package name */
    public r45.s37 f457330h;

    /* renamed from: i, reason: collision with root package name */
    public int f457331i;

    /* renamed from: m, reason: collision with root package name */
    public long f457332m;

    /* renamed from: n, reason: collision with root package name */
    public int f457333n;

    /* renamed from: o, reason: collision with root package name */
    public int f457334o;

    /* renamed from: p, reason: collision with root package name */
    public int f457335p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h27)) {
            return false;
        }
        r45.h27 h27Var = (r45.h27) fVar;
        return n51.f.a(this.f76494x2de60e5e, h27Var.f76494x2de60e5e) && n51.f.a(this.f457326d, h27Var.f457326d) && n51.f.a(java.lang.Integer.valueOf(this.f457327e), java.lang.Integer.valueOf(h27Var.f457327e)) && n51.f.a(java.lang.Long.valueOf(this.f457328f), java.lang.Long.valueOf(h27Var.f457328f)) && n51.f.a(this.f457329g, h27Var.f457329g) && n51.f.a(this.f457330h, h27Var.f457330h) && n51.f.a(java.lang.Integer.valueOf(this.f457331i), java.lang.Integer.valueOf(h27Var.f457331i)) && n51.f.a(java.lang.Long.valueOf(this.f457332m), java.lang.Long.valueOf(h27Var.f457332m)) && n51.f.a(java.lang.Integer.valueOf(this.f457333n), java.lang.Integer.valueOf(h27Var.f457333n)) && n51.f.a(java.lang.Integer.valueOf(this.f457334o), java.lang.Integer.valueOf(h27Var.f457334o)) && n51.f.a(java.lang.Integer.valueOf(this.f457335p), java.lang.Integer.valueOf(h27Var.f457335p));
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
            java.lang.String str = this.f457326d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f457327e);
            fVar.h(4, this.f457328f);
            java.lang.String str2 = this.f457329g;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.s37 s37Var = this.f457330h;
            if (s37Var != null) {
                fVar.i(8, s37Var.mo75928xcd1e8d8());
                this.f457330h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(9, this.f457331i);
            fVar.h(10, this.f457332m);
            fVar.e(11, this.f457333n);
            fVar.e(12, this.f457334o);
            fVar.e(13, this.f457335p);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f457326d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f457327e) + b36.f.h(4, this.f457328f);
            java.lang.String str4 = this.f457329g;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            r45.s37 s37Var2 = this.f457330h;
            if (s37Var2 != null) {
                e17 += b36.f.i(8, s37Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(9, this.f457331i) + b36.f.h(10, this.f457332m) + b36.f.e(11, this.f457333n) + b36.f.e(12, this.f457334o) + b36.f.e(13, this.f457335p);
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
        r45.h27 h27Var = (r45.h27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
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
                    h27Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                h27Var.f457326d = aVar2.k(intValue);
                return 0;
            case 3:
                h27Var.f457327e = aVar2.g(intValue);
                return 0;
            case 4:
                h27Var.f457328f = aVar2.i(intValue);
                return 0;
            case 5:
            case 7:
            default:
                return -1;
            case 6:
                h27Var.f457329g = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.s37 s37Var3 = new r45.s37();
                    if (bArr2 != null && bArr2.length > 0) {
                        s37Var3.mo11468x92b714fd(bArr2);
                    }
                    h27Var.f457330h = s37Var3;
                }
                return 0;
            case 9:
                h27Var.f457331i = aVar2.g(intValue);
                return 0;
            case 10:
                h27Var.f457332m = aVar2.i(intValue);
                return 0;
            case 11:
                h27Var.f457333n = aVar2.g(intValue);
                return 0;
            case 12:
                h27Var.f457334o = aVar2.g(intValue);
                return 0;
            case 13:
                h27Var.f457335p = aVar2.g(intValue);
                return 0;
        }
    }
}

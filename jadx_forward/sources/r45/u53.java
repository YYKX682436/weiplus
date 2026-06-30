package r45;

/* loaded from: classes11.dex */
public class u53 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468580d;

    /* renamed from: f, reason: collision with root package name */
    public r45.c16 f468582f;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f468586m;

    /* renamed from: n, reason: collision with root package name */
    public long f468587n;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f468581e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f468583g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f468584h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f468585i = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u53)) {
            return false;
        }
        r45.u53 u53Var = (r45.u53) fVar;
        return n51.f.a(this.f468580d, u53Var.f468580d) && n51.f.a(this.f468581e, u53Var.f468581e) && n51.f.a(this.f468582f, u53Var.f468582f) && n51.f.a(this.f468583g, u53Var.f468583g) && n51.f.a(java.lang.Boolean.valueOf(this.f468584h), java.lang.Boolean.valueOf(u53Var.f468584h)) && n51.f.a(java.lang.Boolean.valueOf(this.f468585i), java.lang.Boolean.valueOf(u53Var.f468585i)) && n51.f.a(this.f468586m, u53Var.f468586m) && n51.f.a(java.lang.Long.valueOf(this.f468587n), java.lang.Long.valueOf(u53Var.f468587n));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468583g;
        java.util.LinkedList linkedList2 = this.f468581e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f468580d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList2);
            r45.c16 c16Var = this.f468582f;
            if (c16Var != null) {
                fVar.i(3, c16Var.mo75928xcd1e8d8());
                this.f468582f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(4, 8, linkedList);
            fVar.a(5, this.f468584h);
            fVar.a(6, this.f468585i);
            java.lang.String str2 = this.f468586m;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.h(8, this.f468587n);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f468580d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.g(2, 8, linkedList2);
            r45.c16 c16Var2 = this.f468582f;
            if (c16Var2 != null) {
                j17 += b36.f.i(3, c16Var2.mo75928xcd1e8d8());
            }
            int g17 = j17 + b36.f.g(4, 8, linkedList) + b36.f.a(5, this.f468584h) + b36.f.a(6, this.f468585i);
            java.lang.String str4 = this.f468586m;
            if (str4 != null) {
                g17 += b36.f.j(7, str4);
            }
            return g17 + b36.f.h(8, this.f468587n);
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
        r45.u53 u53Var = (r45.u53) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                u53Var.f468580d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.c16 c16Var3 = new r45.c16();
                    if (bArr2 != null && bArr2.length > 0) {
                        c16Var3.mo11468x92b714fd(bArr2);
                    }
                    u53Var.f468581e.add(c16Var3);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.c16 c16Var4 = new r45.c16();
                    if (bArr3 != null && bArr3.length > 0) {
                        c16Var4.mo11468x92b714fd(bArr3);
                    }
                    u53Var.f468582f = c16Var4;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j27.get(i27);
                    r45.t53 t53Var = new r45.t53();
                    if (bArr4 != null && bArr4.length > 0) {
                        t53Var.mo11468x92b714fd(bArr4);
                    }
                    u53Var.f468583g.add(t53Var);
                }
                return 0;
            case 5:
                u53Var.f468584h = aVar2.c(intValue);
                return 0;
            case 6:
                u53Var.f468585i = aVar2.c(intValue);
                return 0;
            case 7:
                u53Var.f468586m = aVar2.k(intValue);
                return 0;
            case 8:
                u53Var.f468587n = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

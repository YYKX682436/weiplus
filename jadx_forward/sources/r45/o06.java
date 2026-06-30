package r45;

/* loaded from: classes7.dex */
public class o06 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f463333d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f463334e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463335f;

    /* renamed from: g, reason: collision with root package name */
    public r45.t06 f463336g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463337h;

    /* renamed from: i, reason: collision with root package name */
    public int f463338i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o06)) {
            return false;
        }
        r45.o06 o06Var = (r45.o06) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f463333d), java.lang.Integer.valueOf(o06Var.f463333d)) && n51.f.a(java.lang.Boolean.valueOf(this.f463334e), java.lang.Boolean.valueOf(o06Var.f463334e)) && n51.f.a(this.f463335f, o06Var.f463335f) && n51.f.a(this.f463336g, o06Var.f463336g) && n51.f.a(this.f463337h, o06Var.f463337h) && n51.f.a(java.lang.Integer.valueOf(this.f463338i), java.lang.Integer.valueOf(o06Var.f463338i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f463333d);
            fVar.a(2, this.f463334e);
            java.lang.String str = this.f463335f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.t06 t06Var = this.f463336g;
            if (t06Var != null) {
                fVar.i(4, t06Var.mo75928xcd1e8d8());
                this.f463336g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f463337h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f463338i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f463333d) + 0 + b36.f.a(2, this.f463334e);
            java.lang.String str3 = this.f463335f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            r45.t06 t06Var2 = this.f463336g;
            if (t06Var2 != null) {
                e17 += b36.f.i(4, t06Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f463337h;
            if (str4 != null) {
                e17 += b36.f.j(5, str4);
            }
            return e17 + b36.f.e(6, this.f463338i);
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
        r45.o06 o06Var = (r45.o06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                o06Var.f463333d = aVar2.g(intValue);
                return 0;
            case 2:
                o06Var.f463334e = aVar2.c(intValue);
                return 0;
            case 3:
                o06Var.f463335f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.t06 t06Var3 = new r45.t06();
                    if (bArr != null && bArr.length > 0) {
                        t06Var3.mo11468x92b714fd(bArr);
                    }
                    o06Var.f463336g = t06Var3;
                }
                return 0;
            case 5:
                o06Var.f463337h = aVar2.k(intValue);
                return 0;
            case 6:
                o06Var.f463338i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

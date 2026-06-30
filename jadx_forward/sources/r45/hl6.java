package r45;

/* loaded from: classes9.dex */
public class hl6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f457804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457806f;

    /* renamed from: g, reason: collision with root package name */
    public float f457807g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yt5 f457808h;

    /* renamed from: i, reason: collision with root package name */
    public int f457809i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f457810m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cg0 f457811n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cg0 f457812o;

    /* renamed from: p, reason: collision with root package name */
    public float f457813p;

    /* renamed from: q, reason: collision with root package name */
    public int f457814q;

    /* renamed from: r, reason: collision with root package name */
    public r45.e90 f457815r;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hl6)) {
            return false;
        }
        r45.hl6 hl6Var = (r45.hl6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f457804d), java.lang.Long.valueOf(hl6Var.f457804d)) && n51.f.a(this.f457805e, hl6Var.f457805e) && n51.f.a(this.f457806f, hl6Var.f457806f) && n51.f.a(java.lang.Float.valueOf(this.f457807g), java.lang.Float.valueOf(hl6Var.f457807g)) && n51.f.a(this.f457808h, hl6Var.f457808h) && n51.f.a(java.lang.Integer.valueOf(this.f457809i), java.lang.Integer.valueOf(hl6Var.f457809i)) && n51.f.a(this.f457810m, hl6Var.f457810m) && n51.f.a(this.f457811n, hl6Var.f457811n) && n51.f.a(this.f457812o, hl6Var.f457812o) && n51.f.a(java.lang.Float.valueOf(this.f457813p), java.lang.Float.valueOf(hl6Var.f457813p)) && n51.f.a(java.lang.Integer.valueOf(this.f457814q), java.lang.Integer.valueOf(hl6Var.f457814q)) && n51.f.a(this.f457815r, hl6Var.f457815r);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f457804d);
            java.lang.String str = this.f457805e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457806f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.d(4, this.f457807g);
            r45.yt5 yt5Var = this.f457808h;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.mo75928xcd1e8d8());
                this.f457808h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f457809i);
            java.lang.String str3 = this.f457810m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.cg0 cg0Var = this.f457811n;
            if (cg0Var != null) {
                fVar.i(8, cg0Var.mo75928xcd1e8d8());
                this.f457811n.mo75956x3d5d1f78(fVar);
            }
            r45.cg0 cg0Var2 = this.f457812o;
            if (cg0Var2 != null) {
                fVar.i(9, cg0Var2.mo75928xcd1e8d8());
                this.f457812o.mo75956x3d5d1f78(fVar);
            }
            fVar.d(10, this.f457813p);
            fVar.e(11, this.f457814q);
            r45.e90 e90Var = this.f457815r;
            if (e90Var == null) {
                return 0;
            }
            fVar.i(12, e90Var.mo75928xcd1e8d8());
            this.f457815r.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f457804d) + 0;
            java.lang.String str4 = this.f457805e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f457806f;
            if (str5 != null) {
                h17 += b36.f.j(3, str5);
            }
            int d17 = h17 + b36.f.d(4, this.f457807g);
            r45.yt5 yt5Var2 = this.f457808h;
            if (yt5Var2 != null) {
                d17 += b36.f.i(5, yt5Var2.mo75928xcd1e8d8());
            }
            int e17 = d17 + b36.f.e(6, this.f457809i);
            java.lang.String str6 = this.f457810m;
            if (str6 != null) {
                e17 += b36.f.j(7, str6);
            }
            r45.cg0 cg0Var3 = this.f457811n;
            if (cg0Var3 != null) {
                e17 += b36.f.i(8, cg0Var3.mo75928xcd1e8d8());
            }
            r45.cg0 cg0Var4 = this.f457812o;
            if (cg0Var4 != null) {
                e17 += b36.f.i(9, cg0Var4.mo75928xcd1e8d8());
            }
            int d18 = e17 + b36.f.d(10, this.f457813p) + b36.f.e(11, this.f457814q);
            r45.e90 e90Var2 = this.f457815r;
            return e90Var2 != null ? d18 + b36.f.i(12, e90Var2.mo75928xcd1e8d8()) : d18;
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
        r45.hl6 hl6Var = (r45.hl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                hl6Var.f457804d = aVar2.i(intValue);
                return 0;
            case 2:
                hl6Var.f457805e = aVar2.k(intValue);
                return 0;
            case 3:
                hl6Var.f457806f = aVar2.k(intValue);
                return 0;
            case 4:
                hl6Var.f457807g = aVar2.f(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr != null && bArr.length > 0) {
                        yt5Var3.mo11468x92b714fd(bArr);
                    }
                    hl6Var.f457808h = yt5Var3;
                }
                return 0;
            case 6:
                hl6Var.f457809i = aVar2.g(intValue);
                return 0;
            case 7:
                hl6Var.f457810m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cg0 cg0Var5 = new r45.cg0();
                    if (bArr2 != null && bArr2.length > 0) {
                        cg0Var5.mo11468x92b714fd(bArr2);
                    }
                    hl6Var.f457811n = cg0Var5;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cg0 cg0Var6 = new r45.cg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        cg0Var6.mo11468x92b714fd(bArr3);
                    }
                    hl6Var.f457812o = cg0Var6;
                }
                return 0;
            case 10:
                hl6Var.f457813p = aVar2.f(intValue);
                return 0;
            case 11:
                hl6Var.f457814q = aVar2.g(intValue);
                return 0;
            case 12:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.e90 e90Var3 = new r45.e90();
                    if (bArr4 != null && bArr4.length > 0) {
                        e90Var3.mo11468x92b714fd(bArr4);
                    }
                    hl6Var.f457815r = e90Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

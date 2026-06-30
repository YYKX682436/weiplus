package r45;

/* loaded from: classes7.dex */
public class pc7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464477d;

    /* renamed from: e, reason: collision with root package name */
    public int f464478e;

    /* renamed from: f, reason: collision with root package name */
    public int f464479f;

    /* renamed from: g, reason: collision with root package name */
    public long f464480g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f464481h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f464482i;

    /* renamed from: m, reason: collision with root package name */
    public r45.hd7 f464483m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464484n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pc7)) {
            return false;
        }
        r45.pc7 pc7Var = (r45.pc7) fVar;
        return n51.f.a(this.f464477d, pc7Var.f464477d) && n51.f.a(java.lang.Integer.valueOf(this.f464478e), java.lang.Integer.valueOf(pc7Var.f464478e)) && n51.f.a(java.lang.Integer.valueOf(this.f464479f), java.lang.Integer.valueOf(pc7Var.f464479f)) && n51.f.a(java.lang.Long.valueOf(this.f464480g), java.lang.Long.valueOf(pc7Var.f464480g)) && n51.f.a(java.lang.Boolean.valueOf(this.f464481h), java.lang.Boolean.valueOf(pc7Var.f464481h)) && n51.f.a(this.f464482i, pc7Var.f464482i) && n51.f.a(this.f464483m, pc7Var.f464483m) && n51.f.a(this.f464484n, pc7Var.f464484n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464477d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f464478e);
            fVar.e(3, this.f464479f);
            fVar.h(4, this.f464480g);
            fVar.a(5, this.f464481h);
            java.lang.String str2 = this.f464482i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            r45.hd7 hd7Var = this.f464483m;
            if (hd7Var != null) {
                fVar.i(10, hd7Var.mo75928xcd1e8d8());
                this.f464483m.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f464484n;
            if (str3 != null) {
                fVar.j(11, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f464477d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f464478e) + b36.f.e(3, this.f464479f) + b36.f.h(4, this.f464480g) + b36.f.a(5, this.f464481h);
            java.lang.String str5 = this.f464482i;
            if (str5 != null) {
                j17 += b36.f.j(6, str5);
            }
            r45.hd7 hd7Var2 = this.f464483m;
            if (hd7Var2 != null) {
                j17 += b36.f.i(10, hd7Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f464484n;
            return str6 != null ? j17 + b36.f.j(11, str6) : j17;
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
        r45.pc7 pc7Var = (r45.pc7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 10) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.hd7 hd7Var3 = new r45.hd7();
                if (bArr != null && bArr.length > 0) {
                    hd7Var3.mo11468x92b714fd(bArr);
                }
                pc7Var.f464483m = hd7Var3;
            }
            return 0;
        }
        if (intValue == 11) {
            pc7Var.f464484n = aVar2.k(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                pc7Var.f464477d = aVar2.k(intValue);
                return 0;
            case 2:
                pc7Var.f464478e = aVar2.g(intValue);
                return 0;
            case 3:
                pc7Var.f464479f = aVar2.g(intValue);
                return 0;
            case 4:
                pc7Var.f464480g = aVar2.i(intValue);
                return 0;
            case 5:
                pc7Var.f464481h = aVar2.c(intValue);
                return 0;
            case 6:
                pc7Var.f464482i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

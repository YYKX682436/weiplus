package r45;

/* loaded from: classes4.dex */
public class bb5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f452189d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452190e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452191f;

    /* renamed from: g, reason: collision with root package name */
    public r45.kq6 f452192g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bb5)) {
            return false;
        }
        r45.bb5 bb5Var = (r45.bb5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f452189d), java.lang.Integer.valueOf(bb5Var.f452189d)) && n51.f.a(this.f452190e, bb5Var.f452190e) && n51.f.a(this.f452191f, bb5Var.f452191f) && n51.f.a(this.f452192g, bb5Var.f452192g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f452189d);
            java.lang.String str = this.f452190e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f452191f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.kq6 kq6Var = this.f452192g;
            if (kq6Var != null) {
                fVar.i(4, kq6Var.mo75928xcd1e8d8());
                this.f452192g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f452189d) + 0;
            java.lang.String str3 = this.f452190e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f452191f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            r45.kq6 kq6Var2 = this.f452192g;
            return kq6Var2 != null ? e17 + b36.f.i(4, kq6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.bb5 bb5Var = (r45.bb5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bb5Var.f452189d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            bb5Var.f452190e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bb5Var.f452191f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.kq6 kq6Var3 = new r45.kq6();
            if (bArr != null && bArr.length > 0) {
                kq6Var3.mo11468x92b714fd(bArr);
            }
            bb5Var.f452192g = kq6Var3;
        }
        return 0;
    }
}

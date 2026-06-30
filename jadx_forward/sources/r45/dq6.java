package r45;

/* loaded from: classes4.dex */
public class dq6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454201d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454202e;

    /* renamed from: f, reason: collision with root package name */
    public int f454203f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454204g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f454205h;

    /* renamed from: i, reason: collision with root package name */
    public int f454206i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dq6)) {
            return false;
        }
        r45.dq6 dq6Var = (r45.dq6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454201d), java.lang.Integer.valueOf(dq6Var.f454201d)) && n51.f.a(this.f454202e, dq6Var.f454202e) && n51.f.a(java.lang.Integer.valueOf(this.f454203f), java.lang.Integer.valueOf(dq6Var.f454203f)) && n51.f.a(this.f454204g, dq6Var.f454204g) && n51.f.a(this.f454205h, dq6Var.f454205h) && n51.f.a(java.lang.Integer.valueOf(this.f454206i), java.lang.Integer.valueOf(dq6Var.f454206i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454201d);
            java.lang.String str = this.f454202e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f454203f);
            java.lang.String str2 = this.f454204g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            r45.cu5 cu5Var = this.f454205h;
            if (cu5Var != null) {
                fVar.i(5, cu5Var.mo75928xcd1e8d8());
                this.f454205h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f454206i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454201d) + 0;
            java.lang.String str3 = this.f454202e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            int e18 = e17 + b36.f.e(3, this.f454203f);
            java.lang.String str4 = this.f454204g;
            if (str4 != null) {
                e18 += b36.f.j(4, str4);
            }
            r45.cu5 cu5Var2 = this.f454205h;
            if (cu5Var2 != null) {
                e18 += b36.f.i(5, cu5Var2.mo75928xcd1e8d8());
            }
            return e18 + b36.f.e(6, this.f454206i);
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
        r45.dq6 dq6Var = (r45.dq6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                dq6Var.f454201d = aVar2.g(intValue);
                return 0;
            case 2:
                dq6Var.f454202e = aVar2.k(intValue);
                return 0;
            case 3:
                dq6Var.f454203f = aVar2.g(intValue);
                return 0;
            case 4:
                dq6Var.f454204g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var3.b(bArr);
                    }
                    dq6Var.f454205h = cu5Var3;
                }
                return 0;
            case 6:
                dq6Var.f454206i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

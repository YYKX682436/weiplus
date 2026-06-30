package r45;

/* loaded from: classes4.dex */
public class n04 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462505d;

    /* renamed from: e, reason: collision with root package name */
    public r45.du5 f462506e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462507f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462508g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462509h;

    /* renamed from: i, reason: collision with root package name */
    public int f462510i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n04)) {
            return false;
        }
        r45.n04 n04Var = (r45.n04) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462505d), java.lang.Integer.valueOf(n04Var.f462505d)) && n51.f.a(this.f462506e, n04Var.f462506e) && n51.f.a(this.f462507f, n04Var.f462507f) && n51.f.a(this.f462508g, n04Var.f462508g) && n51.f.a(this.f462509h, n04Var.f462509h) && n51.f.a(java.lang.Integer.valueOf(this.f462510i), java.lang.Integer.valueOf(n04Var.f462510i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462505d);
            r45.du5 du5Var = this.f462506e;
            if (du5Var != null) {
                fVar.i(2, du5Var.mo75928xcd1e8d8());
                this.f462506e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f462507f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f462508g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f462509h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f462510i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462505d) + 0;
            r45.du5 du5Var2 = this.f462506e;
            if (du5Var2 != null) {
                e17 += b36.f.i(2, du5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f462507f;
            if (str4 != null) {
                e17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f462508g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f462509h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f462510i);
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
        r45.n04 n04Var = (r45.n04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                n04Var.f462505d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr != null && bArr.length > 0) {
                        du5Var3.b(bArr);
                    }
                    n04Var.f462506e = du5Var3;
                }
                return 0;
            case 3:
                n04Var.f462507f = aVar2.k(intValue);
                return 0;
            case 4:
                n04Var.f462508g = aVar2.k(intValue);
                return 0;
            case 5:
                n04Var.f462509h = aVar2.k(intValue);
                return 0;
            case 6:
                n04Var.f462510i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

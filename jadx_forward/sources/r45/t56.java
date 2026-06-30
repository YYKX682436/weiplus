package r45;

/* loaded from: classes9.dex */
public class t56 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467694e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bx6 f467695f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467696g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467697h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t56)) {
            return false;
        }
        r45.t56 t56Var = (r45.t56) fVar;
        return n51.f.a(this.f467693d, t56Var.f467693d) && n51.f.a(this.f467694e, t56Var.f467694e) && n51.f.a(this.f467695f, t56Var.f467695f) && n51.f.a(this.f467696g, t56Var.f467696g) && n51.f.a(this.f467697h, t56Var.f467697h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467693d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467694e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.bx6 bx6Var = this.f467695f;
            if (bx6Var != null) {
                fVar.i(3, bx6Var.mo75928xcd1e8d8());
                this.f467695f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f467696g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467697h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f467693d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f467694e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            r45.bx6 bx6Var2 = this.f467695f;
            if (bx6Var2 != null) {
                j17 += b36.f.i(3, bx6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f467696g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f467697h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        r45.t56 t56Var = (r45.t56) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t56Var.f467693d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            t56Var.f467694e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                t56Var.f467696g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            t56Var.f467697h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.bx6 bx6Var3 = new r45.bx6();
            if (bArr != null && bArr.length > 0) {
                bx6Var3.mo11468x92b714fd(bArr);
            }
            t56Var.f467695f = bx6Var3;
        }
        return 0;
    }
}

package r45;

/* loaded from: classes10.dex */
public class si0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467286d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467287e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zz6 f467288f;

    /* renamed from: g, reason: collision with root package name */
    public r45.zz6 f467289g;

    /* renamed from: h, reason: collision with root package name */
    public r45.bi0 f467290h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.si0)) {
            return false;
        }
        r45.si0 si0Var = (r45.si0) fVar;
        return n51.f.a(this.f467286d, si0Var.f467286d) && n51.f.a(this.f467287e, si0Var.f467287e) && n51.f.a(this.f467288f, si0Var.f467288f) && n51.f.a(this.f467289g, si0Var.f467289g) && n51.f.a(this.f467290h, si0Var.f467290h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467286d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467287e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.zz6 zz6Var = this.f467288f;
            if (zz6Var != null) {
                fVar.i(3, zz6Var.mo75928xcd1e8d8());
                this.f467288f.mo75956x3d5d1f78(fVar);
            }
            r45.zz6 zz6Var2 = this.f467289g;
            if (zz6Var2 != null) {
                fVar.i(4, zz6Var2.mo75928xcd1e8d8());
                this.f467289g.mo75956x3d5d1f78(fVar);
            }
            r45.bi0 bi0Var = this.f467290h;
            if (bi0Var != null) {
                fVar.i(5, bi0Var.mo75928xcd1e8d8());
                this.f467290h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f467286d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f467287e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.zz6 zz6Var3 = this.f467288f;
            if (zz6Var3 != null) {
                j17 += b36.f.i(3, zz6Var3.mo75928xcd1e8d8());
            }
            r45.zz6 zz6Var4 = this.f467289g;
            if (zz6Var4 != null) {
                j17 += b36.f.i(4, zz6Var4.mo75928xcd1e8d8());
            }
            r45.bi0 bi0Var2 = this.f467290h;
            return bi0Var2 != null ? j17 + b36.f.i(5, bi0Var2.mo75928xcd1e8d8()) : j17;
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
        r45.si0 si0Var = (r45.si0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            si0Var.f467286d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            si0Var.f467287e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.zz6 zz6Var5 = new r45.zz6();
                if (bArr != null && bArr.length > 0) {
                    zz6Var5.mo11468x92b714fd(bArr);
                }
                si0Var.f467288f = zz6Var5;
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.zz6 zz6Var6 = new r45.zz6();
                if (bArr2 != null && bArr2.length > 0) {
                    zz6Var6.mo11468x92b714fd(bArr2);
                }
                si0Var.f467289g = zz6Var6;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.bi0 bi0Var3 = new r45.bi0();
            if (bArr3 != null && bArr3.length > 0) {
                bi0Var3.mo11468x92b714fd(bArr3);
            }
            si0Var.f467290h = bi0Var3;
        }
        return 0;
    }
}

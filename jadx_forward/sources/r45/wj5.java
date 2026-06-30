package r45;

/* loaded from: classes2.dex */
public class wj5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470755d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ib7 f470756e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hb7 f470757f;

    /* renamed from: g, reason: collision with root package name */
    public r45.hb7 f470758g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wj5)) {
            return false;
        }
        r45.wj5 wj5Var = (r45.wj5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470755d), java.lang.Integer.valueOf(wj5Var.f470755d)) && n51.f.a(this.f470756e, wj5Var.f470756e) && n51.f.a(this.f470757f, wj5Var.f470757f) && n51.f.a(this.f470758g, wj5Var.f470758g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470755d);
            r45.ib7 ib7Var = this.f470756e;
            if (ib7Var != null) {
                fVar.i(2, ib7Var.mo75928xcd1e8d8());
                this.f470756e.mo75956x3d5d1f78(fVar);
            }
            r45.hb7 hb7Var = this.f470757f;
            if (hb7Var != null) {
                fVar.i(3, hb7Var.mo75928xcd1e8d8());
                this.f470757f.mo75956x3d5d1f78(fVar);
            }
            r45.hb7 hb7Var2 = this.f470758g;
            if (hb7Var2 != null) {
                fVar.i(4, hb7Var2.mo75928xcd1e8d8());
                this.f470758g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470755d) + 0;
            r45.ib7 ib7Var2 = this.f470756e;
            if (ib7Var2 != null) {
                e17 += b36.f.i(2, ib7Var2.mo75928xcd1e8d8());
            }
            r45.hb7 hb7Var3 = this.f470757f;
            if (hb7Var3 != null) {
                e17 += b36.f.i(3, hb7Var3.mo75928xcd1e8d8());
            }
            r45.hb7 hb7Var4 = this.f470758g;
            return hb7Var4 != null ? e17 + b36.f.i(4, hb7Var4.mo75928xcd1e8d8()) : e17;
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
        r45.wj5 wj5Var = (r45.wj5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wj5Var.f470755d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ib7 ib7Var3 = new r45.ib7();
                if (bArr != null && bArr.length > 0) {
                    ib7Var3.mo11468x92b714fd(bArr);
                }
                wj5Var.f470756e = ib7Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.hb7 hb7Var5 = new r45.hb7();
                if (bArr2 != null && bArr2.length > 0) {
                    hb7Var5.mo11468x92b714fd(bArr2);
                }
                wj5Var.f470757f = hb7Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.hb7 hb7Var6 = new r45.hb7();
            if (bArr3 != null && bArr3.length > 0) {
                hb7Var6.mo11468x92b714fd(bArr3);
            }
            wj5Var.f470758g = hb7Var6;
        }
        return 0;
    }
}

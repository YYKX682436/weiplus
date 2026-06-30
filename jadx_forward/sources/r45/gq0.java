package r45;

/* loaded from: classes9.dex */
public class gq0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457008d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457009e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f457010f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.xp0 f457011g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq0)) {
            return false;
        }
        r45.gq0 gq0Var = (r45.gq0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457008d), java.lang.Integer.valueOf(gq0Var.f457008d)) && n51.f.a(this.f457009e, gq0Var.f457009e) && n51.f.a(this.f457010f, gq0Var.f457010f) && n51.f.a(this.f457011g, gq0Var.f457011g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457008d);
            java.lang.String str = this.f457009e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, this.f457010f);
            r45.xp0 xp0Var = this.f457011g;
            if (xp0Var != null) {
                fVar.i(4, xp0Var.mo75928xcd1e8d8());
                this.f457011g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457008d) + 0;
            java.lang.String str2 = this.f457009e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, this.f457010f);
            r45.xp0 xp0Var2 = this.f457011g;
            return xp0Var2 != null ? g17 + b36.f.i(4, xp0Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f457010f.clear();
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
        r45.gq0 gq0Var = (r45.gq0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gq0Var.f457008d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gq0Var.f457009e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.xp0 xp0Var3 = new r45.xp0();
                if (bArr2 != null && bArr2.length > 0) {
                    xp0Var3.mo11468x92b714fd(bArr2);
                }
                gq0Var.f457010f.add(xp0Var3);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.xp0 xp0Var4 = new r45.xp0();
            if (bArr3 != null && bArr3.length > 0) {
                xp0Var4.mo11468x92b714fd(bArr3);
            }
            gq0Var.f457011g = xp0Var4;
        }
        return 0;
    }
}

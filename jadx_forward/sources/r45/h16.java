package r45;

/* loaded from: classes15.dex */
public class h16 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.c45 f457296d;

    /* renamed from: e, reason: collision with root package name */
    public r45.w35 f457297e;

    /* renamed from: f, reason: collision with root package name */
    public r45.c45 f457298f;

    /* renamed from: g, reason: collision with root package name */
    public r45.w35 f457299g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f457300h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f457301i = false;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h16)) {
            return false;
        }
        r45.h16 h16Var = (r45.h16) fVar;
        return n51.f.a(this.f457296d, h16Var.f457296d) && n51.f.a(this.f457297e, h16Var.f457297e) && n51.f.a(this.f457298f, h16Var.f457298f) && n51.f.a(this.f457299g, h16Var.f457299g) && n51.f.a(java.lang.Boolean.valueOf(this.f457300h), java.lang.Boolean.valueOf(h16Var.f457300h)) && n51.f.a(java.lang.Boolean.valueOf(this.f457301i), java.lang.Boolean.valueOf(h16Var.f457301i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.c45 c45Var = this.f457296d;
            if (c45Var != null) {
                fVar.i(1, c45Var.mo75928xcd1e8d8());
                this.f457296d.mo75956x3d5d1f78(fVar);
            }
            r45.w35 w35Var = this.f457297e;
            if (w35Var != null) {
                fVar.i(2, w35Var.mo75928xcd1e8d8());
                this.f457297e.mo75956x3d5d1f78(fVar);
            }
            r45.c45 c45Var2 = this.f457298f;
            if (c45Var2 != null) {
                fVar.i(3, c45Var2.mo75928xcd1e8d8());
                this.f457298f.mo75956x3d5d1f78(fVar);
            }
            r45.w35 w35Var2 = this.f457299g;
            if (w35Var2 != null) {
                fVar.i(4, w35Var2.mo75928xcd1e8d8());
                this.f457299g.mo75956x3d5d1f78(fVar);
            }
            fVar.a(5, this.f457300h);
            fVar.a(6, this.f457301i);
            return 0;
        }
        if (i17 == 1) {
            r45.c45 c45Var3 = this.f457296d;
            int i18 = c45Var3 != null ? 0 + b36.f.i(1, c45Var3.mo75928xcd1e8d8()) : 0;
            r45.w35 w35Var3 = this.f457297e;
            if (w35Var3 != null) {
                i18 += b36.f.i(2, w35Var3.mo75928xcd1e8d8());
            }
            r45.c45 c45Var4 = this.f457298f;
            if (c45Var4 != null) {
                i18 += b36.f.i(3, c45Var4.mo75928xcd1e8d8());
            }
            r45.w35 w35Var4 = this.f457299g;
            if (w35Var4 != null) {
                i18 += b36.f.i(4, w35Var4.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(5, this.f457300h) + b36.f.a(6, this.f457301i);
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
        r45.h16 h16Var = (r45.h16) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.c45 c45Var5 = new r45.c45();
                    if (bArr != null && bArr.length > 0) {
                        c45Var5.mo11468x92b714fd(bArr);
                    }
                    h16Var.f457296d = c45Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.w35 w35Var5 = new r45.w35();
                    if (bArr2 != null && bArr2.length > 0) {
                        w35Var5.mo11468x92b714fd(bArr2);
                    }
                    h16Var.f457297e = w35Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.c45 c45Var6 = new r45.c45();
                    if (bArr3 != null && bArr3.length > 0) {
                        c45Var6.mo11468x92b714fd(bArr3);
                    }
                    h16Var.f457298f = c45Var6;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.w35 w35Var6 = new r45.w35();
                    if (bArr4 != null && bArr4.length > 0) {
                        w35Var6.mo11468x92b714fd(bArr4);
                    }
                    h16Var.f457299g = w35Var6;
                }
                return 0;
            case 5:
                h16Var.f457300h = aVar2.c(intValue);
                return 0;
            case 6:
                h16Var.f457301i = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes8.dex */
public class w33 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470365e;

    /* renamed from: f, reason: collision with root package name */
    public long f470366f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f470367g;

    /* renamed from: h, reason: collision with root package name */
    public float f470368h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470369i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f470370m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public r45.x33 f470371n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w33)) {
            return false;
        }
        r45.w33 w33Var = (r45.w33) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470364d), java.lang.Integer.valueOf(w33Var.f470364d)) && n51.f.a(this.f470365e, w33Var.f470365e) && n51.f.a(java.lang.Long.valueOf(this.f470366f), java.lang.Long.valueOf(w33Var.f470366f)) && n51.f.a(java.lang.Boolean.valueOf(this.f470367g), java.lang.Boolean.valueOf(w33Var.f470367g)) && n51.f.a(java.lang.Float.valueOf(this.f470368h), java.lang.Float.valueOf(w33Var.f470368h)) && n51.f.a(this.f470369i, w33Var.f470369i) && n51.f.a(this.f470370m, w33Var.f470370m) && n51.f.a(this.f470371n, w33Var.f470371n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470364d);
            java.lang.String str = this.f470365e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f470366f);
            fVar.a(4, this.f470367g);
            fVar.d(5, this.f470368h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470369i;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            fVar.g(7, 8, this.f470370m);
            r45.x33 x33Var = this.f470371n;
            if (x33Var != null) {
                fVar.i(8, x33Var.mo75928xcd1e8d8());
                this.f470371n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470364d) + 0;
            java.lang.String str2 = this.f470365e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            int h17 = e17 + b36.f.h(3, this.f470366f) + b36.f.a(4, this.f470367g) + b36.f.d(5, this.f470368h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470369i;
            if (gVar2 != null) {
                h17 += b36.f.b(6, gVar2);
            }
            int g17 = h17 + b36.f.g(7, 8, this.f470370m);
            r45.x33 x33Var2 = this.f470371n;
            return x33Var2 != null ? g17 + b36.f.i(8, x33Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f470370m.clear();
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
        r45.w33 w33Var = (r45.w33) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                w33Var.f470364d = aVar2.g(intValue);
                return 0;
            case 2:
                w33Var.f470365e = aVar2.k(intValue);
                return 0;
            case 3:
                w33Var.f470366f = aVar2.i(intValue);
                return 0;
            case 4:
                w33Var.f470367g = aVar2.c(intValue);
                return 0;
            case 5:
                w33Var.f470368h = aVar2.f(intValue);
                return 0;
            case 6:
                w33Var.f470369i = aVar2.d(intValue);
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.w33 w33Var2 = new r45.w33();
                    if (bArr2 != null && bArr2.length > 0) {
                        w33Var2.mo11468x92b714fd(bArr2);
                    }
                    w33Var.f470370m.add(w33Var2);
                }
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.x33 x33Var3 = new r45.x33();
                    if (bArr3 != null && bArr3.length > 0) {
                        x33Var3.mo11468x92b714fd(bArr3);
                    }
                    w33Var.f470371n = x33Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

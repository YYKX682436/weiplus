package r45;

/* loaded from: classes4.dex */
public class w3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.j4 f470359d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470360e;

    /* renamed from: f, reason: collision with root package name */
    public long f470361f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470362g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470363h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w3)) {
            return false;
        }
        r45.w3 w3Var = (r45.w3) fVar;
        return n51.f.a(this.f470359d, w3Var.f470359d) && n51.f.a(this.f470360e, w3Var.f470360e) && n51.f.a(java.lang.Long.valueOf(this.f470361f), java.lang.Long.valueOf(w3Var.f470361f)) && n51.f.a(this.f470362g, w3Var.f470362g) && n51.f.a(java.lang.Boolean.valueOf(this.f470363h), java.lang.Boolean.valueOf(w3Var.f470363h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.j4 j4Var = this.f470359d;
            if (j4Var != null) {
                fVar.i(1, j4Var.mo75928xcd1e8d8());
                this.f470359d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470360e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f470361f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470362g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.a(5, this.f470363h);
            return 0;
        }
        if (i17 == 1) {
            r45.j4 j4Var2 = this.f470359d;
            int i18 = j4Var2 != null ? 0 + b36.f.i(1, j4Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str2 = this.f470360e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            int h17 = i18 + b36.f.h(3, this.f470361f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470362g;
            if (gVar2 != null) {
                h17 += b36.f.b(4, gVar2);
            }
            return h17 + b36.f.a(5, this.f470363h);
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
        r45.w3 w3Var = (r45.w3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.j4 j4Var3 = new r45.j4();
                if (bArr != null && bArr.length > 0) {
                    j4Var3.mo11468x92b714fd(bArr);
                }
                w3Var.f470359d = j4Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            w3Var.f470360e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            w3Var.f470361f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            w3Var.f470362g = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        w3Var.f470363h = aVar2.c(intValue);
        return 0;
    }
}

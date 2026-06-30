package r45;

/* loaded from: classes2.dex */
public class ne0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f462834d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f462835e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yt5 f462836f;

    /* renamed from: g, reason: collision with root package name */
    public r45.a50 f462837g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f462838h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ne0)) {
            return false;
        }
        r45.ne0 ne0Var = (r45.ne0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f462834d), java.lang.Integer.valueOf(ne0Var.f462834d)) && n51.f.a(this.f462835e, ne0Var.f462835e) && n51.f.a(this.f462836f, ne0Var.f462836f) && n51.f.a(this.f462837g, ne0Var.f462837g) && n51.f.a(this.f462838h, ne0Var.f462838h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f462834d);
            java.lang.String str = this.f462835e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.yt5 yt5Var = this.f462836f;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.mo75928xcd1e8d8());
                this.f462836f.mo75956x3d5d1f78(fVar);
            }
            r45.a50 a50Var = this.f462837g;
            if (a50Var != null) {
                fVar.i(4, a50Var.mo75928xcd1e8d8());
                this.f462837g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f462838h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f462834d) + 0;
            java.lang.String str3 = this.f462835e;
            if (str3 != null) {
                e17 += b36.f.j(2, str3);
            }
            r45.yt5 yt5Var2 = this.f462836f;
            if (yt5Var2 != null) {
                e17 += b36.f.i(3, yt5Var2.mo75928xcd1e8d8());
            }
            r45.a50 a50Var2 = this.f462837g;
            if (a50Var2 != null) {
                e17 += b36.f.i(4, a50Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f462838h;
            return str4 != null ? e17 + b36.f.j(5, str4) : e17;
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
        r45.ne0 ne0Var = (r45.ne0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            ne0Var.f462834d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            ne0Var.f462835e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr != null && bArr.length > 0) {
                    yt5Var3.mo11468x92b714fd(bArr);
                }
                ne0Var.f462836f = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ne0Var.f462838h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.a50 a50Var3 = new r45.a50();
            if (bArr2 != null && bArr2.length > 0) {
                a50Var3.mo11468x92b714fd(bArr2);
            }
            ne0Var.f462837g = a50Var3;
        }
        return 0;
    }
}

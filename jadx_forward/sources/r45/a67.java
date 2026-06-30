package r45;

/* loaded from: classes8.dex */
public class a67 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451329d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f451330e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451331f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f451332g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a67)) {
            return false;
        }
        r45.a67 a67Var = (r45.a67) fVar;
        return n51.f.a(this.f451329d, a67Var.f451329d) && n51.f.a(this.f451330e, a67Var.f451330e) && n51.f.a(this.f451331f, a67Var.f451331f) && n51.f.a(this.f451332g, a67Var.f451332g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451329d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.cu5 cu5Var = this.f451330e;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f451330e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f451331f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.cu5 cu5Var2 = this.f451332g;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.mo75928xcd1e8d8());
                this.f451332g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f451329d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.cu5 cu5Var3 = this.f451330e;
            if (cu5Var3 != null) {
                j17 += b36.f.i(2, cu5Var3.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f451331f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            r45.cu5 cu5Var4 = this.f451332g;
            return cu5Var4 != null ? j17 + b36.f.i(4, cu5Var4.mo75928xcd1e8d8()) : j17;
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
        r45.a67 a67Var = (r45.a67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a67Var.f451329d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.cu5 cu5Var5 = new r45.cu5();
                if (bArr != null && bArr.length > 0) {
                    cu5Var5.b(bArr);
                }
                a67Var.f451330e = cu5Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            a67Var.f451331f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.cu5 cu5Var6 = new r45.cu5();
            if (bArr2 != null && bArr2.length > 0) {
                cu5Var6.b(bArr2);
            }
            a67Var.f451332g = cu5Var6;
        }
        return 0;
    }
}

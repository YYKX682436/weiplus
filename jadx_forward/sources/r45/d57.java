package r45;

/* loaded from: classes7.dex */
public class d57 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.a47 f453667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453668e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453670g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.d57)) {
            return false;
        }
        r45.d57 d57Var = (r45.d57) fVar;
        return n51.f.a(this.f453667d, d57Var.f453667d) && n51.f.a(this.f453668e, d57Var.f453668e) && n51.f.a(this.f453669f, d57Var.f453669f) && n51.f.a(this.f453670g, d57Var.f453670g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.a47 a47Var = this.f453667d;
            if (a47Var != null) {
                fVar.i(1, a47Var.mo75928xcd1e8d8());
                this.f453667d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f453668e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f453669f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f453670g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.a47 a47Var2 = this.f453667d;
            int i18 = a47Var2 != null ? 0 + b36.f.i(1, a47Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f453668e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f453669f;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f453670g;
            return str6 != null ? i18 + b36.f.j(4, str6) : i18;
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
        r45.d57 d57Var = (r45.d57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                d57Var.f453668e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                d57Var.f453669f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            d57Var.f453670g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.a47 a47Var3 = new r45.a47();
            if (bArr != null && bArr.length > 0) {
                a47Var3.mo11468x92b714fd(bArr);
            }
            d57Var.f453667d = a47Var3;
        }
        return 0;
    }
}

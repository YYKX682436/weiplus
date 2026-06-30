package r45;

/* loaded from: classes9.dex */
public class e30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454496d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454497e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f454498f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.n34 f454499g;

    /* renamed from: h, reason: collision with root package name */
    public r45.n34 f454500h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e30)) {
            return false;
        }
        r45.e30 e30Var = (r45.e30) fVar;
        return n51.f.a(this.f454496d, e30Var.f454496d) && n51.f.a(this.f454497e, e30Var.f454497e) && n51.f.a(this.f454498f, e30Var.f454498f) && n51.f.a(this.f454499g, e30Var.f454499g) && n51.f.a(this.f454500h, e30Var.f454500h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454498f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454496d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454497e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            r45.n34 n34Var = this.f454499g;
            if (n34Var != null) {
                fVar.i(4, n34Var.mo75928xcd1e8d8());
                this.f454499g.mo75956x3d5d1f78(fVar);
            }
            r45.n34 n34Var2 = this.f454500h;
            if (n34Var2 != null) {
                fVar.i(5, n34Var2.mo75928xcd1e8d8());
                this.f454500h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f454496d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f454497e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            r45.n34 n34Var3 = this.f454499g;
            if (n34Var3 != null) {
                g17 += b36.f.i(4, n34Var3.mo75928xcd1e8d8());
            }
            r45.n34 n34Var4 = this.f454500h;
            return n34Var4 != null ? g17 + b36.f.i(5, n34Var4.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.e30 e30Var = (r45.e30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e30Var.f454496d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e30Var.f454497e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.f44 f44Var = new r45.f44();
                if (bArr2 != null && bArr2.length > 0) {
                    f44Var.mo11468x92b714fd(bArr2);
                }
                e30Var.f454498f.add(f44Var);
            }
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j19.get(i19);
                r45.n34 n34Var5 = new r45.n34();
                if (bArr3 != null && bArr3.length > 0) {
                    n34Var5.mo11468x92b714fd(bArr3);
                }
                e30Var.f454499g = n34Var5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j27.get(i27);
            r45.n34 n34Var6 = new r45.n34();
            if (bArr4 != null && bArr4.length > 0) {
                n34Var6.mo11468x92b714fd(bArr4);
            }
            e30Var.f454500h = n34Var6;
        }
        return 0;
    }
}

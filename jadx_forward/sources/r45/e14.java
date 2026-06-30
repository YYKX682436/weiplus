package r45;

/* loaded from: classes2.dex */
public class e14 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f454436d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f454437e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f454438f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f454439g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e14)) {
            return false;
        }
        r45.e14 e14Var = (r45.e14) fVar;
        return n51.f.a(this.f454436d, e14Var.f454436d) && n51.f.a(this.f454437e, e14Var.f454437e) && n51.f.a(this.f454438f, e14Var.f454438f) && n51.f.a(this.f454439g, e14Var.f454439g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454437e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f454436d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.mo75928xcd1e8d8());
                this.f454436d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            r45.rl6 rl6Var2 = this.f454438f;
            if (rl6Var2 != null) {
                fVar.i(3, rl6Var2.mo75928xcd1e8d8());
                this.f454438f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f454439g;
            if (str != null) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f454436d;
            int i18 = (rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            r45.rl6 rl6Var4 = this.f454438f;
            if (rl6Var4 != null) {
                i18 += b36.f.i(3, rl6Var4.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f454439g;
            return str2 != null ? i18 + b36.f.j(4, str2) : i18;
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
        r45.e14 e14Var = (r45.e14) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.rl6 rl6Var5 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var5.mo11468x92b714fd(bArr2);
                }
                e14Var.f454436d = rl6Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.xj6 xj6Var = new r45.xj6();
                if (bArr3 != null && bArr3.length > 0) {
                    xj6Var.mo11468x92b714fd(bArr3);
                }
                e14Var.f454437e.add(xj6Var);
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            e14Var.f454439g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.rl6 rl6Var6 = new r45.rl6();
            if (bArr4 != null && bArr4.length > 0) {
                rl6Var6.mo11468x92b714fd(bArr4);
            }
            e14Var.f454438f = rl6Var6;
        }
        return 0;
    }
}

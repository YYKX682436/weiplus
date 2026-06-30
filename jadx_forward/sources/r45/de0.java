package r45;

/* loaded from: classes15.dex */
public class de0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f453873d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f453874e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453875f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f453876g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453877h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f453878i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.de0)) {
            return false;
        }
        r45.de0 de0Var = (r45.de0) fVar;
        return n51.f.a(this.f453873d, de0Var.f453873d) && n51.f.a(this.f453874e, de0Var.f453874e) && n51.f.a(this.f453875f, de0Var.f453875f) && n51.f.a(this.f453876g, de0Var.f453876g) && n51.f.a(this.f453877h, de0Var.f453877h) && n51.f.a(this.f453878i, de0Var.f453878i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f453873d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f453874e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f453875f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, this.f453876g);
            java.lang.String str4 = this.f453877h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f453878i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f453873d;
            int j17 = str6 != null ? 0 + b36.f.j(1, str6) : 0;
            java.lang.String str7 = this.f453874e;
            if (str7 != null) {
                j17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f453875f;
            if (str8 != null) {
                j17 += b36.f.j(3, str8);
            }
            int g17 = j17 + b36.f.g(4, 1, this.f453876g);
            java.lang.String str9 = this.f453877h;
            if (str9 != null) {
                g17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f453878i;
            return str10 != null ? g17 + b36.f.j(6, str10) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f453876g.clear();
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
        r45.de0 de0Var = (r45.de0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                de0Var.f453873d = aVar2.k(intValue);
                return 0;
            case 2:
                de0Var.f453874e = aVar2.k(intValue);
                return 0;
            case 3:
                de0Var.f453875f = aVar2.k(intValue);
                return 0;
            case 4:
                de0Var.f453876g.add(aVar2.k(intValue));
                return 0;
            case 5:
                de0Var.f453877h = aVar2.k(intValue);
                return 0;
            case 6:
                de0Var.f453878i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

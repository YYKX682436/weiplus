package m53;

/* loaded from: classes8.dex */
public class c1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405126d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f405127e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405128f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405129g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405130h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.c1)) {
            return false;
        }
        m53.c1 c1Var = (m53.c1) fVar;
        return n51.f.a(this.f405126d, c1Var.f405126d) && n51.f.a(this.f405127e, c1Var.f405127e) && n51.f.a(this.f405128f, c1Var.f405128f) && n51.f.a(this.f405129g, c1Var.f405129g) && n51.f.a(this.f405130h, c1Var.f405130h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405127e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405126d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str2 = this.f405128f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f405129g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f405130h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f405126d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str6 = this.f405128f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f405129g;
            if (str7 != null) {
                j17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f405130h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        m53.c1 c1Var = (m53.c1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c1Var.f405126d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                c1Var.f405128f = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 4) {
                c1Var.f405129g = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            c1Var.f405130h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            m53.u4 u4Var = new m53.u4();
            if (bArr2 != null && bArr2.length > 0) {
                u4Var.mo11468x92b714fd(bArr2);
            }
            c1Var.f405127e.add(u4Var);
        }
        return 0;
    }
}

package r45;

/* loaded from: classes4.dex */
public class te6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f467892d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467893e;

    /* renamed from: f, reason: collision with root package name */
    public r45.df6 f467894f;

    /* renamed from: g, reason: collision with root package name */
    public int f467895g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f467896h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.te6)) {
            return false;
        }
        r45.te6 te6Var = (r45.te6) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f467892d), java.lang.Long.valueOf(te6Var.f467892d)) && n51.f.a(this.f467893e, te6Var.f467893e) && n51.f.a(this.f467894f, te6Var.f467894f) && n51.f.a(java.lang.Integer.valueOf(this.f467895g), java.lang.Integer.valueOf(te6Var.f467895g)) && n51.f.a(this.f467896h, te6Var.f467896h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f467892d);
            java.lang.String str = this.f467893e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.df6 df6Var = this.f467894f;
            if (df6Var != null) {
                fVar.i(3, df6Var.mo75928xcd1e8d8());
                this.f467894f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f467895g);
            fVar.k(5, 2, this.f467896h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f467892d) + 0;
            java.lang.String str2 = this.f467893e;
            if (str2 != null) {
                h17 += b36.f.j(2, str2);
            }
            r45.df6 df6Var2 = this.f467894f;
            if (df6Var2 != null) {
                h17 += b36.f.i(3, df6Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.e(4, this.f467895g) + b36.f.k(5, 2, this.f467896h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f467896h.clear();
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
        r45.te6 te6Var = (r45.te6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            te6Var.f467892d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            te6Var.f467893e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.df6 df6Var3 = new r45.df6();
                if (bArr2 != null && bArr2.length > 0) {
                    df6Var3.mo11468x92b714fd(bArr2);
                }
                te6Var.f467894f = df6Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            te6Var.f467895g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        byte[] bArr3 = aVar2.d(intValue).f273689a;
        d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
        e36.a aVar3 = new e36.a(bArr3, 0, bArr3.length);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (aVar3.f329129c < aVar3.f329128b) {
            linkedList.add(java.lang.Integer.valueOf(aVar3.f()));
        }
        te6Var.f467896h = linkedList;
        return 0;
    }
}

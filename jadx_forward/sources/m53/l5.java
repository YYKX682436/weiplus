package m53;

/* loaded from: classes8.dex */
public class l5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f405416d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public m53.n5 f405417e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405418f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405419g;

    /* renamed from: h, reason: collision with root package name */
    public m53.i3 f405420h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.l5)) {
            return false;
        }
        m53.l5 l5Var = (m53.l5) fVar;
        return n51.f.a(this.f405416d, l5Var.f405416d) && n51.f.a(this.f405417e, l5Var.f405417e) && n51.f.a(this.f405418f, l5Var.f405418f) && n51.f.a(this.f405419g, l5Var.f405419g) && n51.f.a(this.f405420h, l5Var.f405420h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405416d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            m53.n5 n5Var = this.f405417e;
            if (n5Var != null) {
                fVar.i(2, n5Var.mo75928xcd1e8d8());
                this.f405417e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f405418f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f405419g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            m53.i3 i3Var = this.f405420h;
            if (i3Var != null) {
                fVar.i(5, i3Var.mo75928xcd1e8d8());
                this.f405420h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            m53.n5 n5Var2 = this.f405417e;
            if (n5Var2 != null) {
                g17 += b36.f.i(2, n5Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f405418f;
            if (str3 != null) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f405419g;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            m53.i3 i3Var2 = this.f405420h;
            return i3Var2 != null ? g17 + b36.f.i(5, i3Var2.mo75928xcd1e8d8()) : g17;
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
        m53.l5 l5Var = (m53.l5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                m53.r5 r5Var = new m53.r5();
                if (bArr2 != null && bArr2.length > 0) {
                    r5Var.mo11468x92b714fd(bArr2);
                }
                l5Var.f405416d.add(r5Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                m53.n5 n5Var3 = new m53.n5();
                if (bArr3 != null && bArr3.length > 0) {
                    n5Var3.mo11468x92b714fd(bArr3);
                }
                l5Var.f405417e = n5Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            l5Var.f405418f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            l5Var.f405419g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            m53.i3 i3Var3 = new m53.i3();
            if (bArr4 != null && bArr4.length > 0) {
                i3Var3.mo11468x92b714fd(bArr4);
            }
            l5Var.f405420h = i3Var3;
        }
        return 0;
    }
}

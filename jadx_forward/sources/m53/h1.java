package m53;

/* loaded from: classes2.dex */
public class h1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f405275d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405276e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f405277f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public m53.h6 f405278g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f405279h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.h1)) {
            return false;
        }
        m53.h1 h1Var = (m53.h1) fVar;
        return n51.f.a(this.f405275d, h1Var.f405275d) && n51.f.a(this.f405276e, h1Var.f405276e) && n51.f.a(this.f405277f, h1Var.f405277f) && n51.f.a(this.f405278g, h1Var.f405278g) && n51.f.a(this.f405279h, h1Var.f405279h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405277f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f405275d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f405276e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            m53.h6 h6Var = this.f405278g;
            if (h6Var != null) {
                fVar.i(4, h6Var.mo75928xcd1e8d8());
                this.f405278g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f405279h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f405275d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f405276e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            m53.h6 h6Var2 = this.f405278g;
            if (h6Var2 != null) {
                g17 += b36.f.i(4, h6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f405279h;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
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
        m53.h1 h1Var = (m53.h1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h1Var.f405275d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            h1Var.f405276e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                m53.l4 l4Var = new m53.l4();
                if (bArr2 != null && bArr2.length > 0) {
                    l4Var.mo11468x92b714fd(bArr2);
                }
                h1Var.f405277f.add(l4Var);
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            h1Var.f405279h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            m53.h6 h6Var3 = new m53.h6();
            if (bArr3 != null && bArr3.length > 0) {
                h6Var3.mo11468x92b714fd(bArr3);
            }
            h1Var.f405278g = h6Var3;
        }
        return 0;
    }
}

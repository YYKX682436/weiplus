package m53;

/* loaded from: classes8.dex */
public class m1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f405425d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f405426e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f405427f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f405428g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.m1)) {
            return false;
        }
        m53.m1 m1Var = (m53.m1) fVar;
        return n51.f.a(this.f405425d, m1Var.f405425d) && n51.f.a(this.f405426e, m1Var.f405426e) && n51.f.a(this.f405427f, m1Var.f405427f) && n51.f.a(this.f405428g, m1Var.f405428g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f405425d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f405426e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f405427f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f405428g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str4 = this.f405426e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f405427f;
            if (str5 != null) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f405428g;
            return str6 != null ? g17 + b36.f.j(4, str6) : g17;
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
        m53.m1 m1Var = (m53.m1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                m1Var.f405426e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                m1Var.f405427f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            m1Var.f405428g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            m53.o0 o0Var = new m53.o0();
            if (bArr2 != null && bArr2.length > 0) {
                o0Var.mo11468x92b714fd(bArr2);
            }
            m1Var.f405425d.add(o0Var);
        }
        return 0;
    }
}

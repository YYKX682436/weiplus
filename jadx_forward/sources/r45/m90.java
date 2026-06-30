package r45;

/* loaded from: classes2.dex */
public class m90 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f461805d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f461806e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f461807f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f461808g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461809h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461810i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m90)) {
            return false;
        }
        r45.m90 m90Var = (r45.m90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f461805d), java.lang.Integer.valueOf(m90Var.f461805d)) && n51.f.a(this.f461806e, m90Var.f461806e) && n51.f.a(this.f461807f, m90Var.f461807f) && n51.f.a(this.f461808g, m90Var.f461808g) && n51.f.a(this.f461809h, m90Var.f461809h) && n51.f.a(this.f461810i, m90Var.f461810i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461808g;
        java.util.LinkedList linkedList2 = this.f461807f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f461805d);
            r45.rl6 rl6Var = this.f461806e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.mo75928xcd1e8d8());
                this.f461806e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f461809h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f461810i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f461805d) + 0;
            r45.rl6 rl6Var2 = this.f461806e;
            if (rl6Var2 != null) {
                e17 += b36.f.i(2, rl6Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
            java.lang.String str3 = this.f461809h;
            if (str3 != null) {
                g17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f461810i;
            return str4 != null ? g17 + b36.f.j(6, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.m90 m90Var = (r45.m90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m90Var.f461805d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.rl6 rl6Var3 = new r45.rl6();
                    if (bArr2 != null && bArr2.length > 0) {
                        rl6Var3.mo11468x92b714fd(bArr2);
                    }
                    m90Var.f461806e = rl6Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.rl6 rl6Var4 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var4.mo11468x92b714fd(bArr3);
                    }
                    m90Var.f461807f.add(rl6Var4);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.rl6 rl6Var5 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var5.mo11468x92b714fd(bArr4);
                    }
                    m90Var.f461808g.add(rl6Var5);
                }
                return 0;
            case 5:
                m90Var.f461809h = aVar2.k(intValue);
                return 0;
            case 6:
                m90Var.f461810i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

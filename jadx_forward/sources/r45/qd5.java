package r45;

/* loaded from: classes2.dex */
public class qd5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f465392d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f465393e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f465394f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f465395g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f465396h;

    /* renamed from: i, reason: collision with root package name */
    public int f465397i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd5)) {
            return false;
        }
        r45.qd5 qd5Var = (r45.qd5) fVar;
        return n51.f.a(this.f465392d, qd5Var.f465392d) && n51.f.a(this.f465393e, qd5Var.f465393e) && n51.f.a(this.f465394f, qd5Var.f465394f) && n51.f.a(this.f465395g, qd5Var.f465395g) && n51.f.a(java.lang.Boolean.valueOf(this.f465396h), java.lang.Boolean.valueOf(qd5Var.f465396h)) && n51.f.a(java.lang.Integer.valueOf(this.f465397i), java.lang.Integer.valueOf(qd5Var.f465397i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f465392d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f465393e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f465394f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f465395g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f465396h);
            fVar.e(6, this.f465397i);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str4 = this.f465393e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f465394f;
            if (str5 != null) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f465395g;
            if (str6 != null) {
                g17 += b36.f.j(4, str6);
            }
            return g17 + b36.f.a(5, this.f465396h) + b36.f.e(6, this.f465397i);
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
        r45.qd5 qd5Var = (r45.qd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.fx4 fx4Var = new r45.fx4();
                    if (bArr2 != null && bArr2.length > 0) {
                        fx4Var.mo11468x92b714fd(bArr2);
                    }
                    qd5Var.f465392d.add(fx4Var);
                }
                return 0;
            case 2:
                qd5Var.f465393e = aVar2.k(intValue);
                return 0;
            case 3:
                qd5Var.f465394f = aVar2.k(intValue);
                return 0;
            case 4:
                qd5Var.f465395g = aVar2.k(intValue);
                return 0;
            case 5:
                qd5Var.f465396h = aVar2.c(intValue);
                return 0;
            case 6:
                qd5Var.f465397i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

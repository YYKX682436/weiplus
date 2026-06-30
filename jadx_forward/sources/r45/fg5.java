package r45;

/* loaded from: classes8.dex */
public class fg5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f455850d;

    /* renamed from: e, reason: collision with root package name */
    public int f455851e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f455852f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f455853g;

    /* renamed from: h, reason: collision with root package name */
    public int f455854h;

    /* renamed from: i, reason: collision with root package name */
    public int f455855i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f455856m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fg5)) {
            return false;
        }
        r45.fg5 fg5Var = (r45.fg5) fVar;
        return n51.f.a(this.f455850d, fg5Var.f455850d) && n51.f.a(java.lang.Integer.valueOf(this.f455851e), java.lang.Integer.valueOf(fg5Var.f455851e)) && n51.f.a(java.lang.Boolean.valueOf(this.f455852f), java.lang.Boolean.valueOf(fg5Var.f455852f)) && n51.f.a(this.f455853g, fg5Var.f455853g) && n51.f.a(java.lang.Integer.valueOf(this.f455854h), java.lang.Integer.valueOf(fg5Var.f455854h)) && n51.f.a(java.lang.Integer.valueOf(this.f455855i), java.lang.Integer.valueOf(fg5Var.f455855i)) && n51.f.a(this.f455856m, fg5Var.f455856m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455856m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f455850d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f455851e);
            fVar.a(3, this.f455852f);
            java.lang.String str2 = this.f455853g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f455854h);
            fVar.e(6, this.f455855i);
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f455850d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f455851e) + b36.f.a(3, this.f455852f);
            java.lang.String str4 = this.f455853g;
            if (str4 != null) {
                j17 += b36.f.j(4, str4);
            }
            return j17 + b36.f.e(5, this.f455854h) + b36.f.e(6, this.f455855i) + b36.f.g(7, 8, linkedList);
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
        r45.fg5 fg5Var = (r45.fg5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fg5Var.f455850d = aVar2.k(intValue);
                return 0;
            case 2:
                fg5Var.f455851e = aVar2.g(intValue);
                return 0;
            case 3:
                fg5Var.f455852f = aVar2.c(intValue);
                return 0;
            case 4:
                fg5Var.f455853g = aVar2.k(intValue);
                return 0;
            case 5:
                fg5Var.f455854h = aVar2.g(intValue);
                return 0;
            case 6:
                fg5Var.f455855i = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.eg5 eg5Var = new r45.eg5();
                    if (bArr2 != null && bArr2.length > 0) {
                        eg5Var.mo11468x92b714fd(bArr2);
                    }
                    fg5Var.f455856m.add(eg5Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}

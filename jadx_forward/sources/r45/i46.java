package r45;

/* loaded from: classes4.dex */
public class i46 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f458258d;

    /* renamed from: e, reason: collision with root package name */
    public int f458259e;

    /* renamed from: f, reason: collision with root package name */
    public long f458260f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f458261g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f458262h;

    /* renamed from: i, reason: collision with root package name */
    public long f458263i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f458264m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.i46)) {
            return false;
        }
        r45.i46 i46Var = (r45.i46) fVar;
        return n51.f.a(this.f458258d, i46Var.f458258d) && n51.f.a(java.lang.Integer.valueOf(this.f458259e), java.lang.Integer.valueOf(i46Var.f458259e)) && n51.f.a(java.lang.Long.valueOf(this.f458260f), java.lang.Long.valueOf(i46Var.f458260f)) && n51.f.a(this.f458261g, i46Var.f458261g) && n51.f.a(this.f458262h, i46Var.f458262h) && n51.f.a(java.lang.Long.valueOf(this.f458263i), java.lang.Long.valueOf(i46Var.f458263i)) && n51.f.a(this.f458264m, i46Var.f458264m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f458258d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f458259e);
            fVar.h(3, this.f458260f);
            java.lang.String str2 = this.f458261g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f458262h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f458263i);
            fVar.g(7, 1, this.f458264m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f458258d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f458259e) + b36.f.h(3, this.f458260f);
            java.lang.String str5 = this.f458261g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f458262h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.h(6, this.f458263i) + b36.f.g(7, 1, this.f458264m);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f458264m.clear();
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
        r45.i46 i46Var = (r45.i46) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                i46Var.f458258d = aVar2.k(intValue);
                return 0;
            case 2:
                i46Var.f458259e = aVar2.g(intValue);
                return 0;
            case 3:
                i46Var.f458260f = aVar2.i(intValue);
                return 0;
            case 4:
                i46Var.f458261g = aVar2.k(intValue);
                return 0;
            case 5:
                i46Var.f458262h = aVar2.k(intValue);
                return 0;
            case 6:
                i46Var.f458263i = aVar2.i(intValue);
                return 0;
            case 7:
                i46Var.f458264m.add(aVar2.k(intValue));
                return 0;
            default:
                return -1;
        }
    }
}

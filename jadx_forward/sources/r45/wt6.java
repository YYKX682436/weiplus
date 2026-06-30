package r45;

/* loaded from: classes4.dex */
public class wt6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470984d;

    /* renamed from: e, reason: collision with root package name */
    public int f470985e;

    /* renamed from: f, reason: collision with root package name */
    public int f470986f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f470987g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470988h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470989i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f470990m;

    static {
        new r45.wt6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.wt6 mo11468x92b714fd(byte[] bArr) {
        return (r45.wt6) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wt6)) {
            return false;
        }
        r45.wt6 wt6Var = (r45.wt6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470984d), java.lang.Integer.valueOf(wt6Var.f470984d)) && n51.f.a(java.lang.Integer.valueOf(this.f470985e), java.lang.Integer.valueOf(wt6Var.f470985e)) && n51.f.a(java.lang.Integer.valueOf(this.f470986f), java.lang.Integer.valueOf(wt6Var.f470986f)) && n51.f.a(this.f470987g, wt6Var.f470987g) && n51.f.a(java.lang.Boolean.valueOf(this.f470988h), java.lang.Boolean.valueOf(wt6Var.f470988h)) && n51.f.a(this.f470989i, wt6Var.f470989i) && n51.f.a(java.lang.Boolean.valueOf(this.f470990m), java.lang.Boolean.valueOf(wt6Var.f470990m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.wt6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470984d);
            fVar.e(2, this.f470985e);
            fVar.e(3, this.f470986f);
            java.lang.String str = this.f470987g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.a(5, this.f470988h);
            java.lang.String str2 = this.f470989i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f470990m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470984d) + 0 + b36.f.e(2, this.f470985e) + b36.f.e(3, this.f470986f);
            java.lang.String str3 = this.f470987g;
            if (str3 != null) {
                e17 += b36.f.j(4, str3);
            }
            int a17 = e17 + b36.f.a(5, this.f470988h);
            java.lang.String str4 = this.f470989i;
            if (str4 != null) {
                a17 += b36.f.j(6, str4);
            }
            return a17 + b36.f.a(7, this.f470990m);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f470984d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f470985e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f470986f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f470987g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f470988h = aVar2.c(intValue);
                return 0;
            case 6:
                this.f470989i = aVar2.k(intValue);
                return 0;
            case 7:
                this.f470990m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

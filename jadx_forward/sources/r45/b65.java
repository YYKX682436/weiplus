package r45;

/* loaded from: classes9.dex */
public class b65 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452103d;

    /* renamed from: e, reason: collision with root package name */
    public int f452104e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452105f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452106g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f452107h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f452108i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.b65)) {
            return false;
        }
        r45.b65 b65Var = (r45.b65) fVar;
        return n51.f.a(this.f452103d, b65Var.f452103d) && n51.f.a(java.lang.Integer.valueOf(this.f452104e), java.lang.Integer.valueOf(b65Var.f452104e)) && n51.f.a(this.f452105f, b65Var.f452105f) && n51.f.a(this.f452106g, b65Var.f452106g) && n51.f.a(this.f452107h, b65Var.f452107h) && n51.f.a(this.f452108i, b65Var.f452108i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452103d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f452104e);
            java.lang.String str2 = this.f452105f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f452106g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f452107h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f452108i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f452103d;
            int j17 = (str6 != null ? 0 + b36.f.j(1, str6) : 0) + b36.f.e(2, this.f452104e);
            java.lang.String str7 = this.f452105f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f452106g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f452107h;
            if (str9 != null) {
                j17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f452108i;
            return str10 != null ? j17 + b36.f.j(6, str10) : j17;
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
        r45.b65 b65Var = (r45.b65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                b65Var.f452103d = aVar2.k(intValue);
                return 0;
            case 2:
                b65Var.f452104e = aVar2.g(intValue);
                return 0;
            case 3:
                b65Var.f452105f = aVar2.k(intValue);
                return 0;
            case 4:
                b65Var.f452106g = aVar2.k(intValue);
                return 0;
            case 5:
                b65Var.f452107h = aVar2.k(intValue);
                return 0;
            case 6:
                b65Var.f452108i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

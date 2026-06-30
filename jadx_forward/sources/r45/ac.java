package r45;

/* loaded from: classes9.dex */
public class ac extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f451440d;

    /* renamed from: e, reason: collision with root package name */
    public int f451441e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451442f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451443g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f451444h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac)) {
            return false;
        }
        r45.ac acVar = (r45.ac) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f451440d), java.lang.Boolean.valueOf(acVar.f451440d)) && n51.f.a(java.lang.Integer.valueOf(this.f451441e), java.lang.Integer.valueOf(acVar.f451441e)) && n51.f.a(this.f451442f, acVar.f451442f) && n51.f.a(this.f451443g, acVar.f451443g) && n51.f.a(this.f451444h, acVar.f451444h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f451440d);
            fVar.e(2, this.f451441e);
            java.lang.String str = this.f451442f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f451443g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f451444h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f451440d) + 0 + b36.f.e(2, this.f451441e);
            java.lang.String str4 = this.f451442f;
            if (str4 != null) {
                a17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f451443g;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f451444h;
            return str6 != null ? a17 + b36.f.j(5, str6) : a17;
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
        r45.ac acVar = (r45.ac) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            acVar.f451440d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            acVar.f451441e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            acVar.f451442f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            acVar.f451443g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        acVar.f451444h = aVar2.k(intValue);
        return 0;
    }
}

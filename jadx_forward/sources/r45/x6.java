package r45;

/* loaded from: classes8.dex */
public class x6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f471340d;

    /* renamed from: e, reason: collision with root package name */
    public int f471341e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f471342f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471343g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471344h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471345i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x6)) {
            return false;
        }
        r45.x6 x6Var = (r45.x6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f471340d), java.lang.Integer.valueOf(x6Var.f471340d)) && n51.f.a(java.lang.Integer.valueOf(this.f471341e), java.lang.Integer.valueOf(x6Var.f471341e)) && n51.f.a(this.f471342f, x6Var.f471342f) && n51.f.a(this.f471343g, x6Var.f471343g) && n51.f.a(this.f471344h, x6Var.f471344h) && n51.f.a(this.f471345i, x6Var.f471345i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f471340d);
            fVar.e(2, this.f471341e);
            java.lang.String str = this.f471342f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f471343g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f471344h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f471345i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f471340d) + 0 + b36.f.e(2, this.f471341e);
            java.lang.String str5 = this.f471342f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f471343g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f471344h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f471345i;
            return str8 != null ? e17 + b36.f.j(6, str8) : e17;
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
        r45.x6 x6Var = (r45.x6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                x6Var.f471340d = aVar2.g(intValue);
                return 0;
            case 2:
                x6Var.f471341e = aVar2.g(intValue);
                return 0;
            case 3:
                x6Var.f471342f = aVar2.k(intValue);
                return 0;
            case 4:
                x6Var.f471343g = aVar2.k(intValue);
                return 0;
            case 5:
                x6Var.f471344h = aVar2.k(intValue);
                return 0;
            case 6:
                x6Var.f471345i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

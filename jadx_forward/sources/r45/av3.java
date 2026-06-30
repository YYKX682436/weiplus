package r45;

/* loaded from: classes9.dex */
public class av3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451805e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f451806f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f451807g;

    /* renamed from: h, reason: collision with root package name */
    public int f451808h;

    /* renamed from: i, reason: collision with root package name */
    public r45.zu3 f451809i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.av3)) {
            return false;
        }
        r45.av3 av3Var = (r45.av3) fVar;
        return n51.f.a(this.f451804d, av3Var.f451804d) && n51.f.a(this.f451805e, av3Var.f451805e) && n51.f.a(this.f451806f, av3Var.f451806f) && n51.f.a(java.lang.Boolean.valueOf(this.f451807g), java.lang.Boolean.valueOf(av3Var.f451807g)) && n51.f.a(java.lang.Integer.valueOf(this.f451808h), java.lang.Integer.valueOf(av3Var.f451808h)) && n51.f.a(this.f451809i, av3Var.f451809i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451804d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451805e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f451806f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.a(4, this.f451807g);
            fVar.e(5, this.f451808h);
            r45.zu3 zu3Var = this.f451809i;
            if (zu3Var != null) {
                fVar.i(6, zu3Var.mo75928xcd1e8d8());
                this.f451809i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f451804d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f451805e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f451806f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            int a17 = j17 + b36.f.a(4, this.f451807g) + b36.f.e(5, this.f451808h);
            r45.zu3 zu3Var2 = this.f451809i;
            return zu3Var2 != null ? a17 + b36.f.i(6, zu3Var2.mo75928xcd1e8d8()) : a17;
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
        r45.av3 av3Var = (r45.av3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                av3Var.f451804d = aVar2.k(intValue);
                return 0;
            case 2:
                av3Var.f451805e = aVar2.k(intValue);
                return 0;
            case 3:
                av3Var.f451806f = aVar2.k(intValue);
                return 0;
            case 4:
                av3Var.f451807g = aVar2.c(intValue);
                return 0;
            case 5:
                av3Var.f451808h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.zu3 zu3Var3 = new r45.zu3();
                    if (bArr != null && bArr.length > 0) {
                        zu3Var3.mo11468x92b714fd(bArr);
                    }
                    av3Var.f451809i = zu3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

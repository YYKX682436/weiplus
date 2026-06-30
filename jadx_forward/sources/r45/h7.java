package r45;

/* loaded from: classes9.dex */
public class h7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457425d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f457426e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457427f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457428g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457429h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h7)) {
            return false;
        }
        r45.h7 h7Var = (r45.h7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457425d), java.lang.Integer.valueOf(h7Var.f457425d)) && n51.f.a(this.f457426e, h7Var.f457426e) && n51.f.a(this.f457427f, h7Var.f457427f) && n51.f.a(this.f457428g, h7Var.f457428g) && n51.f.a(this.f457429h, h7Var.f457429h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457425d);
            java.lang.String str = this.f457426e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f457427f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457428g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f457429h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457425d) + 0;
            java.lang.String str5 = this.f457426e;
            if (str5 != null) {
                e17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f457427f;
            if (str6 != null) {
                e17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f457428g;
            if (str7 != null) {
                e17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f457429h;
            return str8 != null ? e17 + b36.f.j(5, str8) : e17;
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
        r45.h7 h7Var = (r45.h7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h7Var.f457425d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            h7Var.f457426e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            h7Var.f457427f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            h7Var.f457428g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h7Var.f457429h = aVar2.k(intValue);
        return 0;
    }
}

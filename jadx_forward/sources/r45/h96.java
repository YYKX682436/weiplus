package r45;

/* loaded from: classes4.dex */
public class h96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457498d;

    /* renamed from: e, reason: collision with root package name */
    public int f457499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457500f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f457501g;

    /* renamed from: h, reason: collision with root package name */
    public int f457502h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h96)) {
            return false;
        }
        r45.h96 h96Var = (r45.h96) fVar;
        return n51.f.a(this.f457498d, h96Var.f457498d) && n51.f.a(java.lang.Integer.valueOf(this.f457499e), java.lang.Integer.valueOf(h96Var.f457499e)) && n51.f.a(this.f457500f, h96Var.f457500f) && n51.f.a(this.f457501g, h96Var.f457501g) && n51.f.a(java.lang.Integer.valueOf(this.f457502h), java.lang.Integer.valueOf(h96Var.f457502h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f457498d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f457499e);
            java.lang.String str2 = this.f457500f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f457501g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f457502h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f457498d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f457499e);
            java.lang.String str5 = this.f457500f;
            if (str5 != null) {
                j17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f457501g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            return j17 + b36.f.e(5, this.f457502h);
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
        r45.h96 h96Var = (r45.h96) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            h96Var.f457498d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            h96Var.f457499e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            h96Var.f457500f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            h96Var.f457501g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        h96Var.f457502h = aVar2.g(intValue);
        return 0;
    }
}

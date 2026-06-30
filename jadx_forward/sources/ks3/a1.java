package ks3;

/* loaded from: classes8.dex */
public class a1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f393151d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393152e;

    /* renamed from: f, reason: collision with root package name */
    public int f393153f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f393154g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f393155h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.a1)) {
            return false;
        }
        ks3.a1 a1Var = (ks3.a1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f393151d), java.lang.Long.valueOf(a1Var.f393151d)) && n51.f.a(this.f393152e, a1Var.f393152e) && n51.f.a(java.lang.Integer.valueOf(this.f393153f), java.lang.Integer.valueOf(a1Var.f393153f)) && n51.f.a(this.f393154g, a1Var.f393154g) && n51.f.a(this.f393155h, a1Var.f393155h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f393151d);
            java.lang.String str = this.f393152e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f393153f);
            java.lang.String str2 = this.f393154g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f393155h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f393151d) + 0;
            java.lang.String str4 = this.f393152e;
            if (str4 != null) {
                h17 += b36.f.j(2, str4);
            }
            int e17 = h17 + b36.f.e(3, this.f393153f);
            java.lang.String str5 = this.f393154g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f393155h;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        ks3.a1 a1Var = (ks3.a1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            a1Var.f393151d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            a1Var.f393152e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            a1Var.f393153f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            a1Var.f393154g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        a1Var.f393155h = aVar2.k(intValue);
        return 0;
    }
}

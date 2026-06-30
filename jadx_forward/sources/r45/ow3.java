package r45;

/* loaded from: classes9.dex */
public class ow3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464108d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464109e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464110f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464111g;

    /* renamed from: h, reason: collision with root package name */
    public long f464112h;

    /* renamed from: i, reason: collision with root package name */
    public int f464113i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ow3)) {
            return false;
        }
        r45.ow3 ow3Var = (r45.ow3) fVar;
        return n51.f.a(this.f464108d, ow3Var.f464108d) && n51.f.a(this.f464109e, ow3Var.f464109e) && n51.f.a(this.f464110f, ow3Var.f464110f) && n51.f.a(this.f464111g, ow3Var.f464111g) && n51.f.a(java.lang.Long.valueOf(this.f464112h), java.lang.Long.valueOf(ow3Var.f464112h)) && n51.f.a(java.lang.Integer.valueOf(this.f464113i), java.lang.Integer.valueOf(ow3Var.f464113i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464108d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f464109e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f464110f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f464111g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            fVar.h(6, this.f464112h);
            fVar.e(5, this.f464113i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f464108d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f464109e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f464110f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f464111g;
            if (str8 != null) {
                j17 += b36.f.j(4, str8);
            }
            return j17 + b36.f.h(6, this.f464112h) + b36.f.e(5, this.f464113i);
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
        r45.ow3 ow3Var = (r45.ow3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ow3Var.f464108d = aVar2.k(intValue);
                return 0;
            case 2:
                ow3Var.f464109e = aVar2.k(intValue);
                return 0;
            case 3:
                ow3Var.f464110f = aVar2.k(intValue);
                return 0;
            case 4:
                ow3Var.f464111g = aVar2.k(intValue);
                return 0;
            case 5:
                ow3Var.f464113i = aVar2.g(intValue);
                return 0;
            case 6:
                ow3Var.f464112h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

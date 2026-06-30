package r45;

/* loaded from: classes7.dex */
public class bm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452398d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452399e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452400f;

    /* renamed from: g, reason: collision with root package name */
    public long f452401g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bm0)) {
            return false;
        }
        r45.bm0 bm0Var = (r45.bm0) fVar;
        return n51.f.a(this.f452398d, bm0Var.f452398d) && n51.f.a(this.f452399e, bm0Var.f452399e) && n51.f.a(this.f452400f, bm0Var.f452400f) && n51.f.a(java.lang.Long.valueOf(this.f452401g), java.lang.Long.valueOf(bm0Var.f452401g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452398d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452399e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f452400f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.h(4, this.f452401g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f452398d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f452399e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f452400f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.h(4, this.f452401g);
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
        r45.bm0 bm0Var = (r45.bm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            bm0Var.f452398d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            bm0Var.f452399e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            bm0Var.f452400f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        bm0Var.f452401g = aVar2.i(intValue);
        return 0;
    }
}

package r45;

/* loaded from: classes2.dex */
public class v31 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469380d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469381e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f469382f;

    /* renamed from: g, reason: collision with root package name */
    public long f469383g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v31)) {
            return false;
        }
        r45.v31 v31Var = (r45.v31) fVar;
        return n51.f.a(this.f469380d, v31Var.f469380d) && n51.f.a(this.f469381e, v31Var.f469381e) && n51.f.a(java.lang.Boolean.valueOf(this.f469382f), java.lang.Boolean.valueOf(v31Var.f469382f)) && n51.f.a(java.lang.Long.valueOf(this.f469383g), java.lang.Long.valueOf(v31Var.f469383g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469380d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469381e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.a(3, this.f469382f);
            fVar.h(4, this.f469383g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f469380d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f469381e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.a(3, this.f469382f) + b36.f.h(4, this.f469383g);
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
        r45.v31 v31Var = (r45.v31) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v31Var.f469380d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            v31Var.f469381e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v31Var.f469382f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        v31Var.f469383g = aVar2.i(intValue);
        return 0;
    }
}

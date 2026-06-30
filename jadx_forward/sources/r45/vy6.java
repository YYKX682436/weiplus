package r45;

/* loaded from: classes4.dex */
public class vy6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470210d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470211e;

    /* renamed from: f, reason: collision with root package name */
    public long f470212f;

    /* renamed from: g, reason: collision with root package name */
    public long f470213g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vy6)) {
            return false;
        }
        r45.vy6 vy6Var = (r45.vy6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470210d), java.lang.Integer.valueOf(vy6Var.f470210d)) && n51.f.a(this.f470211e, vy6Var.f470211e) && n51.f.a(java.lang.Long.valueOf(this.f470212f), java.lang.Long.valueOf(vy6Var.f470212f)) && n51.f.a(java.lang.Long.valueOf(this.f470213g), java.lang.Long.valueOf(vy6Var.f470213g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470210d);
            java.lang.String str = this.f470211e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f470212f);
            fVar.h(4, this.f470213g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470210d) + 0;
            java.lang.String str2 = this.f470211e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f470212f) + b36.f.h(4, this.f470213g);
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
        r45.vy6 vy6Var = (r45.vy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vy6Var.f470210d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            vy6Var.f470211e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            vy6Var.f470212f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        vy6Var.f470213g = aVar2.i(intValue);
        return 0;
    }
}

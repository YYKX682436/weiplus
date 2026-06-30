package r45;

/* loaded from: classes8.dex */
public class y30 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f472268d;

    /* renamed from: e, reason: collision with root package name */
    public int f472269e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472270f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472271g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.y30)) {
            return false;
        }
        r45.y30 y30Var = (r45.y30) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f472268d), java.lang.Long.valueOf(y30Var.f472268d)) && n51.f.a(java.lang.Integer.valueOf(this.f472269e), java.lang.Integer.valueOf(y30Var.f472269e)) && n51.f.a(this.f472270f, y30Var.f472270f) && n51.f.a(this.f472271g, y30Var.f472271g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f472268d);
            fVar.e(2, this.f472269e);
            java.lang.String str = this.f472270f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f472271g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f472268d) + 0 + b36.f.e(2, this.f472269e);
            java.lang.String str3 = this.f472270f;
            if (str3 != null) {
                h17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f472271g;
            return str4 != null ? h17 + b36.f.j(4, str4) : h17;
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
        r45.y30 y30Var = (r45.y30) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            y30Var.f472268d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            y30Var.f472269e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            y30Var.f472270f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        y30Var.f472271g = aVar2.k(intValue);
        return 0;
    }
}

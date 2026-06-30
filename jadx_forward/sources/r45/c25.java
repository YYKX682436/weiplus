package r45;

/* loaded from: classes2.dex */
public class c25 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452775d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f452776e;

    /* renamed from: f, reason: collision with root package name */
    public int f452777f;

    /* renamed from: g, reason: collision with root package name */
    public int f452778g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.c25)) {
            return false;
        }
        r45.c25 c25Var = (r45.c25) fVar;
        return n51.f.a(this.f452775d, c25Var.f452775d) && n51.f.a(this.f452776e, c25Var.f452776e) && n51.f.a(java.lang.Integer.valueOf(this.f452777f), java.lang.Integer.valueOf(c25Var.f452777f)) && n51.f.a(java.lang.Integer.valueOf(this.f452778g), java.lang.Integer.valueOf(c25Var.f452778g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f452775d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f452776e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f452777f);
            fVar.e(4, this.f452778g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f452775d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f452776e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f452777f) + b36.f.e(4, this.f452778g);
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
        r45.c25 c25Var = (r45.c25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c25Var.f452775d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            c25Var.f452776e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            c25Var.f452777f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        c25Var.f452778g = aVar2.g(intValue);
        return 0;
    }
}

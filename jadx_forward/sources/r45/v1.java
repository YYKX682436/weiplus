package r45;

/* loaded from: classes2.dex */
public class v1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f469326d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f469327e;

    /* renamed from: f, reason: collision with root package name */
    public int f469328f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rl6 f469329g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v1)) {
            return false;
        }
        r45.v1 v1Var = (r45.v1) fVar;
        return n51.f.a(this.f469326d, v1Var.f469326d) && n51.f.a(this.f469327e, v1Var.f469327e) && n51.f.a(java.lang.Integer.valueOf(this.f469328f), java.lang.Integer.valueOf(v1Var.f469328f)) && n51.f.a(this.f469329g, v1Var.f469329g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469326d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            r45.rl6 rl6Var = this.f469327e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.mo75928xcd1e8d8());
                this.f469327e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f469328f);
            r45.rl6 rl6Var2 = this.f469329g;
            if (rl6Var2 != null) {
                fVar.i(4, rl6Var2.mo75928xcd1e8d8());
                this.f469329g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            r45.rl6 rl6Var3 = this.f469327e;
            if (rl6Var3 != null) {
                g17 += b36.f.i(2, rl6Var3.mo75928xcd1e8d8());
            }
            int e17 = g17 + b36.f.e(3, this.f469328f);
            r45.rl6 rl6Var4 = this.f469329g;
            return rl6Var4 != null ? e17 + b36.f.i(4, rl6Var4.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.v1 v1Var = (r45.v1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.u1 u1Var = new r45.u1();
                if (bArr2 != null && bArr2.length > 0) {
                    u1Var.mo11468x92b714fd(bArr2);
                }
                v1Var.f469326d.add(u1Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.rl6 rl6Var5 = new r45.rl6();
                if (bArr3 != null && bArr3.length > 0) {
                    rl6Var5.mo11468x92b714fd(bArr3);
                }
                v1Var.f469327e = rl6Var5;
            }
            return 0;
        }
        if (intValue == 3) {
            v1Var.f469328f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.rl6 rl6Var6 = new r45.rl6();
            if (bArr4 != null && bArr4.length > 0) {
                rl6Var6.mo11468x92b714fd(bArr4);
            }
            v1Var.f469329g = rl6Var6;
        }
        return 0;
    }
}

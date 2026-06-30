package r45;

/* loaded from: classes2.dex */
public class m25 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f461633d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f461634e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zi6 f461635f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f461636g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f461637h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m25)) {
            return false;
        }
        r45.m25 m25Var = (r45.m25) fVar;
        return n51.f.a(this.f461633d, m25Var.f461633d) && n51.f.a(this.f461634e, m25Var.f461634e) && n51.f.a(this.f461635f, m25Var.f461635f) && n51.f.a(java.lang.Boolean.valueOf(this.f461636g), java.lang.Boolean.valueOf(m25Var.f461636g)) && n51.f.a(java.lang.Boolean.valueOf(this.f461637h), java.lang.Boolean.valueOf(m25Var.f461637h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f461633d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.mo75928xcd1e8d8());
                this.f461633d.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var2 = this.f461634e;
            if (rl6Var2 != null) {
                fVar.i(2, rl6Var2.mo75928xcd1e8d8());
                this.f461634e.mo75956x3d5d1f78(fVar);
            }
            r45.zi6 zi6Var = this.f461635f;
            if (zi6Var != null) {
                fVar.i(3, zi6Var.mo75928xcd1e8d8());
                this.f461635f.mo75956x3d5d1f78(fVar);
            }
            fVar.a(4, this.f461636g);
            fVar.a(5, this.f461637h);
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f461633d;
            int i18 = rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.mo75928xcd1e8d8()) : 0;
            r45.rl6 rl6Var4 = this.f461634e;
            if (rl6Var4 != null) {
                i18 += b36.f.i(2, rl6Var4.mo75928xcd1e8d8());
            }
            r45.zi6 zi6Var2 = this.f461635f;
            if (zi6Var2 != null) {
                i18 += b36.f.i(3, zi6Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.a(4, this.f461636g) + b36.f.a(5, this.f461637h);
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
        r45.m25 m25Var = (r45.m25) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.rl6 rl6Var5 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var5.mo11468x92b714fd(bArr);
                }
                m25Var.f461633d = rl6Var5;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rl6 rl6Var6 = new r45.rl6();
                if (bArr2 != null && bArr2.length > 0) {
                    rl6Var6.mo11468x92b714fd(bArr2);
                }
                m25Var.f461634e = rl6Var6;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                m25Var.f461636g = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            m25Var.f461637h = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.zi6 zi6Var3 = new r45.zi6();
            if (bArr3 != null && bArr3.length > 0) {
                zi6Var3.mo11468x92b714fd(bArr3);
            }
            m25Var.f461635f = zi6Var3;
        }
        return 0;
    }
}

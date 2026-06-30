package r45;

/* loaded from: classes2.dex */
public class o66 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f463524d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gt5 f463525e;

    /* renamed from: f, reason: collision with root package name */
    public int f463526f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463527g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yt5 f463528h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o66)) {
            return false;
        }
        r45.o66 o66Var = (r45.o66) fVar;
        return n51.f.a(this.f463524d, o66Var.f463524d) && n51.f.a(this.f463525e, o66Var.f463525e) && n51.f.a(java.lang.Integer.valueOf(this.f463526f), java.lang.Integer.valueOf(o66Var.f463526f)) && n51.f.a(this.f463527g, o66Var.f463527g) && n51.f.a(this.f463528h, o66Var.f463528h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f463524d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.mo75928xcd1e8d8());
                this.f463524d.mo75956x3d5d1f78(fVar);
            }
            r45.gt5 gt5Var = this.f463525e;
            if (gt5Var != null) {
                fVar.i(2, gt5Var.mo75928xcd1e8d8());
                this.f463525e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f463526f);
            java.lang.String str = this.f463527g;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.yt5 yt5Var = this.f463528h;
            if (yt5Var != null) {
                fVar.i(5, yt5Var.mo75928xcd1e8d8());
                this.f463528h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f463524d;
            int i18 = rl6Var2 != null ? 0 + b36.f.i(1, rl6Var2.mo75928xcd1e8d8()) : 0;
            r45.gt5 gt5Var2 = this.f463525e;
            if (gt5Var2 != null) {
                i18 += b36.f.i(2, gt5Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f463526f);
            java.lang.String str2 = this.f463527g;
            if (str2 != null) {
                e17 += b36.f.j(4, str2);
            }
            r45.yt5 yt5Var2 = this.f463528h;
            return yt5Var2 != null ? e17 + b36.f.i(5, yt5Var2.mo75928xcd1e8d8()) : e17;
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
        r45.o66 o66Var = (r45.o66) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.rl6 rl6Var3 = new r45.rl6();
                if (bArr != null && bArr.length > 0) {
                    rl6Var3.mo11468x92b714fd(bArr);
                }
                o66Var.f463524d = rl6Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.gt5 gt5Var3 = new r45.gt5();
                if (bArr2 != null && bArr2.length > 0) {
                    gt5Var3.mo11468x92b714fd(bArr2);
                }
                o66Var.f463525e = gt5Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            o66Var.f463526f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            o66Var.f463527g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.yt5 yt5Var3 = new r45.yt5();
            if (bArr3 != null && bArr3.length > 0) {
                yt5Var3.mo11468x92b714fd(bArr3);
            }
            o66Var.f463528h = yt5Var3;
        }
        return 0;
    }
}

package r45;

/* loaded from: classes2.dex */
public class gt5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f457057d;

    /* renamed from: e, reason: collision with root package name */
    public int f457058e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yt5 f457059f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rl6 f457060g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f457061h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gt5)) {
            return false;
        }
        r45.gt5 gt5Var = (r45.gt5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f457057d), java.lang.Integer.valueOf(gt5Var.f457057d)) && n51.f.a(java.lang.Integer.valueOf(this.f457058e), java.lang.Integer.valueOf(gt5Var.f457058e)) && n51.f.a(this.f457059f, gt5Var.f457059f) && n51.f.a(this.f457060g, gt5Var.f457060g) && n51.f.a(this.f457061h, gt5Var.f457061h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f457057d);
            fVar.e(2, this.f457058e);
            r45.yt5 yt5Var = this.f457059f;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.mo75928xcd1e8d8());
                this.f457059f.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var = this.f457060g;
            if (rl6Var != null) {
                fVar.i(4, rl6Var.mo75928xcd1e8d8());
                this.f457060g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f457061h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f457057d) + 0 + b36.f.e(2, this.f457058e);
            r45.yt5 yt5Var2 = this.f457059f;
            if (yt5Var2 != null) {
                e17 += b36.f.i(3, yt5Var2.mo75928xcd1e8d8());
            }
            r45.rl6 rl6Var2 = this.f457060g;
            if (rl6Var2 != null) {
                e17 += b36.f.i(4, rl6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f457061h;
            return str2 != null ? e17 + b36.f.j(5, str2) : e17;
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
        r45.gt5 gt5Var = (r45.gt5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            gt5Var.f457057d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            gt5Var.f457058e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr != null && bArr.length > 0) {
                    yt5Var3.mo11468x92b714fd(bArr);
                }
                gt5Var.f457059f = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            gt5Var.f457061h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.rl6 rl6Var3 = new r45.rl6();
            if (bArr2 != null && bArr2.length > 0) {
                rl6Var3.mo11468x92b714fd(bArr2);
            }
            gt5Var.f457060g = rl6Var3;
        }
        return 0;
    }
}

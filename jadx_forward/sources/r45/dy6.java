package r45;

/* loaded from: classes11.dex */
public class dy6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f454393d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gc6 f454394e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hc6 f454395f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ic6 f454396g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dy6)) {
            return false;
        }
        r45.dy6 dy6Var = (r45.dy6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f454393d), java.lang.Integer.valueOf(dy6Var.f454393d)) && n51.f.a(this.f454394e, dy6Var.f454394e) && n51.f.a(this.f454395f, dy6Var.f454395f) && n51.f.a(this.f454396g, dy6Var.f454396g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f454393d);
            r45.gc6 gc6Var = this.f454394e;
            if (gc6Var != null) {
                fVar.i(2, gc6Var.mo75928xcd1e8d8());
                this.f454394e.mo75956x3d5d1f78(fVar);
            }
            r45.hc6 hc6Var = this.f454395f;
            if (hc6Var != null) {
                fVar.i(3, hc6Var.mo75928xcd1e8d8());
                this.f454395f.mo75956x3d5d1f78(fVar);
            }
            r45.ic6 ic6Var = this.f454396g;
            if (ic6Var != null) {
                fVar.i(4, ic6Var.mo75928xcd1e8d8());
                this.f454396g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f454393d) + 0;
            r45.gc6 gc6Var2 = this.f454394e;
            if (gc6Var2 != null) {
                e17 += b36.f.i(2, gc6Var2.mo75928xcd1e8d8());
            }
            r45.hc6 hc6Var2 = this.f454395f;
            if (hc6Var2 != null) {
                e17 += b36.f.i(3, hc6Var2.mo75928xcd1e8d8());
            }
            r45.ic6 ic6Var2 = this.f454396g;
            return ic6Var2 != null ? e17 + b36.f.i(4, ic6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.dy6 dy6Var = (r45.dy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dy6Var.f454393d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.gc6 gc6Var3 = new r45.gc6();
                if (bArr != null && bArr.length > 0) {
                    gc6Var3.mo11468x92b714fd(bArr);
                }
                dy6Var.f454394e = gc6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                r45.hc6 hc6Var3 = new r45.hc6();
                if (bArr2 != null && bArr2.length > 0) {
                    hc6Var3.mo11468x92b714fd(bArr2);
                }
                dy6Var.f454395f = hc6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            r45.ic6 ic6Var3 = new r45.ic6();
            if (bArr3 != null && bArr3.length > 0) {
                ic6Var3.mo11468x92b714fd(bArr3);
            }
            dy6Var.f454396g = ic6Var3;
        }
        return 0;
    }
}

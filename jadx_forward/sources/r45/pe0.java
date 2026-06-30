package r45;

/* loaded from: classes2.dex */
public class pe0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f464508d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f464509e;

    /* renamed from: f, reason: collision with root package name */
    public r45.gq f464510f;

    /* renamed from: g, reason: collision with root package name */
    public r45.gq f464511g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464512h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pe0)) {
            return false;
        }
        r45.pe0 pe0Var = (r45.pe0) fVar;
        return n51.f.a(this.f464508d, pe0Var.f464508d) && n51.f.a(this.f464509e, pe0Var.f464509e) && n51.f.a(this.f464510f, pe0Var.f464510f) && n51.f.a(this.f464511g, pe0Var.f464511g) && n51.f.a(this.f464512h, pe0Var.f464512h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f464508d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.mo75928xcd1e8d8());
                this.f464508d.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var2 = this.f464509e;
            if (rl6Var2 != null) {
                fVar.i(2, rl6Var2.mo75928xcd1e8d8());
                this.f464509e.mo75956x3d5d1f78(fVar);
            }
            r45.gq gqVar = this.f464510f;
            if (gqVar != null) {
                fVar.i(3, gqVar.mo75928xcd1e8d8());
                this.f464510f.mo75956x3d5d1f78(fVar);
            }
            r45.gq gqVar2 = this.f464511g;
            if (gqVar2 != null) {
                fVar.i(4, gqVar2.mo75928xcd1e8d8());
                this.f464511g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f464512h;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var3 = this.f464508d;
            int i18 = rl6Var3 != null ? 0 + b36.f.i(1, rl6Var3.mo75928xcd1e8d8()) : 0;
            r45.rl6 rl6Var4 = this.f464509e;
            if (rl6Var4 != null) {
                i18 += b36.f.i(2, rl6Var4.mo75928xcd1e8d8());
            }
            r45.gq gqVar3 = this.f464510f;
            if (gqVar3 != null) {
                i18 += b36.f.i(3, gqVar3.mo75928xcd1e8d8());
            }
            r45.gq gqVar4 = this.f464511g;
            if (gqVar4 != null) {
                i18 += b36.f.i(4, gqVar4.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f464512h;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        r45.pe0 pe0Var = (r45.pe0) objArr[1];
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
                pe0Var.f464508d = rl6Var5;
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
                pe0Var.f464509e = rl6Var6;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.gq gqVar5 = new r45.gq();
                if (bArr3 != null && bArr3.length > 0) {
                    gqVar5.mo11468x92b714fd(bArr3);
                }
                pe0Var.f464510f = gqVar5;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            pe0Var.f464512h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.gq gqVar6 = new r45.gq();
            if (bArr4 != null && bArr4.length > 0) {
                gqVar6.mo11468x92b714fd(bArr4);
            }
            pe0Var.f464511g = gqVar6;
        }
        return 0;
    }
}

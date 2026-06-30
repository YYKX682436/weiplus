package r45;

/* loaded from: classes2.dex */
public class g86 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f456525d;

    /* renamed from: e, reason: collision with root package name */
    public r45.wa6 f456526e;

    /* renamed from: f, reason: collision with root package name */
    public int f456527f;

    /* renamed from: g, reason: collision with root package name */
    public r45.zb6 f456528g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g86)) {
            return false;
        }
        r45.g86 g86Var = (r45.g86) fVar;
        return n51.f.a(this.f76492x92037252, g86Var.f76492x92037252) && n51.f.a(this.f456525d, g86Var.f456525d) && n51.f.a(this.f456526e, g86Var.f456526e) && n51.f.a(java.lang.Integer.valueOf(this.f456527f), java.lang.Integer.valueOf(g86Var.f456527f)) && n51.f.a(this.f456528g, g86Var.f456528g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7 = this.f456525d;
            if (c19806x4c372b7 != null) {
                fVar.i(2, c19806x4c372b7.mo75928xcd1e8d8());
                this.f456525d.mo75956x3d5d1f78(fVar);
            }
            r45.wa6 wa6Var = this.f456526e;
            if (wa6Var != null) {
                fVar.i(3, wa6Var.mo75928xcd1e8d8());
                this.f456526e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f456527f);
            r45.zb6 zb6Var = this.f456528g;
            if (zb6Var != null) {
                fVar.i(5, zb6Var.mo75928xcd1e8d8());
                this.f456528g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b72 = this.f456525d;
            if (c19806x4c372b72 != null) {
                i18 += b36.f.i(2, c19806x4c372b72.mo75928xcd1e8d8());
            }
            r45.wa6 wa6Var2 = this.f456526e;
            if (wa6Var2 != null) {
                i18 += b36.f.i(3, wa6Var2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f456527f);
            r45.zb6 zb6Var2 = this.f456528g;
            return zb6Var2 != null ? e17 + b36.f.i(5, zb6Var2.mo75928xcd1e8d8()) : e17;
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
        r45.g86 g86Var = (r45.g86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                g86Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b73 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7();
                if (bArr2 != null && bArr2.length > 0) {
                    c19806x4c372b73.mo11468x92b714fd(bArr2);
                }
                g86Var.f456525d = c19806x4c372b73;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.wa6 wa6Var3 = new r45.wa6();
                if (bArr3 != null && bArr3.length > 0) {
                    wa6Var3.mo11468x92b714fd(bArr3);
                }
                g86Var.f456526e = wa6Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            g86Var.f456527f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.zb6 zb6Var3 = new r45.zb6();
            if (bArr4 != null && bArr4.length > 0) {
                zb6Var3.mo11468x92b714fd(bArr4);
            }
            g86Var.f456528g = zb6Var3;
        }
        return 0;
    }
}

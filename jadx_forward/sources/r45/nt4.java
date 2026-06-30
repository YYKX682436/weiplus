package r45;

/* loaded from: classes2.dex */
public class nt4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.rl6 f463193d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pt4 f463194e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ot4 f463195f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ot4 f463196g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nt4)) {
            return false;
        }
        r45.nt4 nt4Var = (r45.nt4) fVar;
        return n51.f.a(this.f463193d, nt4Var.f463193d) && n51.f.a(this.f463194e, nt4Var.f463194e) && n51.f.a(this.f463195f, nt4Var.f463195f) && n51.f.a(this.f463196g, nt4Var.f463196g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.rl6 rl6Var = this.f463193d;
            if (rl6Var != null) {
                fVar.i(1, rl6Var.mo75928xcd1e8d8());
                this.f463193d.mo75956x3d5d1f78(fVar);
            }
            r45.pt4 pt4Var = this.f463194e;
            if (pt4Var != null) {
                fVar.i(2, pt4Var.mo75928xcd1e8d8());
                this.f463194e.mo75956x3d5d1f78(fVar);
            }
            r45.ot4 ot4Var = this.f463195f;
            if (ot4Var != null) {
                fVar.i(3, ot4Var.mo75928xcd1e8d8());
                this.f463195f.mo75956x3d5d1f78(fVar);
            }
            r45.ot4 ot4Var2 = this.f463196g;
            if (ot4Var2 != null) {
                fVar.i(4, ot4Var2.mo75928xcd1e8d8());
                this.f463196g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.rl6 rl6Var2 = this.f463193d;
            int i18 = rl6Var2 != null ? 0 + b36.f.i(1, rl6Var2.mo75928xcd1e8d8()) : 0;
            r45.pt4 pt4Var2 = this.f463194e;
            if (pt4Var2 != null) {
                i18 += b36.f.i(2, pt4Var2.mo75928xcd1e8d8());
            }
            r45.ot4 ot4Var3 = this.f463195f;
            if (ot4Var3 != null) {
                i18 += b36.f.i(3, ot4Var3.mo75928xcd1e8d8());
            }
            r45.ot4 ot4Var4 = this.f463196g;
            return ot4Var4 != null ? i18 + b36.f.i(4, ot4Var4.mo75928xcd1e8d8()) : i18;
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
        r45.nt4 nt4Var = (r45.nt4) objArr[1];
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
                nt4Var.f463193d = rl6Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.pt4 pt4Var3 = new r45.pt4();
                if (bArr2 != null && bArr2.length > 0) {
                    pt4Var3.mo11468x92b714fd(bArr2);
                }
                nt4Var.f463194e = pt4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.ot4 ot4Var5 = new r45.ot4();
                if (bArr3 != null && bArr3.length > 0) {
                    ot4Var5.mo11468x92b714fd(bArr3);
                }
                nt4Var.f463195f = ot4Var5;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.ot4 ot4Var6 = new r45.ot4();
            if (bArr4 != null && bArr4.length > 0) {
                ot4Var6.mo11468x92b714fd(bArr4);
            }
            nt4Var.f463196g = ot4Var6;
        }
        return 0;
    }
}

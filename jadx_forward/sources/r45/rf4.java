package r45;

/* loaded from: classes15.dex */
public class rf4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f466342d;

    /* renamed from: e, reason: collision with root package name */
    public r45.uf4 f466343e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tf4 f466344f;

    /* renamed from: g, reason: collision with root package name */
    public r45.sf4 f466345g;

    /* renamed from: h, reason: collision with root package name */
    public r45.qf4 f466346h;

    /* renamed from: i, reason: collision with root package name */
    public r45.vf4 f466347i;

    /* renamed from: m, reason: collision with root package name */
    public r45.wf4 f466348m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rf4)) {
            return false;
        }
        r45.rf4 rf4Var = (r45.rf4) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f466342d), java.lang.Integer.valueOf(rf4Var.f466342d)) && n51.f.a(this.f466343e, rf4Var.f466343e) && n51.f.a(this.f466344f, rf4Var.f466344f) && n51.f.a(this.f466345g, rf4Var.f466345g) && n51.f.a(this.f466346h, rf4Var.f466346h) && n51.f.a(this.f466347i, rf4Var.f466347i) && n51.f.a(this.f466348m, rf4Var.f466348m);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f466342d);
            r45.uf4 uf4Var = this.f466343e;
            if (uf4Var != null) {
                fVar.i(2, uf4Var.mo75928xcd1e8d8());
                this.f466343e.mo75956x3d5d1f78(fVar);
            }
            r45.tf4 tf4Var = this.f466344f;
            if (tf4Var != null) {
                fVar.i(3, tf4Var.mo75928xcd1e8d8());
                this.f466344f.mo75956x3d5d1f78(fVar);
            }
            r45.sf4 sf4Var = this.f466345g;
            if (sf4Var != null) {
                fVar.i(4, sf4Var.mo75928xcd1e8d8());
                this.f466345g.mo75956x3d5d1f78(fVar);
            }
            r45.qf4 qf4Var = this.f466346h;
            if (qf4Var != null) {
                fVar.i(5, qf4Var.mo75928xcd1e8d8());
                this.f466346h.mo75956x3d5d1f78(fVar);
            }
            r45.vf4 vf4Var = this.f466347i;
            if (vf4Var != null) {
                fVar.i(6, vf4Var.mo75928xcd1e8d8());
                this.f466347i.mo75956x3d5d1f78(fVar);
            }
            r45.wf4 wf4Var = this.f466348m;
            if (wf4Var != null) {
                fVar.i(7, wf4Var.mo75928xcd1e8d8());
                this.f466348m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f466342d) + 0;
            r45.uf4 uf4Var2 = this.f466343e;
            if (uf4Var2 != null) {
                e17 += b36.f.i(2, uf4Var2.mo75928xcd1e8d8());
            }
            r45.tf4 tf4Var2 = this.f466344f;
            if (tf4Var2 != null) {
                e17 += b36.f.i(3, tf4Var2.mo75928xcd1e8d8());
            }
            r45.sf4 sf4Var2 = this.f466345g;
            if (sf4Var2 != null) {
                e17 += b36.f.i(4, sf4Var2.mo75928xcd1e8d8());
            }
            r45.qf4 qf4Var2 = this.f466346h;
            if (qf4Var2 != null) {
                e17 += b36.f.i(5, qf4Var2.mo75928xcd1e8d8());
            }
            r45.vf4 vf4Var2 = this.f466347i;
            if (vf4Var2 != null) {
                e17 += b36.f.i(6, vf4Var2.mo75928xcd1e8d8());
            }
            r45.wf4 wf4Var2 = this.f466348m;
            return wf4Var2 != null ? e17 + b36.f.i(7, wf4Var2.mo75928xcd1e8d8()) : e17;
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
        r45.rf4 rf4Var = (r45.rf4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                rf4Var.f466342d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.uf4 uf4Var3 = new r45.uf4();
                    if (bArr != null && bArr.length > 0) {
                        uf4Var3.mo11468x92b714fd(bArr);
                    }
                    rf4Var.f466343e = uf4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.tf4 tf4Var3 = new r45.tf4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tf4Var3.mo11468x92b714fd(bArr2);
                    }
                    rf4Var.f466344f = tf4Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.sf4 sf4Var3 = new r45.sf4();
                    if (bArr3 != null && bArr3.length > 0) {
                        sf4Var3.mo11468x92b714fd(bArr3);
                    }
                    rf4Var.f466345g = sf4Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.qf4 qf4Var3 = new r45.qf4();
                    if (bArr4 != null && bArr4.length > 0) {
                        qf4Var3.mo11468x92b714fd(bArr4);
                    }
                    rf4Var.f466346h = qf4Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    r45.vf4 vf4Var3 = new r45.vf4();
                    if (bArr5 != null && bArr5.length > 0) {
                        vf4Var3.mo11468x92b714fd(bArr5);
                    }
                    rf4Var.f466347i = vf4Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    r45.wf4 wf4Var3 = new r45.wf4();
                    if (bArr6 != null && bArr6.length > 0) {
                        wf4Var3.mo11468x92b714fd(bArr6);
                    }
                    rf4Var.f466348m = wf4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

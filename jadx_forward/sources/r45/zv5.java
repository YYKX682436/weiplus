package r45;

/* loaded from: classes11.dex */
public class zv5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.nv3 f473943d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ov3 f473944e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f473945f;

    /* renamed from: g, reason: collision with root package name */
    public r45.tn4 f473946g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zv5)) {
            return false;
        }
        r45.zv5 zv5Var = (r45.zv5) fVar;
        return n51.f.a(this.f76492x92037252, zv5Var.f76492x92037252) && n51.f.a(this.f473943d, zv5Var.f473943d) && n51.f.a(this.f473944e, zv5Var.f473944e) && n51.f.a(this.f473945f, zv5Var.f473945f) && n51.f.a(this.f473946g, zv5Var.f473946g);
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
            r45.nv3 nv3Var = this.f473943d;
            if (nv3Var != null) {
                fVar.i(2, nv3Var.mo75928xcd1e8d8());
                this.f473943d.mo75956x3d5d1f78(fVar);
            }
            r45.ov3 ov3Var = this.f473944e;
            if (ov3Var != null) {
                fVar.i(3, ov3Var.mo75928xcd1e8d8());
                this.f473944e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f473945f;
            if (str != null) {
                fVar.j(4, str);
            }
            r45.tn4 tn4Var = this.f473946g;
            if (tn4Var != null) {
                fVar.i(5, tn4Var.mo75928xcd1e8d8());
                this.f473946g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.nv3 nv3Var2 = this.f473943d;
            if (nv3Var2 != null) {
                i18 += b36.f.i(2, nv3Var2.mo75928xcd1e8d8());
            }
            r45.ov3 ov3Var2 = this.f473944e;
            if (ov3Var2 != null) {
                i18 += b36.f.i(3, ov3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f473945f;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            r45.tn4 tn4Var2 = this.f473946g;
            return tn4Var2 != null ? i18 + b36.f.i(5, tn4Var2.mo75928xcd1e8d8()) : i18;
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
        r45.zv5 zv5Var = (r45.zv5) objArr[1];
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
                zv5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr2 != null && bArr2.length > 0) {
                    nv3Var3.mo11468x92b714fd(bArr2);
                }
                zv5Var.f473943d = nv3Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.ov3 ov3Var3 = new r45.ov3();
                if (bArr3 != null && bArr3.length > 0) {
                    ov3Var3.mo11468x92b714fd(bArr3);
                }
                zv5Var.f473944e = ov3Var3;
            }
            return 0;
        }
        if (intValue == 4) {
            zv5Var.f473945f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.tn4 tn4Var3 = new r45.tn4();
            if (bArr4 != null && bArr4.length > 0) {
                tn4Var3.mo11468x92b714fd(bArr4);
            }
            zv5Var.f473946g = tn4Var3;
        }
        return 0;
    }
}

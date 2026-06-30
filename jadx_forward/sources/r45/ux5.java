package r45;

/* loaded from: classes2.dex */
public class ux5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.tn4 f469251d;

    /* renamed from: e, reason: collision with root package name */
    public r45.nv3 f469252e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ov3 f469253f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469254g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ux5)) {
            return false;
        }
        r45.ux5 ux5Var = (r45.ux5) fVar;
        return n51.f.a(this.f76492x92037252, ux5Var.f76492x92037252) && n51.f.a(this.f469251d, ux5Var.f469251d) && n51.f.a(this.f469252e, ux5Var.f469252e) && n51.f.a(this.f469253f, ux5Var.f469253f) && n51.f.a(this.f469254g, ux5Var.f469254g);
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
            r45.tn4 tn4Var = this.f469251d;
            if (tn4Var != null) {
                fVar.i(2, tn4Var.mo75928xcd1e8d8());
                this.f469251d.mo75956x3d5d1f78(fVar);
            }
            r45.nv3 nv3Var = this.f469252e;
            if (nv3Var != null) {
                fVar.i(3, nv3Var.mo75928xcd1e8d8());
                this.f469252e.mo75956x3d5d1f78(fVar);
            }
            r45.ov3 ov3Var = this.f469253f;
            if (ov3Var != null) {
                fVar.i(4, ov3Var.mo75928xcd1e8d8());
                this.f469253f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469254g;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.tn4 tn4Var2 = this.f469251d;
            if (tn4Var2 != null) {
                i18 += b36.f.i(2, tn4Var2.mo75928xcd1e8d8());
            }
            r45.nv3 nv3Var2 = this.f469252e;
            if (nv3Var2 != null) {
                i18 += b36.f.i(3, nv3Var2.mo75928xcd1e8d8());
            }
            r45.ov3 ov3Var2 = this.f469253f;
            if (ov3Var2 != null) {
                i18 += b36.f.i(4, ov3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f469254g;
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
        r45.ux5 ux5Var = (r45.ux5) objArr[1];
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
                ux5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.tn4 tn4Var3 = new r45.tn4();
                if (bArr2 != null && bArr2.length > 0) {
                    tn4Var3.mo11468x92b714fd(bArr2);
                }
                ux5Var.f469251d = tn4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.nv3 nv3Var3 = new r45.nv3();
                if (bArr3 != null && bArr3.length > 0) {
                    nv3Var3.mo11468x92b714fd(bArr3);
                }
                ux5Var.f469252e = nv3Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            ux5Var.f469254g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.ov3 ov3Var3 = new r45.ov3();
            if (bArr4 != null && bArr4.length > 0) {
                ov3Var3.mo11468x92b714fd(bArr4);
            }
            ux5Var.f469253f = ov3Var3;
        }
        return 0;
    }
}

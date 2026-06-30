package r45;

/* loaded from: classes2.dex */
public class uw5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.tn4 f469229d;

    /* renamed from: e, reason: collision with root package name */
    public r45.nv3 f469230e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ov3 f469231f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469232g;

    /* renamed from: h, reason: collision with root package name */
    public int f469233h;

    /* renamed from: i, reason: collision with root package name */
    public r45.b7 f469234i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uw5)) {
            return false;
        }
        r45.uw5 uw5Var = (r45.uw5) fVar;
        return n51.f.a(this.f76492x92037252, uw5Var.f76492x92037252) && n51.f.a(this.f469229d, uw5Var.f469229d) && n51.f.a(this.f469230e, uw5Var.f469230e) && n51.f.a(this.f469231f, uw5Var.f469231f) && n51.f.a(this.f469232g, uw5Var.f469232g) && n51.f.a(java.lang.Integer.valueOf(this.f469233h), java.lang.Integer.valueOf(uw5Var.f469233h)) && n51.f.a(this.f469234i, uw5Var.f469234i);
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
            r45.tn4 tn4Var = this.f469229d;
            if (tn4Var != null) {
                fVar.i(2, tn4Var.mo75928xcd1e8d8());
                this.f469229d.mo75956x3d5d1f78(fVar);
            }
            r45.nv3 nv3Var = this.f469230e;
            if (nv3Var != null) {
                fVar.i(3, nv3Var.mo75928xcd1e8d8());
                this.f469230e.mo75956x3d5d1f78(fVar);
            }
            r45.ov3 ov3Var = this.f469231f;
            if (ov3Var != null) {
                fVar.i(4, ov3Var.mo75928xcd1e8d8());
                this.f469231f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469232g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f469233h);
            r45.b7 b7Var = this.f469234i;
            if (b7Var != null) {
                fVar.i(7, b7Var.mo75928xcd1e8d8());
                this.f469234i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.tn4 tn4Var2 = this.f469229d;
            if (tn4Var2 != null) {
                i18 += b36.f.i(2, tn4Var2.mo75928xcd1e8d8());
            }
            r45.nv3 nv3Var2 = this.f469230e;
            if (nv3Var2 != null) {
                i18 += b36.f.i(3, nv3Var2.mo75928xcd1e8d8());
            }
            r45.ov3 ov3Var2 = this.f469231f;
            if (ov3Var2 != null) {
                i18 += b36.f.i(4, ov3Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f469232g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            int e17 = i18 + b36.f.e(6, this.f469233h);
            r45.b7 b7Var2 = this.f469234i;
            return b7Var2 != null ? e17 + b36.f.i(7, b7Var2.mo75928xcd1e8d8()) : e17;
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
        r45.uw5 uw5Var = (r45.uw5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    uw5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.tn4 tn4Var3 = new r45.tn4();
                    if (bArr2 != null && bArr2.length > 0) {
                        tn4Var3.mo11468x92b714fd(bArr2);
                    }
                    uw5Var.f469229d = tn4Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.nv3 nv3Var3 = new r45.nv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        nv3Var3.mo11468x92b714fd(bArr3);
                    }
                    uw5Var.f469230e = nv3Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.ov3 ov3Var3 = new r45.ov3();
                    if (bArr4 != null && bArr4.length > 0) {
                        ov3Var3.mo11468x92b714fd(bArr4);
                    }
                    uw5Var.f469231f = ov3Var3;
                }
                return 0;
            case 5:
                uw5Var.f469232g = aVar2.k(intValue);
                return 0;
            case 6:
                uw5Var.f469233h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.b7 b7Var3 = new r45.b7();
                    if (bArr5 != null && bArr5.length > 0) {
                        b7Var3.mo11468x92b714fd(bArr5);
                    }
                    uw5Var.f469234i = b7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

package r45;

/* loaded from: classes11.dex */
public class tg extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f467921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467922e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tn4 f467923f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467924g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467925h;

    /* renamed from: i, reason: collision with root package name */
    public r45.nv3 f467926i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tg)) {
            return false;
        }
        r45.tg tgVar = (r45.tg) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f467921d), java.lang.Integer.valueOf(tgVar.f467921d)) && n51.f.a(this.f467922e, tgVar.f467922e) && n51.f.a(this.f467923f, tgVar.f467923f) && n51.f.a(this.f467924g, tgVar.f467924g) && n51.f.a(this.f467925h, tgVar.f467925h) && n51.f.a(this.f467926i, tgVar.f467926i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f467921d);
            java.lang.String str = this.f467922e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.tn4 tn4Var = this.f467923f;
            if (tn4Var != null) {
                fVar.i(3, tn4Var.mo75928xcd1e8d8());
                this.f467923f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f467924g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f467925h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.nv3 nv3Var = this.f467926i;
            if (nv3Var != null) {
                fVar.i(6, nv3Var.mo75928xcd1e8d8());
                this.f467926i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f467921d) + 0;
            java.lang.String str4 = this.f467922e;
            if (str4 != null) {
                e17 += b36.f.j(2, str4);
            }
            r45.tn4 tn4Var2 = this.f467923f;
            if (tn4Var2 != null) {
                e17 += b36.f.i(3, tn4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f467924g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f467925h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            r45.nv3 nv3Var2 = this.f467926i;
            return nv3Var2 != null ? e17 + b36.f.i(6, nv3Var2.mo75928xcd1e8d8()) : e17;
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
        r45.tg tgVar = (r45.tg) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                tgVar.f467921d = aVar2.g(intValue);
                return 0;
            case 2:
                tgVar.f467922e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.tn4 tn4Var3 = new r45.tn4();
                    if (bArr != null && bArr.length > 0) {
                        tn4Var3.mo11468x92b714fd(bArr);
                    }
                    tgVar.f467923f = tn4Var3;
                }
                return 0;
            case 4:
                tgVar.f467924g = aVar2.k(intValue);
                return 0;
            case 5:
                tgVar.f467925h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.nv3 nv3Var3 = new r45.nv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        nv3Var3.mo11468x92b714fd(bArr2);
                    }
                    tgVar.f467926i = nv3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

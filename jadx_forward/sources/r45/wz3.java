package r45;

/* loaded from: classes9.dex */
public class wz3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471129e;

    /* renamed from: f, reason: collision with root package name */
    public r45.td0 f471130f;

    /* renamed from: g, reason: collision with root package name */
    public r45.td0 f471131g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471132h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f471133i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wz3)) {
            return false;
        }
        r45.wz3 wz3Var = (r45.wz3) fVar;
        return n51.f.a(this.f471128d, wz3Var.f471128d) && n51.f.a(this.f471129e, wz3Var.f471129e) && n51.f.a(this.f471130f, wz3Var.f471130f) && n51.f.a(this.f471131g, wz3Var.f471131g) && n51.f.a(this.f471132h, wz3Var.f471132h) && n51.f.a(this.f471133i, wz3Var.f471133i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471128d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471129e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.td0 td0Var = this.f471130f;
            if (td0Var != null) {
                fVar.i(3, td0Var.mo75928xcd1e8d8());
                this.f471130f.mo75956x3d5d1f78(fVar);
            }
            r45.td0 td0Var2 = this.f471131g;
            if (td0Var2 != null) {
                fVar.i(4, td0Var2.mo75928xcd1e8d8());
                this.f471131g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f471132h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f471133i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f471128d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f471129e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            r45.td0 td0Var3 = this.f471130f;
            if (td0Var3 != null) {
                j17 += b36.f.i(3, td0Var3.mo75928xcd1e8d8());
            }
            r45.td0 td0Var4 = this.f471131g;
            if (td0Var4 != null) {
                j17 += b36.f.i(4, td0Var4.mo75928xcd1e8d8());
            }
            java.lang.String str7 = this.f471132h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f471133i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.wz3 wz3Var = (r45.wz3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wz3Var.f471128d = aVar2.k(intValue);
                return 0;
            case 2:
                wz3Var.f471129e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.td0 td0Var5 = new r45.td0();
                    if (bArr != null && bArr.length > 0) {
                        td0Var5.mo11468x92b714fd(bArr);
                    }
                    wz3Var.f471130f = td0Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    r45.td0 td0Var6 = new r45.td0();
                    if (bArr2 != null && bArr2.length > 0) {
                        td0Var6.mo11468x92b714fd(bArr2);
                    }
                    wz3Var.f471131g = td0Var6;
                }
                return 0;
            case 5:
                wz3Var.f471132h = aVar2.k(intValue);
                return 0;
            case 6:
                wz3Var.f471133i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

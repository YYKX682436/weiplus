package r45;

/* loaded from: classes10.dex */
public class sl4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f467364d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467365e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f467366f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f467367g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f467368h;

    /* renamed from: i, reason: collision with root package name */
    public r45.pl4 f467369i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sl4)) {
            return false;
        }
        r45.sl4 sl4Var = (r45.sl4) fVar;
        return n51.f.a(this.f467364d, sl4Var.f467364d) && n51.f.a(this.f467365e, sl4Var.f467365e) && n51.f.a(this.f467366f, sl4Var.f467366f) && n51.f.a(this.f467367g, sl4Var.f467367g) && n51.f.a(this.f467368h, sl4Var.f467368h) && n51.f.a(this.f467369i, sl4Var.f467369i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467366f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f467364d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f467365e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f467367g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f467368h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            r45.pl4 pl4Var = this.f467369i;
            if (pl4Var != null) {
                fVar.i(6, pl4Var.mo75928xcd1e8d8());
                this.f467369i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f467364d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f467365e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str7 = this.f467367g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f467368h;
            if (str8 != null) {
                g17 += b36.f.j(5, str8);
            }
            r45.pl4 pl4Var2 = this.f467369i;
            return pl4Var2 != null ? g17 + b36.f.i(6, pl4Var2.mo75928xcd1e8d8()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.sl4 sl4Var = (r45.sl4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                sl4Var.f467364d = aVar2.k(intValue);
                return 0;
            case 2:
                sl4Var.f467365e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.l30 l30Var = new r45.l30();
                    if (bArr2 != null && bArr2.length > 0) {
                        l30Var.mo11468x92b714fd(bArr2);
                    }
                    sl4Var.f467366f.add(l30Var);
                }
                return 0;
            case 4:
                sl4Var.f467367g = aVar2.k(intValue);
                return 0;
            case 5:
                sl4Var.f467368h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.pl4 pl4Var3 = new r45.pl4();
                    if (bArr3 != null && bArr3.length > 0) {
                        pl4Var3.mo11468x92b714fd(bArr3);
                    }
                    sl4Var.f467369i = pl4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}

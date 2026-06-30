package r45;

/* loaded from: classes4.dex */
public class f4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f455533d;

    /* renamed from: e, reason: collision with root package name */
    public int f455534e;

    /* renamed from: f, reason: collision with root package name */
    public long f455535f;

    /* renamed from: g, reason: collision with root package name */
    public int f455536g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f455537h;

    /* renamed from: i, reason: collision with root package name */
    public int f455538i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f4)) {
            return false;
        }
        r45.f4 f4Var = (r45.f4) fVar;
        return n51.f.a(this.f76492x92037252, f4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f455533d), java.lang.Integer.valueOf(f4Var.f455533d)) && n51.f.a(java.lang.Integer.valueOf(this.f455534e), java.lang.Integer.valueOf(f4Var.f455534e)) && n51.f.a(java.lang.Long.valueOf(this.f455535f), java.lang.Long.valueOf(f4Var.f455535f)) && n51.f.a(java.lang.Integer.valueOf(this.f455536g), java.lang.Integer.valueOf(f4Var.f455536g)) && n51.f.a(this.f455537h, f4Var.f455537h) && n51.f.a(java.lang.Integer.valueOf(this.f455538i), java.lang.Integer.valueOf(f4Var.f455538i));
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
            fVar.e(2, this.f455533d);
            fVar.e(3, this.f455534e);
            fVar.h(4, this.f455535f);
            fVar.e(5, this.f455536g);
            java.lang.String str = this.f455537h;
            if (str != null) {
                fVar.j(6, str);
            }
            fVar.e(7, this.f455538i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f455533d) + b36.f.e(3, this.f455534e) + b36.f.h(4, this.f455535f) + b36.f.e(5, this.f455536g);
            java.lang.String str2 = this.f455537h;
            if (str2 != null) {
                i18 += b36.f.j(6, str2);
            }
            return i18 + b36.f.e(7, this.f455538i);
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
        r45.f4 f4Var = (r45.f4) objArr[1];
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
                    f4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                f4Var.f455533d = aVar2.g(intValue);
                return 0;
            case 3:
                f4Var.f455534e = aVar2.g(intValue);
                return 0;
            case 4:
                f4Var.f455535f = aVar2.i(intValue);
                return 0;
            case 5:
                f4Var.f455536g = aVar2.g(intValue);
                return 0;
            case 6:
                f4Var.f455537h = aVar2.k(intValue);
                return 0;
            case 7:
                f4Var.f455538i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

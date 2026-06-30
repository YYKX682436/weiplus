package r45;

/* loaded from: classes8.dex */
public class u extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f468427d;

    /* renamed from: e, reason: collision with root package name */
    public long f468428e;

    /* renamed from: f, reason: collision with root package name */
    public int f468429f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f468430g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f468431h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f468432i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.u)) {
            return false;
        }
        r45.u uVar = (r45.u) fVar;
        return n51.f.a(this.f76494x2de60e5e, uVar.f76494x2de60e5e) && n51.f.a(this.f468427d, uVar.f468427d) && n51.f.a(java.lang.Long.valueOf(this.f468428e), java.lang.Long.valueOf(uVar.f468428e)) && n51.f.a(java.lang.Integer.valueOf(this.f468429f), java.lang.Integer.valueOf(uVar.f468429f)) && n51.f.a(this.f468430g, uVar.f468430g) && n51.f.a(this.f468431h, uVar.f468431h) && n51.f.a(this.f468432i, uVar.f468432i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f468427d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f468428e);
            fVar.e(4, this.f468429f);
            java.lang.String str2 = this.f468430g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f468431h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            java.lang.String str4 = this.f468432i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f468427d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            int h17 = i18 + b36.f.h(3, this.f468428e) + b36.f.e(4, this.f468429f);
            java.lang.String str6 = this.f468430g;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f468431h;
            if (str7 != null) {
                h17 += b36.f.j(6, str7);
            }
            java.lang.String str8 = this.f468432i;
            return str8 != null ? h17 + b36.f.j(7, str8) : h17;
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
        r45.u uVar = (r45.u) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    uVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                uVar.f468427d = aVar2.k(intValue);
                return 0;
            case 3:
                uVar.f468428e = aVar2.i(intValue);
                return 0;
            case 4:
                uVar.f468429f = aVar2.g(intValue);
                return 0;
            case 5:
                uVar.f468430g = aVar2.k(intValue);
                return 0;
            case 6:
                uVar.f468431h = aVar2.k(intValue);
                return 0;
            case 7:
                uVar.f468432i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

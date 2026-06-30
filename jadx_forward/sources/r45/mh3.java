package r45;

/* loaded from: classes4.dex */
public class mh3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public long f462035d;

    /* renamed from: e, reason: collision with root package name */
    public int f462036e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f462037f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f462038g;

    /* renamed from: h, reason: collision with root package name */
    public int f462039h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f462040i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mh3)) {
            return false;
        }
        r45.mh3 mh3Var = (r45.mh3) fVar;
        return n51.f.a(this.f76494x2de60e5e, mh3Var.f76494x2de60e5e) && n51.f.a(java.lang.Long.valueOf(this.f462035d), java.lang.Long.valueOf(mh3Var.f462035d)) && n51.f.a(java.lang.Integer.valueOf(this.f462036e), java.lang.Integer.valueOf(mh3Var.f462036e)) && n51.f.a(this.f462037f, mh3Var.f462037f) && n51.f.a(this.f462038g, mh3Var.f462038g) && n51.f.a(java.lang.Integer.valueOf(this.f462039h), java.lang.Integer.valueOf(mh3Var.f462039h)) && n51.f.a(this.f462040i, mh3Var.f462040i);
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
            fVar.h(2, this.f462035d);
            fVar.e(3, this.f462036e);
            java.lang.String str = this.f462037f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f462038g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.e(6, this.f462039h);
            java.lang.String str3 = this.f462040i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f462035d) + b36.f.e(3, this.f462036e);
            java.lang.String str4 = this.f462037f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f462038g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int e17 = i18 + b36.f.e(6, this.f462039h);
            java.lang.String str6 = this.f462040i;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        r45.mh3 mh3Var = (r45.mh3) objArr[1];
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
                    mh3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                mh3Var.f462035d = aVar2.i(intValue);
                return 0;
            case 3:
                mh3Var.f462036e = aVar2.g(intValue);
                return 0;
            case 4:
                mh3Var.f462037f = aVar2.k(intValue);
                return 0;
            case 5:
                mh3Var.f462038g = aVar2.k(intValue);
                return 0;
            case 6:
                mh3Var.f462039h = aVar2.g(intValue);
                return 0;
            case 7:
                mh3Var.f462040i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

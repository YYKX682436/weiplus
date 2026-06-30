package n33;

/* loaded from: classes4.dex */
public class a extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f416010d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f416011e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f416012f;

    /* renamed from: g, reason: collision with root package name */
    public long f416013g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof n33.a)) {
            return false;
        }
        n33.a aVar = (n33.a) fVar;
        return n51.f.a(this.f76494x2de60e5e, aVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f416010d), java.lang.Integer.valueOf(aVar.f416010d)) && n51.f.a(this.f416011e, aVar.f416011e) && n51.f.a(this.f416012f, aVar.f416012f) && n51.f.a(java.lang.Long.valueOf(this.f416013g), java.lang.Long.valueOf(aVar.f416013g));
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
            fVar.e(2, this.f416010d);
            java.lang.String str = this.f416011e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f416012f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.h(5, this.f416013g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f416010d);
            java.lang.String str3 = this.f416011e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f416012f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.h(5, this.f416013g);
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
        n33.a aVar3 = (n33.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                aVar3.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            aVar3.f416010d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f416011e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            aVar3.f416012f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        aVar3.f416013g = aVar2.i(intValue);
        return 0;
    }
}

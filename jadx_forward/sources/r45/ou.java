package r45;

/* loaded from: classes4.dex */
public class ou extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464048d;

    /* renamed from: e, reason: collision with root package name */
    public float f464049e;

    /* renamed from: f, reason: collision with root package name */
    public float f464050f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464051g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ou)) {
            return false;
        }
        r45.ou ouVar = (r45.ou) fVar;
        return n51.f.a(this.f76494x2de60e5e, ouVar.f76494x2de60e5e) && n51.f.a(this.f464048d, ouVar.f464048d) && n51.f.a(java.lang.Float.valueOf(this.f464049e), java.lang.Float.valueOf(ouVar.f464049e)) && n51.f.a(java.lang.Float.valueOf(this.f464050f), java.lang.Float.valueOf(ouVar.f464050f)) && n51.f.a(this.f464051g, ouVar.f464051g);
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
            java.lang.String str = this.f464048d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.d(3, this.f464049e);
            fVar.d(4, this.f464050f);
            java.lang.String str2 = this.f464051g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f464048d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int d17 = i18 + b36.f.d(3, this.f464049e) + b36.f.d(4, this.f464050f);
            java.lang.String str4 = this.f464051g;
            return str4 != null ? d17 + b36.f.j(5, str4) : d17;
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
        r45.ou ouVar = (r45.ou) objArr[1];
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
                ouVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ouVar.f464048d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ouVar.f464049e = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 4) {
            ouVar.f464050f = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ouVar.f464051g = aVar2.k(intValue);
        return 0;
    }
}

package v53;

/* loaded from: classes4.dex */
public class h extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f514871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f514872e;

    /* renamed from: f, reason: collision with root package name */
    public int f514873f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f514874g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof v53.h)) {
            return false;
        }
        v53.h hVar = (v53.h) fVar;
        return n51.f.a(this.f76494x2de60e5e, hVar.f76494x2de60e5e) && n51.f.a(this.f514871d, hVar.f514871d) && n51.f.a(this.f514872e, hVar.f514872e) && n51.f.a(java.lang.Integer.valueOf(this.f514873f), java.lang.Integer.valueOf(hVar.f514873f)) && n51.f.a(this.f514874g, hVar.f514874g);
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
            java.lang.String str = this.f514871d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f514872e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f514873f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f514874g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f514871d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f514872e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f514873f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f514874g;
            return gVar2 != null ? e17 + b36.f.b(5, gVar2) : e17;
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
        v53.h hVar = (v53.h) objArr[1];
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
                hVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            hVar.f514871d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hVar.f514872e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            hVar.f514873f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        hVar.f514874g = aVar2.d(intValue);
        return 0;
    }
}

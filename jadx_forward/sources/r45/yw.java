package r45;

/* loaded from: classes8.dex */
public class yw extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f472963d;

    /* renamed from: e, reason: collision with root package name */
    public int f472964e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472965f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472966g;

    /* renamed from: h, reason: collision with root package name */
    public long f472967h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f472968i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f472969m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f472970n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yw)) {
            return false;
        }
        r45.yw ywVar = (r45.yw) fVar;
        return n51.f.a(this.f76494x2de60e5e, ywVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f472963d), java.lang.Integer.valueOf(ywVar.f472963d)) && n51.f.a(java.lang.Integer.valueOf(this.f472964e), java.lang.Integer.valueOf(ywVar.f472964e)) && n51.f.a(this.f472965f, ywVar.f472965f) && n51.f.a(this.f472966g, ywVar.f472966g) && n51.f.a(java.lang.Long.valueOf(this.f472967h), java.lang.Long.valueOf(ywVar.f472967h)) && n51.f.a(this.f472968i, ywVar.f472968i) && n51.f.a(java.lang.Boolean.valueOf(this.f472969m), java.lang.Boolean.valueOf(ywVar.f472969m)) && n51.f.a(this.f472970n, ywVar.f472970n);
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
            fVar.e(2, this.f472963d);
            fVar.e(3, this.f472964e);
            java.lang.String str = this.f472965f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f472966g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.h(6, this.f472967h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f472968i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.a(8, this.f472969m);
            java.lang.String str3 = this.f472970n;
            if (str3 != null) {
                fVar.j(9, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f472963d) + b36.f.e(3, this.f472964e);
            java.lang.String str4 = this.f472965f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f472966g;
            if (str5 != null) {
                i18 += b36.f.j(5, str5);
            }
            int h17 = i18 + b36.f.h(6, this.f472967h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f472968i;
            if (gVar2 != null) {
                h17 += b36.f.b(7, gVar2);
            }
            int a17 = h17 + b36.f.a(8, this.f472969m);
            java.lang.String str6 = this.f472970n;
            return str6 != null ? a17 + b36.f.j(9, str6) : a17;
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
        r45.yw ywVar = (r45.yw) objArr[1];
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
                    ywVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ywVar.f472963d = aVar2.g(intValue);
                return 0;
            case 3:
                ywVar.f472964e = aVar2.g(intValue);
                return 0;
            case 4:
                ywVar.f472965f = aVar2.k(intValue);
                return 0;
            case 5:
                ywVar.f472966g = aVar2.k(intValue);
                return 0;
            case 6:
                ywVar.f472967h = aVar2.i(intValue);
                return 0;
            case 7:
                ywVar.f472968i = aVar2.d(intValue);
                return 0;
            case 8:
                ywVar.f472969m = aVar2.c(intValue);
                return 0;
            case 9:
                ywVar.f472970n = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

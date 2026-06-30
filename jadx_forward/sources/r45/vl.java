package r45;

/* loaded from: classes9.dex */
public class vl extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469861d;

    /* renamed from: e, reason: collision with root package name */
    public int f469862e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469863f;

    /* renamed from: g, reason: collision with root package name */
    public int f469864g;

    /* renamed from: h, reason: collision with root package name */
    public long f469865h;

    /* renamed from: i, reason: collision with root package name */
    public int f469866i;

    /* renamed from: m, reason: collision with root package name */
    public int f469867m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f469868n;

    /* renamed from: o, reason: collision with root package name */
    public int f469869o;

    /* renamed from: p, reason: collision with root package name */
    public int f469870p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f469871q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vl)) {
            return false;
        }
        r45.vl vlVar = (r45.vl) fVar;
        return n51.f.a(this.f76494x2de60e5e, vlVar.f76494x2de60e5e) && n51.f.a(this.f469861d, vlVar.f469861d) && n51.f.a(java.lang.Integer.valueOf(this.f469862e), java.lang.Integer.valueOf(vlVar.f469862e)) && n51.f.a(this.f469863f, vlVar.f469863f) && n51.f.a(java.lang.Integer.valueOf(this.f469864g), java.lang.Integer.valueOf(vlVar.f469864g)) && n51.f.a(java.lang.Long.valueOf(this.f469865h), java.lang.Long.valueOf(vlVar.f469865h)) && n51.f.a(java.lang.Integer.valueOf(this.f469866i), java.lang.Integer.valueOf(vlVar.f469866i)) && n51.f.a(java.lang.Integer.valueOf(this.f469867m), java.lang.Integer.valueOf(vlVar.f469867m)) && n51.f.a(this.f469868n, vlVar.f469868n) && n51.f.a(java.lang.Integer.valueOf(this.f469869o), java.lang.Integer.valueOf(vlVar.f469869o)) && n51.f.a(java.lang.Integer.valueOf(this.f469870p), java.lang.Integer.valueOf(vlVar.f469870p)) && n51.f.a(java.lang.Boolean.valueOf(this.f469871q), java.lang.Boolean.valueOf(vlVar.f469871q));
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
            java.lang.String str = this.f469861d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f469862e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469863f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            fVar.e(5, this.f469864g);
            fVar.h(6, this.f469865h);
            fVar.e(7, this.f469866i);
            fVar.e(8, this.f469867m);
            java.lang.String str2 = this.f469868n;
            if (str2 != null) {
                fVar.j(12, str2);
            }
            fVar.e(13, this.f469869o);
            fVar.e(14, this.f469870p);
            fVar.a(15, this.f469871q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f469861d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f469862e);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469863f;
            if (gVar2 != null) {
                e17 += b36.f.b(4, gVar2);
            }
            int e18 = e17 + b36.f.e(5, this.f469864g) + b36.f.h(6, this.f469865h) + b36.f.e(7, this.f469866i) + b36.f.e(8, this.f469867m);
            java.lang.String str4 = this.f469868n;
            if (str4 != null) {
                e18 += b36.f.j(12, str4);
            }
            return e18 + b36.f.e(13, this.f469869o) + b36.f.e(14, this.f469870p) + b36.f.a(15, this.f469871q);
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
        r45.vl vlVar = (r45.vl) objArr[1];
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
                    vlVar.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                vlVar.f469861d = aVar2.k(intValue);
                return 0;
            case 3:
                vlVar.f469862e = aVar2.g(intValue);
                return 0;
            case 4:
                vlVar.f469863f = aVar2.d(intValue);
                return 0;
            case 5:
                vlVar.f469864g = aVar2.g(intValue);
                return 0;
            case 6:
                vlVar.f469865h = aVar2.i(intValue);
                return 0;
            case 7:
                vlVar.f469866i = aVar2.g(intValue);
                return 0;
            case 8:
                vlVar.f469867m = aVar2.g(intValue);
                return 0;
            case 9:
            case 10:
            case 11:
            default:
                return -1;
            case 12:
                vlVar.f469868n = aVar2.k(intValue);
                return 0;
            case 13:
                vlVar.f469869o = aVar2.g(intValue);
                return 0;
            case 14:
                vlVar.f469870p = aVar2.g(intValue);
                return 0;
            case 15:
                vlVar.f469871q = aVar2.c(intValue);
                return 0;
        }
    }
}

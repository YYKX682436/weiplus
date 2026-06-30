package r45;

/* loaded from: classes8.dex */
public class nw extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f463232d;

    /* renamed from: e, reason: collision with root package name */
    public int f463233e;

    /* renamed from: f, reason: collision with root package name */
    public int f463234f;

    /* renamed from: g, reason: collision with root package name */
    public long f463235g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463236h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f463237i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463238m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nw)) {
            return false;
        }
        r45.nw nwVar = (r45.nw) fVar;
        return n51.f.a(this.f76492x92037252, nwVar.f76492x92037252) && n51.f.a(this.f463232d, nwVar.f463232d) && n51.f.a(java.lang.Integer.valueOf(this.f463233e), java.lang.Integer.valueOf(nwVar.f463233e)) && n51.f.a(java.lang.Integer.valueOf(this.f463234f), java.lang.Integer.valueOf(nwVar.f463234f)) && n51.f.a(java.lang.Long.valueOf(this.f463235g), java.lang.Long.valueOf(nwVar.f463235g)) && n51.f.a(this.f463236h, nwVar.f463236h) && n51.f.a(java.lang.Boolean.valueOf(this.f463237i), java.lang.Boolean.valueOf(nwVar.f463237i)) && n51.f.a(this.f463238m, nwVar.f463238m);
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
            java.lang.String str = this.f463232d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f463233e);
            fVar.e(4, this.f463234f);
            fVar.h(5, this.f463235g);
            java.lang.String str2 = this.f463236h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.a(7, this.f463237i);
            java.lang.String str3 = this.f463238m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f463232d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int e17 = i18 + b36.f.e(3, this.f463233e) + b36.f.e(4, this.f463234f) + b36.f.h(5, this.f463235g);
            java.lang.String str5 = this.f463236h;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int a17 = e17 + b36.f.a(7, this.f463237i);
            java.lang.String str6 = this.f463238m;
            return str6 != null ? a17 + b36.f.j(8, str6) : a17;
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
        r45.nw nwVar = (r45.nw) objArr[1];
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
                    nwVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                nwVar.f463232d = aVar2.k(intValue);
                return 0;
            case 3:
                nwVar.f463233e = aVar2.g(intValue);
                return 0;
            case 4:
                nwVar.f463234f = aVar2.g(intValue);
                return 0;
            case 5:
                nwVar.f463235g = aVar2.i(intValue);
                return 0;
            case 6:
                nwVar.f463236h = aVar2.k(intValue);
                return 0;
            case 7:
                nwVar.f463237i = aVar2.c(intValue);
                return 0;
            case 8:
                nwVar.f463238m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

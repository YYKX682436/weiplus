package p33;

/* loaded from: classes2.dex */
public class x extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f433196d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433197e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433198f;

    /* renamed from: g, reason: collision with root package name */
    public int f433199g;

    /* renamed from: h, reason: collision with root package name */
    public long f433200h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.x)) {
            return false;
        }
        p33.x xVar = (p33.x) fVar;
        return n51.f.a(this.f76492x92037252, xVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f433196d), java.lang.Integer.valueOf(xVar.f433196d)) && n51.f.a(this.f433197e, xVar.f433197e) && n51.f.a(this.f433198f, xVar.f433198f) && n51.f.a(java.lang.Integer.valueOf(this.f433199g), java.lang.Integer.valueOf(xVar.f433199g)) && n51.f.a(java.lang.Long.valueOf(this.f433200h), java.lang.Long.valueOf(xVar.f433200h));
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
            fVar.e(2, this.f433196d);
            java.lang.String str = this.f433197e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f433198f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f433199g);
            fVar.h(6, this.f433200h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f433196d);
            java.lang.String str3 = this.f433197e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f433198f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f433199g) + b36.f.h(6, this.f433200h);
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
        p33.x xVar = (p33.x) objArr[1];
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
                    xVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                xVar.f433196d = aVar2.g(intValue);
                return 0;
            case 3:
                xVar.f433197e = aVar2.k(intValue);
                return 0;
            case 4:
                xVar.f433198f = aVar2.k(intValue);
                return 0;
            case 5:
                xVar.f433199g = aVar2.g(intValue);
                return 0;
            case 6:
                xVar.f433200h = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}

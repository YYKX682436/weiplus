package bw5;

/* loaded from: classes2.dex */
public class wy extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116404e;

    /* renamed from: f, reason: collision with root package name */
    public int f116405f;

    /* renamed from: g, reason: collision with root package name */
    public int f116406g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mu f116407h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f116408i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ju f116409m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f116403d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f116410n = new boolean[9];

    static {
        new bw5.wy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wy mo11468x92b714fd(byte[] bArr) {
        return (bw5.wy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wy)) {
            return false;
        }
        bw5.wy wyVar = (bw5.wy) fVar;
        return n51.f.a(this.f76492x92037252, wyVar.f76492x92037252) && n51.f.a(this.f116403d, wyVar.f116403d) && n51.f.a(this.f116404e, wyVar.f116404e) && n51.f.a(java.lang.Integer.valueOf(this.f116405f), java.lang.Integer.valueOf(wyVar.f116405f)) && n51.f.a(java.lang.Integer.valueOf(this.f116406g), java.lang.Integer.valueOf(wyVar.f116406g)) && n51.f.a(this.f116407h, wyVar.f116407h) && n51.f.a(this.f116408i, wyVar.f116408i) && n51.f.a(this.f116409m, wyVar.f116409m);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f116410n[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116403d;
        int i18 = 0;
        boolean[] zArr = this.f116410n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f116404e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f116405f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116406g);
            }
            bw5.mu muVar = this.f116407h;
            if (muVar != null && zArr[6]) {
                fVar.i(6, muVar.mo75928xcd1e8d8());
                this.f116407h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f116408i;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            bw5.ju juVar = this.f116409m;
            if (juVar != null && zArr[8]) {
                fVar.i(8, juVar.mo75928xcd1e8d8());
                this.f116409m.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f116404e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f116405f);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f116406g);
            }
            bw5.mu muVar2 = this.f116407h;
            if (muVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, muVar2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f116408i;
            if (str2 != null && zArr[7]) {
                g17 += b36.f.j(7, str2);
            }
            bw5.ju juVar2 = this.f116409m;
            return (juVar2 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, juVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList.clear();
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
                    this.f76492x92037252 = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.yr yrVar = new bw5.yr();
                    if (bArr2 != null && bArr2.length > 0) {
                        yrVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(yrVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f116404e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f116405f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116406g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr3 != null && bArr3.length > 0) {
                        muVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f116407h = muVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f116408i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ju juVar3 = new bw5.ju();
                    if (bArr4 != null && bArr4.length > 0) {
                        juVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f116409m = juVar3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f116410n[1] = true;
        return this;
    }
}

package bw5;

/* loaded from: classes2.dex */
public class wp extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116342f;

    /* renamed from: g, reason: collision with root package name */
    public int f116343g;

    /* renamed from: h, reason: collision with root package name */
    public int f116344h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mu f116345i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ju f116346m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f116347n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.yp f116348o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f116340d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116341e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f116349p = new boolean[11];

    static {
        new bw5.wp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wp)) {
            return false;
        }
        bw5.wp wpVar = (bw5.wp) fVar;
        return n51.f.a(this.f76492x92037252, wpVar.f76492x92037252) && n51.f.a(this.f116340d, wpVar.f116340d) && n51.f.a(this.f116341e, wpVar.f116341e) && n51.f.a(this.f116342f, wpVar.f116342f) && n51.f.a(java.lang.Integer.valueOf(this.f116343g), java.lang.Integer.valueOf(wpVar.f116343g)) && n51.f.a(java.lang.Integer.valueOf(this.f116344h), java.lang.Integer.valueOf(wpVar.f116344h)) && n51.f.a(this.f116345i, wpVar.f116345i) && n51.f.a(this.f116346m, wpVar.f116346m) && n51.f.a(this.f116347n, wpVar.f116347n) && n51.f.a(this.f116348o, wpVar.f116348o);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f116349p[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.wp();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116341e;
        java.util.LinkedList linkedList2 = this.f116340d;
        boolean[] zArr = this.f116349p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f116342f;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f116343g);
            }
            if (zArr[6]) {
                fVar.e(6, this.f116344h);
            }
            bw5.mu muVar = this.f116345i;
            if (muVar != null && zArr[7]) {
                fVar.i(7, muVar.mo75928xcd1e8d8());
                this.f116345i.mo75956x3d5d1f78(fVar);
            }
            bw5.ju juVar = this.f116346m;
            if (juVar != null && zArr[8]) {
                fVar.i(8, juVar.mo75928xcd1e8d8());
                this.f116346m.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f116347n;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            bw5.yp ypVar = this.f116348o;
            if (ypVar == null || !zArr[10]) {
                return 0;
            }
            fVar.i(10, ypVar.mo75928xcd1e8d8());
            this.f116348o.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ((ieVar2 == null || !zArr[1]) ? 0 : 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8())) + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f116342f;
            if (gVar3 != null && zArr[4]) {
                i18 += b36.f.b(4, gVar3);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f116343g);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f116344h);
            }
            bw5.mu muVar2 = this.f116345i;
            if (muVar2 != null && zArr[7]) {
                i18 += b36.f.i(7, muVar2.mo75928xcd1e8d8());
            }
            bw5.ju juVar2 = this.f116346m;
            if (juVar2 != null && zArr[8]) {
                i18 += b36.f.i(8, juVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f116347n;
            if (gVar4 != null && zArr[9]) {
                i18 += b36.f.b(9, gVar4);
            }
            bw5.yp ypVar2 = this.f116348o;
            return (ypVar2 == null || !zArr[10]) ? i18 : i18 + b36.f.i(10, ypVar2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                    bw5.xp xpVar = new bw5.xp();
                    if (bArr2 != null && bArr2.length > 0) {
                        xpVar.mo11468x92b714fd(bArr2);
                    }
                    linkedList2.add(xpVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.xp xpVar2 = new bw5.xp();
                    if (bArr3 != null && bArr3.length > 0) {
                        xpVar2.mo11468x92b714fd(bArr3);
                    }
                    linkedList.add(xpVar2);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f116342f = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f116343g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f116344h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr4 != null && bArr4.length > 0) {
                        muVar3.mo11468x92b714fd(bArr4);
                    }
                    this.f116345i = muVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.ju juVar3 = new bw5.ju();
                    if (bArr5 != null && bArr5.length > 0) {
                        juVar3.mo11468x92b714fd(bArr5);
                    }
                    this.f116346m = juVar3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f116347n = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.yp ypVar3 = new bw5.yp();
                    if (bArr6 != null && bArr6.length > 0) {
                        ypVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f116348o = ypVar3;
                }
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.wp) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f116349p[1] = true;
        return this;
    }
}

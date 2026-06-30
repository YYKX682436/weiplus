package bw5;

/* loaded from: classes2.dex */
public class rg extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f114044e;

    /* renamed from: f, reason: collision with root package name */
    public int f114045f;

    /* renamed from: g, reason: collision with root package name */
    public long f114046g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.dz f114047h;

    /* renamed from: i, reason: collision with root package name */
    public int f114048i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ri0 f114049m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.fh0 f114050n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.mu f114051o;

    /* renamed from: p, reason: collision with root package name */
    public int f114052p;

    /* renamed from: q, reason: collision with root package name */
    public int f114053q;

    /* renamed from: r, reason: collision with root package name */
    public int f114054r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.zt f114055s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.kd f114056t;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f114043d = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f114057u = new boolean[16];

    static {
        new bw5.rg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rg mo11468x92b714fd(byte[] bArr) {
        return (bw5.rg) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rg)) {
            return false;
        }
        bw5.rg rgVar = (bw5.rg) fVar;
        return n51.f.a(this.f76492x92037252, rgVar.f76492x92037252) && n51.f.a(this.f114043d, rgVar.f114043d) && n51.f.a(this.f114044e, rgVar.f114044e) && n51.f.a(java.lang.Integer.valueOf(this.f114045f), java.lang.Integer.valueOf(rgVar.f114045f)) && n51.f.a(java.lang.Long.valueOf(this.f114046g), java.lang.Long.valueOf(rgVar.f114046g)) && n51.f.a(this.f114047h, rgVar.f114047h) && n51.f.a(java.lang.Integer.valueOf(this.f114048i), java.lang.Integer.valueOf(rgVar.f114048i)) && n51.f.a(this.f114049m, rgVar.f114049m) && n51.f.a(this.f114050n, rgVar.f114050n) && n51.f.a(this.f114051o, rgVar.f114051o) && n51.f.a(java.lang.Integer.valueOf(this.f114052p), java.lang.Integer.valueOf(rgVar.f114052p)) && n51.f.a(java.lang.Integer.valueOf(this.f114053q), java.lang.Integer.valueOf(rgVar.f114053q)) && n51.f.a(java.lang.Integer.valueOf(this.f114054r), java.lang.Integer.valueOf(rgVar.f114054r)) && n51.f.a(this.f114055s, rgVar.f114055s) && n51.f.a(this.f114056t, rgVar.f114056t);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f114057u[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rg();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114043d;
        int i18 = 0;
        boolean[] zArr = this.f114057u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f114044e;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f114045f);
            }
            if (zArr[5]) {
                fVar.h(5, this.f114046g);
            }
            bw5.dz dzVar = this.f114047h;
            if (dzVar != null && zArr[6]) {
                fVar.i(6, dzVar.mo75928xcd1e8d8());
                this.f114047h.mo75956x3d5d1f78(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f114048i);
            }
            bw5.ri0 ri0Var = this.f114049m;
            if (ri0Var != null && zArr[8]) {
                fVar.i(8, ri0Var.mo75928xcd1e8d8());
                this.f114049m.mo75956x3d5d1f78(fVar);
            }
            bw5.fh0 fh0Var = this.f114050n;
            if (fh0Var != null && zArr[9]) {
                fVar.i(9, fh0Var.mo75928xcd1e8d8());
                this.f114050n.mo75956x3d5d1f78(fVar);
            }
            bw5.mu muVar = this.f114051o;
            if (muVar != null && zArr[10]) {
                fVar.i(10, muVar.mo75928xcd1e8d8());
                this.f114051o.mo75956x3d5d1f78(fVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f114052p);
            }
            if (zArr[12]) {
                fVar.e(12, this.f114053q);
            }
            if (zArr[13]) {
                fVar.e(13, this.f114054r);
            }
            bw5.zt ztVar = this.f114055s;
            if (ztVar != null && zArr[14]) {
                fVar.i(14, ztVar.mo75928xcd1e8d8());
                this.f114055s.mo75956x3d5d1f78(fVar);
            }
            bw5.kd kdVar = this.f114056t;
            if (kdVar != null && zArr[15]) {
                fVar.i(15, kdVar.mo75928xcd1e8d8());
                this.f114056t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f114044e;
            if (gVar2 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar2);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f114045f);
            }
            if (zArr[5]) {
                g17 += b36.f.h(5, this.f114046g);
            }
            bw5.dz dzVar2 = this.f114047h;
            if (dzVar2 != null && zArr[6]) {
                g17 += b36.f.i(6, dzVar2.mo75928xcd1e8d8());
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f114048i);
            }
            bw5.ri0 ri0Var2 = this.f114049m;
            if (ri0Var2 != null && zArr[8]) {
                g17 += b36.f.i(8, ri0Var2.mo75928xcd1e8d8());
            }
            bw5.fh0 fh0Var2 = this.f114050n;
            if (fh0Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, fh0Var2.mo75928xcd1e8d8());
            }
            bw5.mu muVar2 = this.f114051o;
            if (muVar2 != null && zArr[10]) {
                g17 += b36.f.i(10, muVar2.mo75928xcd1e8d8());
            }
            if (zArr[11]) {
                g17 += b36.f.e(11, this.f114052p);
            }
            if (zArr[12]) {
                g17 += b36.f.e(12, this.f114053q);
            }
            if (zArr[13]) {
                g17 += b36.f.e(13, this.f114054r);
            }
            bw5.zt ztVar2 = this.f114055s;
            if (ztVar2 != null && zArr[14]) {
                g17 += b36.f.i(14, ztVar2.mo75928xcd1e8d8());
            }
            bw5.kd kdVar2 = this.f114056t;
            return (kdVar2 == null || !zArr[15]) ? g17 : g17 + b36.f.i(15, kdVar2.mo75928xcd1e8d8());
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
                this.f114044e = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f114045f = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f114046g = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.dz dzVar3 = new bw5.dz();
                    if (bArr3 != null && bArr3.length > 0) {
                        dzVar3.mo11468x92b714fd(bArr3);
                    }
                    this.f114047h = dzVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f114048i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.ri0 ri0Var3 = new bw5.ri0();
                    if (bArr4 != null && bArr4.length > 0) {
                        ri0Var3.mo11468x92b714fd(bArr4);
                    }
                    this.f114049m = ri0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.fh0 fh0Var3 = new bw5.fh0();
                    if (bArr5 != null && bArr5.length > 0) {
                        fh0Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f114050n = fh0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.mu muVar3 = new bw5.mu();
                    if (bArr6 != null && bArr6.length > 0) {
                        muVar3.mo11468x92b714fd(bArr6);
                    }
                    this.f114051o = muVar3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f114052p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f114053q = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f114054r = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.zt ztVar3 = new bw5.zt();
                    if (bArr7 != null && bArr7.length > 0) {
                        ztVar3.mo11468x92b714fd(bArr7);
                    }
                    this.f114055s = ztVar3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.kd kdVar3 = new bw5.kd();
                    if (bArr8 != null && bArr8.length > 0) {
                        kdVar3.mo11468x92b714fd(bArr8);
                    }
                    this.f114056t = kdVar3;
                }
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f114057u[1] = true;
        return this;
    }
}

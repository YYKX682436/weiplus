package bw5;

/* loaded from: classes2.dex */
public class v40 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115669d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f115671f;

    /* renamed from: g, reason: collision with root package name */
    public int f115672g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f115673h;

    /* renamed from: i, reason: collision with root package name */
    public int f115674i;

    /* renamed from: m, reason: collision with root package name */
    public int f115675m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.cc0 f115676n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f115677o;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f115670e = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f115678p = new boolean[11];

    static {
        new bw5.v40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.v40 mo11468x92b714fd(byte[] bArr) {
        return (bw5.v40) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.v40)) {
            return false;
        }
        bw5.v40 v40Var = (bw5.v40) fVar;
        return n51.f.a(this.f76492x92037252, v40Var.f76492x92037252) && n51.f.a(this.f115669d, v40Var.f115669d) && n51.f.a(this.f115670e, v40Var.f115670e) && n51.f.a(java.lang.Boolean.valueOf(this.f115671f), java.lang.Boolean.valueOf(v40Var.f115671f)) && n51.f.a(java.lang.Integer.valueOf(this.f115672g), java.lang.Integer.valueOf(v40Var.f115672g)) && n51.f.a(this.f115673h, v40Var.f115673h) && n51.f.a(java.lang.Integer.valueOf(this.f115674i), java.lang.Integer.valueOf(v40Var.f115674i)) && n51.f.a(java.lang.Integer.valueOf(this.f115675m), java.lang.Integer.valueOf(v40Var.f115675m)) && n51.f.a(this.f115676n, v40Var.f115676n) && n51.f.a(this.f115677o, v40Var.f115677o);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f115678p[1] ? this.f76492x92037252 : new r45.ie();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.v40();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f115670e;
        int i18 = 0;
        boolean[] zArr = this.f115678p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f115669d;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.a(4, this.f115671f);
            }
            if (zArr[5]) {
                fVar.e(5, this.f115672g);
            }
            java.lang.String str = this.f115673h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.e(7, this.f115674i);
            }
            if (zArr[8]) {
                fVar.e(8, this.f115675m);
            }
            bw5.cc0 cc0Var = this.f115676n;
            if (cc0Var != null && zArr[9]) {
                fVar.i(9, cc0Var.mo75928xcd1e8d8());
                this.f115676n.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f115677o;
            if (gVar2 != null && zArr[10]) {
                fVar.b(10, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f115669d;
            if (gVar3 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar3);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (zArr[4]) {
                g17 += b36.f.a(4, this.f115671f);
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f115672g);
            }
            java.lang.String str2 = this.f115673h;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f115674i);
            }
            if (zArr[8]) {
                g17 += b36.f.e(8, this.f115675m);
            }
            bw5.cc0 cc0Var2 = this.f115676n;
            if (cc0Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, cc0Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f115677o;
            return (gVar4 == null || !zArr[10]) ? g17 : g17 + b36.f.b(10, gVar4);
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
                this.f115669d = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.dc0 dc0Var = new bw5.dc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        dc0Var.mo11468x92b714fd(bArr2);
                    }
                    linkedList.add(dc0Var);
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f115671f = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f115672g = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f115673h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f115674i = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f115675m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.cc0 cc0Var3 = new bw5.cc0();
                    if (bArr3 != null && bArr3.length > 0) {
                        cc0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f115676n = cc0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f115677o = aVar2.d(intValue);
                zArr[10] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        this.f115678p[1] = true;
        return this;
    }
}
